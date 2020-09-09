/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.qbit.geradordecodigos;

import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;

/**
 *
 * @author lmdc
 */
public class MainServices {

    public static void main(String[] args) {
        String basePackage = "br.com.rioformoso";
        String entity = "Endereco";
        String entityL = "endereco";

        JtwigTemplate template = JtwigTemplate.classpathTemplate("kotlin/services.kt.twig");

        JtwigModel model = JtwigModel.newModel()
                .with("entity", entity)
                .with("basepackage", basePackage)
                .with("entityL", entityL);
        template.render(model, System.out);
    }

}

