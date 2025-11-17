package org.moe.core.svm;

import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;
import org.graalvm.nativeimage.ProcessProperties;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@TargetClass(className = "com.oracle.svm.jdwp.resident.DebuggingOnDemandHandler")
final class Target_com_oracle_svm_jdwp_resident_DebuggingOnDemandHandler {

    @Substitute
    private static Path findLibrary(String libraryName, boolean throwIfNotFound, List<Path> searchPaths) {
        return Paths.get(ProcessProperties.getExecutableName()).getParent().resolve("Frameworks").resolve("svmjdwp.framework").resolve("svmjdwp");
    }
}

@TargetClass(className = "com.oracle.svm.interpreter.metadata.MetadataUtil")
final class Target_com_oracle_svm_interpreter_metadata_MetadataUtil {

    @Substitute
    public static Path metadataFilePath(Path binaryFilePath) {
        String arch = System.getProperty("os.arch");

        if (arch.equals("aarch64")) {
            arch = "arm64";
        } else if (arch.equals("amd64")) {
            arch = "x86_64";
        }

        String metadataFileName = "jdwp_" + arch + ".metadata";
        return binaryFilePath.resolveSibling(metadataFileName);
    }
}

public class JDWPSubstitutions {

}
