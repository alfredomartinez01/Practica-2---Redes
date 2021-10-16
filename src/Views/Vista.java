package Views;

import java.awt.Color;
import javax.swing.JPanel;

public class Vista extends javax.swing.JFrame {

    // Variables de ayuda para la posición de las ventanas
    private static final int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    private static final int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    private static JPanel[][] tableroPropio = new JPanel[10][10];
    private static JPanel[][] tableroOponente = new JPanel[10][10];

    public Vista() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        declararTableros();
        
        
    }
    
    
    
    
    /*
        Declaramos todas las celdas de los tableros
     */
    public void declararTableros() {
        // Declarando todas las celdas del tablero propio
        tableroPropio[0][0] = my_1x1;
        tableroPropio[0][1] = my_1x2;
        tableroPropio[0][2] = my_1x3;
        tableroPropio[0][3] = my_1x4;
        tableroPropio[0][4] = my_1x5;
        tableroPropio[0][5] = my_1x6;
        tableroPropio[0][6] = my_1x7;
        tableroPropio[0][7] = my_1x8;
        tableroPropio[0][8] = my_1x9;
        tableroPropio[0][9] = my_1x10;
        tableroPropio[1][0] = my_2x1;
        tableroPropio[1][1] = my_2x2;
        tableroPropio[1][2] = my_2x3;
        tableroPropio[1][3] = my_2x4;
        tableroPropio[1][4] = my_2x5;
        tableroPropio[1][5] = my_2x6;
        tableroPropio[1][6] = my_2x7;
        tableroPropio[1][7] = my_2x8;
        tableroPropio[1][8] = my_2x9;
        tableroPropio[1][9] = my_2x10;
        tableroPropio[2][0] = my_3x1;
        tableroPropio[2][1] = my_3x2;
        tableroPropio[2][2] = my_3x3;
        tableroPropio[2][3] = my_3x4;
        tableroPropio[2][4] = my_3x5;
        tableroPropio[2][5] = my_3x6;
        tableroPropio[2][6] = my_3x7;
        tableroPropio[2][7] = my_3x8;
        tableroPropio[2][8] = my_3x9;
        tableroPropio[2][9] = my_3x10;
        tableroPropio[3][0] = my_4x1;
        tableroPropio[3][1] = my_4x2;
        tableroPropio[3][2] = my_4x3;
        tableroPropio[3][3] = my_4x4;
        tableroPropio[3][4] = my_4x5;
        tableroPropio[3][5] = my_4x6;
        tableroPropio[3][6] = my_4x7;
        tableroPropio[3][7] = my_4x8;
        tableroPropio[3][8] = my_4x9;
        tableroPropio[3][9] = my_4x10;
        tableroPropio[4][0] = my_5x1;
        tableroPropio[4][1] = my_5x2;
        tableroPropio[4][2] = my_5x3;
        tableroPropio[4][3] = my_5x4;
        tableroPropio[4][4] = my_5x5;
        tableroPropio[4][5] = my_5x6;
        tableroPropio[4][6] = my_5x7;
        tableroPropio[4][7] = my_5x8;
        tableroPropio[4][8] = my_5x9;
        tableroPropio[4][9] = my_5x10;
        tableroPropio[5][0] = my_6x1;
        tableroPropio[5][1] = my_6x2;
        tableroPropio[5][2] = my_6x3;
        tableroPropio[5][3] = my_6x4;
        tableroPropio[5][4] = my_6x5;
        tableroPropio[5][5] = my_6x6;
        tableroPropio[5][6] = my_6x7;
        tableroPropio[5][7] = my_6x8;
        tableroPropio[5][8] = my_6x9;
        tableroPropio[5][9] = my_6x10;
        tableroPropio[6][0] = my_7x1;
        tableroPropio[6][1] = my_7x2;
        tableroPropio[6][2] = my_7x3;
        tableroPropio[6][3] = my_7x4;
        tableroPropio[6][4] = my_7x5;
        tableroPropio[6][5] = my_7x6;
        tableroPropio[6][6] = my_7x7;
        tableroPropio[6][7] = my_7x8;
        tableroPropio[6][8] = my_7x9;
        tableroPropio[6][9] = my_7x10;
        tableroPropio[7][0] = my_8x1;
        tableroPropio[7][1] = my_8x2;
        tableroPropio[7][2] = my_8x3;
        tableroPropio[7][3] = my_8x4;
        tableroPropio[7][4] = my_8x5;
        tableroPropio[7][5] = my_8x6;
        tableroPropio[7][6] = my_8x7;
        tableroPropio[7][7] = my_8x8;
        tableroPropio[7][8] = my_8x9;
        tableroPropio[7][9] = my_8x10;
        tableroPropio[8][0] = my_9x1;
        tableroPropio[8][1] = my_9x2;
        tableroPropio[8][2] = my_9x3;
        tableroPropio[8][3] = my_9x4;
        tableroPropio[8][4] = my_9x5;
        tableroPropio[8][5] = my_9x6;
        tableroPropio[8][6] = my_9x7;
        tableroPropio[8][7] = my_9x8;
        tableroPropio[8][8] = my_9x9;
        tableroPropio[8][9] = my_9x10;
        tableroPropio[9][0] = my_10x1;
        tableroPropio[9][1] = my_10x2;
        tableroPropio[9][2] = my_10x3;
        tableroPropio[9][3] = my_10x4;
        tableroPropio[9][4] = my_10x5;
        tableroPropio[9][5] = my_10x6;
        tableroPropio[9][6] = my_10x7;
        tableroPropio[9][7] = my_10x8;
        tableroPropio[9][8] = my_10x9;
        tableroPropio[9][9] = my_10x10;
        
        // Tablero del oponente
        tableroOponente[0][0] = vs_1x1;
        tableroOponente[0][1] = vs_1x2;
        tableroOponente[0][2] = vs_1x3;
        tableroOponente[0][3] = vs_1x4;
        tableroOponente[0][4] = vs_1x5;
        tableroOponente[0][5] = vs_1x6;
        tableroOponente[0][6] = vs_1x7;
        tableroOponente[0][7] = vs_1x8;
        tableroOponente[0][8] = vs_1x9;
        tableroOponente[0][9] = vs_1x10;
        tableroOponente[1][0] = vs_2x1;
        tableroOponente[1][1] = vs_2x2;
        tableroOponente[1][2] = vs_2x3;
        tableroOponente[1][3] = vs_2x4;
        tableroOponente[1][4] = vs_2x5;
        tableroOponente[1][5] = vs_2x6;
        tableroOponente[1][6] = vs_2x7;
        tableroOponente[1][7] = vs_2x8;
        tableroOponente[1][8] = vs_2x9;
        tableroOponente[1][9] = vs_2x10;
        tableroOponente[2][0] = vs_3x1;
        tableroOponente[2][1] = vs_3x2;
        tableroOponente[2][2] = vs_3x3;
        tableroOponente[2][3] = vs_3x4;
        tableroOponente[2][4] = vs_3x5;
        tableroOponente[2][5] = vs_3x6;
        tableroOponente[2][6] = vs_3x7;
        tableroOponente[2][7] = vs_3x8;
        tableroOponente[2][8] = vs_3x9;
        tableroOponente[2][9] = vs_3x10;
        tableroOponente[3][0] = vs_4x1;
        tableroOponente[3][1] = vs_4x2;
        tableroOponente[3][2] = vs_4x3;
        tableroOponente[3][3] = vs_4x4;
        tableroOponente[3][4] = vs_4x5;
        tableroOponente[3][5] = vs_4x6;
        tableroOponente[3][6] = vs_4x7;
        tableroOponente[3][7] = vs_4x8;
        tableroOponente[3][8] = vs_4x9;
        tableroOponente[3][9] = vs_4x10;
        tableroOponente[4][0] = vs_5x1;
        tableroOponente[4][1] = vs_5x2;
        tableroOponente[4][2] = vs_5x3;
        tableroOponente[4][3] = vs_5x4;
        tableroOponente[4][4] = vs_5x5;
        tableroOponente[4][5] = vs_5x6;
        tableroOponente[4][6] = vs_5x7;
        tableroOponente[4][7] = vs_5x8;
        tableroOponente[4][8] = vs_5x9;
        tableroOponente[4][9] = vs_5x10;
        tableroOponente[5][0] = vs_6x1;
        tableroOponente[5][1] = vs_6x2;
        tableroOponente[5][2] = vs_6x3;
        tableroOponente[5][3] = vs_6x4;
        tableroOponente[5][4] = vs_6x5;
        tableroOponente[5][5] = vs_6x6;
        tableroOponente[5][6] = vs_6x7;
        tableroOponente[5][7] = vs_6x8;
        tableroOponente[5][8] = vs_6x9;
        tableroOponente[5][9] = vs_6x10;
        tableroOponente[6][0] = vs_7x1;
        tableroOponente[6][1] = vs_7x2;
        tableroOponente[6][2] = vs_7x3;
        tableroOponente[6][3] = vs_7x4;
        tableroOponente[6][4] = vs_7x5;
        tableroOponente[6][5] = vs_7x6;
        tableroOponente[6][6] = vs_7x7;
        tableroOponente[6][7] = vs_7x8;
        tableroOponente[6][8] = vs_7x9;
        tableroOponente[6][9] = vs_7x10;
        tableroOponente[7][0] = vs_8x1;
        tableroOponente[7][1] = vs_8x2;
        tableroOponente[7][2] = vs_8x3;
        tableroOponente[7][3] = vs_8x4;
        tableroOponente[7][4] = vs_8x5;
        tableroOponente[7][5] = vs_8x6;
        tableroOponente[7][6] = vs_8x7;
        tableroOponente[7][7] = vs_8x8;
        tableroOponente[7][8] = vs_8x9;
        tableroOponente[7][9] = vs_8x10;
        tableroOponente[8][0] = vs_9x1;
        tableroOponente[8][1] = vs_9x2;
        tableroOponente[8][2] = vs_9x3;
        tableroOponente[8][3] = vs_9x4;
        tableroOponente[8][4] = vs_9x5;
        tableroOponente[8][5] = vs_9x6;
        tableroOponente[8][6] = vs_9x7;
        tableroOponente[8][7] = vs_9x8;
        tableroOponente[8][8] = vs_9x9;
        tableroOponente[8][9] = vs_9x10;
        tableroOponente[9][0] = vs_10x1;
        tableroOponente[9][1] = vs_10x2;
        tableroOponente[9][2] = vs_10x3;
        tableroOponente[9][3] = vs_10x4;
        tableroOponente[9][4] = vs_10x5;
        tableroOponente[9][5] = vs_10x6;
        tableroOponente[9][6] = vs_10x7;
        tableroOponente[9][7] = vs_10x8;
        tableroOponente[9][8] = vs_10x9;
        tableroOponente[9][9] = vs_10x10;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        my_3x1 = new javax.swing.JPanel();
        my_3x2 = new javax.swing.JPanel();
        my_3x3 = new javax.swing.JPanel();
        my_1x2 = new javax.swing.JPanel();
        my_3x4 = new javax.swing.JPanel();
        my_1x3 = new javax.swing.JPanel();
        my_1x4 = new javax.swing.JPanel();
        my_3x5 = new javax.swing.JPanel();
        my_3x6 = new javax.swing.JPanel();
        my_1x5 = new javax.swing.JPanel();
        my_3x7 = new javax.swing.JPanel();
        my_1x6 = new javax.swing.JPanel();
        my_3x8 = new javax.swing.JPanel();
        my_1x7 = new javax.swing.JPanel();
        my_3x9 = new javax.swing.JPanel();
        my_1x8 = new javax.swing.JPanel();
        my_3x10 = new javax.swing.JPanel();
        my_1x9 = new javax.swing.JPanel();
        my_4x1 = new javax.swing.JPanel();
        my_1x10 = new javax.swing.JPanel();
        my_4x2 = new javax.swing.JPanel();
        my_2x1 = new javax.swing.JPanel();
        my_4x3 = new javax.swing.JPanel();
        my_2x2 = new javax.swing.JPanel();
        my_4x4 = new javax.swing.JPanel();
        my_2x3 = new javax.swing.JPanel();
        my_1x1 = new javax.swing.JPanel();
        my_2x4 = new javax.swing.JPanel();
        my_4x5 = new javax.swing.JPanel();
        my_4x6 = new javax.swing.JPanel();
        my_2x5 = new javax.swing.JPanel();
        my_4x7 = new javax.swing.JPanel();
        my_2x6 = new javax.swing.JPanel();
        my_4x8 = new javax.swing.JPanel();
        my_2x7 = new javax.swing.JPanel();
        my_4x9 = new javax.swing.JPanel();
        my_2x8 = new javax.swing.JPanel();
        my_4x10 = new javax.swing.JPanel();
        my_2x9 = new javax.swing.JPanel();
        my_2x10 = new javax.swing.JPanel();
        my_5x1 = new javax.swing.JPanel();
        my_5x2 = new javax.swing.JPanel();
        my_5x3 = new javax.swing.JPanel();
        my_5x4 = new javax.swing.JPanel();
        my_5x5 = new javax.swing.JPanel();
        my_5x6 = new javax.swing.JPanel();
        my_5x7 = new javax.swing.JPanel();
        my_5x8 = new javax.swing.JPanel();
        my_5x9 = new javax.swing.JPanel();
        my_5x10 = new javax.swing.JPanel();
        my_6x1 = new javax.swing.JPanel();
        my_6x2 = new javax.swing.JPanel();
        my_6x3 = new javax.swing.JPanel();
        my_6x4 = new javax.swing.JPanel();
        my_6x5 = new javax.swing.JPanel();
        my_6x6 = new javax.swing.JPanel();
        my_6x7 = new javax.swing.JPanel();
        my_6x8 = new javax.swing.JPanel();
        my_6x9 = new javax.swing.JPanel();
        my_6x10 = new javax.swing.JPanel();
        my_7x1 = new javax.swing.JPanel();
        my_7x2 = new javax.swing.JPanel();
        my_7x3 = new javax.swing.JPanel();
        my_7x4 = new javax.swing.JPanel();
        my_7x5 = new javax.swing.JPanel();
        my_7x6 = new javax.swing.JPanel();
        my_7x7 = new javax.swing.JPanel();
        my_7x8 = new javax.swing.JPanel();
        my_7x9 = new javax.swing.JPanel();
        my_7x10 = new javax.swing.JPanel();
        my_8x1 = new javax.swing.JPanel();
        my_8x2 = new javax.swing.JPanel();
        my_8x3 = new javax.swing.JPanel();
        my_8x4 = new javax.swing.JPanel();
        my_8x5 = new javax.swing.JPanel();
        my_8x6 = new javax.swing.JPanel();
        my_8x7 = new javax.swing.JPanel();
        my_8x8 = new javax.swing.JPanel();
        my_8x9 = new javax.swing.JPanel();
        my_8x10 = new javax.swing.JPanel();
        my_9x1 = new javax.swing.JPanel();
        my_9x2 = new javax.swing.JPanel();
        my_9x3 = new javax.swing.JPanel();
        my_9x4 = new javax.swing.JPanel();
        my_9x5 = new javax.swing.JPanel();
        my_9x6 = new javax.swing.JPanel();
        my_9x7 = new javax.swing.JPanel();
        my_9x8 = new javax.swing.JPanel();
        my_9x9 = new javax.swing.JPanel();
        my_9x10 = new javax.swing.JPanel();
        my_10x1 = new javax.swing.JPanel();
        my_10x2 = new javax.swing.JPanel();
        my_10x3 = new javax.swing.JPanel();
        my_10x4 = new javax.swing.JPanel();
        my_10x5 = new javax.swing.JPanel();
        my_10x6 = new javax.swing.JPanel();
        my_10x7 = new javax.swing.JPanel();
        my_10x8 = new javax.swing.JPanel();
        my_10x9 = new javax.swing.JPanel();
        my_10x10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        vs_1x1 = new javax.swing.JPanel();
        vs_1x2 = new javax.swing.JPanel();
        vs_1x3 = new javax.swing.JPanel();
        vs_1x4 = new javax.swing.JPanel();
        vs_1x5 = new javax.swing.JPanel();
        vs_1x6 = new javax.swing.JPanel();
        vs_1x7 = new javax.swing.JPanel();
        vs_1x8 = new javax.swing.JPanel();
        vs_1x9 = new javax.swing.JPanel();
        vs_1x10 = new javax.swing.JPanel();
        vs_2x1 = new javax.swing.JPanel();
        vs_2x2 = new javax.swing.JPanel();
        vs_2x3 = new javax.swing.JPanel();
        vs_2x4 = new javax.swing.JPanel();
        vs_2x5 = new javax.swing.JPanel();
        vs_2x6 = new javax.swing.JPanel();
        vs_2x7 = new javax.swing.JPanel();
        vs_2x8 = new javax.swing.JPanel();
        vs_2x9 = new javax.swing.JPanel();
        vs_2x10 = new javax.swing.JPanel();
        vs_3x1 = new javax.swing.JPanel();
        vs_3x2 = new javax.swing.JPanel();
        vs_3x3 = new javax.swing.JPanel();
        vs_3x4 = new javax.swing.JPanel();
        vs_3x5 = new javax.swing.JPanel();
        vs_3x6 = new javax.swing.JPanel();
        vs_3x7 = new javax.swing.JPanel();
        vs_3x8 = new javax.swing.JPanel();
        vs_3x9 = new javax.swing.JPanel();
        vs_3x10 = new javax.swing.JPanel();
        vs_4x1 = new javax.swing.JPanel();
        vs_4x2 = new javax.swing.JPanel();
        vs_4x3 = new javax.swing.JPanel();
        vs_4x4 = new javax.swing.JPanel();
        vs_4x5 = new javax.swing.JPanel();
        vs_4x6 = new javax.swing.JPanel();
        vs_4x7 = new javax.swing.JPanel();
        vs_4x8 = new javax.swing.JPanel();
        vs_4x9 = new javax.swing.JPanel();
        vs_4x10 = new javax.swing.JPanel();
        vs_5x1 = new javax.swing.JPanel();
        vs_5x2 = new javax.swing.JPanel();
        vs_5x3 = new javax.swing.JPanel();
        vs_5x4 = new javax.swing.JPanel();
        vs_5x5 = new javax.swing.JPanel();
        vs_5x6 = new javax.swing.JPanel();
        vs_5x7 = new javax.swing.JPanel();
        vs_5x8 = new javax.swing.JPanel();
        vs_5x9 = new javax.swing.JPanel();
        vs_5x10 = new javax.swing.JPanel();
        vs_6x1 = new javax.swing.JPanel();
        vs_6x2 = new javax.swing.JPanel();
        vs_6x3 = new javax.swing.JPanel();
        vs_6x4 = new javax.swing.JPanel();
        vs_6x5 = new javax.swing.JPanel();
        vs_6x6 = new javax.swing.JPanel();
        vs_6x7 = new javax.swing.JPanel();
        vs_6x8 = new javax.swing.JPanel();
        vs_6x9 = new javax.swing.JPanel();
        vs_6x10 = new javax.swing.JPanel();
        vs_7x1 = new javax.swing.JPanel();
        vs_7x2 = new javax.swing.JPanel();
        vs_7x3 = new javax.swing.JPanel();
        vs_7x4 = new javax.swing.JPanel();
        vs_7x5 = new javax.swing.JPanel();
        vs_7x6 = new javax.swing.JPanel();
        vs_7x7 = new javax.swing.JPanel();
        vs_7x8 = new javax.swing.JPanel();
        vs_7x9 = new javax.swing.JPanel();
        vs_7x10 = new javax.swing.JPanel();
        vs_8x1 = new javax.swing.JPanel();
        vs_8x2 = new javax.swing.JPanel();
        vs_8x3 = new javax.swing.JPanel();
        vs_8x4 = new javax.swing.JPanel();
        vs_8x5 = new javax.swing.JPanel();
        vs_8x6 = new javax.swing.JPanel();
        vs_8x7 = new javax.swing.JPanel();
        vs_8x8 = new javax.swing.JPanel();
        vs_8x9 = new javax.swing.JPanel();
        vs_8x10 = new javax.swing.JPanel();
        vs_9x1 = new javax.swing.JPanel();
        vs_9x2 = new javax.swing.JPanel();
        vs_9x3 = new javax.swing.JPanel();
        vs_9x4 = new javax.swing.JPanel();
        vs_9x5 = new javax.swing.JPanel();
        vs_9x6 = new javax.swing.JPanel();
        vs_9x7 = new javax.swing.JPanel();
        vs_9x8 = new javax.swing.JPanel();
        vs_9x9 = new javax.swing.JPanel();
        vs_9x10 = new javax.swing.JPanel();
        vs_10x1 = new javax.swing.JPanel();
        vs_10x2 = new javax.swing.JPanel();
        vs_10x3 = new javax.swing.JPanel();
        vs_10x4 = new javax.swing.JPanel();
        vs_10x5 = new javax.swing.JPanel();
        vs_10x6 = new javax.swing.JPanel();
        vs_10x7 = new javax.swing.JPanel();
        vs_10x8 = new javax.swing.JPanel();
        vs_10x9 = new javax.swing.JPanel();
        vs_10x10 = new javax.swing.JPanel();
        lbl_my_tab = new javax.swing.JLabel();
        lbl_my_tab1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        acorazado_1 = new javax.swing.JPanel();
        acorazado_2 = new javax.swing.JPanel();
        acorazado_3 = new javax.swing.JPanel();
        acorazado_4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        crucero_1 = new javax.swing.JPanel();
        crucero_2 = new javax.swing.JPanel();
        crucero_3 = new javax.swing.JPanel();
        submarino_1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        destructores_2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        destructores_1 = new javax.swing.JPanel();
        acorazado_rest = new javax.swing.JLabel();
        crucero_rest = new javax.swing.JLabel();
        destructor_rest = new javax.swing.JLabel();
        submarino_rest = new javax.swing.JLabel();
        lbl_instrucciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        my_3x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_3x1Layout = new javax.swing.GroupLayout(my_3x1);
        my_3x1.setLayout(my_3x1Layout);
        my_3x1Layout.setHorizontalGroup(
            my_3x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_3x1Layout.setVerticalGroup(
            my_3x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_3x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_3x2Layout = new javax.swing.GroupLayout(my_3x2);
        my_3x2.setLayout(my_3x2Layout);
        my_3x2Layout.setHorizontalGroup(
            my_3x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_3x2Layout.setVerticalGroup(
            my_3x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_3x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_3x3Layout = new javax.swing.GroupLayout(my_3x3);
        my_3x3.setLayout(my_3x3Layout);
        my_3x3Layout.setHorizontalGroup(
            my_3x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_3x3Layout.setVerticalGroup(
            my_3x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_1x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_1x2Layout = new javax.swing.GroupLayout(my_1x2);
        my_1x2.setLayout(my_1x2Layout);
        my_1x2Layout.setHorizontalGroup(
            my_1x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_1x2Layout.setVerticalGroup(
            my_1x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_3x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_3x4Layout = new javax.swing.GroupLayout(my_3x4);
        my_3x4.setLayout(my_3x4Layout);
        my_3x4Layout.setHorizontalGroup(
            my_3x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_3x4Layout.setVerticalGroup(
            my_3x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_1x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_1x3Layout = new javax.swing.GroupLayout(my_1x3);
        my_1x3.setLayout(my_1x3Layout);
        my_1x3Layout.setHorizontalGroup(
            my_1x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_1x3Layout.setVerticalGroup(
            my_1x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_1x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_1x4Layout = new javax.swing.GroupLayout(my_1x4);
        my_1x4.setLayout(my_1x4Layout);
        my_1x4Layout.setHorizontalGroup(
            my_1x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_1x4Layout.setVerticalGroup(
            my_1x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_3x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_3x5Layout = new javax.swing.GroupLayout(my_3x5);
        my_3x5.setLayout(my_3x5Layout);
        my_3x5Layout.setHorizontalGroup(
            my_3x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_3x5Layout.setVerticalGroup(
            my_3x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_3x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_3x6Layout = new javax.swing.GroupLayout(my_3x6);
        my_3x6.setLayout(my_3x6Layout);
        my_3x6Layout.setHorizontalGroup(
            my_3x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_3x6Layout.setVerticalGroup(
            my_3x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_1x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_1x5Layout = new javax.swing.GroupLayout(my_1x5);
        my_1x5.setLayout(my_1x5Layout);
        my_1x5Layout.setHorizontalGroup(
            my_1x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_1x5Layout.setVerticalGroup(
            my_1x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_3x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_3x7Layout = new javax.swing.GroupLayout(my_3x7);
        my_3x7.setLayout(my_3x7Layout);
        my_3x7Layout.setHorizontalGroup(
            my_3x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_3x7Layout.setVerticalGroup(
            my_3x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_1x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_1x6Layout = new javax.swing.GroupLayout(my_1x6);
        my_1x6.setLayout(my_1x6Layout);
        my_1x6Layout.setHorizontalGroup(
            my_1x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_1x6Layout.setVerticalGroup(
            my_1x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_3x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_3x8Layout = new javax.swing.GroupLayout(my_3x8);
        my_3x8.setLayout(my_3x8Layout);
        my_3x8Layout.setHorizontalGroup(
            my_3x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_3x8Layout.setVerticalGroup(
            my_3x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_1x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_1x7Layout = new javax.swing.GroupLayout(my_1x7);
        my_1x7.setLayout(my_1x7Layout);
        my_1x7Layout.setHorizontalGroup(
            my_1x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_1x7Layout.setVerticalGroup(
            my_1x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_3x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_3x9Layout = new javax.swing.GroupLayout(my_3x9);
        my_3x9.setLayout(my_3x9Layout);
        my_3x9Layout.setHorizontalGroup(
            my_3x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_3x9Layout.setVerticalGroup(
            my_3x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_1x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_1x8Layout = new javax.swing.GroupLayout(my_1x8);
        my_1x8.setLayout(my_1x8Layout);
        my_1x8Layout.setHorizontalGroup(
            my_1x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_1x8Layout.setVerticalGroup(
            my_1x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_3x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_3x10Layout = new javax.swing.GroupLayout(my_3x10);
        my_3x10.setLayout(my_3x10Layout);
        my_3x10Layout.setHorizontalGroup(
            my_3x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_3x10Layout.setVerticalGroup(
            my_3x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_1x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_1x9Layout = new javax.swing.GroupLayout(my_1x9);
        my_1x9.setLayout(my_1x9Layout);
        my_1x9Layout.setHorizontalGroup(
            my_1x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_1x9Layout.setVerticalGroup(
            my_1x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_4x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_4x1Layout = new javax.swing.GroupLayout(my_4x1);
        my_4x1.setLayout(my_4x1Layout);
        my_4x1Layout.setHorizontalGroup(
            my_4x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_4x1Layout.setVerticalGroup(
            my_4x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_1x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_1x10Layout = new javax.swing.GroupLayout(my_1x10);
        my_1x10.setLayout(my_1x10Layout);
        my_1x10Layout.setHorizontalGroup(
            my_1x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_1x10Layout.setVerticalGroup(
            my_1x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_4x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_4x2Layout = new javax.swing.GroupLayout(my_4x2);
        my_4x2.setLayout(my_4x2Layout);
        my_4x2Layout.setHorizontalGroup(
            my_4x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_4x2Layout.setVerticalGroup(
            my_4x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_2x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_2x1Layout = new javax.swing.GroupLayout(my_2x1);
        my_2x1.setLayout(my_2x1Layout);
        my_2x1Layout.setHorizontalGroup(
            my_2x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_2x1Layout.setVerticalGroup(
            my_2x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_4x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_4x3Layout = new javax.swing.GroupLayout(my_4x3);
        my_4x3.setLayout(my_4x3Layout);
        my_4x3Layout.setHorizontalGroup(
            my_4x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_4x3Layout.setVerticalGroup(
            my_4x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_2x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_2x2Layout = new javax.swing.GroupLayout(my_2x2);
        my_2x2.setLayout(my_2x2Layout);
        my_2x2Layout.setHorizontalGroup(
            my_2x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_2x2Layout.setVerticalGroup(
            my_2x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_4x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_4x4Layout = new javax.swing.GroupLayout(my_4x4);
        my_4x4.setLayout(my_4x4Layout);
        my_4x4Layout.setHorizontalGroup(
            my_4x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_4x4Layout.setVerticalGroup(
            my_4x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_2x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_2x3Layout = new javax.swing.GroupLayout(my_2x3);
        my_2x3.setLayout(my_2x3Layout);
        my_2x3Layout.setHorizontalGroup(
            my_2x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_2x3Layout.setVerticalGroup(
            my_2x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_1x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_1x1Layout = new javax.swing.GroupLayout(my_1x1);
        my_1x1.setLayout(my_1x1Layout);
        my_1x1Layout.setHorizontalGroup(
            my_1x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_1x1Layout.setVerticalGroup(
            my_1x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_2x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_2x4Layout = new javax.swing.GroupLayout(my_2x4);
        my_2x4.setLayout(my_2x4Layout);
        my_2x4Layout.setHorizontalGroup(
            my_2x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_2x4Layout.setVerticalGroup(
            my_2x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_4x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_4x5Layout = new javax.swing.GroupLayout(my_4x5);
        my_4x5.setLayout(my_4x5Layout);
        my_4x5Layout.setHorizontalGroup(
            my_4x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_4x5Layout.setVerticalGroup(
            my_4x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_4x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_4x6Layout = new javax.swing.GroupLayout(my_4x6);
        my_4x6.setLayout(my_4x6Layout);
        my_4x6Layout.setHorizontalGroup(
            my_4x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_4x6Layout.setVerticalGroup(
            my_4x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_2x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_2x5Layout = new javax.swing.GroupLayout(my_2x5);
        my_2x5.setLayout(my_2x5Layout);
        my_2x5Layout.setHorizontalGroup(
            my_2x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_2x5Layout.setVerticalGroup(
            my_2x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_4x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_4x7Layout = new javax.swing.GroupLayout(my_4x7);
        my_4x7.setLayout(my_4x7Layout);
        my_4x7Layout.setHorizontalGroup(
            my_4x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_4x7Layout.setVerticalGroup(
            my_4x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_2x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_2x6Layout = new javax.swing.GroupLayout(my_2x6);
        my_2x6.setLayout(my_2x6Layout);
        my_2x6Layout.setHorizontalGroup(
            my_2x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_2x6Layout.setVerticalGroup(
            my_2x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_4x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_4x8Layout = new javax.swing.GroupLayout(my_4x8);
        my_4x8.setLayout(my_4x8Layout);
        my_4x8Layout.setHorizontalGroup(
            my_4x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_4x8Layout.setVerticalGroup(
            my_4x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_2x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_2x7Layout = new javax.swing.GroupLayout(my_2x7);
        my_2x7.setLayout(my_2x7Layout);
        my_2x7Layout.setHorizontalGroup(
            my_2x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_2x7Layout.setVerticalGroup(
            my_2x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_4x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_4x9Layout = new javax.swing.GroupLayout(my_4x9);
        my_4x9.setLayout(my_4x9Layout);
        my_4x9Layout.setHorizontalGroup(
            my_4x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_4x9Layout.setVerticalGroup(
            my_4x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_2x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_2x8Layout = new javax.swing.GroupLayout(my_2x8);
        my_2x8.setLayout(my_2x8Layout);
        my_2x8Layout.setHorizontalGroup(
            my_2x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_2x8Layout.setVerticalGroup(
            my_2x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_4x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_4x10Layout = new javax.swing.GroupLayout(my_4x10);
        my_4x10.setLayout(my_4x10Layout);
        my_4x10Layout.setHorizontalGroup(
            my_4x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_4x10Layout.setVerticalGroup(
            my_4x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_2x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_2x9Layout = new javax.swing.GroupLayout(my_2x9);
        my_2x9.setLayout(my_2x9Layout);
        my_2x9Layout.setHorizontalGroup(
            my_2x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_2x9Layout.setVerticalGroup(
            my_2x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_2x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_2x10Layout = new javax.swing.GroupLayout(my_2x10);
        my_2x10.setLayout(my_2x10Layout);
        my_2x10Layout.setHorizontalGroup(
            my_2x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_2x10Layout.setVerticalGroup(
            my_2x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_5x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_5x1Layout = new javax.swing.GroupLayout(my_5x1);
        my_5x1.setLayout(my_5x1Layout);
        my_5x1Layout.setHorizontalGroup(
            my_5x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_5x1Layout.setVerticalGroup(
            my_5x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_5x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_5x2Layout = new javax.swing.GroupLayout(my_5x2);
        my_5x2.setLayout(my_5x2Layout);
        my_5x2Layout.setHorizontalGroup(
            my_5x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_5x2Layout.setVerticalGroup(
            my_5x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_5x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_5x3Layout = new javax.swing.GroupLayout(my_5x3);
        my_5x3.setLayout(my_5x3Layout);
        my_5x3Layout.setHorizontalGroup(
            my_5x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_5x3Layout.setVerticalGroup(
            my_5x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_5x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_5x4Layout = new javax.swing.GroupLayout(my_5x4);
        my_5x4.setLayout(my_5x4Layout);
        my_5x4Layout.setHorizontalGroup(
            my_5x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_5x4Layout.setVerticalGroup(
            my_5x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_5x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_5x5Layout = new javax.swing.GroupLayout(my_5x5);
        my_5x5.setLayout(my_5x5Layout);
        my_5x5Layout.setHorizontalGroup(
            my_5x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_5x5Layout.setVerticalGroup(
            my_5x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_5x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_5x6Layout = new javax.swing.GroupLayout(my_5x6);
        my_5x6.setLayout(my_5x6Layout);
        my_5x6Layout.setHorizontalGroup(
            my_5x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_5x6Layout.setVerticalGroup(
            my_5x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_5x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_5x7Layout = new javax.swing.GroupLayout(my_5x7);
        my_5x7.setLayout(my_5x7Layout);
        my_5x7Layout.setHorizontalGroup(
            my_5x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_5x7Layout.setVerticalGroup(
            my_5x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_5x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_5x8Layout = new javax.swing.GroupLayout(my_5x8);
        my_5x8.setLayout(my_5x8Layout);
        my_5x8Layout.setHorizontalGroup(
            my_5x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_5x8Layout.setVerticalGroup(
            my_5x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_5x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_5x9Layout = new javax.swing.GroupLayout(my_5x9);
        my_5x9.setLayout(my_5x9Layout);
        my_5x9Layout.setHorizontalGroup(
            my_5x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_5x9Layout.setVerticalGroup(
            my_5x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_5x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_5x10Layout = new javax.swing.GroupLayout(my_5x10);
        my_5x10.setLayout(my_5x10Layout);
        my_5x10Layout.setHorizontalGroup(
            my_5x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_5x10Layout.setVerticalGroup(
            my_5x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_6x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_6x1Layout = new javax.swing.GroupLayout(my_6x1);
        my_6x1.setLayout(my_6x1Layout);
        my_6x1Layout.setHorizontalGroup(
            my_6x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_6x1Layout.setVerticalGroup(
            my_6x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_6x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_6x2Layout = new javax.swing.GroupLayout(my_6x2);
        my_6x2.setLayout(my_6x2Layout);
        my_6x2Layout.setHorizontalGroup(
            my_6x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_6x2Layout.setVerticalGroup(
            my_6x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_6x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_6x3Layout = new javax.swing.GroupLayout(my_6x3);
        my_6x3.setLayout(my_6x3Layout);
        my_6x3Layout.setHorizontalGroup(
            my_6x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_6x3Layout.setVerticalGroup(
            my_6x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_6x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_6x4Layout = new javax.swing.GroupLayout(my_6x4);
        my_6x4.setLayout(my_6x4Layout);
        my_6x4Layout.setHorizontalGroup(
            my_6x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_6x4Layout.setVerticalGroup(
            my_6x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_6x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_6x5Layout = new javax.swing.GroupLayout(my_6x5);
        my_6x5.setLayout(my_6x5Layout);
        my_6x5Layout.setHorizontalGroup(
            my_6x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_6x5Layout.setVerticalGroup(
            my_6x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_6x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_6x6Layout = new javax.swing.GroupLayout(my_6x6);
        my_6x6.setLayout(my_6x6Layout);
        my_6x6Layout.setHorizontalGroup(
            my_6x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_6x6Layout.setVerticalGroup(
            my_6x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_6x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_6x7Layout = new javax.swing.GroupLayout(my_6x7);
        my_6x7.setLayout(my_6x7Layout);
        my_6x7Layout.setHorizontalGroup(
            my_6x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_6x7Layout.setVerticalGroup(
            my_6x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_6x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_6x8Layout = new javax.swing.GroupLayout(my_6x8);
        my_6x8.setLayout(my_6x8Layout);
        my_6x8Layout.setHorizontalGroup(
            my_6x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_6x8Layout.setVerticalGroup(
            my_6x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_6x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_6x9Layout = new javax.swing.GroupLayout(my_6x9);
        my_6x9.setLayout(my_6x9Layout);
        my_6x9Layout.setHorizontalGroup(
            my_6x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_6x9Layout.setVerticalGroup(
            my_6x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_6x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_6x10Layout = new javax.swing.GroupLayout(my_6x10);
        my_6x10.setLayout(my_6x10Layout);
        my_6x10Layout.setHorizontalGroup(
            my_6x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_6x10Layout.setVerticalGroup(
            my_6x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_7x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_7x1Layout = new javax.swing.GroupLayout(my_7x1);
        my_7x1.setLayout(my_7x1Layout);
        my_7x1Layout.setHorizontalGroup(
            my_7x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_7x1Layout.setVerticalGroup(
            my_7x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_7x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_7x2Layout = new javax.swing.GroupLayout(my_7x2);
        my_7x2.setLayout(my_7x2Layout);
        my_7x2Layout.setHorizontalGroup(
            my_7x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_7x2Layout.setVerticalGroup(
            my_7x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_7x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_7x3Layout = new javax.swing.GroupLayout(my_7x3);
        my_7x3.setLayout(my_7x3Layout);
        my_7x3Layout.setHorizontalGroup(
            my_7x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_7x3Layout.setVerticalGroup(
            my_7x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_7x4.setBackground(new java.awt.Color(204, 255, 255));
        my_7x4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout my_7x4Layout = new javax.swing.GroupLayout(my_7x4);
        my_7x4.setLayout(my_7x4Layout);
        my_7x4Layout.setHorizontalGroup(
            my_7x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_7x4Layout.setVerticalGroup(
            my_7x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_7x5.setBackground(new java.awt.Color(204, 255, 255));
        my_7x5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout my_7x5Layout = new javax.swing.GroupLayout(my_7x5);
        my_7x5.setLayout(my_7x5Layout);
        my_7x5Layout.setHorizontalGroup(
            my_7x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_7x5Layout.setVerticalGroup(
            my_7x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_7x6.setBackground(new java.awt.Color(204, 255, 255));
        my_7x6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout my_7x6Layout = new javax.swing.GroupLayout(my_7x6);
        my_7x6.setLayout(my_7x6Layout);
        my_7x6Layout.setHorizontalGroup(
            my_7x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_7x6Layout.setVerticalGroup(
            my_7x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_7x7.setBackground(new java.awt.Color(204, 255, 255));
        my_7x7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout my_7x7Layout = new javax.swing.GroupLayout(my_7x7);
        my_7x7.setLayout(my_7x7Layout);
        my_7x7Layout.setHorizontalGroup(
            my_7x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_7x7Layout.setVerticalGroup(
            my_7x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_7x8.setBackground(new java.awt.Color(204, 255, 255));
        my_7x8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout my_7x8Layout = new javax.swing.GroupLayout(my_7x8);
        my_7x8.setLayout(my_7x8Layout);
        my_7x8Layout.setHorizontalGroup(
            my_7x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_7x8Layout.setVerticalGroup(
            my_7x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_7x9.setBackground(new java.awt.Color(204, 255, 255));
        my_7x9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout my_7x9Layout = new javax.swing.GroupLayout(my_7x9);
        my_7x9.setLayout(my_7x9Layout);
        my_7x9Layout.setHorizontalGroup(
            my_7x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_7x9Layout.setVerticalGroup(
            my_7x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_7x10.setBackground(new java.awt.Color(204, 255, 255));
        my_7x10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout my_7x10Layout = new javax.swing.GroupLayout(my_7x10);
        my_7x10.setLayout(my_7x10Layout);
        my_7x10Layout.setHorizontalGroup(
            my_7x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_7x10Layout.setVerticalGroup(
            my_7x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_8x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_8x1Layout = new javax.swing.GroupLayout(my_8x1);
        my_8x1.setLayout(my_8x1Layout);
        my_8x1Layout.setHorizontalGroup(
            my_8x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_8x1Layout.setVerticalGroup(
            my_8x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_8x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_8x2Layout = new javax.swing.GroupLayout(my_8x2);
        my_8x2.setLayout(my_8x2Layout);
        my_8x2Layout.setHorizontalGroup(
            my_8x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_8x2Layout.setVerticalGroup(
            my_8x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_8x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_8x3Layout = new javax.swing.GroupLayout(my_8x3);
        my_8x3.setLayout(my_8x3Layout);
        my_8x3Layout.setHorizontalGroup(
            my_8x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_8x3Layout.setVerticalGroup(
            my_8x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_8x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_8x4Layout = new javax.swing.GroupLayout(my_8x4);
        my_8x4.setLayout(my_8x4Layout);
        my_8x4Layout.setHorizontalGroup(
            my_8x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_8x4Layout.setVerticalGroup(
            my_8x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_8x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_8x5Layout = new javax.swing.GroupLayout(my_8x5);
        my_8x5.setLayout(my_8x5Layout);
        my_8x5Layout.setHorizontalGroup(
            my_8x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_8x5Layout.setVerticalGroup(
            my_8x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_8x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_8x6Layout = new javax.swing.GroupLayout(my_8x6);
        my_8x6.setLayout(my_8x6Layout);
        my_8x6Layout.setHorizontalGroup(
            my_8x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_8x6Layout.setVerticalGroup(
            my_8x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_8x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_8x7Layout = new javax.swing.GroupLayout(my_8x7);
        my_8x7.setLayout(my_8x7Layout);
        my_8x7Layout.setHorizontalGroup(
            my_8x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_8x7Layout.setVerticalGroup(
            my_8x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_8x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_8x8Layout = new javax.swing.GroupLayout(my_8x8);
        my_8x8.setLayout(my_8x8Layout);
        my_8x8Layout.setHorizontalGroup(
            my_8x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_8x8Layout.setVerticalGroup(
            my_8x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_8x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_8x9Layout = new javax.swing.GroupLayout(my_8x9);
        my_8x9.setLayout(my_8x9Layout);
        my_8x9Layout.setHorizontalGroup(
            my_8x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_8x9Layout.setVerticalGroup(
            my_8x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_8x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_8x10Layout = new javax.swing.GroupLayout(my_8x10);
        my_8x10.setLayout(my_8x10Layout);
        my_8x10Layout.setHorizontalGroup(
            my_8x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_8x10Layout.setVerticalGroup(
            my_8x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_9x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_9x1Layout = new javax.swing.GroupLayout(my_9x1);
        my_9x1.setLayout(my_9x1Layout);
        my_9x1Layout.setHorizontalGroup(
            my_9x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_9x1Layout.setVerticalGroup(
            my_9x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_9x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_9x2Layout = new javax.swing.GroupLayout(my_9x2);
        my_9x2.setLayout(my_9x2Layout);
        my_9x2Layout.setHorizontalGroup(
            my_9x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_9x2Layout.setVerticalGroup(
            my_9x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_9x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_9x3Layout = new javax.swing.GroupLayout(my_9x3);
        my_9x3.setLayout(my_9x3Layout);
        my_9x3Layout.setHorizontalGroup(
            my_9x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_9x3Layout.setVerticalGroup(
            my_9x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_9x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_9x4Layout = new javax.swing.GroupLayout(my_9x4);
        my_9x4.setLayout(my_9x4Layout);
        my_9x4Layout.setHorizontalGroup(
            my_9x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_9x4Layout.setVerticalGroup(
            my_9x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_9x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_9x5Layout = new javax.swing.GroupLayout(my_9x5);
        my_9x5.setLayout(my_9x5Layout);
        my_9x5Layout.setHorizontalGroup(
            my_9x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_9x5Layout.setVerticalGroup(
            my_9x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_9x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_9x6Layout = new javax.swing.GroupLayout(my_9x6);
        my_9x6.setLayout(my_9x6Layout);
        my_9x6Layout.setHorizontalGroup(
            my_9x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_9x6Layout.setVerticalGroup(
            my_9x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_9x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_9x7Layout = new javax.swing.GroupLayout(my_9x7);
        my_9x7.setLayout(my_9x7Layout);
        my_9x7Layout.setHorizontalGroup(
            my_9x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_9x7Layout.setVerticalGroup(
            my_9x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_9x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_9x8Layout = new javax.swing.GroupLayout(my_9x8);
        my_9x8.setLayout(my_9x8Layout);
        my_9x8Layout.setHorizontalGroup(
            my_9x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_9x8Layout.setVerticalGroup(
            my_9x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_9x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_9x9Layout = new javax.swing.GroupLayout(my_9x9);
        my_9x9.setLayout(my_9x9Layout);
        my_9x9Layout.setHorizontalGroup(
            my_9x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_9x9Layout.setVerticalGroup(
            my_9x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_9x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_9x10Layout = new javax.swing.GroupLayout(my_9x10);
        my_9x10.setLayout(my_9x10Layout);
        my_9x10Layout.setHorizontalGroup(
            my_9x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_9x10Layout.setVerticalGroup(
            my_9x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_10x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_10x1Layout = new javax.swing.GroupLayout(my_10x1);
        my_10x1.setLayout(my_10x1Layout);
        my_10x1Layout.setHorizontalGroup(
            my_10x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_10x1Layout.setVerticalGroup(
            my_10x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_10x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_10x2Layout = new javax.swing.GroupLayout(my_10x2);
        my_10x2.setLayout(my_10x2Layout);
        my_10x2Layout.setHorizontalGroup(
            my_10x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_10x2Layout.setVerticalGroup(
            my_10x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_10x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_10x3Layout = new javax.swing.GroupLayout(my_10x3);
        my_10x3.setLayout(my_10x3Layout);
        my_10x3Layout.setHorizontalGroup(
            my_10x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_10x3Layout.setVerticalGroup(
            my_10x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_10x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_10x4Layout = new javax.swing.GroupLayout(my_10x4);
        my_10x4.setLayout(my_10x4Layout);
        my_10x4Layout.setHorizontalGroup(
            my_10x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_10x4Layout.setVerticalGroup(
            my_10x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_10x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_10x5Layout = new javax.swing.GroupLayout(my_10x5);
        my_10x5.setLayout(my_10x5Layout);
        my_10x5Layout.setHorizontalGroup(
            my_10x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_10x5Layout.setVerticalGroup(
            my_10x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_10x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_10x6Layout = new javax.swing.GroupLayout(my_10x6);
        my_10x6.setLayout(my_10x6Layout);
        my_10x6Layout.setHorizontalGroup(
            my_10x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_10x6Layout.setVerticalGroup(
            my_10x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_10x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_10x7Layout = new javax.swing.GroupLayout(my_10x7);
        my_10x7.setLayout(my_10x7Layout);
        my_10x7Layout.setHorizontalGroup(
            my_10x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_10x7Layout.setVerticalGroup(
            my_10x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_10x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_10x8Layout = new javax.swing.GroupLayout(my_10x8);
        my_10x8.setLayout(my_10x8Layout);
        my_10x8Layout.setHorizontalGroup(
            my_10x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_10x8Layout.setVerticalGroup(
            my_10x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_10x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_10x9Layout = new javax.swing.GroupLayout(my_10x9);
        my_10x9.setLayout(my_10x9Layout);
        my_10x9Layout.setHorizontalGroup(
            my_10x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_10x9Layout.setVerticalGroup(
            my_10x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        my_10x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout my_10x10Layout = new javax.swing.GroupLayout(my_10x10);
        my_10x10.setLayout(my_10x10Layout);
        my_10x10Layout.setHorizontalGroup(
            my_10x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        my_10x10Layout.setVerticalGroup(
            my_10x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(my_4x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_4x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_4x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_4x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_4x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_4x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_4x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_4x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_4x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_4x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(my_1x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_1x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_1x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_1x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_1x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_1x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_1x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_1x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_1x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_1x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(my_2x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_2x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_2x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_2x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_2x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_2x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_2x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_2x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_2x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_2x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(my_3x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_3x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_3x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_3x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_3x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_3x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_3x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_3x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_3x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_3x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(my_5x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_5x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_5x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_5x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_5x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_5x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_5x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_5x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_5x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_5x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(my_6x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_6x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_6x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_6x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_6x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_6x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_6x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_6x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_6x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_6x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(my_7x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_7x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_7x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_7x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_7x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_7x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_7x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_7x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_7x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_7x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(my_8x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_8x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_8x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_8x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_8x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_8x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_8x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_8x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_8x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_8x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(my_9x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_9x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_9x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_9x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_9x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_9x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_9x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_9x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_9x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_9x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(my_10x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_10x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_10x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_10x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_10x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_10x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_10x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_10x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_10x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(my_10x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(my_1x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_1x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_1x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_1x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_1x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_1x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_1x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_1x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_1x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_1x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(my_2x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_2x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_2x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_2x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_2x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_2x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_2x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_2x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_2x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_2x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(my_3x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_3x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_3x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_3x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_3x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_3x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_3x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_3x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_3x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_3x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(my_4x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_4x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_4x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_4x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_4x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_4x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_4x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_4x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_4x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_4x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(my_5x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_5x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_5x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_5x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_5x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_5x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_5x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_5x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_5x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_5x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(my_6x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_6x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_6x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_6x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_6x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_6x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_6x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_6x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_6x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_6x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(my_7x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_7x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_7x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_7x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_7x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_7x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_7x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_7x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_7x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_7x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(my_8x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_8x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_8x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_8x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_8x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_8x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_8x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_8x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_8x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_8x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(my_9x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_9x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_9x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_9x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_9x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_9x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_9x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_9x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_9x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_9x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(my_10x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_10x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_10x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_10x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_10x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_10x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_10x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_10x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_10x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(my_10x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        vs_1x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_1x1Layout = new javax.swing.GroupLayout(vs_1x1);
        vs_1x1.setLayout(vs_1x1Layout);
        vs_1x1Layout.setHorizontalGroup(
            vs_1x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_1x1Layout.setVerticalGroup(
            vs_1x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_1x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_1x2Layout = new javax.swing.GroupLayout(vs_1x2);
        vs_1x2.setLayout(vs_1x2Layout);
        vs_1x2Layout.setHorizontalGroup(
            vs_1x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_1x2Layout.setVerticalGroup(
            vs_1x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_1x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_1x3Layout = new javax.swing.GroupLayout(vs_1x3);
        vs_1x3.setLayout(vs_1x3Layout);
        vs_1x3Layout.setHorizontalGroup(
            vs_1x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_1x3Layout.setVerticalGroup(
            vs_1x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_1x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_1x4Layout = new javax.swing.GroupLayout(vs_1x4);
        vs_1x4.setLayout(vs_1x4Layout);
        vs_1x4Layout.setHorizontalGroup(
            vs_1x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_1x4Layout.setVerticalGroup(
            vs_1x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_1x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_1x5Layout = new javax.swing.GroupLayout(vs_1x5);
        vs_1x5.setLayout(vs_1x5Layout);
        vs_1x5Layout.setHorizontalGroup(
            vs_1x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_1x5Layout.setVerticalGroup(
            vs_1x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_1x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_1x6Layout = new javax.swing.GroupLayout(vs_1x6);
        vs_1x6.setLayout(vs_1x6Layout);
        vs_1x6Layout.setHorizontalGroup(
            vs_1x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_1x6Layout.setVerticalGroup(
            vs_1x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_1x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_1x7Layout = new javax.swing.GroupLayout(vs_1x7);
        vs_1x7.setLayout(vs_1x7Layout);
        vs_1x7Layout.setHorizontalGroup(
            vs_1x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_1x7Layout.setVerticalGroup(
            vs_1x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_1x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_1x8Layout = new javax.swing.GroupLayout(vs_1x8);
        vs_1x8.setLayout(vs_1x8Layout);
        vs_1x8Layout.setHorizontalGroup(
            vs_1x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_1x8Layout.setVerticalGroup(
            vs_1x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_1x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_1x9Layout = new javax.swing.GroupLayout(vs_1x9);
        vs_1x9.setLayout(vs_1x9Layout);
        vs_1x9Layout.setHorizontalGroup(
            vs_1x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_1x9Layout.setVerticalGroup(
            vs_1x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_1x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_1x10Layout = new javax.swing.GroupLayout(vs_1x10);
        vs_1x10.setLayout(vs_1x10Layout);
        vs_1x10Layout.setHorizontalGroup(
            vs_1x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_1x10Layout.setVerticalGroup(
            vs_1x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_2x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_2x1Layout = new javax.swing.GroupLayout(vs_2x1);
        vs_2x1.setLayout(vs_2x1Layout);
        vs_2x1Layout.setHorizontalGroup(
            vs_2x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_2x1Layout.setVerticalGroup(
            vs_2x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_2x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_2x2Layout = new javax.swing.GroupLayout(vs_2x2);
        vs_2x2.setLayout(vs_2x2Layout);
        vs_2x2Layout.setHorizontalGroup(
            vs_2x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_2x2Layout.setVerticalGroup(
            vs_2x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_2x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_2x3Layout = new javax.swing.GroupLayout(vs_2x3);
        vs_2x3.setLayout(vs_2x3Layout);
        vs_2x3Layout.setHorizontalGroup(
            vs_2x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_2x3Layout.setVerticalGroup(
            vs_2x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_2x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_2x4Layout = new javax.swing.GroupLayout(vs_2x4);
        vs_2x4.setLayout(vs_2x4Layout);
        vs_2x4Layout.setHorizontalGroup(
            vs_2x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_2x4Layout.setVerticalGroup(
            vs_2x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_2x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_2x5Layout = new javax.swing.GroupLayout(vs_2x5);
        vs_2x5.setLayout(vs_2x5Layout);
        vs_2x5Layout.setHorizontalGroup(
            vs_2x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_2x5Layout.setVerticalGroup(
            vs_2x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_2x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_2x6Layout = new javax.swing.GroupLayout(vs_2x6);
        vs_2x6.setLayout(vs_2x6Layout);
        vs_2x6Layout.setHorizontalGroup(
            vs_2x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_2x6Layout.setVerticalGroup(
            vs_2x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_2x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_2x7Layout = new javax.swing.GroupLayout(vs_2x7);
        vs_2x7.setLayout(vs_2x7Layout);
        vs_2x7Layout.setHorizontalGroup(
            vs_2x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_2x7Layout.setVerticalGroup(
            vs_2x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_2x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_2x8Layout = new javax.swing.GroupLayout(vs_2x8);
        vs_2x8.setLayout(vs_2x8Layout);
        vs_2x8Layout.setHorizontalGroup(
            vs_2x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_2x8Layout.setVerticalGroup(
            vs_2x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_2x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_2x9Layout = new javax.swing.GroupLayout(vs_2x9);
        vs_2x9.setLayout(vs_2x9Layout);
        vs_2x9Layout.setHorizontalGroup(
            vs_2x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_2x9Layout.setVerticalGroup(
            vs_2x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_2x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_2x10Layout = new javax.swing.GroupLayout(vs_2x10);
        vs_2x10.setLayout(vs_2x10Layout);
        vs_2x10Layout.setHorizontalGroup(
            vs_2x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_2x10Layout.setVerticalGroup(
            vs_2x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_3x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_3x1Layout = new javax.swing.GroupLayout(vs_3x1);
        vs_3x1.setLayout(vs_3x1Layout);
        vs_3x1Layout.setHorizontalGroup(
            vs_3x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_3x1Layout.setVerticalGroup(
            vs_3x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_3x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_3x2Layout = new javax.swing.GroupLayout(vs_3x2);
        vs_3x2.setLayout(vs_3x2Layout);
        vs_3x2Layout.setHorizontalGroup(
            vs_3x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_3x2Layout.setVerticalGroup(
            vs_3x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_3x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_3x3Layout = new javax.swing.GroupLayout(vs_3x3);
        vs_3x3.setLayout(vs_3x3Layout);
        vs_3x3Layout.setHorizontalGroup(
            vs_3x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_3x3Layout.setVerticalGroup(
            vs_3x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_3x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_3x4Layout = new javax.swing.GroupLayout(vs_3x4);
        vs_3x4.setLayout(vs_3x4Layout);
        vs_3x4Layout.setHorizontalGroup(
            vs_3x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_3x4Layout.setVerticalGroup(
            vs_3x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_3x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_3x5Layout = new javax.swing.GroupLayout(vs_3x5);
        vs_3x5.setLayout(vs_3x5Layout);
        vs_3x5Layout.setHorizontalGroup(
            vs_3x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_3x5Layout.setVerticalGroup(
            vs_3x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_3x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_3x6Layout = new javax.swing.GroupLayout(vs_3x6);
        vs_3x6.setLayout(vs_3x6Layout);
        vs_3x6Layout.setHorizontalGroup(
            vs_3x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_3x6Layout.setVerticalGroup(
            vs_3x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_3x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_3x7Layout = new javax.swing.GroupLayout(vs_3x7);
        vs_3x7.setLayout(vs_3x7Layout);
        vs_3x7Layout.setHorizontalGroup(
            vs_3x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_3x7Layout.setVerticalGroup(
            vs_3x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_3x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_3x8Layout = new javax.swing.GroupLayout(vs_3x8);
        vs_3x8.setLayout(vs_3x8Layout);
        vs_3x8Layout.setHorizontalGroup(
            vs_3x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_3x8Layout.setVerticalGroup(
            vs_3x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_3x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_3x9Layout = new javax.swing.GroupLayout(vs_3x9);
        vs_3x9.setLayout(vs_3x9Layout);
        vs_3x9Layout.setHorizontalGroup(
            vs_3x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_3x9Layout.setVerticalGroup(
            vs_3x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_3x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_3x10Layout = new javax.swing.GroupLayout(vs_3x10);
        vs_3x10.setLayout(vs_3x10Layout);
        vs_3x10Layout.setHorizontalGroup(
            vs_3x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_3x10Layout.setVerticalGroup(
            vs_3x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_4x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_4x1Layout = new javax.swing.GroupLayout(vs_4x1);
        vs_4x1.setLayout(vs_4x1Layout);
        vs_4x1Layout.setHorizontalGroup(
            vs_4x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_4x1Layout.setVerticalGroup(
            vs_4x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_4x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_4x2Layout = new javax.swing.GroupLayout(vs_4x2);
        vs_4x2.setLayout(vs_4x2Layout);
        vs_4x2Layout.setHorizontalGroup(
            vs_4x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_4x2Layout.setVerticalGroup(
            vs_4x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_4x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_4x3Layout = new javax.swing.GroupLayout(vs_4x3);
        vs_4x3.setLayout(vs_4x3Layout);
        vs_4x3Layout.setHorizontalGroup(
            vs_4x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_4x3Layout.setVerticalGroup(
            vs_4x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_4x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_4x4Layout = new javax.swing.GroupLayout(vs_4x4);
        vs_4x4.setLayout(vs_4x4Layout);
        vs_4x4Layout.setHorizontalGroup(
            vs_4x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_4x4Layout.setVerticalGroup(
            vs_4x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_4x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_4x5Layout = new javax.swing.GroupLayout(vs_4x5);
        vs_4x5.setLayout(vs_4x5Layout);
        vs_4x5Layout.setHorizontalGroup(
            vs_4x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_4x5Layout.setVerticalGroup(
            vs_4x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_4x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_4x6Layout = new javax.swing.GroupLayout(vs_4x6);
        vs_4x6.setLayout(vs_4x6Layout);
        vs_4x6Layout.setHorizontalGroup(
            vs_4x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_4x6Layout.setVerticalGroup(
            vs_4x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_4x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_4x7Layout = new javax.swing.GroupLayout(vs_4x7);
        vs_4x7.setLayout(vs_4x7Layout);
        vs_4x7Layout.setHorizontalGroup(
            vs_4x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_4x7Layout.setVerticalGroup(
            vs_4x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_4x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_4x8Layout = new javax.swing.GroupLayout(vs_4x8);
        vs_4x8.setLayout(vs_4x8Layout);
        vs_4x8Layout.setHorizontalGroup(
            vs_4x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_4x8Layout.setVerticalGroup(
            vs_4x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_4x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_4x9Layout = new javax.swing.GroupLayout(vs_4x9);
        vs_4x9.setLayout(vs_4x9Layout);
        vs_4x9Layout.setHorizontalGroup(
            vs_4x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_4x9Layout.setVerticalGroup(
            vs_4x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_4x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_4x10Layout = new javax.swing.GroupLayout(vs_4x10);
        vs_4x10.setLayout(vs_4x10Layout);
        vs_4x10Layout.setHorizontalGroup(
            vs_4x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_4x10Layout.setVerticalGroup(
            vs_4x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_5x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_5x1Layout = new javax.swing.GroupLayout(vs_5x1);
        vs_5x1.setLayout(vs_5x1Layout);
        vs_5x1Layout.setHorizontalGroup(
            vs_5x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_5x1Layout.setVerticalGroup(
            vs_5x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_5x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_5x2Layout = new javax.swing.GroupLayout(vs_5x2);
        vs_5x2.setLayout(vs_5x2Layout);
        vs_5x2Layout.setHorizontalGroup(
            vs_5x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_5x2Layout.setVerticalGroup(
            vs_5x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_5x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_5x3Layout = new javax.swing.GroupLayout(vs_5x3);
        vs_5x3.setLayout(vs_5x3Layout);
        vs_5x3Layout.setHorizontalGroup(
            vs_5x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_5x3Layout.setVerticalGroup(
            vs_5x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_5x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_5x4Layout = new javax.swing.GroupLayout(vs_5x4);
        vs_5x4.setLayout(vs_5x4Layout);
        vs_5x4Layout.setHorizontalGroup(
            vs_5x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_5x4Layout.setVerticalGroup(
            vs_5x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_5x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_5x5Layout = new javax.swing.GroupLayout(vs_5x5);
        vs_5x5.setLayout(vs_5x5Layout);
        vs_5x5Layout.setHorizontalGroup(
            vs_5x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_5x5Layout.setVerticalGroup(
            vs_5x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_5x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_5x6Layout = new javax.swing.GroupLayout(vs_5x6);
        vs_5x6.setLayout(vs_5x6Layout);
        vs_5x6Layout.setHorizontalGroup(
            vs_5x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_5x6Layout.setVerticalGroup(
            vs_5x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_5x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_5x7Layout = new javax.swing.GroupLayout(vs_5x7);
        vs_5x7.setLayout(vs_5x7Layout);
        vs_5x7Layout.setHorizontalGroup(
            vs_5x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_5x7Layout.setVerticalGroup(
            vs_5x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_5x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_5x8Layout = new javax.swing.GroupLayout(vs_5x8);
        vs_5x8.setLayout(vs_5x8Layout);
        vs_5x8Layout.setHorizontalGroup(
            vs_5x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_5x8Layout.setVerticalGroup(
            vs_5x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_5x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_5x9Layout = new javax.swing.GroupLayout(vs_5x9);
        vs_5x9.setLayout(vs_5x9Layout);
        vs_5x9Layout.setHorizontalGroup(
            vs_5x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_5x9Layout.setVerticalGroup(
            vs_5x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_5x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_5x10Layout = new javax.swing.GroupLayout(vs_5x10);
        vs_5x10.setLayout(vs_5x10Layout);
        vs_5x10Layout.setHorizontalGroup(
            vs_5x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_5x10Layout.setVerticalGroup(
            vs_5x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_6x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_6x1Layout = new javax.swing.GroupLayout(vs_6x1);
        vs_6x1.setLayout(vs_6x1Layout);
        vs_6x1Layout.setHorizontalGroup(
            vs_6x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_6x1Layout.setVerticalGroup(
            vs_6x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_6x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_6x2Layout = new javax.swing.GroupLayout(vs_6x2);
        vs_6x2.setLayout(vs_6x2Layout);
        vs_6x2Layout.setHorizontalGroup(
            vs_6x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_6x2Layout.setVerticalGroup(
            vs_6x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_6x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_6x3Layout = new javax.swing.GroupLayout(vs_6x3);
        vs_6x3.setLayout(vs_6x3Layout);
        vs_6x3Layout.setHorizontalGroup(
            vs_6x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_6x3Layout.setVerticalGroup(
            vs_6x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_6x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_6x4Layout = new javax.swing.GroupLayout(vs_6x4);
        vs_6x4.setLayout(vs_6x4Layout);
        vs_6x4Layout.setHorizontalGroup(
            vs_6x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_6x4Layout.setVerticalGroup(
            vs_6x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_6x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_6x5Layout = new javax.swing.GroupLayout(vs_6x5);
        vs_6x5.setLayout(vs_6x5Layout);
        vs_6x5Layout.setHorizontalGroup(
            vs_6x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_6x5Layout.setVerticalGroup(
            vs_6x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_6x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_6x6Layout = new javax.swing.GroupLayout(vs_6x6);
        vs_6x6.setLayout(vs_6x6Layout);
        vs_6x6Layout.setHorizontalGroup(
            vs_6x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_6x6Layout.setVerticalGroup(
            vs_6x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_6x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_6x7Layout = new javax.swing.GroupLayout(vs_6x7);
        vs_6x7.setLayout(vs_6x7Layout);
        vs_6x7Layout.setHorizontalGroup(
            vs_6x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_6x7Layout.setVerticalGroup(
            vs_6x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_6x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_6x8Layout = new javax.swing.GroupLayout(vs_6x8);
        vs_6x8.setLayout(vs_6x8Layout);
        vs_6x8Layout.setHorizontalGroup(
            vs_6x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_6x8Layout.setVerticalGroup(
            vs_6x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_6x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_6x9Layout = new javax.swing.GroupLayout(vs_6x9);
        vs_6x9.setLayout(vs_6x9Layout);
        vs_6x9Layout.setHorizontalGroup(
            vs_6x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_6x9Layout.setVerticalGroup(
            vs_6x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_6x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_6x10Layout = new javax.swing.GroupLayout(vs_6x10);
        vs_6x10.setLayout(vs_6x10Layout);
        vs_6x10Layout.setHorizontalGroup(
            vs_6x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_6x10Layout.setVerticalGroup(
            vs_6x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_7x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_7x1Layout = new javax.swing.GroupLayout(vs_7x1);
        vs_7x1.setLayout(vs_7x1Layout);
        vs_7x1Layout.setHorizontalGroup(
            vs_7x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_7x1Layout.setVerticalGroup(
            vs_7x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_7x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_7x2Layout = new javax.swing.GroupLayout(vs_7x2);
        vs_7x2.setLayout(vs_7x2Layout);
        vs_7x2Layout.setHorizontalGroup(
            vs_7x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_7x2Layout.setVerticalGroup(
            vs_7x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_7x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_7x3Layout = new javax.swing.GroupLayout(vs_7x3);
        vs_7x3.setLayout(vs_7x3Layout);
        vs_7x3Layout.setHorizontalGroup(
            vs_7x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_7x3Layout.setVerticalGroup(
            vs_7x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_7x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_7x4Layout = new javax.swing.GroupLayout(vs_7x4);
        vs_7x4.setLayout(vs_7x4Layout);
        vs_7x4Layout.setHorizontalGroup(
            vs_7x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_7x4Layout.setVerticalGroup(
            vs_7x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_7x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_7x5Layout = new javax.swing.GroupLayout(vs_7x5);
        vs_7x5.setLayout(vs_7x5Layout);
        vs_7x5Layout.setHorizontalGroup(
            vs_7x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_7x5Layout.setVerticalGroup(
            vs_7x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_7x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_7x6Layout = new javax.swing.GroupLayout(vs_7x6);
        vs_7x6.setLayout(vs_7x6Layout);
        vs_7x6Layout.setHorizontalGroup(
            vs_7x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_7x6Layout.setVerticalGroup(
            vs_7x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_7x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_7x7Layout = new javax.swing.GroupLayout(vs_7x7);
        vs_7x7.setLayout(vs_7x7Layout);
        vs_7x7Layout.setHorizontalGroup(
            vs_7x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_7x7Layout.setVerticalGroup(
            vs_7x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_7x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_7x8Layout = new javax.swing.GroupLayout(vs_7x8);
        vs_7x8.setLayout(vs_7x8Layout);
        vs_7x8Layout.setHorizontalGroup(
            vs_7x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_7x8Layout.setVerticalGroup(
            vs_7x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_7x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_7x9Layout = new javax.swing.GroupLayout(vs_7x9);
        vs_7x9.setLayout(vs_7x9Layout);
        vs_7x9Layout.setHorizontalGroup(
            vs_7x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_7x9Layout.setVerticalGroup(
            vs_7x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_7x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_7x10Layout = new javax.swing.GroupLayout(vs_7x10);
        vs_7x10.setLayout(vs_7x10Layout);
        vs_7x10Layout.setHorizontalGroup(
            vs_7x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_7x10Layout.setVerticalGroup(
            vs_7x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_8x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_8x1Layout = new javax.swing.GroupLayout(vs_8x1);
        vs_8x1.setLayout(vs_8x1Layout);
        vs_8x1Layout.setHorizontalGroup(
            vs_8x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_8x1Layout.setVerticalGroup(
            vs_8x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_8x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_8x2Layout = new javax.swing.GroupLayout(vs_8x2);
        vs_8x2.setLayout(vs_8x2Layout);
        vs_8x2Layout.setHorizontalGroup(
            vs_8x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_8x2Layout.setVerticalGroup(
            vs_8x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_8x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_8x3Layout = new javax.swing.GroupLayout(vs_8x3);
        vs_8x3.setLayout(vs_8x3Layout);
        vs_8x3Layout.setHorizontalGroup(
            vs_8x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_8x3Layout.setVerticalGroup(
            vs_8x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_8x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_8x4Layout = new javax.swing.GroupLayout(vs_8x4);
        vs_8x4.setLayout(vs_8x4Layout);
        vs_8x4Layout.setHorizontalGroup(
            vs_8x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_8x4Layout.setVerticalGroup(
            vs_8x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_8x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_8x5Layout = new javax.swing.GroupLayout(vs_8x5);
        vs_8x5.setLayout(vs_8x5Layout);
        vs_8x5Layout.setHorizontalGroup(
            vs_8x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_8x5Layout.setVerticalGroup(
            vs_8x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_8x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_8x6Layout = new javax.swing.GroupLayout(vs_8x6);
        vs_8x6.setLayout(vs_8x6Layout);
        vs_8x6Layout.setHorizontalGroup(
            vs_8x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_8x6Layout.setVerticalGroup(
            vs_8x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_8x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_8x7Layout = new javax.swing.GroupLayout(vs_8x7);
        vs_8x7.setLayout(vs_8x7Layout);
        vs_8x7Layout.setHorizontalGroup(
            vs_8x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_8x7Layout.setVerticalGroup(
            vs_8x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_8x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_8x8Layout = new javax.swing.GroupLayout(vs_8x8);
        vs_8x8.setLayout(vs_8x8Layout);
        vs_8x8Layout.setHorizontalGroup(
            vs_8x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_8x8Layout.setVerticalGroup(
            vs_8x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_8x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_8x9Layout = new javax.swing.GroupLayout(vs_8x9);
        vs_8x9.setLayout(vs_8x9Layout);
        vs_8x9Layout.setHorizontalGroup(
            vs_8x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_8x9Layout.setVerticalGroup(
            vs_8x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_8x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_8x10Layout = new javax.swing.GroupLayout(vs_8x10);
        vs_8x10.setLayout(vs_8x10Layout);
        vs_8x10Layout.setHorizontalGroup(
            vs_8x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_8x10Layout.setVerticalGroup(
            vs_8x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_9x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_9x1Layout = new javax.swing.GroupLayout(vs_9x1);
        vs_9x1.setLayout(vs_9x1Layout);
        vs_9x1Layout.setHorizontalGroup(
            vs_9x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_9x1Layout.setVerticalGroup(
            vs_9x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_9x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_9x2Layout = new javax.swing.GroupLayout(vs_9x2);
        vs_9x2.setLayout(vs_9x2Layout);
        vs_9x2Layout.setHorizontalGroup(
            vs_9x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_9x2Layout.setVerticalGroup(
            vs_9x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_9x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_9x3Layout = new javax.swing.GroupLayout(vs_9x3);
        vs_9x3.setLayout(vs_9x3Layout);
        vs_9x3Layout.setHorizontalGroup(
            vs_9x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_9x3Layout.setVerticalGroup(
            vs_9x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_9x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_9x4Layout = new javax.swing.GroupLayout(vs_9x4);
        vs_9x4.setLayout(vs_9x4Layout);
        vs_9x4Layout.setHorizontalGroup(
            vs_9x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_9x4Layout.setVerticalGroup(
            vs_9x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_9x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_9x5Layout = new javax.swing.GroupLayout(vs_9x5);
        vs_9x5.setLayout(vs_9x5Layout);
        vs_9x5Layout.setHorizontalGroup(
            vs_9x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_9x5Layout.setVerticalGroup(
            vs_9x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_9x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_9x6Layout = new javax.swing.GroupLayout(vs_9x6);
        vs_9x6.setLayout(vs_9x6Layout);
        vs_9x6Layout.setHorizontalGroup(
            vs_9x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_9x6Layout.setVerticalGroup(
            vs_9x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_9x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_9x7Layout = new javax.swing.GroupLayout(vs_9x7);
        vs_9x7.setLayout(vs_9x7Layout);
        vs_9x7Layout.setHorizontalGroup(
            vs_9x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_9x7Layout.setVerticalGroup(
            vs_9x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_9x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_9x8Layout = new javax.swing.GroupLayout(vs_9x8);
        vs_9x8.setLayout(vs_9x8Layout);
        vs_9x8Layout.setHorizontalGroup(
            vs_9x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_9x8Layout.setVerticalGroup(
            vs_9x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_9x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_9x9Layout = new javax.swing.GroupLayout(vs_9x9);
        vs_9x9.setLayout(vs_9x9Layout);
        vs_9x9Layout.setHorizontalGroup(
            vs_9x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_9x9Layout.setVerticalGroup(
            vs_9x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_9x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_9x10Layout = new javax.swing.GroupLayout(vs_9x10);
        vs_9x10.setLayout(vs_9x10Layout);
        vs_9x10Layout.setHorizontalGroup(
            vs_9x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_9x10Layout.setVerticalGroup(
            vs_9x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_10x1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_10x1Layout = new javax.swing.GroupLayout(vs_10x1);
        vs_10x1.setLayout(vs_10x1Layout);
        vs_10x1Layout.setHorizontalGroup(
            vs_10x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_10x1Layout.setVerticalGroup(
            vs_10x1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_10x2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_10x2Layout = new javax.swing.GroupLayout(vs_10x2);
        vs_10x2.setLayout(vs_10x2Layout);
        vs_10x2Layout.setHorizontalGroup(
            vs_10x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_10x2Layout.setVerticalGroup(
            vs_10x2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_10x3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_10x3Layout = new javax.swing.GroupLayout(vs_10x3);
        vs_10x3.setLayout(vs_10x3Layout);
        vs_10x3Layout.setHorizontalGroup(
            vs_10x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_10x3Layout.setVerticalGroup(
            vs_10x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_10x4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_10x4Layout = new javax.swing.GroupLayout(vs_10x4);
        vs_10x4.setLayout(vs_10x4Layout);
        vs_10x4Layout.setHorizontalGroup(
            vs_10x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_10x4Layout.setVerticalGroup(
            vs_10x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_10x5.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_10x5Layout = new javax.swing.GroupLayout(vs_10x5);
        vs_10x5.setLayout(vs_10x5Layout);
        vs_10x5Layout.setHorizontalGroup(
            vs_10x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_10x5Layout.setVerticalGroup(
            vs_10x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_10x6.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_10x6Layout = new javax.swing.GroupLayout(vs_10x6);
        vs_10x6.setLayout(vs_10x6Layout);
        vs_10x6Layout.setHorizontalGroup(
            vs_10x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_10x6Layout.setVerticalGroup(
            vs_10x6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_10x7.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_10x7Layout = new javax.swing.GroupLayout(vs_10x7);
        vs_10x7.setLayout(vs_10x7Layout);
        vs_10x7Layout.setHorizontalGroup(
            vs_10x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_10x7Layout.setVerticalGroup(
            vs_10x7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_10x8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_10x8Layout = new javax.swing.GroupLayout(vs_10x8);
        vs_10x8.setLayout(vs_10x8Layout);
        vs_10x8Layout.setHorizontalGroup(
            vs_10x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_10x8Layout.setVerticalGroup(
            vs_10x8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_10x9.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_10x9Layout = new javax.swing.GroupLayout(vs_10x9);
        vs_10x9.setLayout(vs_10x9Layout);
        vs_10x9Layout.setHorizontalGroup(
            vs_10x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_10x9Layout.setVerticalGroup(
            vs_10x9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        vs_10x10.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout vs_10x10Layout = new javax.swing.GroupLayout(vs_10x10);
        vs_10x10.setLayout(vs_10x10Layout);
        vs_10x10Layout.setHorizontalGroup(
            vs_10x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        vs_10x10Layout.setVerticalGroup(
            vs_10x10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(vs_1x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_1x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_1x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_1x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_1x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_1x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_1x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_1x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_1x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_1x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(vs_2x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_2x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_2x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_2x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_2x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_2x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_2x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_2x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_2x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_2x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(vs_3x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_3x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_3x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_3x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_3x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_3x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_3x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_3x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_3x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_3x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(vs_4x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_4x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_4x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_4x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_4x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_4x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_4x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_4x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_4x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_4x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(vs_5x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_5x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_5x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_5x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_5x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_5x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_5x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_5x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_5x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_5x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(vs_6x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_6x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_6x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_6x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_6x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_6x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_6x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_6x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_6x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_6x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(vs_7x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_7x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_7x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_7x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_7x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_7x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_7x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_7x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_7x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_7x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(vs_8x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_8x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_8x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_8x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_8x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_8x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_8x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_8x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_8x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_8x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(vs_9x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_9x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_9x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_9x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_9x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_9x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_9x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_9x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_9x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_9x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(vs_10x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_10x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_10x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_10x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_10x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_10x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_10x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_10x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_10x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vs_10x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vs_1x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_1x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_1x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_1x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_1x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_1x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_1x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_1x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_1x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_1x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vs_2x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_2x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_2x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_2x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_2x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_2x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_2x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_2x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_2x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_2x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vs_3x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_3x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_3x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_3x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_3x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_3x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_3x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_3x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_3x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_3x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vs_4x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_4x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_4x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_4x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_4x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_4x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_4x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_4x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_4x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_4x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vs_5x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_5x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_5x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_5x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_5x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_5x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_5x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_5x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_5x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_5x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vs_6x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_6x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_6x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_6x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_6x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_6x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_6x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_6x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_6x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_6x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vs_7x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_7x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_7x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_7x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_7x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_7x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_7x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_7x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_7x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_7x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vs_8x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_8x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_8x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_8x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_8x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_8x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_8x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_8x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_8x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_8x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vs_9x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_9x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_9x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_9x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_9x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_9x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_9x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_9x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_9x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_9x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vs_10x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_10x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_10x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_10x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_10x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_10x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_10x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_10x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_10x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs_10x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_my_tab.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lbl_my_tab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_my_tab.setText("(Mi tablero)");

        lbl_my_tab1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lbl_my_tab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_my_tab1.setText("(VS tablero)");

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Naves");

        acorazado_1.setBackground(new java.awt.Color(102, 102, 255));
        acorazado_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acorazado_1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout acorazado_1Layout = new javax.swing.GroupLayout(acorazado_1);
        acorazado_1.setLayout(acorazado_1Layout);
        acorazado_1Layout.setHorizontalGroup(
            acorazado_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        acorazado_1Layout.setVerticalGroup(
            acorazado_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        acorazado_2.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout acorazado_2Layout = new javax.swing.GroupLayout(acorazado_2);
        acorazado_2.setLayout(acorazado_2Layout);
        acorazado_2Layout.setHorizontalGroup(
            acorazado_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        acorazado_2Layout.setVerticalGroup(
            acorazado_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        acorazado_3.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout acorazado_3Layout = new javax.swing.GroupLayout(acorazado_3);
        acorazado_3.setLayout(acorazado_3Layout);
        acorazado_3Layout.setHorizontalGroup(
            acorazado_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        acorazado_3Layout.setVerticalGroup(
            acorazado_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        acorazado_4.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout acorazado_4Layout = new javax.swing.GroupLayout(acorazado_4);
        acorazado_4.setLayout(acorazado_4Layout);
        acorazado_4Layout.setHorizontalGroup(
            acorazado_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        acorazado_4Layout.setVerticalGroup(
            acorazado_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Acorazado");

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Crucero");

        crucero_1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout crucero_1Layout = new javax.swing.GroupLayout(crucero_1);
        crucero_1.setLayout(crucero_1Layout);
        crucero_1Layout.setHorizontalGroup(
            crucero_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        crucero_1Layout.setVerticalGroup(
            crucero_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        crucero_2.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout crucero_2Layout = new javax.swing.GroupLayout(crucero_2);
        crucero_2.setLayout(crucero_2Layout);
        crucero_2Layout.setHorizontalGroup(
            crucero_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        crucero_2Layout.setVerticalGroup(
            crucero_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        crucero_3.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout crucero_3Layout = new javax.swing.GroupLayout(crucero_3);
        crucero_3.setLayout(crucero_3Layout);
        crucero_3Layout.setHorizontalGroup(
            crucero_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        crucero_3Layout.setVerticalGroup(
            crucero_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        submarino_1.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout submarino_1Layout = new javax.swing.GroupLayout(submarino_1);
        submarino_1.setLayout(submarino_1Layout);
        submarino_1Layout.setHorizontalGroup(
            submarino_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        submarino_1Layout.setVerticalGroup(
            submarino_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Destructores");

        destructores_2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout destructores_2Layout = new javax.swing.GroupLayout(destructores_2);
        destructores_2.setLayout(destructores_2Layout);
        destructores_2Layout.setHorizontalGroup(
            destructores_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        destructores_2Layout.setVerticalGroup(
            destructores_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Submarino");

        destructores_1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout destructores_1Layout = new javax.swing.GroupLayout(destructores_1);
        destructores_1.setLayout(destructores_1Layout);
        destructores_1Layout.setHorizontalGroup(
            destructores_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        destructores_1Layout.setVerticalGroup(
            destructores_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        acorazado_rest.setText("x restantes");

        crucero_rest.setText("x restantes");

        destructor_rest.setText("x restantes");

        submarino_rest.setText("x restantes");

        lbl_instrucciones.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 24)); // NOI18N
        lbl_instrucciones.setText("Instrucciones:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(lbl_my_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_my_tab1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_instrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(acorazado_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(acorazado_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(acorazado_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(acorazado_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(crucero_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(crucero_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(crucero_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(destructores_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(destructores_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(submarino_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(submarino_rest)
                                    .addComponent(destructor_rest)
                                    .addComponent(acorazado_rest)
                                    .addComponent(crucero_rest))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_my_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_my_tab1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(acorazado_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acorazado_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acorazado_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acorazado_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acorazado_rest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(crucero_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(crucero_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(crucero_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(crucero_rest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(destructores_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destructores_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destructor_rest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(submarino_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submarino_rest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(lbl_instrucciones)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acorazado_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acorazado_1MouseClicked
        
    }//GEN-LAST:event_acorazado_1MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acorazado_1;
    private javax.swing.JPanel acorazado_2;
    private javax.swing.JPanel acorazado_3;
    private javax.swing.JPanel acorazado_4;
    private javax.swing.JLabel acorazado_rest;
    private javax.swing.JPanel crucero_1;
    private javax.swing.JPanel crucero_2;
    private javax.swing.JPanel crucero_3;
    private javax.swing.JLabel crucero_rest;
    private javax.swing.JLabel destructor_rest;
    private javax.swing.JPanel destructores_1;
    private javax.swing.JPanel destructores_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_instrucciones;
    private javax.swing.JLabel lbl_my_tab;
    private javax.swing.JLabel lbl_my_tab1;
    private javax.swing.JPanel my_10x1;
    private javax.swing.JPanel my_10x10;
    private javax.swing.JPanel my_10x2;
    private javax.swing.JPanel my_10x3;
    private javax.swing.JPanel my_10x4;
    private javax.swing.JPanel my_10x5;
    private javax.swing.JPanel my_10x6;
    private javax.swing.JPanel my_10x7;
    private javax.swing.JPanel my_10x8;
    private javax.swing.JPanel my_10x9;
    private javax.swing.JPanel my_1x1;
    private javax.swing.JPanel my_1x10;
    private javax.swing.JPanel my_1x2;
    private javax.swing.JPanel my_1x3;
    private javax.swing.JPanel my_1x4;
    private javax.swing.JPanel my_1x5;
    private javax.swing.JPanel my_1x6;
    private javax.swing.JPanel my_1x7;
    private javax.swing.JPanel my_1x8;
    private javax.swing.JPanel my_1x9;
    private javax.swing.JPanel my_2x1;
    private javax.swing.JPanel my_2x10;
    private javax.swing.JPanel my_2x2;
    private javax.swing.JPanel my_2x3;
    private javax.swing.JPanel my_2x4;
    private javax.swing.JPanel my_2x5;
    private javax.swing.JPanel my_2x6;
    private javax.swing.JPanel my_2x7;
    private javax.swing.JPanel my_2x8;
    private javax.swing.JPanel my_2x9;
    private javax.swing.JPanel my_3x1;
    private javax.swing.JPanel my_3x10;
    private javax.swing.JPanel my_3x2;
    private javax.swing.JPanel my_3x3;
    private javax.swing.JPanel my_3x4;
    private javax.swing.JPanel my_3x5;
    private javax.swing.JPanel my_3x6;
    private javax.swing.JPanel my_3x7;
    private javax.swing.JPanel my_3x8;
    private javax.swing.JPanel my_3x9;
    private javax.swing.JPanel my_4x1;
    private javax.swing.JPanel my_4x10;
    private javax.swing.JPanel my_4x2;
    private javax.swing.JPanel my_4x3;
    private javax.swing.JPanel my_4x4;
    private javax.swing.JPanel my_4x5;
    private javax.swing.JPanel my_4x6;
    private javax.swing.JPanel my_4x7;
    private javax.swing.JPanel my_4x8;
    private javax.swing.JPanel my_4x9;
    private javax.swing.JPanel my_5x1;
    private javax.swing.JPanel my_5x10;
    private javax.swing.JPanel my_5x2;
    private javax.swing.JPanel my_5x3;
    private javax.swing.JPanel my_5x4;
    private javax.swing.JPanel my_5x5;
    private javax.swing.JPanel my_5x6;
    private javax.swing.JPanel my_5x7;
    private javax.swing.JPanel my_5x8;
    private javax.swing.JPanel my_5x9;
    private javax.swing.JPanel my_6x1;
    private javax.swing.JPanel my_6x10;
    private javax.swing.JPanel my_6x2;
    private javax.swing.JPanel my_6x3;
    private javax.swing.JPanel my_6x4;
    private javax.swing.JPanel my_6x5;
    private javax.swing.JPanel my_6x6;
    private javax.swing.JPanel my_6x7;
    private javax.swing.JPanel my_6x8;
    private javax.swing.JPanel my_6x9;
    private javax.swing.JPanel my_7x1;
    private javax.swing.JPanel my_7x10;
    private javax.swing.JPanel my_7x2;
    private javax.swing.JPanel my_7x3;
    private javax.swing.JPanel my_7x4;
    private javax.swing.JPanel my_7x5;
    private javax.swing.JPanel my_7x6;
    private javax.swing.JPanel my_7x7;
    private javax.swing.JPanel my_7x8;
    private javax.swing.JPanel my_7x9;
    private javax.swing.JPanel my_8x1;
    private javax.swing.JPanel my_8x10;
    private javax.swing.JPanel my_8x2;
    private javax.swing.JPanel my_8x3;
    private javax.swing.JPanel my_8x4;
    private javax.swing.JPanel my_8x5;
    private javax.swing.JPanel my_8x6;
    private javax.swing.JPanel my_8x7;
    private javax.swing.JPanel my_8x8;
    private javax.swing.JPanel my_8x9;
    private javax.swing.JPanel my_9x1;
    private javax.swing.JPanel my_9x10;
    private javax.swing.JPanel my_9x2;
    private javax.swing.JPanel my_9x3;
    private javax.swing.JPanel my_9x4;
    private javax.swing.JPanel my_9x5;
    private javax.swing.JPanel my_9x6;
    private javax.swing.JPanel my_9x7;
    private javax.swing.JPanel my_9x8;
    private javax.swing.JPanel my_9x9;
    private javax.swing.JPanel submarino_1;
    private javax.swing.JLabel submarino_rest;
    private javax.swing.JPanel vs_10x1;
    private javax.swing.JPanel vs_10x10;
    private javax.swing.JPanel vs_10x2;
    private javax.swing.JPanel vs_10x3;
    private javax.swing.JPanel vs_10x4;
    private javax.swing.JPanel vs_10x5;
    private javax.swing.JPanel vs_10x6;
    private javax.swing.JPanel vs_10x7;
    private javax.swing.JPanel vs_10x8;
    private javax.swing.JPanel vs_10x9;
    private javax.swing.JPanel vs_1x1;
    private javax.swing.JPanel vs_1x10;
    private javax.swing.JPanel vs_1x2;
    private javax.swing.JPanel vs_1x3;
    private javax.swing.JPanel vs_1x4;
    private javax.swing.JPanel vs_1x5;
    private javax.swing.JPanel vs_1x6;
    private javax.swing.JPanel vs_1x7;
    private javax.swing.JPanel vs_1x8;
    private javax.swing.JPanel vs_1x9;
    private javax.swing.JPanel vs_2x1;
    private javax.swing.JPanel vs_2x10;
    private javax.swing.JPanel vs_2x2;
    private javax.swing.JPanel vs_2x3;
    private javax.swing.JPanel vs_2x4;
    private javax.swing.JPanel vs_2x5;
    private javax.swing.JPanel vs_2x6;
    private javax.swing.JPanel vs_2x7;
    private javax.swing.JPanel vs_2x8;
    private javax.swing.JPanel vs_2x9;
    private javax.swing.JPanel vs_3x1;
    private javax.swing.JPanel vs_3x10;
    private javax.swing.JPanel vs_3x2;
    private javax.swing.JPanel vs_3x3;
    private javax.swing.JPanel vs_3x4;
    private javax.swing.JPanel vs_3x5;
    private javax.swing.JPanel vs_3x6;
    private javax.swing.JPanel vs_3x7;
    private javax.swing.JPanel vs_3x8;
    private javax.swing.JPanel vs_3x9;
    private javax.swing.JPanel vs_4x1;
    private javax.swing.JPanel vs_4x10;
    private javax.swing.JPanel vs_4x2;
    private javax.swing.JPanel vs_4x3;
    private javax.swing.JPanel vs_4x4;
    private javax.swing.JPanel vs_4x5;
    private javax.swing.JPanel vs_4x6;
    private javax.swing.JPanel vs_4x7;
    private javax.swing.JPanel vs_4x8;
    private javax.swing.JPanel vs_4x9;
    private javax.swing.JPanel vs_5x1;
    private javax.swing.JPanel vs_5x10;
    private javax.swing.JPanel vs_5x2;
    private javax.swing.JPanel vs_5x3;
    private javax.swing.JPanel vs_5x4;
    private javax.swing.JPanel vs_5x5;
    private javax.swing.JPanel vs_5x6;
    private javax.swing.JPanel vs_5x7;
    private javax.swing.JPanel vs_5x8;
    private javax.swing.JPanel vs_5x9;
    private javax.swing.JPanel vs_6x1;
    private javax.swing.JPanel vs_6x10;
    private javax.swing.JPanel vs_6x2;
    private javax.swing.JPanel vs_6x3;
    private javax.swing.JPanel vs_6x4;
    private javax.swing.JPanel vs_6x5;
    private javax.swing.JPanel vs_6x6;
    private javax.swing.JPanel vs_6x7;
    private javax.swing.JPanel vs_6x8;
    private javax.swing.JPanel vs_6x9;
    private javax.swing.JPanel vs_7x1;
    private javax.swing.JPanel vs_7x10;
    private javax.swing.JPanel vs_7x2;
    private javax.swing.JPanel vs_7x3;
    private javax.swing.JPanel vs_7x4;
    private javax.swing.JPanel vs_7x5;
    private javax.swing.JPanel vs_7x6;
    private javax.swing.JPanel vs_7x7;
    private javax.swing.JPanel vs_7x8;
    private javax.swing.JPanel vs_7x9;
    private javax.swing.JPanel vs_8x1;
    private javax.swing.JPanel vs_8x10;
    private javax.swing.JPanel vs_8x2;
    private javax.swing.JPanel vs_8x3;
    private javax.swing.JPanel vs_8x4;
    private javax.swing.JPanel vs_8x5;
    private javax.swing.JPanel vs_8x6;
    private javax.swing.JPanel vs_8x7;
    private javax.swing.JPanel vs_8x8;
    private javax.swing.JPanel vs_8x9;
    private javax.swing.JPanel vs_9x1;
    private javax.swing.JPanel vs_9x10;
    private javax.swing.JPanel vs_9x2;
    private javax.swing.JPanel vs_9x3;
    private javax.swing.JPanel vs_9x4;
    private javax.swing.JPanel vs_9x5;
    private javax.swing.JPanel vs_9x6;
    private javax.swing.JPanel vs_9x7;
    private javax.swing.JPanel vs_9x8;
    private javax.swing.JPanel vs_9x9;
    // End of variables declaration//GEN-END:variables
}
