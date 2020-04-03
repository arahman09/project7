public class OuterClass {

    public String payment;

    InnerClass1 visa = new InnerClass1();
    InnerClass2 master = new InnerClass2();
    InnerClass3 amex = new InnerClass3();
    InnerClass4 discover = new InnerClass4();


    public void paymentMethod () {
        System.out.println("This is a Payment Method");
        visa.visaCardMethod();
        master.masterCardMethod();
        amex.amexCardMethod();
        discover.discoverMethod();

    }

    public class InnerClass1 {

        private String visaCard;

        private void visaCardMethod() {

            System.out.println("This Payment done by Visa Card");

        }
    }
    public class InnerClass2 {

        private String masterCard;

        private void masterCardMethod () {

            System.out.println("This Payment done by Master Card");

        }
    }


    public class  InnerClass3  {

        private String amexCard;

        private void amexCardMethod () {

            System.out.println("This Payment done by American Express Card");
        }
    }


    private class InnerClass4 {

        private String discoverCard;

        private void discoverMethod () {

            System.out.println("This Payment done by Discover Card");

        }
    }

    }

