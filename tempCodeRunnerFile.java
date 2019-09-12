        do{
                JFrame frame = new JFrame("InputDialog Example #1");
                String kroner =JOptionPane.showInputDialog(frame, "Hvor mange Kroner vil du konverter?");
                try{
                    test = Double.parseDouble(kroner);
                }catch (NumberFormatException nfe){
                    JFrame frames = new JFrame("InputDialog Example #2");
                    JOptionPane.showMessageDialog(frames, "Dette er ikke et nummber");
            }
            }while(test==0);