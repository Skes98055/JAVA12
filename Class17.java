public class Class17 {
    public static void main(String[] args) {
        String a="262904713";
        short b=Short.parseShort(a);
        System.out.println(b);
        //因為範圍在	-32,768 ~ 32,767,所以印出錯誤
    }
}
