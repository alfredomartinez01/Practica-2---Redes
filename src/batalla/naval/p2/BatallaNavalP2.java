// for (int k = 0; k < indice; k++) { // Recorremos cada nave
//            Nave nv = naves[k];
//            
//            System.out.println("Nave: " + k);
//            for (int i = 0; i < nv.getLongitud(); i++) { // Recorremos cada punto de cada nave
//                
//                System.out.print("direc: " + direccion + ", x: " + nv.obtenerPuntos().get(i).x + ", y:" + nv.obtenerPuntos().get(i).y);
//                System.out.println("    x_in: " + x_inicio + ", y_in:" + y_inicio);
//                
//                for (int p = 0; p < naves[indice].getLongitud(); p++) { // Recorremos cada punto de la nueva nave
//                    
//                    if (direccion == 1) {
//                        System.out.println("x2: "+ (x_inicio + p));
//                        if (nv.intersecta(x_inicio + p, y_inicio)) {
//                            System.out.println("Sí");
//                            return true;
//                        }
//                    } else {
//                        System.out.println("y2: "+ (y_inicio + p));
//                        if (nv.intersecta(x_inicio,  y_inicio + p)) {
//                            System.out.println("Sí");
//                            return true;
//                        }
//                    }
//                }
//            }
//        }
