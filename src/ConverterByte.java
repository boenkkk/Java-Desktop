
class ConverterByte{
    public static void main(String[] args) {
        System.out.println("104-"+getSize(104));
        System.out.println("1048-"+getSize(1048));
        System.out.println("10485-"+getSize(10485));
        System.out.println("104857-"+getSize(104857));
        System.out.println("1048576-"+getSize(1048576));
    }
    public static String getSize(long size) {
        String s = "";
        double kb = size / 1024;
        double mb = kb / 1024;
        double gb = kb / 1024;
        double tb = kb / 1024;
        if(size < 1024) {
            s = size + " Bytes";
        } else if(size >= 1024 && size < (1024 * 1024)) {
            s =  String.format("%.2f", kb) + " KB";
        } else if(size >= (1024 * 1024) && size < (1024 * 1024 * 1024)) {
            s = String.format("%.2f", mb) + " MB";
        } else if(size >= (1024 * 1024 * 1024) && size < (1024 * 1024 * 1024 * 1024)) {
            s = String.format("%.2f", gb) + " GB";
        } else if(size >= (1024 * 1024 * 1024 * 1024)) {
            s = String.format("%.2f", tb) + " TB";
        }
        return s;
    }
}