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
  public input_Channel rotated_in = new input_Channel();
  public output_Channel convReady_o = new output_Channel();
  public output_Channel simFiller_o = new output_Channel();
  public output_Channel simCapper_o = new output_Channel();
  public output_Channel checkFive_o = new output_Channel();
  private Signal rotaryRotated_1;
  private Signal empty_1;
  private Signal insert_1;
  private Signal simF_11;
  private Signal simC_11;
  private Signal simFive_11;
  private long __start_thread_2;//sysj\conveyor_controller.sysj line: 87, column: 5
  private boolean[] q_thread_15;//sysj\conveyor_controller.sysj line: 16, column: 3
  private boolean o_thread_15;//sysj\conveyor_controller.sysj line: 18, column: 9
  private boolean c_thread_15;//sysj\conveyor_controller.sysj line: 18, column: 9
  private int S3733 = 1;
  private int S3732 = 1;
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
  private int S2426 = 1;
  private int S2340 = 1;
  private int S2321 = 1;
  private int S2325 = 1;
  private int S2497 = 1;
  private int S2449 = 1;
  private int S2433 = 1;
  private int S2428 = 1;
  private int S3665 = 1;
  private int S2733 = 1;
  private int S2547 = 1;
  private int S2509 = 1;
  private int S2504 = 1;
  private int S2965 = 1;
  private int S2779 = 1;
  private int S2741 = 1;
  private int S2736 = 1;
  private int S3197 = 1;
  private int S3011 = 1;
  private int S2973 = 1;
  private int S2968 = 1;
  private int S3663 = 1;
  private int S3219 = 1;
  private int S3198 = 1;
  private int S3206 = 1;
  private int S3676 = 1;
  private int S3670 = 1;
  private int S3673 = 1;
  
  private int[] ends = new int[60];
  private int[] tdone = new int[60];
  
  public void thread30979(int [] tdone, int [] ends){
        S3673=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread30978(int [] tdone, int [] ends){
        S3670=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 158, column: 22
    currsigs.addElement(bottleDeployedE);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread30976(int [] tdone, int [] ends){
        switch(S3673){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 162, column: 28
          ends[17]=2;
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

  public void thread30975(int [] tdone, int [] ends){
        switch(S3670){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 158, column: 22
        currsigs.addElement(bottleDeployedE);
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread30973(int [] tdone, int [] ends){
        S3673=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread30972(int [] tdone, int [] ends){
        S3670=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 158, column: 22
    currsigs.addElement(bottleDeployedE);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread30969(int [] tdone, int [] ends){
        switch(S3663){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 38, column: 11
          for(int i_thread_15 = q_thread_15.length - 1; i_thread_15 > 0; i_thread_15 = i_thread_15 - 1) {//sysj\conveyor_controller.sysj line: 39, column: 36
            q_thread_15[i_thread_15] = q_thread_15[i_thread_15 - 1];//sysj\conveyor_controller.sysj line: 40, column: 6
          }
          if(insert_1.getprestatus()){//sysj\conveyor_controller.sysj line: 42, column: 13
            q_thread_15[0] = true;//sysj\conveyor_controller.sysj line: 43, column: 6
            S3219=0;
            System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 19, column: 5
            o_thread_15 = false;//sysj\conveyor_controller.sysj line: 18, column: 9
            c_thread_15 = false;//sysj\conveyor_controller.sysj line: 18, column: 9
            System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 21, column: 5
            for(int i_thread_15 = 0; i_thread_15 < q_thread_15.length; i_thread_15 = i_thread_15 + 1) {//sysj\conveyor_controller.sysj line: 22, column: 34
              if(q_thread_15[i_thread_15]) {//sysj\conveyor_controller.sysj line: 23, column: 6
                o_thread_15 = true;//sysj\conveyor_controller.sysj line: 24, column: 7
              }
              System.out.print(" " + (q_thread_15[i_thread_15] ? 1 : 0));//sysj\conveyor_controller.sysj line: 25, column: 6
            }
            System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 27, column: 5
            if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 29, column: 13
              simF_11.setPresent();//sysj\conveyor_controller.sysj line: 30, column: 6
              currsigs.addElement(simF_11);
              simF_11.setValue(q_thread_15[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 30, column: 6
              simC_11.setPresent();//sysj\conveyor_controller.sysj line: 31, column: 6
              currsigs.addElement(simC_11);
              simC_11.setValue(q_thread_15[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 31, column: 6
              simFive_11.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
              currsigs.addElement(simFive_11);
              simFive_11.setValue(q_thread_15[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 32, column: 6
              S3198=0;
              if(o_thread_15){//sysj\conveyor_controller.sysj line: 34, column: 5
                S3206=0;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                S3206=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                currsigs.addElement(empty_1);
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            else {
              S3198=0;
              if(o_thread_15){//sysj\conveyor_controller.sysj line: 34, column: 5
                S3206=0;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                S3206=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                currsigs.addElement(empty_1);
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
          }
          else {
            q_thread_15[0] = false;//sysj\conveyor_controller.sysj line: 45, column: 6
            S3219=0;
            System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 19, column: 5
            o_thread_15 = false;//sysj\conveyor_controller.sysj line: 18, column: 9
            c_thread_15 = false;//sysj\conveyor_controller.sysj line: 18, column: 9
            System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 21, column: 5
            for(int i_thread_15 = 0; i_thread_15 < q_thread_15.length; i_thread_15 = i_thread_15 + 1) {//sysj\conveyor_controller.sysj line: 22, column: 34
              if(q_thread_15[i_thread_15]) {//sysj\conveyor_controller.sysj line: 23, column: 6
                o_thread_15 = true;//sysj\conveyor_controller.sysj line: 24, column: 7
              }
              System.out.print(" " + (q_thread_15[i_thread_15] ? 1 : 0));//sysj\conveyor_controller.sysj line: 25, column: 6
            }
            System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 27, column: 5
            if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 29, column: 13
              simF_11.setPresent();//sysj\conveyor_controller.sysj line: 30, column: 6
              currsigs.addElement(simF_11);
              simF_11.setValue(q_thread_15[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 30, column: 6
              simC_11.setPresent();//sysj\conveyor_controller.sysj line: 31, column: 6
              currsigs.addElement(simC_11);
              simC_11.setValue(q_thread_15[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 31, column: 6
              simFive_11.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
              currsigs.addElement(simFive_11);
              simFive_11.setValue(q_thread_15[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 32, column: 6
              S3198=0;
              if(o_thread_15){//sysj\conveyor_controller.sysj line: 34, column: 5
                S3206=0;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                S3206=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                currsigs.addElement(empty_1);
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            else {
              S3198=0;
              if(o_thread_15){//sysj\conveyor_controller.sysj line: 34, column: 5
                S3206=0;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                S3206=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                currsigs.addElement(empty_1);
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
          }
        }
        else {
          switch(S3219){
            case 0 : 
              if(insert_1.getprestatus()){//sysj\conveyor_controller.sysj line: 46, column: 12
                if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 47, column: 13
                  for(int i_thread_15 = q_thread_15.length - 1; i_thread_15 > 0; i_thread_15 = i_thread_15 - 1) {//sysj\conveyor_controller.sysj line: 48, column: 37
                    q_thread_15[i_thread_15] = q_thread_15[i_thread_15 - 1];//sysj\conveyor_controller.sysj line: 49, column: 7
                  }
                  q_thread_15[0] = true;//sysj\conveyor_controller.sysj line: 52, column: 5
                  S3219=0;
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 19, column: 5
                  o_thread_15 = false;//sysj\conveyor_controller.sysj line: 18, column: 9
                  c_thread_15 = false;//sysj\conveyor_controller.sysj line: 18, column: 9
                  System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 21, column: 5
                  for(int i_thread_15 = 0; i_thread_15 < q_thread_15.length; i_thread_15 = i_thread_15 + 1) {//sysj\conveyor_controller.sysj line: 22, column: 34
                    if(q_thread_15[i_thread_15]) {//sysj\conveyor_controller.sysj line: 23, column: 6
                      o_thread_15 = true;//sysj\conveyor_controller.sysj line: 24, column: 7
                    }
                    System.out.print(" " + (q_thread_15[i_thread_15] ? 1 : 0));//sysj\conveyor_controller.sysj line: 25, column: 6
                  }
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 27, column: 5
                  if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 29, column: 13
                    simF_11.setPresent();//sysj\conveyor_controller.sysj line: 30, column: 6
                    currsigs.addElement(simF_11);
                    simF_11.setValue(q_thread_15[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 30, column: 6
                    simC_11.setPresent();//sysj\conveyor_controller.sysj line: 31, column: 6
                    currsigs.addElement(simC_11);
                    simC_11.setValue(q_thread_15[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 31, column: 6
                    simFive_11.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                    currsigs.addElement(simFive_11);
                    simFive_11.setValue(q_thread_15[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 32, column: 6
                    S3198=0;
                    if(o_thread_15){//sysj\conveyor_controller.sysj line: 34, column: 5
                      S3206=0;
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                    else {
                      S3206=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                      currsigs.addElement(empty_1);
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                  }
                  else {
                    S3198=0;
                    if(o_thread_15){//sysj\conveyor_controller.sysj line: 34, column: 5
                      S3206=0;
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                    else {
                      S3206=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                      currsigs.addElement(empty_1);
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                  }
                }
                else {
                  q_thread_15[0] = true;//sysj\conveyor_controller.sysj line: 52, column: 5
                  S3219=0;
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 19, column: 5
                  o_thread_15 = false;//sysj\conveyor_controller.sysj line: 18, column: 9
                  c_thread_15 = false;//sysj\conveyor_controller.sysj line: 18, column: 9
                  System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 21, column: 5
                  for(int i_thread_15 = 0; i_thread_15 < q_thread_15.length; i_thread_15 = i_thread_15 + 1) {//sysj\conveyor_controller.sysj line: 22, column: 34
                    if(q_thread_15[i_thread_15]) {//sysj\conveyor_controller.sysj line: 23, column: 6
                      o_thread_15 = true;//sysj\conveyor_controller.sysj line: 24, column: 7
                    }
                    System.out.print(" " + (q_thread_15[i_thread_15] ? 1 : 0));//sysj\conveyor_controller.sysj line: 25, column: 6
                  }
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 27, column: 5
                  if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 29, column: 13
                    simF_11.setPresent();//sysj\conveyor_controller.sysj line: 30, column: 6
                    currsigs.addElement(simF_11);
                    simF_11.setValue(q_thread_15[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 30, column: 6
                    simC_11.setPresent();//sysj\conveyor_controller.sysj line: 31, column: 6
                    currsigs.addElement(simC_11);
                    simC_11.setValue(q_thread_15[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 31, column: 6
                    simFive_11.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                    currsigs.addElement(simFive_11);
                    simFive_11.setValue(q_thread_15[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 32, column: 6
                    S3198=0;
                    if(o_thread_15){//sysj\conveyor_controller.sysj line: 34, column: 5
                      S3206=0;
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                    else {
                      S3206=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                      currsigs.addElement(empty_1);
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                  }
                  else {
                    S3198=0;
                    if(o_thread_15){//sysj\conveyor_controller.sysj line: 34, column: 5
                      S3206=0;
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                    else {
                      S3206=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                      currsigs.addElement(empty_1);
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                  }
                }
              }
              else {
                switch(S3198){
                  case 0 : 
                    switch(S3206){
                      case 0 : 
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                        break;
                      
                      case 1 : 
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                        currsigs.addElement(empty_1);
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    S3219=0;
                    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 19, column: 5
                    o_thread_15 = false;//sysj\conveyor_controller.sysj line: 18, column: 9
                    c_thread_15 = false;//sysj\conveyor_controller.sysj line: 18, column: 9
                    System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 21, column: 5
                    for(int i_thread_15 = 0; i_thread_15 < q_thread_15.length; i_thread_15 = i_thread_15 + 1) {//sysj\conveyor_controller.sysj line: 22, column: 34
                      if(q_thread_15[i_thread_15]) {//sysj\conveyor_controller.sysj line: 23, column: 6
                        o_thread_15 = true;//sysj\conveyor_controller.sysj line: 24, column: 7
                      }
                      System.out.print(" " + (q_thread_15[i_thread_15] ? 1 : 0));//sysj\conveyor_controller.sysj line: 25, column: 6
                    }
                    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 27, column: 5
                    if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 29, column: 13
                      simF_11.setPresent();//sysj\conveyor_controller.sysj line: 30, column: 6
                      currsigs.addElement(simF_11);
                      simF_11.setValue(q_thread_15[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 30, column: 6
                      simC_11.setPresent();//sysj\conveyor_controller.sysj line: 31, column: 6
                      currsigs.addElement(simC_11);
                      simC_11.setValue(q_thread_15[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 31, column: 6
                      simFive_11.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                      currsigs.addElement(simFive_11);
                      simFive_11.setValue(q_thread_15[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 32, column: 6
                      S3198=0;
                      if(o_thread_15){//sysj\conveyor_controller.sysj line: 34, column: 5
                        S3206=0;
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      else {
                        S3206=1;
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                        currsigs.addElement(empty_1);
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                    }
                    else {
                      S3198=0;
                      if(o_thread_15){//sysj\conveyor_controller.sysj line: 34, column: 5
                        S3206=0;
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      else {
                        S3206=1;
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                        currsigs.addElement(empty_1);
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                    }
                    break;
                  
                }
              }
              break;
            
            case 1 : 
              S3219=0;
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 19, column: 5
              o_thread_15 = false;//sysj\conveyor_controller.sysj line: 18, column: 9
              c_thread_15 = false;//sysj\conveyor_controller.sysj line: 18, column: 9
              System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 21, column: 5
              for(int i_thread_15 = 0; i_thread_15 < q_thread_15.length; i_thread_15 = i_thread_15 + 1) {//sysj\conveyor_controller.sysj line: 22, column: 34
                if(q_thread_15[i_thread_15]) {//sysj\conveyor_controller.sysj line: 23, column: 6
                  o_thread_15 = true;//sysj\conveyor_controller.sysj line: 24, column: 7
                }
                System.out.print(" " + (q_thread_15[i_thread_15] ? 1 : 0));//sysj\conveyor_controller.sysj line: 25, column: 6
              }
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 27, column: 5
              if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 29, column: 13
                simF_11.setPresent();//sysj\conveyor_controller.sysj line: 30, column: 6
                currsigs.addElement(simF_11);
                simF_11.setValue(q_thread_15[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 30, column: 6
                simC_11.setPresent();//sysj\conveyor_controller.sysj line: 31, column: 6
                currsigs.addElement(simC_11);
                simC_11.setValue(q_thread_15[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 31, column: 6
                simFive_11.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                currsigs.addElement(simFive_11);
                simFive_11.setValue(q_thread_15[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 32, column: 6
                S3198=0;
                if(o_thread_15){//sysj\conveyor_controller.sysj line: 34, column: 5
                  S3206=0;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  S3206=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                  currsigs.addElement(empty_1);
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
              }
              else {
                S3198=0;
                if(o_thread_15){//sysj\conveyor_controller.sysj line: 34, column: 5
                  S3206=0;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  S3206=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                  currsigs.addElement(empty_1);
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
              }
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread30968(int [] tdone, int [] ends){
        switch(S3197){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S3011){
          case 0 : 
            if(simFive_11.getprestatus()){//sysj\conveyor_controller.sysj line: 11, column: 14
              S3011=1;
              S2973=0;
              if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 11, column: 30
                checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 11, column: 30
                S2973=1;
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
              else {
                S2968=0;
                if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 11, column: 30
                  checkFive_o.setVal((simFive_11.getpreval() == null ? null : ((Boolean)simFive_11.getpreval())));//sysj\conveyor_controller.sysj line: 11, column: 30
                  S2968=1;
                  if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 11, column: 30
                    checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 11, column: 30
                    ends[14]=2;
                    ;//sysj\conveyor_controller.sysj line: 11, column: 30
                    S3011=0;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                }
                else {
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
              }
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 1 : 
            switch(S2973){
              case 0 : 
                if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 11, column: 30
                  checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 11, column: 30
                  S2973=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  switch(S2968){
                    case 0 : 
                      if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 11, column: 30
                        checkFive_o.setVal((simFive_11.getpreval() == null ? null : ((Boolean)simFive_11.getpreval())));//sysj\conveyor_controller.sysj line: 11, column: 30
                        S2968=1;
                        if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 11, column: 30
                          checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 11, column: 30
                          ends[14]=2;
                          ;//sysj\conveyor_controller.sysj line: 11, column: 30
                          S3011=0;
                          active[14]=1;
                          ends[14]=1;
                          tdone[14]=1;
                        }
                        else {
                          active[14]=1;
                          ends[14]=1;
                          tdone[14]=1;
                        }
                      }
                      else {
                        active[14]=1;
                        ends[14]=1;
                        tdone[14]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 11, column: 30
                        checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 11, column: 30
                        ends[14]=2;
                        ;//sysj\conveyor_controller.sysj line: 11, column: 30
                        S3011=0;
                        active[14]=1;
                        ends[14]=1;
                        tdone[14]=1;
                      }
                      else {
                        active[14]=1;
                        ends[14]=1;
                        tdone[14]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S2973=1;
                S2973=0;
                if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 11, column: 30
                  checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 11, column: 30
                  S2973=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  S2968=0;
                  if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 11, column: 30
                    checkFive_o.setVal((simFive_11.getpreval() == null ? null : ((Boolean)simFive_11.getpreval())));//sysj\conveyor_controller.sysj line: 11, column: 30
                    S2968=1;
                    if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 11, column: 30
                      checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 11, column: 30
                      ends[14]=2;
                      ;//sysj\conveyor_controller.sysj line: 11, column: 30
                      S3011=0;
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                    else {
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                  }
                  else {
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread30967(int [] tdone, int [] ends){
        switch(S2965){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S2779){
          case 0 : 
            if(simC_11.getprestatus()){//sysj\conveyor_controller.sysj line: 9, column: 14
              S2779=1;
              S2741=0;
              if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 9, column: 27
                simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 9, column: 27
                S2741=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              else {
                S2736=0;
                if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 9, column: 27
                  simCapper_o.setVal((simC_11.getpreval() == null ? null : ((Boolean)simC_11.getpreval())));//sysj\conveyor_controller.sysj line: 9, column: 27
                  S2736=1;
                  if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 9, column: 27
                    simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 9, column: 27
                    ends[13]=2;
                    ;//sysj\conveyor_controller.sysj line: 9, column: 27
                    S2779=0;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                else {
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            switch(S2741){
              case 0 : 
                if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 9, column: 27
                  simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 9, column: 27
                  S2741=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  switch(S2736){
                    case 0 : 
                      if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 9, column: 27
                        simCapper_o.setVal((simC_11.getpreval() == null ? null : ((Boolean)simC_11.getpreval())));//sysj\conveyor_controller.sysj line: 9, column: 27
                        S2736=1;
                        if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 9, column: 27
                          simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 9, column: 27
                          ends[13]=2;
                          ;//sysj\conveyor_controller.sysj line: 9, column: 27
                          S2779=0;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 9, column: 27
                        simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 9, column: 27
                        ends[13]=2;
                        ;//sysj\conveyor_controller.sysj line: 9, column: 27
                        S2779=0;
                        active[13]=1;
                        ends[13]=1;
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
                break;
              
              case 1 : 
                S2741=1;
                S2741=0;
                if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 9, column: 27
                  simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 9, column: 27
                  S2741=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  S2736=0;
                  if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 9, column: 27
                    simCapper_o.setVal((simC_11.getpreval() == null ? null : ((Boolean)simC_11.getpreval())));//sysj\conveyor_controller.sysj line: 9, column: 27
                    S2736=1;
                    if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 9, column: 27
                      simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 9, column: 27
                      ends[13]=2;
                      ;//sysj\conveyor_controller.sysj line: 9, column: 27
                      S2779=0;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread30966(int [] tdone, int [] ends){
        switch(S2733){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S2547){
          case 0 : 
            if(simF_11.getprestatus()){//sysj\conveyor_controller.sysj line: 7, column: 14
              S2547=1;
              S2509=0;
              if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 7, column: 27
                simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                S2509=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S2504=0;
                if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                  simFiller_o.setVal((simF_11.getpreval() == null ? null : ((Boolean)simF_11.getpreval())));//sysj\conveyor_controller.sysj line: 7, column: 27
                  S2504=1;
                  if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                    simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                    ends[12]=2;
                    ;//sysj\conveyor_controller.sysj line: 7, column: 27
                    S2547=0;
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                  else {
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                }
                else {
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
              }
            }
            else {
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            switch(S2509){
              case 0 : 
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 7, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                  S2509=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  switch(S2504){
                    case 0 : 
                      if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                        simFiller_o.setVal((simF_11.getpreval() == null ? null : ((Boolean)simF_11.getpreval())));//sysj\conveyor_controller.sysj line: 7, column: 27
                        S2504=1;
                        if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                          simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                          ends[12]=2;
                          ;//sysj\conveyor_controller.sysj line: 7, column: 27
                          S2547=0;
                          active[12]=1;
                          ends[12]=1;
                          tdone[12]=1;
                        }
                        else {
                          active[12]=1;
                          ends[12]=1;
                          tdone[12]=1;
                        }
                      }
                      else {
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                        simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                        ends[12]=2;
                        ;//sysj\conveyor_controller.sysj line: 7, column: 27
                        S2547=0;
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      else {
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S2509=1;
                S2509=0;
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 7, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                  S2509=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  S2504=0;
                  if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                    simFiller_o.setVal((simF_11.getpreval() == null ? null : ((Boolean)simF_11.getpreval())));//sysj\conveyor_controller.sysj line: 7, column: 27
                    S2504=1;
                    if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                      simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                      ends[12]=2;
                      ;//sysj\conveyor_controller.sysj line: 7, column: 27
                      S2547=0;
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    else {
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                  }
                  else {
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread30965(int [] tdone, int [] ends){
        switch(S3665){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        simF_11.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
        simC_11.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
        simFive_11.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
        thread30966(tdone,ends);
        thread30967(tdone,ends);
        thread30968(tdone,ends);
        thread30969(tdone,ends);
        int biggest30970 = 0;
        if(ends[12]>=biggest30970){
          biggest30970=ends[12];
        }
        if(ends[13]>=biggest30970){
          biggest30970=ends[13];
        }
        if(ends[14]>=biggest30970){
          biggest30970=ends[14];
        }
        if(ends[15]>=biggest30970){
          biggest30970=ends[15];
        }
        if(biggest30970 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest30970 == 0){
          S3665=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread30964(int [] tdone, int [] ends){
        switch(S2497){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S2449){
          case 0 : 
            switch(S2433){
              case 0 : 
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 145, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 145, column: 4
                  S2433=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S2428){
                    case 0 : 
                      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 145, column: 4
                        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 145, column: 4
                        S2428=1;
                        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 145, column: 4
                          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 145, column: 4
                          ends[10]=2;
                          ;//sysj\conveyor_controller.sysj line: 145, column: 4
                          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 146, column: 4
                          currsigs.addElement(rotaryRotated_1);
                          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 147, column: 4
                          S2449=1;
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
                      if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 145, column: 4
                        rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 145, column: 4
                        ends[10]=2;
                        ;//sysj\conveyor_controller.sysj line: 145, column: 4
                        rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 146, column: 4
                        currsigs.addElement(rotaryRotated_1);
                        System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 147, column: 4
                        S2449=1;
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
                S2433=1;
                S2433=0;
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 145, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 145, column: 4
                  S2433=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S2428=0;
                  if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 145, column: 4
                    rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 145, column: 4
                    S2428=1;
                    if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 145, column: 4
                      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 145, column: 4
                      ends[10]=2;
                      ;//sysj\conveyor_controller.sysj line: 145, column: 4
                      rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 146, column: 4
                      currsigs.addElement(rotaryRotated_1);
                      System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 147, column: 4
                      S2449=1;
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
            S2449=1;
            S2449=0;
            S2433=0;
            if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 145, column: 4
              rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 145, column: 4
              S2433=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S2428=0;
              if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 145, column: 4
                rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 145, column: 4
                S2428=1;
                if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 145, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 145, column: 4
                  ends[10]=2;
                  ;//sysj\conveyor_controller.sysj line: 145, column: 4
                  rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 146, column: 4
                  currsigs.addElement(rotaryRotated_1);
                  System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 147, column: 4
                  S2449=1;
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

  public void thread30962(int [] tdone, int [] ends){
        switch(S2325){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 131, column: 27
          System.out.println("*Conveyor - Bottle Reached Pos1*");//sysj\conveyor_controller.sysj line: 132, column: 21
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
  }

  public void thread30961(int [] tdone, int [] ends){
        switch(S2321){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 126, column: 21
        currsigs.addElement(motConveyorOnOff);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread30959(int [] tdone, int [] ends){
        S2325=1;
    System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 130, column: 21
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread30958(int [] tdone, int [] ends){
        S2321=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor_controller.sysj line: 125, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 126, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread30957(int [] tdone, int [] ends){
        switch(S2426){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S2340){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 121, column: 19
              S2340=1;
              thread30958(tdone,ends);
              thread30959(tdone,ends);
              int biggest30960 = 0;
              if(ends[8]>=biggest30960){
                biggest30960=ends[8];
              }
              if(ends[9]>=biggest30960){
                biggest30960=ends[9];
              }
              if(biggest30960 == 1){
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
            thread30961(tdone,ends);
            thread30962(tdone,ends);
            int biggest30963 = 0;
            if(ends[8]>=biggest30963){
              biggest30963=ends[8];
            }
            if(ends[9]>=biggest30963){
              biggest30963=ends[9];
            }
            if(biggest30963 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest30963 == 2){
              ends[7]=2;
              ;//sysj\conveyor_controller.sysj line: 123, column: 13
              S2340=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest30963 == 0){
              S2340=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread30955(int [] tdone, int [] ends){
        S1511=1;
    S1466=0;
    if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 99, column: 34
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

  public void thread30954(int [] tdone, int [] ends){
        S1464=1;
    S1463=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread30952(int [] tdone, int [] ends){
        switch(S1663){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 112, column: 53
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

  public void thread30951(int [] tdone, int [] ends){
        switch(S1660){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1643){
          case 0 : 
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 112, column: 14
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 112, column: 14
              S1643=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S1638){
                case 0 : 
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 112, column: 14
                    convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 112, column: 14
                    S1638=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 112, column: 14
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 112, column: 14
                      ends[5]=2;
                      ;//sysj\conveyor_controller.sysj line: 112, column: 14
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
                  if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 112, column: 14
                    convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 112, column: 14
                    ends[5]=2;
                    ;//sysj\conveyor_controller.sysj line: 112, column: 14
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
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 112, column: 14
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 112, column: 14
              S1643=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S1638=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 112, column: 14
                convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 112, column: 14
                S1638=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 112, column: 14
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 112, column: 14
                  ends[5]=2;
                  ;//sysj\conveyor_controller.sysj line: 112, column: 14
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

  public void thread30949(int [] tdone, int [] ends){
        S1663=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread30948(int [] tdone, int [] ends){
        S1660=1;
    S1643=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 112, column: 14
      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 112, column: 14
      S1643=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S1638=0;
      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 112, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 112, column: 14
        S1638=1;
        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 112, column: 14
          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 112, column: 14
          ends[5]=2;
          ;//sysj\conveyor_controller.sysj line: 112, column: 14
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

  public void thread30946(int [] tdone, int [] ends){
        S1663=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread30945(int [] tdone, int [] ends){
        S1660=1;
    S1643=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 112, column: 14
      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 112, column: 14
      S1643=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S1638=0;
      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 112, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 112, column: 14
        S1638=1;
        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 112, column: 14
          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 112, column: 14
          ends[5]=2;
          ;//sysj\conveyor_controller.sysj line: 112, column: 14
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

  public void thread30943(int [] tdone, int [] ends){
        S1663=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread30942(int [] tdone, int [] ends){
        S1660=1;
    S1643=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 112, column: 14
      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 112, column: 14
      S1643=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S1638=0;
      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 112, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 112, column: 14
        S1638=1;
        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 112, column: 14
          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 112, column: 14
          ends[5]=2;
          ;//sysj\conveyor_controller.sysj line: 112, column: 14
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

  public void thread30940(int [] tdone, int [] ends){
        switch(S1511){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1466){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 99, column: 34
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
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 101, column: 18
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 101, column: 18
              S1473=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S1468=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 101, column: 18
                convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 101, column: 18
                S1468=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 101, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 101, column: 18
                  ends[4]=2;
                  ;//sysj\conveyor_controller.sysj line: 101, column: 18
                  System.out.println("*empty...*");//sysj\conveyor_controller.sysj line: 102, column: 18
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
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 101, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 101, column: 18
                  S1473=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S1468){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 101, column: 18
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 101, column: 18
                        S1468=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 101, column: 18
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 101, column: 18
                          ends[4]=2;
                          ;//sysj\conveyor_controller.sysj line: 101, column: 18
                          System.out.println("*empty...*");//sysj\conveyor_controller.sysj line: 102, column: 18
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
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 101, column: 18
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 101, column: 18
                        ends[4]=2;
                        ;//sysj\conveyor_controller.sysj line: 101, column: 18
                        System.out.println("*empty...*");//sysj\conveyor_controller.sysj line: 102, column: 18
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
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 101, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 101, column: 18
                  S1473=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S1468=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 101, column: 18
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 101, column: 18
                    S1468=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 101, column: 18
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 101, column: 18
                      ends[4]=2;
                      ;//sysj\conveyor_controller.sysj line: 101, column: 18
                      System.out.println("*empty...*");//sysj\conveyor_controller.sysj line: 102, column: 18
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

  public void thread30939(int [] tdone, int [] ends){
        switch(S1464){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1463){
          case 0 : 
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 93, column: 27
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
            convReady_o.setPreempted();//sysj\conveyor_controller.sysj line: 95, column: 21
            ends[3]=2;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread30938(int [] tdone, int [] ends){
        switch(S2312){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1564){
          case 0 : 
            thread30939(tdone,ends);
            thread30940(tdone,ends);
            int biggest30941 = 0;
            if(ends[3]>=biggest30941){
              biggest30941=ends[3];
            }
            if(ends[4]>=biggest30941){
              biggest30941=ends[4];
            }
            if(biggest30941 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest30941 == 2){
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 91, column: 13
              S1564=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest30941 == 0){
              S1564=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S1564=1;
            insert_1.setPresent();//sysj\conveyor_controller.sysj line: 106, column: 13
            currsigs.addElement(insert_1);
            S1564=2;
            S1571=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 107, column: 13
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 107, column: 13
              S1571=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S1566=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 107, column: 13
                convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 107, column: 13
                S1566=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 107, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 107, column: 13
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 107, column: 13
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
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 107, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 107, column: 13
                  S1571=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S1566){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 107, column: 13
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 107, column: 13
                        S1566=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 107, column: 13
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 107, column: 13
                          ends[2]=2;
                          ;//sysj\conveyor_controller.sysj line: 107, column: 13
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
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 107, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 107, column: 13
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 107, column: 13
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
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 107, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 107, column: 13
                  S1571=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S1566=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 107, column: 13
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 107, column: 13
                    S1566=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 107, column: 13
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 107, column: 13
                      ends[2]=2;
                      ;//sysj\conveyor_controller.sysj line: 107, column: 13
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
            __start_thread_2 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 87, column: 5
            S1610=0;
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 87, column: 5
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 87, column: 5
              S1564=5;
              thread30942(tdone,ends);
              thread30943(tdone,ends);
              int biggest30944 = 0;
              if(ends[5]>=biggest30944){
                biggest30944=ends[5];
              }
              if(ends[6]>=biggest30944){
                biggest30944=ends[6];
              }
              if(biggest30944 == 1){
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
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 87, column: 5
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 87, column: 5
                  S1564=5;
                  thread30945(tdone,ends);
                  thread30946(tdone,ends);
                  int biggest30947 = 0;
                  if(ends[5]>=biggest30947){
                    biggest30947=ends[5];
                  }
                  if(ends[6]>=biggest30947){
                    biggest30947=ends[6];
                  }
                  if(biggest30947 == 1){
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
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 87, column: 5
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 87, column: 5
                  S1564=5;
                  thread30948(tdone,ends);
                  thread30949(tdone,ends);
                  int biggest30950 = 0;
                  if(ends[5]>=biggest30950){
                    biggest30950=ends[5];
                  }
                  if(ends[6]>=biggest30950){
                    biggest30950=ends[6];
                  }
                  if(biggest30950 == 1){
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
            thread30951(tdone,ends);
            thread30952(tdone,ends);
            int biggest30953 = 0;
            if(ends[5]>=biggest30953){
              biggest30953=ends[5];
            }
            if(ends[6]>=biggest30953){
              biggest30953=ends[6];
            }
            if(biggest30953 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest30953 == 0){
              S1564=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            S1564=6;
            System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 89, column: 10
            S1564=0;
            thread30954(tdone,ends);
            thread30955(tdone,ends);
            int biggest30956 = 0;
            if(ends[3]>=biggest30956){
              biggest30956=ends[3];
            }
            if(ends[4]>=biggest30956){
              biggest30956=ends[4];
            }
            if(biggest30956 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread30935(int [] tdone, int [] ends){
        S3663=1;
    q_thread_15 = new boolean[5];//sysj\conveyor_controller.sysj line: 16, column: 3
    S3219=0;
    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 19, column: 5
    o_thread_15 = false;//sysj\conveyor_controller.sysj line: 18, column: 9
    c_thread_15 = false;//sysj\conveyor_controller.sysj line: 18, column: 9
    System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 21, column: 5
    for(int i_thread_15 = 0; i_thread_15 < q_thread_15.length; i_thread_15 = i_thread_15 + 1) {//sysj\conveyor_controller.sysj line: 22, column: 34
      if(q_thread_15[i_thread_15]) {//sysj\conveyor_controller.sysj line: 23, column: 6
        o_thread_15 = true;//sysj\conveyor_controller.sysj line: 24, column: 7
      }
      System.out.print(" " + (q_thread_15[i_thread_15] ? 1 : 0));//sysj\conveyor_controller.sysj line: 25, column: 6
    }
    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 27, column: 5
    if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 29, column: 13
      simF_11.setPresent();//sysj\conveyor_controller.sysj line: 30, column: 6
      currsigs.addElement(simF_11);
      simF_11.setValue(q_thread_15[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 30, column: 6
      simC_11.setPresent();//sysj\conveyor_controller.sysj line: 31, column: 6
      currsigs.addElement(simC_11);
      simC_11.setValue(q_thread_15[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 31, column: 6
      simFive_11.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
      currsigs.addElement(simFive_11);
      simFive_11.setValue(q_thread_15[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 32, column: 6
      S3198=0;
      if(o_thread_15){//sysj\conveyor_controller.sysj line: 34, column: 5
        S3206=0;
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
      else {
        S3206=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
        currsigs.addElement(empty_1);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
    else {
      S3198=0;
      if(o_thread_15){//sysj\conveyor_controller.sysj line: 34, column: 5
        S3206=0;
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
      else {
        S3206=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
        currsigs.addElement(empty_1);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread30934(int [] tdone, int [] ends){
        S3197=1;
    S3011=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread30933(int [] tdone, int [] ends){
        S2965=1;
    S2779=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread30932(int [] tdone, int [] ends){
        S2733=1;
    S2547=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread30931(int [] tdone, int [] ends){
        S3665=1;
    simF_11.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
    simC_11.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
    simFive_11.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
    thread30932(tdone,ends);
    thread30933(tdone,ends);
    thread30934(tdone,ends);
    thread30935(tdone,ends);
    int biggest30936 = 0;
    if(ends[12]>=biggest30936){
      biggest30936=ends[12];
    }
    if(ends[13]>=biggest30936){
      biggest30936=ends[13];
    }
    if(ends[14]>=biggest30936){
      biggest30936=ends[14];
    }
    if(ends[15]>=biggest30936){
      biggest30936=ends[15];
    }
    if(biggest30936 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread30930(int [] tdone, int [] ends){
        S2497=1;
    S2449=0;
    S2433=0;
    if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 145, column: 4
      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 145, column: 4
      S2433=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S2428=0;
      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 145, column: 4
        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 145, column: 4
        S2428=1;
        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 145, column: 4
          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 145, column: 4
          ends[10]=2;
          ;//sysj\conveyor_controller.sysj line: 145, column: 4
          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 146, column: 4
          currsigs.addElement(rotaryRotated_1);
          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 147, column: 4
          S2449=1;
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

  public void thread30929(int [] tdone, int [] ends){
        S2426=1;
    S2340=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread30927(int [] tdone, int [] ends){
        S1511=1;
    S1466=0;
    if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 99, column: 34
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

  public void thread30926(int [] tdone, int [] ends){
        S1464=1;
    S1463=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread30925(int [] tdone, int [] ends){
        S2312=1;
    System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 89, column: 10
    S1564=0;
    thread30926(tdone,ends);
    thread30927(tdone,ends);
    int biggest30928 = 0;
    if(ends[3]>=biggest30928){
      biggest30928=ends[3];
    }
    if(ends[4]>=biggest30928){
      biggest30928=ends[4];
    }
    if(biggest30928 == 1){
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
      switch(S3733){
        case 0 : 
          S3733=0;
          break RUN;
        
        case 1 : 
          S3733=2;
          S3733=2;
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 86, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 86, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 86, column: 2
          S3732=0;
          thread30925(tdone,ends);
          thread30929(tdone,ends);
          thread30930(tdone,ends);
          thread30931(tdone,ends);
          int biggest30937 = 0;
          if(ends[2]>=biggest30937){
            biggest30937=ends[2];
          }
          if(ends[7]>=biggest30937){
            biggest30937=ends[7];
          }
          if(ends[10]>=biggest30937){
            biggest30937=ends[10];
          }
          if(ends[11]>=biggest30937){
            biggest30937=ends[11];
          }
          if(biggest30937 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          if(biggest30937 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 86, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 86, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 86, column: 2
          switch(S3732){
            case 0 : 
              thread30938(tdone,ends);
              thread30957(tdone,ends);
              thread30964(tdone,ends);
              thread30965(tdone,ends);
              int biggest30971 = 0;
              if(ends[2]>=biggest30971){
                biggest30971=ends[2];
              }
              if(ends[7]>=biggest30971){
                biggest30971=ends[7];
              }
              if(ends[10]>=biggest30971){
                biggest30971=ends[10];
              }
              if(ends[11]>=biggest30971){
                biggest30971=ends[11];
              }
              if(biggest30971 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest30971 == 0){
                S3732=1;
                S3676=0;
                if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 155, column: 19
                  thread30972(tdone,ends);
                  thread30973(tdone,ends);
                  int biggest30974 = 0;
                  if(ends[16]>=biggest30974){
                    biggest30974=ends[16];
                  }
                  if(ends[17]>=biggest30974){
                    biggest30974=ends[17];
                  }
                  if(biggest30974 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S3676=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 1 : 
              switch(S3676){
                case 0 : 
                  thread30975(tdone,ends);
                  thread30976(tdone,ends);
                  int biggest30977 = 0;
                  if(ends[16]>=biggest30977){
                    biggest30977=ends[16];
                  }
                  if(ends[17]>=biggest30977){
                    biggest30977=ends[17];
                  }
                  if(biggest30977 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  if(biggest30977 == 2){
                    ends[1]=2;
                    ;//sysj\conveyor_controller.sysj line: 156, column: 11
                    S3676=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest30977 == 0){
                    S3676=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S3676=1;
                  S3676=0;
                  if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 155, column: 19
                    thread30978(tdone,ends);
                    thread30979(tdone,ends);
                    int biggest30980 = 0;
                    if(ends[16]>=biggest30980){
                      biggest30980=ends[16];
                    }
                    if(ends[17]>=biggest30980){
                      biggest30980=ends[17];
                    }
                    if(biggest30980 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S3676=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
              }
              break;
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    rotaryRotated_1 = new Signal();
    empty_1 = new Signal();
    insert_1 = new Signal();
    simF_11 = new Signal();
    simC_11 = new Signal();
    simFive_11 = new Signal();
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
      rotaryRotated_1.setpreclear();
      empty_1.setpreclear();
      insert_1.setpreclear();
      simF_11.setpreclear();
      simC_11.setpreclear();
      simFive_11.setpreclear();
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
      rotaryRotated_1.setClear();
      empty_1.setClear();
      insert_1.setClear();
      simF_11.setClear();
      simC_11.setClear();
      simFive_11.setClear();
      rotated_in.sethook();
      convReady_o.sethook();
      simFiller_o.sethook();
      simCapper_o.sethook();
      checkFive_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        rotated_in.gethook();
        convReady_o.gethook();
        simFiller_o.gethook();
        simCapper_o.gethook();
        checkFive_o.gethook();
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
