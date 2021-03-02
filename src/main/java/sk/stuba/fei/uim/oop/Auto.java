package sk.stuba.fei.uim.oop;

public class Auto {

        private static double Fuel_Per_KM=0.5;
        private boolean neojazdene;
        private double kapacitaNadrze;
        private double stavNadrze;

        public Auto(double kapacitaNadrze) {
            neojazdene=true;
            this.kapacitaNadrze=kapacitaNadrze;
        }

        public Auto(){
                this.kapacitaNadrze=100;
        }

        public void dotankovat(){
                stavNadrze=kapacitaNadrze;
        }
        public void drive(double distanceInKm){
                this.neojazdene=false;
                stavNadrze-= distanceInKm * Fuel_Per_KM;
                if(stavNadrze<0){
                        stavNadrze=0;
                }
        }
        public double getStavNadrze(){
                return stavNadrze;
        }

        public void setStavNadrze(double stavNadrze){
                this.stavNadrze=stavNadrze;

        }

        public static double getFuel_Per_KM() {
                return Fuel_Per_KM;
        }

        public static void setFuel_Per_KM(double fuel_Per_KM) {
                Fuel_Per_KM = fuel_Per_KM;
        }

        public double getKapacitaNadrze() {
                return kapacitaNadrze;
        }

        public void setKapacitaNadrze(double kapacitaNadrze) {
                this.kapacitaNadrze = kapacitaNadrze;
        }


        public boolean isNeojazdene() {
                return neojazdene;
        }

        public void setNeojazdene(boolean neojazdene) {
                this.neojazdene = neojazdene;
        }

        public String currentState(){
                String result ="";
                if (this.neojazdene){
                        result= "Auto je neojazdene";
                }
                else {
                        result= "Auto je ojazdene";
                }
                        result +="\n"+stavNadrze+"\\"+kapacitaNadrze;
                        return result;
                }
        }
