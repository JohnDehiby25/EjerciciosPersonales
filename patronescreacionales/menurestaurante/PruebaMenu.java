public class PruebaMenu {

    public static void main(String[] args){
        Menu personalizado = new Menu.MenuBuilder("Sancocho de pescado","Limonada")
                .withPostre("Tiramisu")
                .withPanArtesanal("Pan de ajo")
                .buildMenu();
        System.out.println(personalizado);

        Menu vegetariano = Menu.MenuBuilder.vegetariano();
        System.out.println(vegetariano);


    }
}
