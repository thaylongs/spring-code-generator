/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geradordecodigos;

import java.io.File;
import java.io.FileOutputStream;
import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;

/**
 *
 * @author lmdc
 */
public class MainController {

    public static void main(String[] args) {

        String basePackage = "br.uff.lmdc.DataLakeService";
        String entity = "FolderDataLake";
        String entityL = "folderDataLake";
        String base_url = "/api/folder";

        JtwigTemplate template = JtwigTemplate.classpathTemplate("controller.twig");

        JtwigModel model = JtwigModel.newModel()
                .with("entity", entity)
                .with("basepackage", basePackage)
                .with("entityL", entityL);
        template.render(model, System.out);
    }

}
