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

public class COpaquePtrImplManager {

	private final AbstractUnitManager manager;

	public COpaquePtrImplManager(AbstractUnitManager manager) {
		if (manager == null) {
			throw new IllegalArgumentException();
		}

		this.manager = manager;
	}

	public final String getName() {
		return "Impl";
	}

	public final void update(ClassMemberEditor cme) throws GeneratorException {
		if (cme.getManager() != manager) {
			return;
		}

		ClassEditor editor = cme.getBlockClass(getName());

		if (editor != null && editor.isEditable()) {
			editor.setClass();
			editor.setClassName(getName());
			editor.setSuperClass(manager.addImport(Constants.OpaquePtrImplFQ));
			editor.setInterfaces(manager.getUnitName());

			ModifierEditor modifiers = editor.getModifiers();
			modifiers.setGenerated();

			editor.close();
		}

		Type pointerCAT = new Type(Constants.PointerFQ, true);
		String pointerCAN = "peer";
		ConstructorEditor pointerC = editor.getMemberEditor().setConstructor(pointerCAT);
		if (pointerC != null && pointerC.isEditable()) {
			pointerC.setName(getName());
			pointerC.getModifiers().setProtected();
			pointerC.getModifiers().setGenerated();
			pointerC.setArgumentCount(1);
			pointerC.setArgument(0, pointerCAN, pointerCAT, TypeResolver.PRIMITIVE_RESOLVER);
			pointerC.setBodyAsSuperInitWithPointerAsArg(pointerCAN);
			pointerC.close();
		}
	}

	public final AbstractUnitManager getManager() {
		return manager;
	}

}
