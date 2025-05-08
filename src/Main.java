public class Main {
    public static void main(String[] args) {
        String filePath = "laborator8_input.xlsx";
        ExcelReader reader = new ExcelReader(filePath);
        reader.readAndPrintExcel();
    }
}
