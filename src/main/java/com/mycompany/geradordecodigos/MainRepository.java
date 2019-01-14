/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geradordecodigos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;

/**
 *
 * @author lmdc
 */
public class MainRepository {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File outputDir = new File("/home/lmdc/Documentos/Data Lake Service/backend/src/main/java/br/uff/lmdc/DataLakeService/repository");
        String targetPackage = "br.uff.lmdc.DataLakeService.repository";
        String entityPackage = "br.uff.lmdc.DataLakeService.entities";
        List<String> entities = Arrays.asList("Attribute", "DataLakeFileReference", "FileDataLakeFileReference", "FileTag", "FolderToFile", "OperationSourceData", "SchemaAttributes", "Tag", "AttributeType", "DataSource", "FileDataLake", "FileTypeClassification", "InterTableSchemaDependencies", "OperationType", "Schema", "TransformationSourceFile", "ExternalFile", "FileDependencies", "FileType", "OperationDependencies", "PermissionLevel", "StatisticsOfAttributes", "Workflow", "CommentFileAttachment", "FileComments", "FileTables", "FolderDataLake", "Operation", "Person", "TableSchemaAttribute");

        JtwigTemplate template = JtwigTemplate.classpathTemplate("reporitory.twig");

        for (String entity : entities) {
            JtwigModel model = JtwigModel.newModel().with("entity", entity)
                    .with("packageEntities", entityPackage)
                    .with("packageRepo", targetPackage);
            try (FileOutputStream o = new FileOutputStream(new File(outputDir, entity + "Repository.java"))) {
                template.render(model, o);
            }

        }
    }
}
