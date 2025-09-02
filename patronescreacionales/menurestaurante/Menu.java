public class Menu {
    private String mainPlate;
    private String bebida;
    private String postre;
    private String aperitivos;
    private String panArtesanal;
    private String sopaDia;

    private Menu(MenuBuilder builder){
        this.mainPlate = builder.mainPlate;
        this.bebida = builder.bebida;
        this.postre = builder.postre;
        this.aperitivos = builder.aperitivos;
        this.panArtesanal = builder.panArtesanal;
        this.sopaDia = builder.sopaDia;
    }
    public static class MenuBuilder{
        private String mainPlate;
        private String bebida;
        private String postre="No usado";
        private String aperitivos ="No usado";
        private String panArtesanal = "No seleccionado";
        private String sopaDia = "No utilizado";

        public MenuBuilder(String mainPlate,String bebida){
            this.mainPlate = mainPlate;
            this.bebida = bebida;
        }
        public Menu buildMenu(){
            return new Menu(this);
        }
        public MenuBuilder withPostre(String postre){
            this.postre = postre;
            return(this);
        }
        public MenuBuilder withAperitivos(String aperitivos){
            this.aperitivos = aperitivos;
            return this;
        }
        public MenuBuilder withPanArtesanal(String panArtesanal){
            this.panArtesanal = panArtesanal;
            return this;
        }
        public MenuBuilder withSopaDia(String sopaDia){
            this.sopaDia = sopaDia;
            return this;
        }
        public static Menu infantil(){
            return new MenuBuilder("Hamburguesa pequeña","Jugo de naranja")
                    .withPostre("Helado")
                    .withAperitivos("Papas Fritas")
                    .buildMenu();
        }
        public static Menu vegetariano(){
            return new MenuBuilder("Ensalada de quinoa","agua")
                    .withSopaDia("Sopa de verduras")
                    .withPostre("Flan")
                    .buildMenu();
        }
        public static Menu ejecutivo(){
            return new MenuBuilder("Filete de res","vino tinto")
                    .withSopaDia("Sopa de verduras")
                    .withPostre("Flan")
                    .buildMenu();
        }


    }
    public String getPanArtesanal() {
        return panArtesanal;
    }

    public String getSopaDia() {
        return sopaDia;
    }

    public String getAperitivos() {
        return aperitivos;
    }

    public String getPostre() {
        return postre;
    }
    public String getBebida() {
        return bebida;
    }

    public String getMainPlate() {
        return mainPlate;
    }
    @Override
    public String toString() {
        return "Menu{" +
                "mainPlate='" + mainPlate + '\'' +
                ", bebida='" + bebida + '\'' +
                ", postre='" + postre + '\'' +
                ", aperitivos='" + aperitivos + '\'' +
                ", panArtesanal='" + panArtesanal + '\'' +
                ", sopaDia='" + sopaDia + '\'' +
                '}';
    }
}
