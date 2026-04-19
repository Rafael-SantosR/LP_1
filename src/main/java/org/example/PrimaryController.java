package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML private TabPane tabPane;

    // Elementos Neston
    @FXML private TextField fieldSaborNeston, fieldCorNeston, fieldTamNeston;
    @FXML private TextArea txtNeston;

    // Elementos Fralda
    @FXML private TextField fieldMarcaFralda, fieldTamFralda, fieldQtdFralda;
    @FXML private TextArea txtFralda;

    // Elementos Desodorante
    @FXML private TextField fieldMarcaDeso, fieldDuracaoDeso, fieldMlDeso;
    @FXML private TextArea txtDesodorante;

    // Navegação
    @FXML private void irParaNeston() { tabPane.getSelectionModel().select(1); }
    @FXML private void irParaFralda() { tabPane.getSelectionModel().select(2); }
    @FXML private void irParaDesodorante() { tabPane.getSelectionModel().select(3); }

    // --- Ações NESTON ---
    @FXML private void acaoVitamina() { txtNeston.appendText("Vitamina de " + fieldSaborNeston.getText() + " preparada!\n"); }
    @FXML private void acaoValidade() { txtNeston.appendText("Validade do Neston conferida.\n"); }
    @FXML private void acaoEstoque() { txtNeston.appendText("Estoque atualizado para " + fieldTamNeston.getText() + " unidades.\n"); }

    // --- Ações FRALDA ---
    @FXML private void acaoAbsorcao() { txtFralda.appendText("Teste de absorção da " + fieldMarcaFralda.getText() + " concluído.\n"); }
    @FXML private void acaoTamanho() { txtFralda.appendText("Tamanho " + fieldTamFralda.getText() + " disponível.\n"); }
    @FXML private void acaoPacote() { txtFralda.appendText("Pacote com " + fieldQtdFralda.getText() + " fraldas verificado.\n"); }

    // --- Ações DESODORANTE ---
    @FXML private void acaoProtecao() { txtDesodorante.appendText("Proteção de " + fieldDuracaoDeso.getText() + "h ativada.\n"); }
    @FXML private void acaoFragrancia() { txtDesodorante.appendText("Fragrância da marca " + fieldMarcaDeso.getText() + " selecionada.\n"); }
    @FXML private void acaoSpray() { txtDesodorante.appendText("Volume de " + fieldMlDeso.getText() + "ml registrado.\n"); }

    // Registros
    @FXML private void registrarNeston() { fieldSaborNeston.clear(); fieldCorNeston.clear(); fieldTamNeston.clear(); }
    @FXML private void registrarFralda() { fieldMarcaFralda.clear(); fieldTamFralda.clear(); fieldQtdFralda.clear(); }
    @FXML private void registrarDesodorante() { fieldMarcaDeso.clear(); fieldDuracaoDeso.clear(); fieldMlDeso.clear(); }
}