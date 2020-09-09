/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.qbit.geradordecodigos;

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

        String basePackage = "br.com.rioformoso";
        String entity = "Empreendimento";
        String entityL = "empreendimento";
        String base_url = "/api/empreendimento";

        JtwigTemplate template = JtwigTemplate.classpathTemplate("kotlin/controller.kt.twig");

        JtwigModel model = JtwigModel.newModel()
                .with("entity", entity)
                .with("basepackage", basePackage)
                .with("entityL", entityL)
                .with("base_url", base_url);
        template.render(model, System.out);
    }

}
