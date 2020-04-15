package ua.zp.bainacad.lab13.wrappers;

public class WrapperTest {
    public static void main(String[] args) {
        {
            Byte b1 = 123;
            Byte b2 = Byte.valueOf((byte) 123);
            Byte b3 = new Byte((byte) 101);
            Byte b4 = Byte.parseByte("123");

            Short s1 = 527;
            Short s2 = Short.valueOf((short) 527);
            Short s3 = new Short((short) 527);
            Short s4 = Short.parseShort("527");

            Integer i1 = 10;
            Integer i2 = Integer.valueOf(10);
            Integer i3 = new Integer(10);
            Integer i4 = Integer.parseInt("10");

            Long l1 = 1123330L;
            Long l2 = Long.valueOf(1123330);
            Long l3 = new Long(1123330);
            Long l4 = Long.parseLong("1123330");

            Float f1 = 11.0F;
            Float f2 = Float.valueOf(11.0F);
            Float f3 = new Float(11.0);
            Float f4 = Float.parseFloat("11.0");

            Double d1 = 11.012;
            Double d2 = Double.valueOf(11.012);
            Double d3 = new Double(11.012);
            Double d4 = Double.parseDouble("11.012");

            Character c1 = '\t';
            Character c2 = Character.valueOf('\t');
            Character c3 = new Character('\t');
            //Character c4 = Character.parseCharacter('\t');
        }
        {
            Double dd = 123.456;
            double d = dd;
            byte bDd = dd.byteValue();
            short sDd = Short.parseShort(dd.toString());
            int iDd = (int) (double) dd;
            float fDd = (float) dd.doubleValue();
            long lDd = (long) d;
        }
        {
            Double d1,d2;
            d1=0.0;
            Double nanValue;
            nanValue= d1/d1;
            Double infinityValue=0.1;
            infinityValue = infinityValue / d1;
            System.out.println(nanValue.toString());
            System.out.println(infinityValue.toString());

            if(nanValue.isNaN()){
                System.out.println("Переменная "+nanValue+" = NaN");
            }
            if(nanValue.isInfinite()){
                System.out.println("Переменная "+nanValue+" = Infinity");
            }
            if(infinityValue.isNaN()){
                System.out.println("Переменная "+infinityValue+" = NaN");
            }
            if(infinityValue.isInfinite()){
                System.out.println("Переменная "+infinityValue+" = Infinity");
            }
        }
        {
            Long l1 = 120L;
            Long l2 = Long.valueOf(120);
            if (l1 == l2) {
                System.out.println(l1 + "==" + l2);
            } else {
                System.out.println(l1 + "!=" + l2);
            }
            l1=1200L;
            l2=1200L;
            if (l1 == l2) {
                System.out.println(l1 + "==" + l2);
            } else {
                System.out.println(l1 + "!=" + l2);
            }

        }
    }
}
