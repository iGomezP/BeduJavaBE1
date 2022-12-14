public class Application {
    public static void main(String Args[]){
        TextEditor editor = new TextEditor();

        // El usuario presiona el botón de guardar
        editor.onPressSaveButton();

        // El usuario presiona el botón de guardar
        editor.onMenuSaveOption();

        // El usuario presiona la combinación en el teclado
        editor.onShortcut();
    }
}
