package jour07.job05;

    class A {
        public A() {

        }
    }
    
    class B extends A {
        public B() {
            super ();
        }

    }

    class C extends B {
        public C() {
            super();
        }
    }

    class D extends A {

        protected int d = 1;

        public D (int x){
            super(); 
            d =x; 
        }
        public D() {

        }

    }
    
    class E extends D {
        public E() {
            super ();
            
        }
    }

    class F extends D {
        public F() {
            super ();
        }
    }