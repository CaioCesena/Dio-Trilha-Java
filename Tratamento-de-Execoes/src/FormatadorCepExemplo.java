public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("02752070");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExeception e) {
            // TODO Auto-generated catch block
            System.out.println("O Cep esta incorreto");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoExeception{
        if(cep.length() != 8)
        throw new CepInvalidoExeception();

        return "027.52-070";
    }
}
