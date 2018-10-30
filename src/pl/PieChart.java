/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl;

/**
 *
 * @author Alibimunka
 */
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
 
public class PieChart extends ApplicationFrame {
   
   static public DefaultPieDataset dataset;
    
   public PieChart( String title, DefaultPieDataset data ) {
      super( title ); 
      dataset=data;
      setContentPane(createDemoPanel(title));
   }
   
   public static PieDataset createDataset( ) { 
      return dataset;         
   }
   
   public static JFreeChart createChart( PieDataset dataset, String title ) {
      JFreeChart chart = ChartFactory.createPieChart(      
         title,   // chart title 
         dataset,          // data    
         true,             // include legend   
         true, 
         false);

      return chart;
   }
   
   public static JPanel createDemoPanel(String title) {
      JFreeChart chart = createChart(createDataset( ),title);  
      return new ChartPanel( chart ); 
   }

   public static void main( String[ ] args ) {
   }
}
