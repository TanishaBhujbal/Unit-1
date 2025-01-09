public class Logical {
    public static void main (String [] args){
        int a = 10, b = 14, c = 9;
        boolean d  =a>b;
        boolean e = b>c;
        boolean f = b>=c;

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        int x = 20, y = 15, z =18;
        boolean p = (x>y&&x>z);
        boolean q = (x>y||x>z);
        boolean r = !(x>y);

        System.out.println(p);
        System.out.println(q);
        System.out.println(r);

    }

}
