/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.natjgen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IProgressMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.moe.natjgen.Configuration.Unit;

public class Generator {

	/**
	 * Logger for the class
	 */
	private static final Logger LOG = LoggerFactory.getLogger(Generator.class);

	/**
	 * Class map
	 */
	private GMap<ObjCClassManager> objcClassMap = new GMap<ObjCClassManager>("Objective-C Class Manager");

	/**
	 * Protocol map
	 */
	private GMap<ObjCProtocolManager> objcProtocolMap = new GMap<ObjCProtocolManager>("Objective-C Protocol Manager");

	/**
	 * External category map
	 */
	private GMap<ObjCExternalCategoryManager> objcExternalCategoryMap = new GMap<ObjCExternalCategoryManager>(
			"Objective-C External Category Manager");

	/**
	 * C struct map
	 */
	private GMap<CStructManager> cStructMap = new GMap<CStructManager>("C Struct Manager");

	/**
	 * C enum map
	 */
	private GMap<CEnumManager> cEnumMap = new GMap<CEnumManager>("C Enum Manager");

	/**
	 * C function & variable map
	 */
	private GMap<CManager> cManagerMap = new GMap<CManager>("C Manager");

	/**
	 * C opaque type map
	 */
	private GMap<COpaquePtrManager> cOpaqueTypeMap = new GMap<COpaquePtrManager>("C Opaque Type Manager");

	/**
	 * C opaque alias map
	 */
	private GMap<COpaquePtrManager> cOpaqueTypeAliasMap = new GMap<COpaquePtrManager>("C Opaque Type Alias Manager");

	/**
	 * C opaque type map for types with const roots
	 */
	private Map<String, COpaquePtrManager> cConstRootOpaqueTypeMap = new HashMap<String, COpaquePtrManager>();

	/**
	 * Generate Java classes and interfaces
	 * 
	 * @param monitor
	 *            progress monitor
	 */
	public void generate(IProgressMonitor monitor) {
		monitor.beginTask("Setting up generation", 3);

		monitor.subTask("Merging anonymous enums");
		mergeAnonymEnums();
		monitor.worked(1);

		monitor.subTask("Setting up hierarchy");
		setupHierarchy();
		monitor.worked(1);

		monitor.subTask("Removing unsupported elements");
		removeUnsupported();
		monitor.worked(1);

		int numManagers = objcClassMap.size() + objcProtocolMap.size() + objcExternalCategoryMap.size();
		numManagers += cStructMap.size() + cEnumMap.size() + cManagerMap.size() + cOpaqueTypeMap.size();
		ArrayList<AbstractUnitManager> managers = new ArrayList<AbstractUnitManager>(numManagers);
		collectManagers(objcClassMap, managers);
		collectManagers(objcProtocolMap, managers);
		collectManagers(objcExternalCategoryMap, managers);
		collectManagers(cStructMap, managers);
		collectManagers(cEnumMap, managers);
		collectManagers(cManagerMap, managers);
		collectManagers(cOpaqueTypeMap, managers);

		monitor.beginTask("Starting generation", 5 + numManagers + 1);
		monitor.subTask("Preparing units (Phase: Initialize)");
		for (AbstractUnitManager manager : managers) {
			manager.preparationPhase_Initialize();
		}
		monitor.worked(1);
		monitor.subTask("Preparing units (Phase: Member Type Validation)");
		for (AbstractUnitManager manager : managers) {
			manager.preparationPhase_MemberTypeValidation();
		}
		monitor.worked(1);
		monitor.subTask("Preparing units (Phase: Member Merge)");
		for (AbstractUnitManager manager : managers) {
			manager.preparationPhase_MemberMerge();
		}
		monitor.worked(1);
		monitor.subTask("Preparing units (Phase: Member Manipulation)");
		for (AbstractUnitManager manager : managers) {
			manager.preparationPhase_MemberManipulation();
		}
		monitor.worked(1);
		monitor.subTask("Preparing units (Phase: Final)");
		for (AbstractUnitManager manager : managers) {
			manager.preparationPhase_Final();
		}
		monitor.worked(1);

		monitor.subTask("Generating units");
		for (AbstractUnitManager manager : managers) {
			manager.generate();
			monitor.worked(1);
		}

		monitor.subTask("Cleaning up units");
		for (AbstractUnitManager manager : managers) {
			manager.cleanup();
		}
		monitor.worked(1);
	}

	/**
	 * Merges together those {@link CEnumManager}s which don't have a name and
	 * are from the same framework.
	 */
	private void mergeAnonymEnums() {
		HashMap<String, CEnumManager> globalEnums = new HashMap<String, CEnumManager>();
		ArrayList<String> deprecated = new ArrayList<String>();

		Iterator<Entry<String, CEnumManager>> it = cEnumMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, CEnumManager> e = it.next();
			CEnumManager current = e.getValue();
			if (!current.isSupported()) {
				CEnumManager manager = globalEnums.get(current.getPackage());
				if (manager == null) {
					manager = new CEnumManager(current.getIndexer(), Unit.packageName(current.getPackage(), "Enums"),
							"<none>", "<none>");
					manager.disablePrefixTrim();
					globalEnums.put(current.getPackage(), manager);
				}
				manager.getConstants().addAll(current.getConstants());
				deprecated.add(e.getKey());
			}
		}

		for (String enum_name : deprecated) {
			cEnumMap.remove(enum_name);
		}

		Iterator<Entry<String, CEnumManager>> it2 = globalEnums.entrySet().iterator();
		while (it2.hasNext()) {
			Entry<String, CEnumManager> e = it2.next();
			cEnumMap.put(e.getValue().getFullyQualifiedName(), e.getValue());
		}
	}

	/**
	 * Copy all managers in a map into a given array
	 * 
	 * @param map
	 *            source
	 * @param managers
	 *            destination
	 */
	private <T extends AbstractUnitManager> void collectManagers(GMap<T> map, ArrayList<AbstractUnitManager> managers) {
		Iterator<Entry<String, T>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			managers.add(it.next().getValue());
		}
	}

	/**
	 * Remove managers which are structure sensitive and are incomplete. For
	 * example: {@link CStructManager} is structure sensitive. When there is at
	 * least one field that NatJGen cannot bind, then the struct binding is not
	 * supported!
	 */
	private void removeUnsupported() {
		ArrayList<String> keys = new ArrayList<String>();
		ArrayList<CStructManager> values = new ArrayList<CStructManager>();

		Iterator<Entry<String, CStructManager>> it = cStructMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, CStructManager> e = it.next();
			keys.add(e.getKey());
			values.add(e.getValue());
		}
		cStructMap.clear();

		int count = values.size() + 1;
		while (count > values.size()) {
			count = values.size();

			for (int i = 0; i < values.size(); ++i) {
				CStructManager man = values.get(i);
				if (man.isSupported()) {
					cStructMap.put(keys.get(i), man);
					keys.remove(i);
					values.remove(i);
					--i;
				}
			}
		}

		for (CStructManager man : values) {
			if (!man.isExternalUnit()) {
				man.reportFailure();
			}
		}
	}

	/**
	 * Fix hierarchy of protocols and classes
	 */
	private void setupHierarchy() {
		// Setup classes
		Iterator<Map.Entry<String, ObjCClassManager>> class_it = objcClassMap.entrySet().iterator();
		while (class_it.hasNext()) {
			Map.Entry<String, ObjCClassManager> entry = class_it.next();

			String super_name = entry.getValue().getSuperName();
			if (super_name != null) {
				ObjCClassManager super_manager = objcClassMap.get(super_name);
				if (super_manager == null) {
					throw new RuntimeException("Failed to build hierarchy, " + super_name + " class was not found!");
				} else {
					entry.getValue().setSuperManager(super_manager);
				}
			}

			for (String protocolname : entry.getValue().getProtocolNames()) {
				ObjCProtocolManager protocol = objcProtocolMap.get(protocolname);
				if (protocol != null) {
					entry.getValue().addProtocol(protocol);
				}
			}
		}

		// Setup protocols
		Iterator<Map.Entry<String, ObjCProtocolManager>> it = objcProtocolMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, ObjCProtocolManager> entry = it.next();

			for (String protocolname : entry.getValue().getProtocolNames()) {
				ObjCProtocolManager protocol = objcProtocolMap.get(protocolname);
				if (protocol != null) {
					entry.getValue().addProtocol(protocol);
				}
			}
		}
	}

	/**
	 * Put a unit manager into the correct map
	 * 
	 * @param unitname
	 *            name of the unit manager
	 * @param manager
	 *            unit manager to store
	 */
	public void put(String unitname, ObjCClassManager manager) {
		objcClassMap.put(unitname, manager);
	}

	/**
	 * Put a unit manager into the correct map
	 * 
	 * @param unitname
	 *            name of the unit manager
	 * @param manager
	 *            unit manager to store
	 */
	public void put(String unitname, ObjCProtocolManager manager) {
		objcProtocolMap.put(unitname, manager);
	}

	/**
	 * Put a unit manager into the correct map
	 * 
	 * @param identifier
	 *            name of the unit manager
	 * @param manager
	 *            unit manager to store
	 */
	public void put(String unitname, ObjCExternalCategoryManager manager) {
		objcExternalCategoryMap.put(unitname, manager);
	}

	/**
	 * Put a unit manager into the correct map
	 * 
	 * @param unitname
	 *            name of the unit manager
	 * @param manager
	 *            unit manager to store
	 */
	public void put(String unitname, CStructManager manager) {
		cStructMap.put(unitname, manager);
	}

	/**
	 * Put a unit manager into the correct map
	 * 
	 * @param unitname
	 *            name of the unit manager
	 * @param manager
	 *            unit manager to store
	 */
	public void put(String unitname, CEnumManager manager) {
		cEnumMap.put(unitname, manager);
	}

	/**
	 * Put a unit manager into the correct map
	 * 
	 * @param unitname
	 *            name of the unit manager
	 * @param manager
	 *            unit manager to store
	 */
	public void put(String unitname, CManager manager) {
		cManagerMap.put(unitname, manager);
	}

	/**
	 * Put a unit manager into the correct map
	 * 
	 * @param unitname
	 *            name of the unit manager
	 * @param manager
	 *            unit manager to store
	 */
	public void put(String unitname, COpaquePtrManager manager) {
		cOpaqueTypeMap.put(unitname, manager);
		if (manager.isRootConst()) {
			cConstRootOpaqueTypeMap.put(manager.getRootName(), manager);
		}
	}

	/**
	 * Put a unit manager into the correct map
	 * 
	 * @param unitname
	 *            name of the unit manager
	 * @param manager
	 *            unit manager to store
	 */
	public void putAlias(String unitname, COpaquePtrManager manager) {
		cOpaqueTypeAliasMap.put(unitname, manager);
	}

	/**
	 * Get a {@link ObjCClassManager} for the given key
	 * 
	 * @param classname
	 *            key
	 * @return {@link ObjCClassManager} if exists otherwise null
	 */
	public ObjCClassManager getClass(String classname) {
		return objcClassMap.get(classname);
	}

	/**
	 * Get a {@link ObjCProtocolManager} for the given key
	 * 
	 * @param protocolname
	 *            key
	 * @return {@link ObjCProtocolManager} if exists otherwise null
	 */
	public ObjCProtocolManager getProtocol(String protocolname) {
		return objcProtocolMap.get(protocolname);
	}

	/**
	 * Get a {@link ObjCExternalCategoryManager} for the given key
	 * 
	 * @param categoryclassname
	 *            key
	 * @return {@link ObjCExternalCategoryManager} if exists otherwise null
	 */
	public ObjCExternalCategoryManager getExternalCategory(String categoryclassname) {
		return objcExternalCategoryMap.get(categoryclassname);
	}

	/**
	 * Get a {@link CStructManager} for the given key
	 * 
	 * @param structname
	 *            key
	 * @return {@link CStructManager} if exists otherwise null
	 */
	public CStructManager getStruct(String structname) {
		return cStructMap.get(structname);
	}

	/**
	 * Get a {@link CEnumManager} for the given key
	 * 
	 * @param identifier
	 *            key
	 * @return {@link CEnumManager} if exists otherwise null
	 */
	public CEnumManager getEnum(String identifier) {
		return cEnumMap.get(identifier);
	}

	/**
	 * Get a {@link CManager} for the given key
	 * 
	 * @param identifier
	 *            key
	 * @return {@link CManager} if exists otherwise null
	 */
	public CManager getCManager(Indexer indexer, Unit unit) {
		if (!unit.handlingDefault()) {
			throw new IllegalStateException("handling for C functions must be 'default' at this point");
		}
		String framework = unit.getFramework();
		if (framework == null) {
			framework = "<global>." + unit.getPkg();
		}
		CManager manager = cManagerMap.get(framework);
		if (manager == null) {
			String clsName = framework;
			if (unit.getFramework() == null) {
				clsName = "Globals";
			}
			manager = new CManager(indexer, Unit.packageName(unit.getPkg(), clsName));
			manager.setLibraryName(unit.getFramework());
			cManagerMap.put(framework, manager);
		}
		return manager;
	}

	/**
	 * Get a {@link COpaquePtrManager} for the given key
	 * 
	 * @param identifier
	 *            key
	 * @return {@link COpaquePtrManager} if exists otherwise null
	 */
	public COpaquePtrManager getOpaqueTypeManager(String identifier) {
		return cOpaqueTypeMap.get(identifier);
	}

	/**
	 * Get a {@link COpaquePtrManager} for the given key
	 * 
	 * @param identifier
	 *            key
	 * @return {@link COpaquePtrManager} if exists otherwise null
	 */
	public COpaquePtrManager getOpaqueTypeManagerWithAlias(String identifier) {
		return cOpaqueTypeAliasMap.get(identifier);
	}

	/**
	 * Simple class representing a type aliasing action
	 */
	public static class Alias {

		/**
		 * Name of the manager
		 */
		public final String name;

		/**
		 * New proposed name of the manager
		 */
		public final String alias;

		/**
		 * Path of the alias
		 */
		public final String path;

		/**
		 * Create an {@link Alias} object
		 * 
		 * @param name
		 *            name of the manager
		 * @param alias
		 *            proposed name of the manager
		 * @param path
		 *            path of the alias
		 */
		public Alias(String name, String alias, String path) {
			if (name == null || alias == null || path == null) {
				throw new IllegalArgumentException();
			}
			this.name = name;
			this.alias = alias;
			this.path = path;
		}
	}

	/**
	 * Process {@link CStructManager} aliasing
	 * 
	 * @param aliases
	 *            aliases to process
	 */
	public void processCStructAliasing(List<Alias> aliases) {
		for (Alias alias : aliases) {
			CStructManager man = cStructMap.get(alias.name);
			if (man != null) {
				man.addAlias(alias.alias, alias.path);
			}
		}
	}

	/**
	 * Process {@link CEnumManager} aliasing
	 * 
	 * @param aliases
	 *            aliases to process
	 */
	public void processCEnumAliasing(List<Alias> aliases) {
		for (Alias alias : aliases) {
			CEnumManager man = cEnumMap.get(alias.name);
			if (man != null) {
				man.addAlias(alias.alias, alias.path);
			}
		}
	}

	/**
	 * Get {@link COpaquePtrManager} for a const root type
	 * 
	 * @param rootName
	 *            name of the root type
	 * @return {@link COpaquePtrManager}
	 */
	public COpaquePtrManager getConstOpaqueTypeManager(String rootName) {
		return cConstRootOpaqueTypeMap.get(rootName);
	}

	/**
	 * @param <T>
	 */
	private static class GMap<T extends AbstractUnitManager> extends HashMap<String, T> {
		/**
		 * 
		 */
		private static final long serialVersionUID = 304106661335992910L;

		/**
		 * Name of the group
		 */
		private final String groupName;

		GMap(String groupName) {
			if (groupName == null) {
				throw new NullPointerException();
			}
			this.groupName = groupName;
		}

		/**
		 * Put a unit manager into the given map
		 * 
		 * @param unitname
		 *            unit name
		 * @param manager
		 *            manager
		 * @param map
		 *            map to put the manager in
		 * @param groupname
		 *            name of the manager group
		 */
		public final T put(String unitname, T manager) {
			Iterator<Entry<String, T>> it = entrySet().iterator();
			Map.Entry<String, T> entry = null;
			boolean collision = false;
			while (it.hasNext() && !collision) {
				entry = it.next();
				collision = entry.getKey().toLowerCase().equals(unitname.toLowerCase())
						&& !(entry.getKey().equals(unitname));
			}
			if (!collision) {
				return super.put(unitname, manager);
			} else {
				LOG.debug(groupName + " collision was detected! " + entry.getKey() + " collides with new " + unitname
						+ "!");
			}
			return null;
		}
	}

	public Collection<CStructManager> getAllStructs() {
		return cStructMap.values();
	}

	public Collection<ObjCClassManager> getAllObjCClasss() {
		return objcClassMap.values();
	}

	public Collection<ObjCProtocolManager> getAllObjCProtocols() {
		return objcProtocolMap.values();
	}

	public Collection<CEnumManager> getAllCEnums() {
		return cEnumMap.values();
	}

	public Collection<CManager> getAllCManagers() {
		return cManagerMap.values();
	}

}
