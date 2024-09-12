class String_sort {
    static void stringSorting(String str){
        char []arr=str.toCharArray();
        Arrays.sort(arr);
        System.out.println(String.valueOf(arr));
    }
    public static void main(String[] args) {
        String s="prepbytes";
        stringSorting(s);
    }
}
