import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ConveyorController extends ClockDomain{
  public ConveyorController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal bottleDeployed = new Signal("bottleDeployed", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  public Signal bottleDeployedE = new Signal("bottleDeployedE", Signal.OUTPUT);
  public Signal rotaryTableTriggerE = new Signal("rotaryTableTriggerE", Signal.OUTPUT);
  public input_Channel rotated_in = new input_Channel();
  public output_Channel convReady_o = new output_Channel();
  public output_Channel simFiller_o = new output_Channel();
  public output_Channel simCapper_o = new output_Channel();
  public output_Channel checkFive_o = new output_Channel();
  public output_Channel checkThree_o = new output_Channel();
  public output_Channel checkOne_o = new output_Channel();
  private Signal rotaryRotated_1;
  private Signal empty_1;
  private Signal insert_1;
  private Signal simF_14;
  private Signal simC_14;
  private Signal simFive_14;
  private Signal simThree_14;
  private Signal simOne_14;
  private long __start_thread_2;//sysj\conveyor_controller.sysj line: 95, column: 5
  private long __start_thread_9;//sysj\conveyor_controller.sysj line: 141, column: 17
  private boolean[] q_thread_20;//sysj\conveyor_controller.sysj line: 20, column: 3
  private boolean o_thread_20;//sysj\conveyor_controller.sysj line: 22, column: 9
  private boolean c_thread_20;//sysj\conveyor_controller.sysj line: 22, column: 9
  private int S4296 = 1;
  private int S2312 = 1;
  private int S1564 = 1;
  private int S1464 = 1;
  private int S1463 = 1;
  private int S1511 = 1;
  private int S1466 = 1;
  private int S1473 = 1;
  private int S1468 = 1;
  private int S1571 = 1;
  private int S1566 = 1;
  private int S1610 = 1;
  private int S1660 = 1;
  private int S1643 = 1;
  private int S1638 = 1;
  private int S1663 = 1;
  private int S2554 = 1;
  private int S2372 = 1;
  private int S2321 = 1;
  private int S2341 = 1;
  private int S2336 = 1;
  private int S2625 = 1;
  private int S2577 = 1;
  private int S2561 = 1;
  private int S2556 = 1;
  private int S2660 = 1;
  private int S2636 = 1;
  private int S2630 = 1;
  private int S2633 = 1;
  private int S4294 = 1;
  private int S2898 = 1;
  private int S2712 = 1;
  private int S2674 = 1;
  private int S2669 = 1;
  private int S3130 = 1;
  private int S2944 = 1;
  private int S2906 = 1;
  private int S2901 = 1;
  private int S3362 = 1;
  private int S3176 = 1;
  private int S3138 = 1;
  private int S3133 = 1;
  private int S3594 = 1;
  private int S3408 = 1;
  private int S3370 = 1;
  private int S3365 = 1;
  private int S3826 = 1;
  private int S3640 = 1;
  private int S3602 = 1;
  private int S3597 = 1;
  private int S4292 = 1;
  private int S3848 = 1;
  private int S3827 = 1;
  private int S3835 = 1;
  
  private int[] ends = new int[72];
  private int[] tdone = new int[72];
  
  public void thread38276(int [] tdone, int [] ends){
        switch(S4292){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 44, column: 11
          for(int i_thread_20 = q_thread_20.length - 1; i_thread_20 > 0; i_thread_20 = i_thread_20 - 1) {//sysj\conveyor_controller.sysj line: 45, column: 36
            q_thread_20[i_thread_20] = q_thread_20[i_thread_20 - 1];//sysj\conveyor_controller.sysj line: 46, column: 6
          }
          if(insert_1.getprestatus()){//sysj\conveyor_controller.sysj line: 48, column: 13
            q_thread_20[0] = true;//sysj\conveyor_controller.sysj line: 49, column: 6
            S3848=0;
            System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
            o_thread_20 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
            c_thread_20 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
            System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
            for(int i_thread_20 = 0; i_thread_20 < q_thread_20.length; i_thread_20 = i_thread_20 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
              if(q_thread_20[i_thread_20]) {//sysj\conveyor_controller.sysj line: 27, column: 6
                o_thread_20 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
              }
              System.out.print(" " + (q_thread_20[i_thread_20] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
            }
            System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
            if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
              simOne_14.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
              currsigs.addElement(simOne_14);
              simOne_14.setValue(q_thread_20[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
              simF_14.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
              currsigs.addElement(simF_14);
              simF_14.setValue(q_thread_20[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
              simThree_14.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
              currsigs.addElement(simThree_14);
              simThree_14.setValue(q_thread_20[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
              simC_14.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
              currsigs.addElement(simC_14);
              simC_14.setValue(q_thread_20[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
              simFive_14.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
              currsigs.addElement(simFive_14);
              simFive_14.setValue(q_thread_20[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
              S3827=0;
              if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                S3835=0;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                S3835=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                currsigs.addElement(empty_1);
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
            else {
              S3827=0;
              if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                S3835=0;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                S3835=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                currsigs.addElement(empty_1);
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
          }
          else {
            q_thread_20[0] = false;//sysj\conveyor_controller.sysj line: 51, column: 6
            S3848=0;
            System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
            o_thread_20 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
            c_thread_20 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
            System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
            for(int i_thread_20 = 0; i_thread_20 < q_thread_20.length; i_thread_20 = i_thread_20 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
              if(q_thread_20[i_thread_20]) {//sysj\conveyor_controller.sysj line: 27, column: 6
                o_thread_20 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
              }
              System.out.print(" " + (q_thread_20[i_thread_20] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
            }
            System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
            if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
              simOne_14.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
              currsigs.addElement(simOne_14);
              simOne_14.setValue(q_thread_20[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
              simF_14.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
              currsigs.addElement(simF_14);
              simF_14.setValue(q_thread_20[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
              simThree_14.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
              currsigs.addElement(simThree_14);
              simThree_14.setValue(q_thread_20[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
              simC_14.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
              currsigs.addElement(simC_14);
              simC_14.setValue(q_thread_20[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
              simFive_14.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
              currsigs.addElement(simFive_14);
              simFive_14.setValue(q_thread_20[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
              S3827=0;
              if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                S3835=0;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                S3835=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                currsigs.addElement(empty_1);
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
            else {
              S3827=0;
              if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                S3835=0;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                S3835=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                currsigs.addElement(empty_1);
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
          }
        }
        else {
          switch(S3848){
            case 0 : 
              if(insert_1.getprestatus()){//sysj\conveyor_controller.sysj line: 52, column: 12
                if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 53, column: 13
                  for(int i_thread_20 = q_thread_20.length - 1; i_thread_20 > 0; i_thread_20 = i_thread_20 - 1) {//sysj\conveyor_controller.sysj line: 54, column: 37
                    q_thread_20[i_thread_20] = q_thread_20[i_thread_20 - 1];//sysj\conveyor_controller.sysj line: 55, column: 7
                  }
                  q_thread_20[0] = true;//sysj\conveyor_controller.sysj line: 58, column: 5
                  S3848=0;
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
                  o_thread_20 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
                  c_thread_20 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
                  System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
                  for(int i_thread_20 = 0; i_thread_20 < q_thread_20.length; i_thread_20 = i_thread_20 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
                    if(q_thread_20[i_thread_20]) {//sysj\conveyor_controller.sysj line: 27, column: 6
                      o_thread_20 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
                    }
                    System.out.print(" " + (q_thread_20[i_thread_20] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
                  }
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
                  if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
                    simOne_14.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
                    currsigs.addElement(simOne_14);
                    simOne_14.setValue(q_thread_20[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
                    simF_14.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
                    currsigs.addElement(simF_14);
                    simF_14.setValue(q_thread_20[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
                    simThree_14.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
                    currsigs.addElement(simThree_14);
                    simThree_14.setValue(q_thread_20[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
                    simC_14.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                    currsigs.addElement(simC_14);
                    simC_14.setValue(q_thread_20[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
                    simFive_14.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
                    currsigs.addElement(simFive_14);
                    simFive_14.setValue(q_thread_20[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
                    S3827=0;
                    if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S3835=0;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      S3835=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                      currsigs.addElement(empty_1);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    S3827=0;
                    if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S3835=0;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      S3835=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                      currsigs.addElement(empty_1);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                }
                else {
                  q_thread_20[0] = true;//sysj\conveyor_controller.sysj line: 58, column: 5
                  S3848=0;
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
                  o_thread_20 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
                  c_thread_20 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
                  System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
                  for(int i_thread_20 = 0; i_thread_20 < q_thread_20.length; i_thread_20 = i_thread_20 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
                    if(q_thread_20[i_thread_20]) {//sysj\conveyor_controller.sysj line: 27, column: 6
                      o_thread_20 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
                    }
                    System.out.print(" " + (q_thread_20[i_thread_20] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
                  }
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
                  if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
                    simOne_14.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
                    currsigs.addElement(simOne_14);
                    simOne_14.setValue(q_thread_20[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
                    simF_14.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
                    currsigs.addElement(simF_14);
                    simF_14.setValue(q_thread_20[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
                    simThree_14.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
                    currsigs.addElement(simThree_14);
                    simThree_14.setValue(q_thread_20[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
                    simC_14.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                    currsigs.addElement(simC_14);
                    simC_14.setValue(q_thread_20[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
                    simFive_14.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
                    currsigs.addElement(simFive_14);
                    simFive_14.setValue(q_thread_20[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
                    S3827=0;
                    if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S3835=0;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      S3835=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                      currsigs.addElement(empty_1);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    S3827=0;
                    if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S3835=0;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      S3835=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                      currsigs.addElement(empty_1);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                }
              }
              else {
                switch(S3827){
                  case 0 : 
                    switch(S3835){
                      case 0 : 
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                        break;
                      
                      case 1 : 
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                        currsigs.addElement(empty_1);
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    S3848=0;
                    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
                    o_thread_20 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
                    c_thread_20 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
                    System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
                    for(int i_thread_20 = 0; i_thread_20 < q_thread_20.length; i_thread_20 = i_thread_20 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
                      if(q_thread_20[i_thread_20]) {//sysj\conveyor_controller.sysj line: 27, column: 6
                        o_thread_20 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
                      }
                      System.out.print(" " + (q_thread_20[i_thread_20] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
                    }
                    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
                    if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
                      simOne_14.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
                      currsigs.addElement(simOne_14);
                      simOne_14.setValue(q_thread_20[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
                      simF_14.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
                      currsigs.addElement(simF_14);
                      simF_14.setValue(q_thread_20[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
                      simThree_14.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
                      currsigs.addElement(simThree_14);
                      simThree_14.setValue(q_thread_20[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
                      simC_14.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                      currsigs.addElement(simC_14);
                      simC_14.setValue(q_thread_20[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
                      simFive_14.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
                      currsigs.addElement(simFive_14);
                      simFive_14.setValue(q_thread_20[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
                      S3827=0;
                      if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                        S3835=0;
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      else {
                        S3835=1;
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                        currsigs.addElement(empty_1);
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                    }
                    else {
                      S3827=0;
                      if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                        S3835=0;
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      else {
                        S3835=1;
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                        currsigs.addElement(empty_1);
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                    }
                    break;
                  
                }
              }
              break;
            
            case 1 : 
              S3848=0;
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
              o_thread_20 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
              c_thread_20 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
              System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
              for(int i_thread_20 = 0; i_thread_20 < q_thread_20.length; i_thread_20 = i_thread_20 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
                if(q_thread_20[i_thread_20]) {//sysj\conveyor_controller.sysj line: 27, column: 6
                  o_thread_20 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
                }
                System.out.print(" " + (q_thread_20[i_thread_20] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
              }
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
              if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
                simOne_14.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
                currsigs.addElement(simOne_14);
                simOne_14.setValue(q_thread_20[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
                simF_14.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
                currsigs.addElement(simF_14);
                simF_14.setValue(q_thread_20[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
                simThree_14.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
                currsigs.addElement(simThree_14);
                simThree_14.setValue(q_thread_20[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
                simC_14.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                currsigs.addElement(simC_14);
                simC_14.setValue(q_thread_20[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
                simFive_14.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
                currsigs.addElement(simFive_14);
                simFive_14.setValue(q_thread_20[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
                S3827=0;
                if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S3835=0;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  S3835=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
              }
              else {
                S3827=0;
                if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S3835=0;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  S3835=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
              }
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread38275(int [] tdone, int [] ends){
        switch(S3826){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S3640){
          case 0 : 
            if(simOne_14.getprestatus()){//sysj\conveyor_controller.sysj line: 16, column: 14
              S3640=1;
              S3602=0;
              if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 16, column: 29
                checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                S3602=1;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S3597=0;
                if(checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                  checkOne_o.setVal((simOne_14.getpreval() == null ? null : ((Boolean)simOne_14.getpreval())));//sysj\conveyor_controller.sysj line: 16, column: 29
                  S3597=1;
                  if(!checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                    checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                    ends[19]=2;
                    ;//sysj\conveyor_controller.sysj line: 16, column: 29
                    S3640=0;
                    active[19]=1;
                    ends[19]=1;
                    tdone[19]=1;
                  }
                  else {
                    active[19]=1;
                    ends[19]=1;
                    tdone[19]=1;
                  }
                }
                else {
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
              }
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            switch(S3602){
              case 0 : 
                if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 16, column: 29
                  checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                  S3602=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  switch(S3597){
                    case 0 : 
                      if(checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                        checkOne_o.setVal((simOne_14.getpreval() == null ? null : ((Boolean)simOne_14.getpreval())));//sysj\conveyor_controller.sysj line: 16, column: 29
                        S3597=1;
                        if(!checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                          checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                          ends[19]=2;
                          ;//sysj\conveyor_controller.sysj line: 16, column: 29
                          S3640=0;
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                        else {
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                        checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                        ends[19]=2;
                        ;//sysj\conveyor_controller.sysj line: 16, column: 29
                        S3640=0;
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S3602=1;
                S3602=0;
                if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 16, column: 29
                  checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                  S3602=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S3597=0;
                  if(checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                    checkOne_o.setVal((simOne_14.getpreval() == null ? null : ((Boolean)simOne_14.getpreval())));//sysj\conveyor_controller.sysj line: 16, column: 29
                    S3597=1;
                    if(!checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                      checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                      ends[19]=2;
                      ;//sysj\conveyor_controller.sysj line: 16, column: 29
                      S3640=0;
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                    else {
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                  }
                  else {
                    active[19]=1;
                    ends[19]=1;
                    tdone[19]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38274(int [] tdone, int [] ends){
        switch(S3594){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S3408){
          case 0 : 
            if(simThree_14.getprestatus()){//sysj\conveyor_controller.sysj line: 14, column: 14
              S3408=1;
              S3370=0;
              if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 31
                checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                S3370=1;
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                S3365=0;
                if(checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                  checkThree_o.setVal((simThree_14.getpreval() == null ? null : ((Boolean)simThree_14.getpreval())));//sysj\conveyor_controller.sysj line: 14, column: 31
                  S3365=1;
                  if(!checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                    checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                    ends[18]=2;
                    ;//sysj\conveyor_controller.sysj line: 14, column: 31
                    S3408=0;
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  else {
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                }
                else {
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                }
              }
            }
            else {
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 1 : 
            switch(S3370){
              case 0 : 
                if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 31
                  checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                  S3370=1;
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                }
                else {
                  switch(S3365){
                    case 0 : 
                      if(checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                        checkThree_o.setVal((simThree_14.getpreval() == null ? null : ((Boolean)simThree_14.getpreval())));//sysj\conveyor_controller.sysj line: 14, column: 31
                        S3365=1;
                        if(!checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                          checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                          ends[18]=2;
                          ;//sysj\conveyor_controller.sysj line: 14, column: 31
                          S3408=0;
                          active[18]=1;
                          ends[18]=1;
                          tdone[18]=1;
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          tdone[18]=1;
                        }
                      }
                      else {
                        active[18]=1;
                        ends[18]=1;
                        tdone[18]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                        checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                        ends[18]=2;
                        ;//sysj\conveyor_controller.sysj line: 14, column: 31
                        S3408=0;
                        active[18]=1;
                        ends[18]=1;
                        tdone[18]=1;
                      }
                      else {
                        active[18]=1;
                        ends[18]=1;
                        tdone[18]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S3370=1;
                S3370=0;
                if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 31
                  checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                  S3370=1;
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                }
                else {
                  S3365=0;
                  if(checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                    checkThree_o.setVal((simThree_14.getpreval() == null ? null : ((Boolean)simThree_14.getpreval())));//sysj\conveyor_controller.sysj line: 14, column: 31
                    S3365=1;
                    if(!checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                      checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                      ends[18]=2;
                      ;//sysj\conveyor_controller.sysj line: 14, column: 31
                      S3408=0;
                      active[18]=1;
                      ends[18]=1;
                      tdone[18]=1;
                    }
                    else {
                      active[18]=1;
                      ends[18]=1;
                      tdone[18]=1;
                    }
                  }
                  else {
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38273(int [] tdone, int [] ends){
        switch(S3362){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S3176){
          case 0 : 
            if(simFive_14.getprestatus()){//sysj\conveyor_controller.sysj line: 12, column: 14
              S3176=1;
              S3138=0;
              if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 12, column: 30
                checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                S3138=1;
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
              else {
                S3133=0;
                if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                  checkFive_o.setVal((simFive_14.getpreval() == null ? null : ((Boolean)simFive_14.getpreval())));//sysj\conveyor_controller.sysj line: 12, column: 30
                  S3133=1;
                  if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                    checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                    ends[17]=2;
                    ;//sysj\conveyor_controller.sysj line: 12, column: 30
                    S3176=0;
                    active[17]=1;
                    ends[17]=1;
                    tdone[17]=1;
                  }
                  else {
                    active[17]=1;
                    ends[17]=1;
                    tdone[17]=1;
                  }
                }
                else {
                  active[17]=1;
                  ends[17]=1;
                  tdone[17]=1;
                }
              }
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            switch(S3138){
              case 0 : 
                if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 12, column: 30
                  checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                  S3138=1;
                  active[17]=1;
                  ends[17]=1;
                  tdone[17]=1;
                }
                else {
                  switch(S3133){
                    case 0 : 
                      if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                        checkFive_o.setVal((simFive_14.getpreval() == null ? null : ((Boolean)simFive_14.getpreval())));//sysj\conveyor_controller.sysj line: 12, column: 30
                        S3133=1;
                        if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                          checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                          ends[17]=2;
                          ;//sysj\conveyor_controller.sysj line: 12, column: 30
                          S3176=0;
                          active[17]=1;
                          ends[17]=1;
                          tdone[17]=1;
                        }
                        else {
                          active[17]=1;
                          ends[17]=1;
                          tdone[17]=1;
                        }
                      }
                      else {
                        active[17]=1;
                        ends[17]=1;
                        tdone[17]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                        checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                        ends[17]=2;
                        ;//sysj\conveyor_controller.sysj line: 12, column: 30
                        S3176=0;
                        active[17]=1;
                        ends[17]=1;
                        tdone[17]=1;
                      }
                      else {
                        active[17]=1;
                        ends[17]=1;
                        tdone[17]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S3138=1;
                S3138=0;
                if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 12, column: 30
                  checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                  S3138=1;
                  active[17]=1;
                  ends[17]=1;
                  tdone[17]=1;
                }
                else {
                  S3133=0;
                  if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                    checkFive_o.setVal((simFive_14.getpreval() == null ? null : ((Boolean)simFive_14.getpreval())));//sysj\conveyor_controller.sysj line: 12, column: 30
                    S3133=1;
                    if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                      checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                      ends[17]=2;
                      ;//sysj\conveyor_controller.sysj line: 12, column: 30
                      S3176=0;
                      active[17]=1;
                      ends[17]=1;
                      tdone[17]=1;
                    }
                    else {
                      active[17]=1;
                      ends[17]=1;
                      tdone[17]=1;
                    }
                  }
                  else {
                    active[17]=1;
                    ends[17]=1;
                    tdone[17]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38272(int [] tdone, int [] ends){
        switch(S3130){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S2944){
          case 0 : 
            if(simC_14.getprestatus()){//sysj\conveyor_controller.sysj line: 10, column: 14
              S2944=1;
              S2906=0;
              if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 27
                simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                S2906=1;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                S2901=0;
                if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                  simCapper_o.setVal((simC_14.getpreval() == null ? null : ((Boolean)simC_14.getpreval())));//sysj\conveyor_controller.sysj line: 10, column: 27
                  S2901=1;
                  if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                    simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                    ends[16]=2;
                    ;//sysj\conveyor_controller.sysj line: 10, column: 27
                    S2944=0;
                    active[16]=1;
                    ends[16]=1;
                    tdone[16]=1;
                  }
                  else {
                    active[16]=1;
                    ends[16]=1;
                    tdone[16]=1;
                  }
                }
                else {
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
              }
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            switch(S2906){
              case 0 : 
                if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 27
                  simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                  S2906=1;
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
                else {
                  switch(S2901){
                    case 0 : 
                      if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                        simCapper_o.setVal((simC_14.getpreval() == null ? null : ((Boolean)simC_14.getpreval())));//sysj\conveyor_controller.sysj line: 10, column: 27
                        S2901=1;
                        if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                          simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                          ends[16]=2;
                          ;//sysj\conveyor_controller.sysj line: 10, column: 27
                          S2944=0;
                          active[16]=1;
                          ends[16]=1;
                          tdone[16]=1;
                        }
                        else {
                          active[16]=1;
                          ends[16]=1;
                          tdone[16]=1;
                        }
                      }
                      else {
                        active[16]=1;
                        ends[16]=1;
                        tdone[16]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                        simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                        ends[16]=2;
                        ;//sysj\conveyor_controller.sysj line: 10, column: 27
                        S2944=0;
                        active[16]=1;
                        ends[16]=1;
                        tdone[16]=1;
                      }
                      else {
                        active[16]=1;
                        ends[16]=1;
                        tdone[16]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S2906=1;
                S2906=0;
                if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 27
                  simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                  S2906=1;
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
                else {
                  S2901=0;
                  if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                    simCapper_o.setVal((simC_14.getpreval() == null ? null : ((Boolean)simC_14.getpreval())));//sysj\conveyor_controller.sysj line: 10, column: 27
                    S2901=1;
                    if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                      simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                      ends[16]=2;
                      ;//sysj\conveyor_controller.sysj line: 10, column: 27
                      S2944=0;
                      active[16]=1;
                      ends[16]=1;
                      tdone[16]=1;
                    }
                    else {
                      active[16]=1;
                      ends[16]=1;
                      tdone[16]=1;
                    }
                  }
                  else {
                    active[16]=1;
                    ends[16]=1;
                    tdone[16]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38271(int [] tdone, int [] ends){
        switch(S2898){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S2712){
          case 0 : 
            if(simF_14.getprestatus()){//sysj\conveyor_controller.sysj line: 8, column: 14
              S2712=1;
              S2674=0;
              if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 27
                simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                S2674=1;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                S2669=0;
                if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                  simFiller_o.setVal((simF_14.getpreval() == null ? null : ((Boolean)simF_14.getpreval())));//sysj\conveyor_controller.sysj line: 8, column: 27
                  S2669=1;
                  if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                    simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                    ends[15]=2;
                    ;//sysj\conveyor_controller.sysj line: 8, column: 27
                    S2712=0;
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                  else {
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
                else {
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
              }
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            switch(S2674){
              case 0 : 
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                  S2674=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  switch(S2669){
                    case 0 : 
                      if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                        simFiller_o.setVal((simF_14.getpreval() == null ? null : ((Boolean)simF_14.getpreval())));//sysj\conveyor_controller.sysj line: 8, column: 27
                        S2669=1;
                        if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                          simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                          ends[15]=2;
                          ;//sysj\conveyor_controller.sysj line: 8, column: 27
                          S2712=0;
                          active[15]=1;
                          ends[15]=1;
                          tdone[15]=1;
                        }
                        else {
                          active[15]=1;
                          ends[15]=1;
                          tdone[15]=1;
                        }
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                        simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                        ends[15]=2;
                        ;//sysj\conveyor_controller.sysj line: 8, column: 27
                        S2712=0;
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S2674=1;
                S2674=0;
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                  S2674=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  S2669=0;
                  if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                    simFiller_o.setVal((simF_14.getpreval() == null ? null : ((Boolean)simF_14.getpreval())));//sysj\conveyor_controller.sysj line: 8, column: 27
                    S2669=1;
                    if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                      simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                      ends[15]=2;
                      ;//sysj\conveyor_controller.sysj line: 8, column: 27
                      S2712=0;
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                    else {
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                  }
                  else {
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38270(int [] tdone, int [] ends){
        switch(S4294){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        simF_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
        simC_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
        simFive_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
        simThree_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
        simOne_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
        thread38271(tdone,ends);
        thread38272(tdone,ends);
        thread38273(tdone,ends);
        thread38274(tdone,ends);
        thread38275(tdone,ends);
        thread38276(tdone,ends);
        int biggest38277 = 0;
        if(ends[15]>=biggest38277){
          biggest38277=ends[15];
        }
        if(ends[16]>=biggest38277){
          biggest38277=ends[16];
        }
        if(ends[17]>=biggest38277){
          biggest38277=ends[17];
        }
        if(ends[18]>=biggest38277){
          biggest38277=ends[18];
        }
        if(ends[19]>=biggest38277){
          biggest38277=ends[19];
        }
        if(ends[20]>=biggest38277){
          biggest38277=ends[20];
        }
        if(biggest38277 == 1){
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        //FINXME code
        if(biggest38277 == 0){
          S4294=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread38268(int [] tdone, int [] ends){
        S2633=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38267(int [] tdone, int [] ends){
        S2630=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 174, column: 22
    currsigs.addElement(bottleDeployedE);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread38265(int [] tdone, int [] ends){
        switch(S2633){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 178, column: 28
          ends[13]=2;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread38264(int [] tdone, int [] ends){
        switch(S2630){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 174, column: 22
        currsigs.addElement(bottleDeployedE);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread38263(int [] tdone, int [] ends){
        switch(S2660){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S2636){
          case 0 : 
            thread38264(tdone,ends);
            thread38265(tdone,ends);
            int biggest38266 = 0;
            if(ends[12]>=biggest38266){
              biggest38266=ends[12];
            }
            if(ends[13]>=biggest38266){
              biggest38266=ends[13];
            }
            if(biggest38266 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            if(biggest38266 == 2){
              ends[11]=2;
              ;//sysj\conveyor_controller.sysj line: 172, column: 11
              S2636=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            //FINXME code
            if(biggest38266 == 0){
              S2636=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            S2636=1;
            S2636=0;
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 171, column: 19
              thread38267(tdone,ends);
              thread38268(tdone,ends);
              int biggest38269 = 0;
              if(ends[12]>=biggest38269){
                biggest38269=ends[12];
              }
              if(ends[13]>=biggest38269){
                biggest38269=ends[13];
              }
              if(biggest38269 == 1){
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              S2636=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38262(int [] tdone, int [] ends){
        switch(S2625){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S2577){
          case 0 : 
            switch(S2561){
              case 0 : 
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 158, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
                  S2561=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S2556){
                    case 0 : 
                      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
                        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 158, column: 4
                        S2556=1;
                        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
                          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
                          ends[10]=2;
                          ;//sysj\conveyor_controller.sysj line: 158, column: 4
                          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 159, column: 4
                          currsigs.addElement(rotaryRotated_1);
                          rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 160, column: 6
                          currsigs.addElement(rotaryTableTriggerE);
                          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 161, column: 4
                          S2577=1;
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                        else {
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                      }
                      else {
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
                        rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
                        ends[10]=2;
                        ;//sysj\conveyor_controller.sysj line: 158, column: 4
                        rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 159, column: 4
                        currsigs.addElement(rotaryRotated_1);
                        rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 160, column: 6
                        currsigs.addElement(rotaryTableTriggerE);
                        System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 161, column: 4
                        S2577=1;
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      else {
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S2561=1;
                S2561=0;
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 158, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
                  S2561=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S2556=0;
                  if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
                    rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 158, column: 4
                    S2556=1;
                    if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
                      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
                      ends[10]=2;
                      ;//sysj\conveyor_controller.sysj line: 158, column: 4
                      rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 159, column: 4
                      currsigs.addElement(rotaryRotated_1);
                      rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 160, column: 6
                      currsigs.addElement(rotaryTableTriggerE);
                      System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 161, column: 4
                      S2577=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                  }
                  else {
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S2577=1;
            S2577=0;
            S2561=0;
            if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 158, column: 4
              rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
              S2561=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S2556=0;
              if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
                rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 158, column: 4
                S2556=1;
                if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
                  ends[10]=2;
                  ;//sysj\conveyor_controller.sysj line: 158, column: 4
                  rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 159, column: 4
                  currsigs.addElement(rotaryRotated_1);
                  rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 160, column: 6
                  currsigs.addElement(rotaryTableTriggerE);
                  System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 161, column: 4
                  S2577=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
              }
              else {
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38260(int [] tdone, int [] ends){
        switch(S2341){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S2336){
          case 0 : 
            if(com.systemj.Timer.getMs() - __start_thread_9 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 141, column: 17
              ends[9]=3;
              ;//sysj\conveyor_controller.sysj line: 141, column: 17
              System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 143, column: 21
              S2336=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 144, column: 27
              System.out.println("*Conveyor - Bottle Reached Pos1*");//sysj\conveyor_controller.sysj line: 145, column: 21
              ends[9]=2;
              tdone[9]=1;
            }
            else {
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38259(int [] tdone, int [] ends){
        switch(S2321){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 138, column: 21
        currsigs.addElement(motConveyorOnOff);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread38257(int [] tdone, int [] ends){
        S2341=1;
    S2336=0;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 141, column: 17
    if(com.systemj.Timer.getMs() - __start_thread_9 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 141, column: 17
      ends[9]=3;
      ;//sysj\conveyor_controller.sysj line: 141, column: 17
      System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 143, column: 21
      S2336=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread38256(int [] tdone, int [] ends){
        S2321=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor_controller.sysj line: 137, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 138, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread38255(int [] tdone, int [] ends){
        switch(S2554){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S2372){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 131, column: 19
              S2372=1;
              thread38256(tdone,ends);
              thread38257(tdone,ends);
              int biggest38258 = 0;
              if(ends[8]>=biggest38258){
                biggest38258=ends[8];
              }
              if(ends[9]>=biggest38258){
                biggest38258=ends[9];
              }
              if(biggest38258 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            thread38259(tdone,ends);
            thread38260(tdone,ends);
            int biggest38261 = 0;
            if(ends[8]>=biggest38261){
              biggest38261=ends[8];
            }
            if(ends[9]>=biggest38261){
              biggest38261=ends[9];
            }
            if(biggest38261 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest38261 == 2){
              ends[7]=2;
              ;//sysj\conveyor_controller.sysj line: 135, column: 13
              S2372=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest38261 == 0){
              S2372=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38253(int [] tdone, int [] ends){
        S1511=1;
    S1466=0;
    if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 107, column: 34
      S1466=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread38252(int [] tdone, int [] ends){
        S1464=1;
    S1463=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread38250(int [] tdone, int [] ends){
        switch(S1663){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 122, column: 20
          S1663=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread38249(int [] tdone, int [] ends){
        switch(S1660){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1643){
          case 0 : 
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 120, column: 14
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 120, column: 14
              S1643=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S1638){
                case 0 : 
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 120, column: 14
                    convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 120, column: 14
                    S1638=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 120, column: 14
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 120, column: 14
                      ends[5]=2;
                      ;//sysj\conveyor_controller.sysj line: 120, column: 14
                      S1660=0;
                      active[5]=0;
                      ends[5]=0;
                      tdone[5]=1;
                    }
                    else {
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  break;
                
                case 1 : 
                  if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 120, column: 14
                    convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 120, column: 14
                    ends[5]=2;
                    ;//sysj\conveyor_controller.sysj line: 120, column: 14
                    S1660=0;
                    active[5]=0;
                    ends[5]=0;
                    tdone[5]=1;
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 1 : 
            S1643=1;
            S1643=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 120, column: 14
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 120, column: 14
              S1643=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S1638=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 120, column: 14
                convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 120, column: 14
                S1638=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 120, column: 14
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 120, column: 14
                  ends[5]=2;
                  ;//sysj\conveyor_controller.sysj line: 120, column: 14
                  S1660=0;
                  active[5]=0;
                  ends[5]=0;
                  tdone[5]=1;
                }
                else {
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38247(int [] tdone, int [] ends){
        S1663=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread38246(int [] tdone, int [] ends){
        S1660=1;
    S1643=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 120, column: 14
      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 120, column: 14
      S1643=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S1638=0;
      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 120, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 120, column: 14
        S1638=1;
        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 120, column: 14
          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 120, column: 14
          ends[5]=2;
          ;//sysj\conveyor_controller.sysj line: 120, column: 14
          S1660=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
      else {
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
  }

  public void thread38244(int [] tdone, int [] ends){
        S1663=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread38243(int [] tdone, int [] ends){
        S1660=1;
    S1643=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 120, column: 14
      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 120, column: 14
      S1643=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S1638=0;
      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 120, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 120, column: 14
        S1638=1;
        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 120, column: 14
          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 120, column: 14
          ends[5]=2;
          ;//sysj\conveyor_controller.sysj line: 120, column: 14
          S1660=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
      else {
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
  }

  public void thread38241(int [] tdone, int [] ends){
        S1663=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread38240(int [] tdone, int [] ends){
        S1660=1;
    S1643=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 120, column: 14
      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 120, column: 14
      S1643=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S1638=0;
      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 120, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 120, column: 14
        S1638=1;
        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 120, column: 14
          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 120, column: 14
          ends[5]=2;
          ;//sysj\conveyor_controller.sysj line: 120, column: 14
          S1660=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
      else {
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
  }

  public void thread38238(int [] tdone, int [] ends){
        switch(S1511){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1466){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 107, column: 34
              S1466=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S1466=1;
            S1466=2;
            S1473=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 109, column: 18
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 109, column: 18
              S1473=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S1468=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 109, column: 18
                convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 109, column: 18
                S1468=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 109, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 109, column: 18
                  ends[4]=2;
                  ;//sysj\conveyor_controller.sysj line: 109, column: 18
                  System.out.println("*Empty...*");//sysj\conveyor_controller.sysj line: 110, column: 18
                  S1511=0;
                  active[4]=0;
                  ends[4]=0;
                  tdone[4]=1;
                }
                else {
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            break;
          
          case 2 : 
            switch(S1473){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 109, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 109, column: 18
                  S1473=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S1468){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 109, column: 18
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 109, column: 18
                        S1468=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 109, column: 18
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 109, column: 18
                          ends[4]=2;
                          ;//sysj\conveyor_controller.sysj line: 109, column: 18
                          System.out.println("*Empty...*");//sysj\conveyor_controller.sysj line: 110, column: 18
                          S1511=0;
                          active[4]=0;
                          ends[4]=0;
                          tdone[4]=1;
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 109, column: 18
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 109, column: 18
                        ends[4]=2;
                        ;//sysj\conveyor_controller.sysj line: 109, column: 18
                        System.out.println("*Empty...*");//sysj\conveyor_controller.sysj line: 110, column: 18
                        S1511=0;
                        active[4]=0;
                        ends[4]=0;
                        tdone[4]=1;
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S1473=1;
                S1473=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 109, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 109, column: 18
                  S1473=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S1468=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 109, column: 18
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 109, column: 18
                    S1468=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 109, column: 18
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 109, column: 18
                      ends[4]=2;
                      ;//sysj\conveyor_controller.sysj line: 109, column: 18
                      System.out.println("*Empty...*");//sysj\conveyor_controller.sysj line: 110, column: 18
                      S1511=0;
                      active[4]=0;
                      ends[4]=0;
                      tdone[4]=1;
                    }
                    else {
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38237(int [] tdone, int [] ends){
        switch(S1464){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1463){
          case 0 : 
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 101, column: 27
              S1463=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S1463=1;
            convReady_o.setPreempted();//sysj\conveyor_controller.sysj line: 103, column: 21
            ends[3]=2;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread38236(int [] tdone, int [] ends){
        switch(S2312){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1564){
          case 0 : 
            thread38237(tdone,ends);
            thread38238(tdone,ends);
            int biggest38239 = 0;
            if(ends[3]>=biggest38239){
              biggest38239=ends[3];
            }
            if(ends[4]>=biggest38239){
              biggest38239=ends[4];
            }
            if(biggest38239 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest38239 == 2){
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 99, column: 13
              S1564=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest38239 == 0){
              S1564=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S1564=1;
            insert_1.setPresent();//sysj\conveyor_controller.sysj line: 114, column: 13
            currsigs.addElement(insert_1);
            S1564=2;
            S1571=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 115, column: 13
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 13
              S1571=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S1566=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 13
                convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 115, column: 13
                S1566=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 13
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 115, column: 13
                  S1564=3;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 2 : 
            switch(S1571){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 115, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 13
                  S1571=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S1566){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 13
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 115, column: 13
                        S1566=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 13
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 13
                          ends[2]=2;
                          ;//sysj\conveyor_controller.sysj line: 115, column: 13
                          S1564=3;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 13
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 115, column: 13
                        S1564=3;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S1571=1;
                S1571=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 115, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 13
                  S1571=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S1566=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 13
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 115, column: 13
                    S1566=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 13
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 13
                      ends[2]=2;
                      ;//sysj\conveyor_controller.sysj line: 115, column: 13
                      S1564=3;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 3 : 
            S1564=3;
            S1564=4;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 95, column: 5
            S1610=0;
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 95, column: 5
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 95, column: 5
              S1564=5;
              thread38240(tdone,ends);
              thread38241(tdone,ends);
              int biggest38242 = 0;
              if(ends[5]>=biggest38242){
                biggest38242=ends[5];
              }
              if(ends[6]>=biggest38242){
                biggest38242=ends[6];
              }
              if(biggest38242 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S1610=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            switch(S1610){
              case 0 : 
                S1610=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 95, column: 5
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 95, column: 5
                  S1564=5;
                  thread38243(tdone,ends);
                  thread38244(tdone,ends);
                  int biggest38245 = 0;
                  if(ends[5]>=biggest38245){
                    biggest38245=ends[5];
                  }
                  if(ends[6]>=biggest38245){
                    biggest38245=ends[6];
                  }
                  if(biggest38245 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S1610=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S1610=1;
                S1610=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 95, column: 5
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 95, column: 5
                  S1564=5;
                  thread38246(tdone,ends);
                  thread38247(tdone,ends);
                  int biggest38248 = 0;
                  if(ends[5]>=biggest38248){
                    biggest38248=ends[5];
                  }
                  if(ends[6]>=biggest38248){
                    biggest38248=ends[6];
                  }
                  if(biggest38248 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S1610=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 5 : 
            thread38249(tdone,ends);
            thread38250(tdone,ends);
            int biggest38251 = 0;
            if(ends[5]>=biggest38251){
              biggest38251=ends[5];
            }
            if(ends[6]>=biggest38251){
              biggest38251=ends[6];
            }
            if(biggest38251 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest38251 == 0){
              S1564=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            S1564=6;
            System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 97, column: 10
            S1564=0;
            thread38252(tdone,ends);
            thread38253(tdone,ends);
            int biggest38254 = 0;
            if(ends[3]>=biggest38254){
              biggest38254=ends[3];
            }
            if(ends[4]>=biggest38254){
              biggest38254=ends[4];
            }
            if(biggest38254 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38233(int [] tdone, int [] ends){
        S4292=1;
    q_thread_20 = new boolean[5];//sysj\conveyor_controller.sysj line: 20, column: 3
    S3848=0;
    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
    o_thread_20 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
    c_thread_20 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
    System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
    for(int i_thread_20 = 0; i_thread_20 < q_thread_20.length; i_thread_20 = i_thread_20 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
      if(q_thread_20[i_thread_20]) {//sysj\conveyor_controller.sysj line: 27, column: 6
        o_thread_20 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
      }
      System.out.print(" " + (q_thread_20[i_thread_20] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
    }
    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
    if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
      simOne_14.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
      currsigs.addElement(simOne_14);
      simOne_14.setValue(q_thread_20[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
      simF_14.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
      currsigs.addElement(simF_14);
      simF_14.setValue(q_thread_20[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
      simThree_14.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
      currsigs.addElement(simThree_14);
      simThree_14.setValue(q_thread_20[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
      simC_14.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
      currsigs.addElement(simC_14);
      simC_14.setValue(q_thread_20[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
      simFive_14.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
      currsigs.addElement(simFive_14);
      simFive_14.setValue(q_thread_20[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
      S3827=0;
      if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
        S3835=0;
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
      else {
        S3835=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
        currsigs.addElement(empty_1);
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
    }
    else {
      S3827=0;
      if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
        S3835=0;
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
      else {
        S3835=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
        currsigs.addElement(empty_1);
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
    }
  }

  public void thread38232(int [] tdone, int [] ends){
        S3826=1;
    S3640=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread38231(int [] tdone, int [] ends){
        S3594=1;
    S3408=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38230(int [] tdone, int [] ends){
        S3362=1;
    S3176=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38229(int [] tdone, int [] ends){
        S3130=1;
    S2944=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38228(int [] tdone, int [] ends){
        S2898=1;
    S2712=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread38227(int [] tdone, int [] ends){
        S4294=1;
    simF_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simC_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simFive_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simThree_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simOne_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    thread38228(tdone,ends);
    thread38229(tdone,ends);
    thread38230(tdone,ends);
    thread38231(tdone,ends);
    thread38232(tdone,ends);
    thread38233(tdone,ends);
    int biggest38234 = 0;
    if(ends[15]>=biggest38234){
      biggest38234=ends[15];
    }
    if(ends[16]>=biggest38234){
      biggest38234=ends[16];
    }
    if(ends[17]>=biggest38234){
      biggest38234=ends[17];
    }
    if(ends[18]>=biggest38234){
      biggest38234=ends[18];
    }
    if(ends[19]>=biggest38234){
      biggest38234=ends[19];
    }
    if(ends[20]>=biggest38234){
      biggest38234=ends[20];
    }
    if(biggest38234 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread38225(int [] tdone, int [] ends){
        S2633=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38224(int [] tdone, int [] ends){
        S2630=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 174, column: 22
    currsigs.addElement(bottleDeployedE);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread38223(int [] tdone, int [] ends){
        S2660=1;
    S2636=0;
    if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 171, column: 19
      thread38224(tdone,ends);
      thread38225(tdone,ends);
      int biggest38226 = 0;
      if(ends[12]>=biggest38226){
        biggest38226=ends[12];
      }
      if(ends[13]>=biggest38226){
        biggest38226=ends[13];
      }
      if(biggest38226 == 1){
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
    else {
      S2636=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread38222(int [] tdone, int [] ends){
        S2625=1;
    S2577=0;
    S2561=0;
    if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 158, column: 4
      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
      S2561=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S2556=0;
      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 158, column: 4
        S2556=1;
        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
          ends[10]=2;
          ;//sysj\conveyor_controller.sysj line: 158, column: 4
          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 159, column: 4
          currsigs.addElement(rotaryRotated_1);
          rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 160, column: 6
          currsigs.addElement(rotaryTableTriggerE);
          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 161, column: 4
          S2577=1;
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
      }
      else {
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
  }

  public void thread38221(int [] tdone, int [] ends){
        S2554=1;
    S2372=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread38219(int [] tdone, int [] ends){
        S1511=1;
    S1466=0;
    if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 107, column: 34
      S1466=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread38218(int [] tdone, int [] ends){
        S1464=1;
    S1463=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread38217(int [] tdone, int [] ends){
        S2312=1;
    System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 97, column: 10
    S1564=0;
    thread38218(tdone,ends);
    thread38219(tdone,ends);
    int biggest38220 = 0;
    if(ends[3]>=biggest38220){
      biggest38220=ends[3];
    }
    if(ends[4]>=biggest38220){
      biggest38220=ends[4];
    }
    if(biggest38220 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S4296){
        case 0 : 
          S4296=0;
          break RUN;
        
        case 1 : 
          S4296=2;
          S4296=2;
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 94, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 94, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 94, column: 2
          thread38217(tdone,ends);
          thread38221(tdone,ends);
          thread38222(tdone,ends);
          thread38223(tdone,ends);
          thread38227(tdone,ends);
          int biggest38235 = 0;
          if(ends[2]>=biggest38235){
            biggest38235=ends[2];
          }
          if(ends[7]>=biggest38235){
            biggest38235=ends[7];
          }
          if(ends[10]>=biggest38235){
            biggest38235=ends[10];
          }
          if(ends[11]>=biggest38235){
            biggest38235=ends[11];
          }
          if(ends[14]>=biggest38235){
            biggest38235=ends[14];
          }
          if(biggest38235 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          if(biggest38235 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 94, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 94, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 94, column: 2
          thread38236(tdone,ends);
          thread38255(tdone,ends);
          thread38262(tdone,ends);
          thread38263(tdone,ends);
          thread38270(tdone,ends);
          int biggest38278 = 0;
          if(ends[2]>=biggest38278){
            biggest38278=ends[2];
          }
          if(ends[7]>=biggest38278){
            biggest38278=ends[7];
          }
          if(ends[10]>=biggest38278){
            biggest38278=ends[10];
          }
          if(ends[11]>=biggest38278){
            biggest38278=ends[11];
          }
          if(ends[14]>=biggest38278){
            biggest38278=ends[14];
          }
          if(biggest38278 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest38278 == 0){
            S4296=0;
            active[1]=0;
            ends[1]=0;
            S4296=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    rotaryRotated_1 = new Signal();
    empty_1 = new Signal();
    insert_1 = new Signal();
    simF_14 = new Signal();
    simC_14 = new Signal();
    simFive_14 = new Signal();
    simThree_14 = new Signal();
    simOne_14 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          rotated_in.gethook();
          convReady_o.gethook();
          simFiller_o.gethook();
          simCapper_o.gethook();
          checkFive_o.gethook();
          checkThree_o.gethook();
          checkOne_o.gethook();
          bottleAtPos1.gethook();
          bottleLeftPos5.gethook();
          bottleDeployed.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleDeployed.setpreclear();
      motConveyorOnOff.setpreclear();
      bottleDeployedE.setpreclear();
      rotaryTableTriggerE.setpreclear();
      rotaryRotated_1.setpreclear();
      empty_1.setpreclear();
      insert_1.setpreclear();
      simF_14.setpreclear();
      simC_14.setpreclear();
      simFive_14.setpreclear();
      simThree_14.setpreclear();
      simOne_14.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      dummyint = bottleDeployed.getStatus() ? bottleDeployed.setprepresent() : bottleDeployed.setpreclear();
      bottleDeployed.setpreval(bottleDeployed.getValue());
      bottleDeployed.setClear();
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      bottleDeployedE.sethook();
      bottleDeployedE.setClear();
      rotaryTableTriggerE.sethook();
      rotaryTableTriggerE.setClear();
      rotaryRotated_1.setClear();
      empty_1.setClear();
      insert_1.setClear();
      simF_14.setClear();
      simC_14.setClear();
      simFive_14.setClear();
      simThree_14.setClear();
      simOne_14.setClear();
      rotated_in.sethook();
      convReady_o.sethook();
      simFiller_o.sethook();
      simCapper_o.sethook();
      checkFive_o.sethook();
      checkThree_o.sethook();
      checkOne_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        rotated_in.gethook();
        convReady_o.gethook();
        simFiller_o.gethook();
        simCapper_o.gethook();
        checkFive_o.gethook();
        checkThree_o.gethook();
        checkOne_o.gethook();
        bottleAtPos1.gethook();
        bottleLeftPos5.gethook();
        bottleDeployed.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
