package br.com.ithappens;

import br.com.ithappens.controller.ProdutoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class App  {
  @Autowired
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}