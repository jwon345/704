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
  private long __start_thread_7;//sysj\conveyor_controller.sysj line: 129, column: 5
  private long __start_thread_9;//sysj\conveyor_controller.sysj line: 141, column: 17
  private boolean[] q_thread_20;//sysj\conveyor_controller.sysj line: 20, column: 3
  private boolean o_thread_20;//sysj\conveyor_controller.sysj line: 22, column: 9
  private boolean c_thread_20;//sysj\conveyor_controller.sysj line: 22, column: 9
  private int S4640 = 1;
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
  private int S2898 = 1;
  private int S2342 = 1;
  private int S2350 = 1;
  private int S2370 = 1;
  private int S2365 = 1;
  private int S2969 = 1;
  private int S2921 = 1;
  private int S2905 = 1;
  private int S2900 = 1;
  private int S3004 = 1;
  private int S2980 = 1;
  private int S2974 = 1;
  private int S2977 = 1;
  private int S4638 = 1;
  private int S3242 = 1;
  private int S3056 = 1;
  private int S3018 = 1;
  private int S3013 = 1;
  private int S3474 = 1;
  private int S3288 = 1;
  private int S3250 = 1;
  private int S3245 = 1;
  private int S3706 = 1;
  private int S3520 = 1;
  private int S3482 = 1;
  private int S3477 = 1;
  private int S3938 = 1;
  private int S3752 = 1;
  private int S3714 = 1;
  private int S3709 = 1;
  private int S4170 = 1;
  private int S3984 = 1;
  private int S3946 = 1;
  private int S3941 = 1;
  private int S4636 = 1;
  private int S4192 = 1;
  private int S4171 = 1;
  private int S4179 = 1;
  
  private int[] ends = new int[72];
  private int[] tdone = new int[72];
  
  public void thread38623(int [] tdone, int [] ends){
        switch(S4636){
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
            S4192=0;
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
              S4171=0;
              if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                S4179=0;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                S4179=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                currsigs.addElement(empty_1);
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
            else {
              S4171=0;
              if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                S4179=0;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                S4179=1;
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
            S4192=0;
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
              S4171=0;
              if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                S4179=0;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                S4179=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                currsigs.addElement(empty_1);
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
            else {
              S4171=0;
              if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                S4179=0;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                S4179=1;
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
          switch(S4192){
            case 0 : 
              if(insert_1.getprestatus()){//sysj\conveyor_controller.sysj line: 52, column: 12
                if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 53, column: 13
                  for(int i_thread_20 = q_thread_20.length - 1; i_thread_20 > 0; i_thread_20 = i_thread_20 - 1) {//sysj\conveyor_controller.sysj line: 54, column: 37
                    q_thread_20[i_thread_20] = q_thread_20[i_thread_20 - 1];//sysj\conveyor_controller.sysj line: 55, column: 7
                  }
                  q_thread_20[0] = true;//sysj\conveyor_controller.sysj line: 58, column: 5
                  S4192=0;
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
                    S4171=0;
                    if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S4179=0;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      S4179=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                      currsigs.addElement(empty_1);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    S4171=0;
                    if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S4179=0;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      S4179=1;
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
                  S4192=0;
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
                    S4171=0;
                    if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S4179=0;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      S4179=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                      currsigs.addElement(empty_1);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    S4171=0;
                    if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S4179=0;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      S4179=1;
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
                switch(S4171){
                  case 0 : 
                    switch(S4179){
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
                    S4192=0;
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
                      S4171=0;
                      if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                        S4179=0;
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      else {
                        S4179=1;
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                        currsigs.addElement(empty_1);
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                    }
                    else {
                      S4171=0;
                      if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                        S4179=0;
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      else {
                        S4179=1;
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
              S4192=0;
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
                S4171=0;
                if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S4179=0;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  S4179=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
              }
              else {
                S4171=0;
                if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S4179=0;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  S4179=1;
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

  public void thread38622(int [] tdone, int [] ends){
        switch(S4170){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S3984){
          case 0 : 
            if(simOne_14.getprestatus()){//sysj\conveyor_controller.sysj line: 16, column: 14
              S3984=1;
              S3946=0;
              if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 16, column: 29
                checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                S3946=1;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S3941=0;
                if(checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                  checkOne_o.setVal((simOne_14.getpreval() == null ? null : ((Boolean)simOne_14.getpreval())));//sysj\conveyor_controller.sysj line: 16, column: 29
                  S3941=1;
                  if(!checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                    checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                    ends[19]=2;
                    ;//sysj\conveyor_controller.sysj line: 16, column: 29
                    S3984=0;
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
            switch(S3946){
              case 0 : 
                if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 16, column: 29
                  checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                  S3946=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  switch(S3941){
                    case 0 : 
                      if(checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                        checkOne_o.setVal((simOne_14.getpreval() == null ? null : ((Boolean)simOne_14.getpreval())));//sysj\conveyor_controller.sysj line: 16, column: 29
                        S3941=1;
                        if(!checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                          checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                          ends[19]=2;
                          ;//sysj\conveyor_controller.sysj line: 16, column: 29
                          S3984=0;
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
                        S3984=0;
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
                S3946=1;
                S3946=0;
                if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 16, column: 29
                  checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                  S3946=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S3941=0;
                  if(checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                    checkOne_o.setVal((simOne_14.getpreval() == null ? null : ((Boolean)simOne_14.getpreval())));//sysj\conveyor_controller.sysj line: 16, column: 29
                    S3941=1;
                    if(!checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                      checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                      ends[19]=2;
                      ;//sysj\conveyor_controller.sysj line: 16, column: 29
                      S3984=0;
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

  public void thread38621(int [] tdone, int [] ends){
        switch(S3938){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S3752){
          case 0 : 
            if(simThree_14.getprestatus()){//sysj\conveyor_controller.sysj line: 14, column: 14
              S3752=1;
              S3714=0;
              if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 31
                checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                S3714=1;
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                S3709=0;
                if(checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                  checkThree_o.setVal((simThree_14.getpreval() == null ? null : ((Boolean)simThree_14.getpreval())));//sysj\conveyor_controller.sysj line: 14, column: 31
                  S3709=1;
                  if(!checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                    checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                    ends[18]=2;
                    ;//sysj\conveyor_controller.sysj line: 14, column: 31
                    S3752=0;
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
            switch(S3714){
              case 0 : 
                if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 31
                  checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                  S3714=1;
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                }
                else {
                  switch(S3709){
                    case 0 : 
                      if(checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                        checkThree_o.setVal((simThree_14.getpreval() == null ? null : ((Boolean)simThree_14.getpreval())));//sysj\conveyor_controller.sysj line: 14, column: 31
                        S3709=1;
                        if(!checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                          checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                          ends[18]=2;
                          ;//sysj\conveyor_controller.sysj line: 14, column: 31
                          S3752=0;
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
                        S3752=0;
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
                S3714=1;
                S3714=0;
                if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 31
                  checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                  S3714=1;
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                }
                else {
                  S3709=0;
                  if(checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                    checkThree_o.setVal((simThree_14.getpreval() == null ? null : ((Boolean)simThree_14.getpreval())));//sysj\conveyor_controller.sysj line: 14, column: 31
                    S3709=1;
                    if(!checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                      checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                      ends[18]=2;
                      ;//sysj\conveyor_controller.sysj line: 14, column: 31
                      S3752=0;
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

  public void thread38620(int [] tdone, int [] ends){
        switch(S3706){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S3520){
          case 0 : 
            if(simFive_14.getprestatus()){//sysj\conveyor_controller.sysj line: 12, column: 14
              S3520=1;
              S3482=0;
              if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 12, column: 30
                checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                S3482=1;
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
              else {
                S3477=0;
                if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                  checkFive_o.setVal((simFive_14.getpreval() == null ? null : ((Boolean)simFive_14.getpreval())));//sysj\conveyor_controller.sysj line: 12, column: 30
                  S3477=1;
                  if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                    checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                    ends[17]=2;
                    ;//sysj\conveyor_controller.sysj line: 12, column: 30
                    S3520=0;
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
            switch(S3482){
              case 0 : 
                if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 12, column: 30
                  checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                  S3482=1;
                  active[17]=1;
                  ends[17]=1;
                  tdone[17]=1;
                }
                else {
                  switch(S3477){
                    case 0 : 
                      if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                        checkFive_o.setVal((simFive_14.getpreval() == null ? null : ((Boolean)simFive_14.getpreval())));//sysj\conveyor_controller.sysj line: 12, column: 30
                        S3477=1;
                        if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                          checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                          ends[17]=2;
                          ;//sysj\conveyor_controller.sysj line: 12, column: 30
                          S3520=0;
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
                        S3520=0;
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
                S3482=1;
                S3482=0;
                if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 12, column: 30
                  checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                  S3482=1;
                  active[17]=1;
                  ends[17]=1;
                  tdone[17]=1;
                }
                else {
                  S3477=0;
                  if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                    checkFive_o.setVal((simFive_14.getpreval() == null ? null : ((Boolean)simFive_14.getpreval())));//sysj\conveyor_controller.sysj line: 12, column: 30
                    S3477=1;
                    if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                      checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                      ends[17]=2;
                      ;//sysj\conveyor_controller.sysj line: 12, column: 30
                      S3520=0;
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

  public void thread38619(int [] tdone, int [] ends){
        switch(S3474){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S3288){
          case 0 : 
            if(simC_14.getprestatus()){//sysj\conveyor_controller.sysj line: 10, column: 14
              S3288=1;
              S3250=0;
              if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 27
                simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                S3250=1;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                S3245=0;
                if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                  simCapper_o.setVal((simC_14.getpreval() == null ? null : ((Boolean)simC_14.getpreval())));//sysj\conveyor_controller.sysj line: 10, column: 27
                  S3245=1;
                  if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                    simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                    ends[16]=2;
                    ;//sysj\conveyor_controller.sysj line: 10, column: 27
                    S3288=0;
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
            switch(S3250){
              case 0 : 
                if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 27
                  simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                  S3250=1;
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
                else {
                  switch(S3245){
                    case 0 : 
                      if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                        simCapper_o.setVal((simC_14.getpreval() == null ? null : ((Boolean)simC_14.getpreval())));//sysj\conveyor_controller.sysj line: 10, column: 27
                        S3245=1;
                        if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                          simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                          ends[16]=2;
                          ;//sysj\conveyor_controller.sysj line: 10, column: 27
                          S3288=0;
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
                        S3288=0;
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
                S3250=1;
                S3250=0;
                if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 27
                  simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                  S3250=1;
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
                else {
                  S3245=0;
                  if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                    simCapper_o.setVal((simC_14.getpreval() == null ? null : ((Boolean)simC_14.getpreval())));//sysj\conveyor_controller.sysj line: 10, column: 27
                    S3245=1;
                    if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                      simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                      ends[16]=2;
                      ;//sysj\conveyor_controller.sysj line: 10, column: 27
                      S3288=0;
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

  public void thread38618(int [] tdone, int [] ends){
        switch(S3242){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S3056){
          case 0 : 
            if(simF_14.getprestatus()){//sysj\conveyor_controller.sysj line: 8, column: 14
              S3056=1;
              S3018=0;
              if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 27
                simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                S3018=1;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                S3013=0;
                if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                  simFiller_o.setVal((simF_14.getpreval() == null ? null : ((Boolean)simF_14.getpreval())));//sysj\conveyor_controller.sysj line: 8, column: 27
                  S3013=1;
                  if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                    simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                    ends[15]=2;
                    ;//sysj\conveyor_controller.sysj line: 8, column: 27
                    S3056=0;
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
            switch(S3018){
              case 0 : 
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                  S3018=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  switch(S3013){
                    case 0 : 
                      if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                        simFiller_o.setVal((simF_14.getpreval() == null ? null : ((Boolean)simF_14.getpreval())));//sysj\conveyor_controller.sysj line: 8, column: 27
                        S3013=1;
                        if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                          simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                          ends[15]=2;
                          ;//sysj\conveyor_controller.sysj line: 8, column: 27
                          S3056=0;
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
                        S3056=0;
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
                S3018=1;
                S3018=0;
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                  S3018=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  S3013=0;
                  if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                    simFiller_o.setVal((simF_14.getpreval() == null ? null : ((Boolean)simF_14.getpreval())));//sysj\conveyor_controller.sysj line: 8, column: 27
                    S3013=1;
                    if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                      simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                      ends[15]=2;
                      ;//sysj\conveyor_controller.sysj line: 8, column: 27
                      S3056=0;
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

  public void thread38617(int [] tdone, int [] ends){
        switch(S4638){
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
        thread38618(tdone,ends);
        thread38619(tdone,ends);
        thread38620(tdone,ends);
        thread38621(tdone,ends);
        thread38622(tdone,ends);
        thread38623(tdone,ends);
        int biggest38624 = 0;
        if(ends[15]>=biggest38624){
          biggest38624=ends[15];
        }
        if(ends[16]>=biggest38624){
          biggest38624=ends[16];
        }
        if(ends[17]>=biggest38624){
          biggest38624=ends[17];
        }
        if(ends[18]>=biggest38624){
          biggest38624=ends[18];
        }
        if(ends[19]>=biggest38624){
          biggest38624=ends[19];
        }
        if(ends[20]>=biggest38624){
          biggest38624=ends[20];
        }
        if(biggest38624 == 1){
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        //FINXME code
        if(biggest38624 == 0){
          S4638=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread38615(int [] tdone, int [] ends){
        S2977=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38614(int [] tdone, int [] ends){
        S2974=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 174, column: 22
    currsigs.addElement(bottleDeployedE);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread38612(int [] tdone, int [] ends){
        switch(S2977){
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

  public void thread38611(int [] tdone, int [] ends){
        switch(S2974){
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

  public void thread38610(int [] tdone, int [] ends){
        switch(S3004){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S2980){
          case 0 : 
            thread38611(tdone,ends);
            thread38612(tdone,ends);
            int biggest38613 = 0;
            if(ends[12]>=biggest38613){
              biggest38613=ends[12];
            }
            if(ends[13]>=biggest38613){
              biggest38613=ends[13];
            }
            if(biggest38613 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            if(biggest38613 == 2){
              ends[11]=2;
              ;//sysj\conveyor_controller.sysj line: 172, column: 11
              S2980=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            //FINXME code
            if(biggest38613 == 0){
              S2980=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            S2980=1;
            S2980=0;
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 171, column: 19
              thread38614(tdone,ends);
              thread38615(tdone,ends);
              int biggest38616 = 0;
              if(ends[12]>=biggest38616){
                biggest38616=ends[12];
              }
              if(ends[13]>=biggest38616){
                biggest38616=ends[13];
              }
              if(biggest38616 == 1){
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              S2980=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38609(int [] tdone, int [] ends){
        switch(S2969){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S2921){
          case 0 : 
            switch(S2905){
              case 0 : 
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 158, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
                  S2905=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S2900){
                    case 0 : 
                      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
                        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 158, column: 4
                        S2900=1;
                        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
                          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
                          ends[10]=2;
                          ;//sysj\conveyor_controller.sysj line: 158, column: 4
                          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 159, column: 4
                          currsigs.addElement(rotaryRotated_1);
                          rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 160, column: 6
                          currsigs.addElement(rotaryTableTriggerE);
                          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 161, column: 4
                          S2921=1;
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
                        S2921=1;
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
                S2905=1;
                S2905=0;
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 158, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
                  S2905=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S2900=0;
                  if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
                    rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 158, column: 4
                    S2900=1;
                    if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
                      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
                      ends[10]=2;
                      ;//sysj\conveyor_controller.sysj line: 158, column: 4
                      rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 159, column: 4
                      currsigs.addElement(rotaryRotated_1);
                      rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 160, column: 6
                      currsigs.addElement(rotaryTableTriggerE);
                      System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 161, column: 4
                      S2921=1;
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
            S2921=1;
            S2921=0;
            S2905=0;
            if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 158, column: 4
              rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
              S2905=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S2900=0;
              if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
                rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 158, column: 4
                S2900=1;
                if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
                  ends[10]=2;
                  ;//sysj\conveyor_controller.sysj line: 158, column: 4
                  rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 159, column: 4
                  currsigs.addElement(rotaryRotated_1);
                  rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 160, column: 6
                  currsigs.addElement(rotaryTableTriggerE);
                  System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 161, column: 4
                  S2921=1;
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

  public void thread38607(int [] tdone, int [] ends){
        switch(S2370){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S2365){
          case 0 : 
            if(com.systemj.Timer.getMs() - __start_thread_9 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 141, column: 17
              ends[9]=3;
              ;//sysj\conveyor_controller.sysj line: 141, column: 17
              System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 143, column: 21
              S2365=1;
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

  public void thread38606(int [] tdone, int [] ends){
        switch(S2350){
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

  public void thread38604(int [] tdone, int [] ends){
        S2370=1;
    S2365=0;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 141, column: 17
    if(com.systemj.Timer.getMs() - __start_thread_9 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 141, column: 17
      ends[9]=3;
      ;//sysj\conveyor_controller.sysj line: 141, column: 17
      System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 143, column: 21
      S2365=1;
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

  public void thread38603(int [] tdone, int [] ends){
        S2350=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor_controller.sysj line: 137, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 138, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread38601(int [] tdone, int [] ends){
        S2370=1;
    S2365=0;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 141, column: 17
    if(com.systemj.Timer.getMs() - __start_thread_9 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 141, column: 17
      ends[9]=3;
      ;//sysj\conveyor_controller.sysj line: 141, column: 17
      System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 143, column: 21
      S2365=1;
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

  public void thread38600(int [] tdone, int [] ends){
        S2350=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor_controller.sysj line: 137, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 138, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread38599(int [] tdone, int [] ends){
        switch(S2898){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S2342){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 131, column: 19
              S2342=1;
              __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 129, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 129, column: 5
                ends[7]=2;
                ;//sysj\conveyor_controller.sysj line: 129, column: 5
                S2342=2;
                thread38600(tdone,ends);
                thread38601(tdone,ends);
                int biggest38602 = 0;
                if(ends[8]>=biggest38602){
                  biggest38602=ends[8];
                }
                if(ends[9]>=biggest38602){
                  biggest38602=ends[9];
                }
                if(biggest38602 == 1){
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
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 129, column: 5
              ends[7]=2;
              ;//sysj\conveyor_controller.sysj line: 129, column: 5
              S2342=2;
              thread38603(tdone,ends);
              thread38604(tdone,ends);
              int biggest38605 = 0;
              if(ends[8]>=biggest38605){
                biggest38605=ends[8];
              }
              if(ends[9]>=biggest38605){
                biggest38605=ends[9];
              }
              if(biggest38605 == 1){
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
          
          case 2 : 
            thread38606(tdone,ends);
            thread38607(tdone,ends);
            int biggest38608 = 0;
            if(ends[8]>=biggest38608){
              biggest38608=ends[8];
            }
            if(ends[9]>=biggest38608){
              biggest38608=ends[9];
            }
            if(biggest38608 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest38608 == 2){
              ends[7]=2;
              ;//sysj\conveyor_controller.sysj line: 135, column: 13
              S2342=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest38608 == 0){
              S2342=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38597(int [] tdone, int [] ends){
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

  public void thread38596(int [] tdone, int [] ends){
        S1464=1;
    S1463=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread38594(int [] tdone, int [] ends){
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

  public void thread38593(int [] tdone, int [] ends){
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

  public void thread38591(int [] tdone, int [] ends){
        S1663=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread38590(int [] tdone, int [] ends){
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

  public void thread38588(int [] tdone, int [] ends){
        S1663=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread38587(int [] tdone, int [] ends){
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

  public void thread38585(int [] tdone, int [] ends){
        S1663=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread38584(int [] tdone, int [] ends){
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

  public void thread38582(int [] tdone, int [] ends){
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

  public void thread38581(int [] tdone, int [] ends){
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

  public void thread38580(int [] tdone, int [] ends){
        switch(S2312){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1564){
          case 0 : 
            thread38581(tdone,ends);
            thread38582(tdone,ends);
            int biggest38583 = 0;
            if(ends[3]>=biggest38583){
              biggest38583=ends[3];
            }
            if(ends[4]>=biggest38583){
              biggest38583=ends[4];
            }
            if(biggest38583 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest38583 == 2){
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 99, column: 13
              S1564=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest38583 == 0){
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
              thread38584(tdone,ends);
              thread38585(tdone,ends);
              int biggest38586 = 0;
              if(ends[5]>=biggest38586){
                biggest38586=ends[5];
              }
              if(ends[6]>=biggest38586){
                biggest38586=ends[6];
              }
              if(biggest38586 == 1){
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
                  thread38587(tdone,ends);
                  thread38588(tdone,ends);
                  int biggest38589 = 0;
                  if(ends[5]>=biggest38589){
                    biggest38589=ends[5];
                  }
                  if(ends[6]>=biggest38589){
                    biggest38589=ends[6];
                  }
                  if(biggest38589 == 1){
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
                  thread38590(tdone,ends);
                  thread38591(tdone,ends);
                  int biggest38592 = 0;
                  if(ends[5]>=biggest38592){
                    biggest38592=ends[5];
                  }
                  if(ends[6]>=biggest38592){
                    biggest38592=ends[6];
                  }
                  if(biggest38592 == 1){
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
            thread38593(tdone,ends);
            thread38594(tdone,ends);
            int biggest38595 = 0;
            if(ends[5]>=biggest38595){
              biggest38595=ends[5];
            }
            if(ends[6]>=biggest38595){
              biggest38595=ends[6];
            }
            if(biggest38595 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest38595 == 0){
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
            thread38596(tdone,ends);
            thread38597(tdone,ends);
            int biggest38598 = 0;
            if(ends[3]>=biggest38598){
              biggest38598=ends[3];
            }
            if(ends[4]>=biggest38598){
              biggest38598=ends[4];
            }
            if(biggest38598 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38577(int [] tdone, int [] ends){
        S4636=1;
    q_thread_20 = new boolean[5];//sysj\conveyor_controller.sysj line: 20, column: 3
    S4192=0;
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
      S4171=0;
      if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
        S4179=0;
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
      else {
        S4179=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
        currsigs.addElement(empty_1);
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
    }
    else {
      S4171=0;
      if(o_thread_20){//sysj\conveyor_controller.sysj line: 40, column: 5
        S4179=0;
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
      else {
        S4179=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
        currsigs.addElement(empty_1);
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
    }
  }

  public void thread38576(int [] tdone, int [] ends){
        S4170=1;
    S3984=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread38575(int [] tdone, int [] ends){
        S3938=1;
    S3752=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38574(int [] tdone, int [] ends){
        S3706=1;
    S3520=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38573(int [] tdone, int [] ends){
        S3474=1;
    S3288=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38572(int [] tdone, int [] ends){
        S3242=1;
    S3056=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread38571(int [] tdone, int [] ends){
        S4638=1;
    simF_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simC_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simFive_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simThree_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simOne_14.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    thread38572(tdone,ends);
    thread38573(tdone,ends);
    thread38574(tdone,ends);
    thread38575(tdone,ends);
    thread38576(tdone,ends);
    thread38577(tdone,ends);
    int biggest38578 = 0;
    if(ends[15]>=biggest38578){
      biggest38578=ends[15];
    }
    if(ends[16]>=biggest38578){
      biggest38578=ends[16];
    }
    if(ends[17]>=biggest38578){
      biggest38578=ends[17];
    }
    if(ends[18]>=biggest38578){
      biggest38578=ends[18];
    }
    if(ends[19]>=biggest38578){
      biggest38578=ends[19];
    }
    if(ends[20]>=biggest38578){
      biggest38578=ends[20];
    }
    if(biggest38578 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread38569(int [] tdone, int [] ends){
        S2977=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38568(int [] tdone, int [] ends){
        S2974=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 174, column: 22
    currsigs.addElement(bottleDeployedE);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread38567(int [] tdone, int [] ends){
        S3004=1;
    S2980=0;
    if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 171, column: 19
      thread38568(tdone,ends);
      thread38569(tdone,ends);
      int biggest38570 = 0;
      if(ends[12]>=biggest38570){
        biggest38570=ends[12];
      }
      if(ends[13]>=biggest38570){
        biggest38570=ends[13];
      }
      if(biggest38570 == 1){
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
    else {
      S2980=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread38566(int [] tdone, int [] ends){
        S2969=1;
    S2921=0;
    S2905=0;
    if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 158, column: 4
      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
      S2905=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S2900=0;
      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 158, column: 4
        S2900=1;
        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 158, column: 4
          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 158, column: 4
          ends[10]=2;
          ;//sysj\conveyor_controller.sysj line: 158, column: 4
          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 159, column: 4
          currsigs.addElement(rotaryRotated_1);
          rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 160, column: 6
          currsigs.addElement(rotaryTableTriggerE);
          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 161, column: 4
          S2921=1;
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

  public void thread38565(int [] tdone, int [] ends){
        S2898=1;
    S2342=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread38563(int [] tdone, int [] ends){
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

  public void thread38562(int [] tdone, int [] ends){
        S1464=1;
    S1463=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread38561(int [] tdone, int [] ends){
        S2312=1;
    System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 97, column: 10
    S1564=0;
    thread38562(tdone,ends);
    thread38563(tdone,ends);
    int biggest38564 = 0;
    if(ends[3]>=biggest38564){
      biggest38564=ends[3];
    }
    if(ends[4]>=biggest38564){
      biggest38564=ends[4];
    }
    if(biggest38564 == 1){
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
      switch(S4640){
        case 0 : 
          S4640=0;
          break RUN;
        
        case 1 : 
          S4640=2;
          S4640=2;
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 94, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 94, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 94, column: 2
          thread38561(tdone,ends);
          thread38565(tdone,ends);
          thread38566(tdone,ends);
          thread38567(tdone,ends);
          thread38571(tdone,ends);
          int biggest38579 = 0;
          if(ends[2]>=biggest38579){
            biggest38579=ends[2];
          }
          if(ends[7]>=biggest38579){
            biggest38579=ends[7];
          }
          if(ends[10]>=biggest38579){
            biggest38579=ends[10];
          }
          if(ends[11]>=biggest38579){
            biggest38579=ends[11];
          }
          if(ends[14]>=biggest38579){
            biggest38579=ends[14];
          }
          if(biggest38579 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          if(biggest38579 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 94, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 94, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 94, column: 2
          thread38580(tdone,ends);
          thread38599(tdone,ends);
          thread38609(tdone,ends);
          thread38610(tdone,ends);
          thread38617(tdone,ends);
          int biggest38625 = 0;
          if(ends[2]>=biggest38625){
            biggest38625=ends[2];
          }
          if(ends[7]>=biggest38625){
            biggest38625=ends[7];
          }
          if(ends[10]>=biggest38625){
            biggest38625=ends[10];
          }
          if(ends[11]>=biggest38625){
            biggest38625=ends[11];
          }
          if(ends[14]>=biggest38625){
            biggest38625=ends[14];
          }
          if(biggest38625 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest38625 == 0){
            S4640=0;
            active[1]=0;
            ends[1]=0;
            S4640=0;
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
