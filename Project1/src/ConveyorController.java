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
  private Signal rotaryRotated_1;
  private Signal empty_1;
  private Signal insert_1;
  private Signal simF_9;
  private Signal simC_9;
  private boolean[] q_thread_12;//sysj\conveyor_controller.sysj line: 13, column: 3
  private boolean o_thread_12;//sysj\conveyor_controller.sysj line: 15, column: 9
  private boolean c_thread_12;//sysj\conveyor_controller.sysj line: 15, column: 9
  private int S3362 = 1;
  private int S3361 = 1;
  private int S2174 = 1;
  private int S1464 = 1;
  private int S1467 = 1;
  private int S1466 = 1;
  private int S1514 = 1;
  private int S1469 = 1;
  private int S1476 = 1;
  private int S1471 = 1;
  private int S1573 = 1;
  private int S1568 = 1;
  private int S1617 = 1;
  private int S1612 = 1;
  private int S2288 = 1;
  private int S2202 = 1;
  private int S2183 = 1;
  private int S2187 = 1;
  private int S2359 = 1;
  private int S2311 = 1;
  private int S2295 = 1;
  private int S2290 = 1;
  private int S3294 = 1;
  private int S2594 = 1;
  private int S2408 = 1;
  private int S2370 = 1;
  private int S2365 = 1;
  private int S2826 = 1;
  private int S2640 = 1;
  private int S2602 = 1;
  private int S2597 = 1;
  private int S3292 = 1;
  private int S2848 = 1;
  private int S2827 = 1;
  private int S2835 = 1;
  private int S3305 = 1;
  private int S3299 = 1;
  private int S3302 = 1;
  
  private int[] ends = new int[55];
  private int[] tdone = new int[55];
  
  public void thread24430(int [] tdone, int [] ends){
        S3302=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread24429(int [] tdone, int [] ends){
        S3299=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 151, column: 22
    currsigs.addElement(bottleDeployedE);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread24427(int [] tdone, int [] ends){
        switch(S3302){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 155, column: 28
          ends[14]=2;
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

  public void thread24426(int [] tdone, int [] ends){
        switch(S3299){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 151, column: 22
        currsigs.addElement(bottleDeployedE);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread24424(int [] tdone, int [] ends){
        S3302=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread24423(int [] tdone, int [] ends){
        S3299=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 151, column: 22
    currsigs.addElement(bottleDeployedE);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread24420(int [] tdone, int [] ends){
        switch(S3292){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 34, column: 11
          for(int i_thread_12 = q_thread_12.length - 1; i_thread_12 > 0; i_thread_12 = i_thread_12 - 1) {//sysj\conveyor_controller.sysj line: 35, column: 36
            q_thread_12[i_thread_12] = q_thread_12[i_thread_12 - 1];//sysj\conveyor_controller.sysj line: 36, column: 6
          }
          if(insert_1.getprestatus()){//sysj\conveyor_controller.sysj line: 38, column: 13
            q_thread_12[0] = true;//sysj\conveyor_controller.sysj line: 39, column: 6
            S2848=0;
            o_thread_12 = false;//sysj\conveyor_controller.sysj line: 15, column: 9
            c_thread_12 = false;//sysj\conveyor_controller.sysj line: 15, column: 9
            System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 17, column: 5
            for(int i_thread_12 = 0; i_thread_12 < q_thread_12.length; i_thread_12 = i_thread_12 + 1) {//sysj\conveyor_controller.sysj line: 18, column: 34
              if(q_thread_12[i_thread_12]) {//sysj\conveyor_controller.sysj line: 19, column: 6
                o_thread_12 = true;//sysj\conveyor_controller.sysj line: 20, column: 7
              }
              System.out.print(" " + (q_thread_12[i_thread_12] ? 1 : 0));//sysj\conveyor_controller.sysj line: 21, column: 6
            }
            System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
            if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 25, column: 13
              simF_9.setPresent();//sysj\conveyor_controller.sysj line: 26, column: 6
              currsigs.addElement(simF_9);
              simF_9.setValue(q_thread_12[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 26, column: 6
              simC_9.setPresent();//sysj\conveyor_controller.sysj line: 27, column: 6
              currsigs.addElement(simC_9);
              simC_9.setValue(q_thread_12[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 27, column: 6
              S2827=0;
              if(o_thread_12){//sysj\conveyor_controller.sysj line: 30, column: 5
                S2835=0;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S2835=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
                currsigs.addElement(empty_1);
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              S2827=0;
              if(o_thread_12){//sysj\conveyor_controller.sysj line: 30, column: 5
                S2835=0;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S2835=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
                currsigs.addElement(empty_1);
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
          }
          else {
            q_thread_12[0] = false;//sysj\conveyor_controller.sysj line: 41, column: 6
            S2848=0;
            o_thread_12 = false;//sysj\conveyor_controller.sysj line: 15, column: 9
            c_thread_12 = false;//sysj\conveyor_controller.sysj line: 15, column: 9
            System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 17, column: 5
            for(int i_thread_12 = 0; i_thread_12 < q_thread_12.length; i_thread_12 = i_thread_12 + 1) {//sysj\conveyor_controller.sysj line: 18, column: 34
              if(q_thread_12[i_thread_12]) {//sysj\conveyor_controller.sysj line: 19, column: 6
                o_thread_12 = true;//sysj\conveyor_controller.sysj line: 20, column: 7
              }
              System.out.print(" " + (q_thread_12[i_thread_12] ? 1 : 0));//sysj\conveyor_controller.sysj line: 21, column: 6
            }
            System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
            if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 25, column: 13
              simF_9.setPresent();//sysj\conveyor_controller.sysj line: 26, column: 6
              currsigs.addElement(simF_9);
              simF_9.setValue(q_thread_12[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 26, column: 6
              simC_9.setPresent();//sysj\conveyor_controller.sysj line: 27, column: 6
              currsigs.addElement(simC_9);
              simC_9.setValue(q_thread_12[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 27, column: 6
              S2827=0;
              if(o_thread_12){//sysj\conveyor_controller.sysj line: 30, column: 5
                S2835=0;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S2835=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
                currsigs.addElement(empty_1);
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              S2827=0;
              if(o_thread_12){//sysj\conveyor_controller.sysj line: 30, column: 5
                S2835=0;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S2835=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
                currsigs.addElement(empty_1);
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
          }
        }
        else {
          switch(S2848){
            case 0 : 
              if(insert_1.getprestatus()){//sysj\conveyor_controller.sysj line: 42, column: 12
                if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 43, column: 13
                  for(int i_thread_12 = q_thread_12.length - 1; i_thread_12 > 0; i_thread_12 = i_thread_12 - 1) {//sysj\conveyor_controller.sysj line: 44, column: 37
                    q_thread_12[i_thread_12] = q_thread_12[i_thread_12 - 1];//sysj\conveyor_controller.sysj line: 45, column: 7
                  }
                  q_thread_12[0] = true;//sysj\conveyor_controller.sysj line: 48, column: 5
                  S2848=0;
                  o_thread_12 = false;//sysj\conveyor_controller.sysj line: 15, column: 9
                  c_thread_12 = false;//sysj\conveyor_controller.sysj line: 15, column: 9
                  System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 17, column: 5
                  for(int i_thread_12 = 0; i_thread_12 < q_thread_12.length; i_thread_12 = i_thread_12 + 1) {//sysj\conveyor_controller.sysj line: 18, column: 34
                    if(q_thread_12[i_thread_12]) {//sysj\conveyor_controller.sysj line: 19, column: 6
                      o_thread_12 = true;//sysj\conveyor_controller.sysj line: 20, column: 7
                    }
                    System.out.print(" " + (q_thread_12[i_thread_12] ? 1 : 0));//sysj\conveyor_controller.sysj line: 21, column: 6
                  }
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
                  if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 25, column: 13
                    simF_9.setPresent();//sysj\conveyor_controller.sysj line: 26, column: 6
                    currsigs.addElement(simF_9);
                    simF_9.setValue(q_thread_12[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 26, column: 6
                    simC_9.setPresent();//sysj\conveyor_controller.sysj line: 27, column: 6
                    currsigs.addElement(simC_9);
                    simC_9.setValue(q_thread_12[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 27, column: 6
                    S2827=0;
                    if(o_thread_12){//sysj\conveyor_controller.sysj line: 30, column: 5
                      S2835=0;
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    else {
                      S2835=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
                      currsigs.addElement(empty_1);
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                  }
                  else {
                    S2827=0;
                    if(o_thread_12){//sysj\conveyor_controller.sysj line: 30, column: 5
                      S2835=0;
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    else {
                      S2835=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
                      currsigs.addElement(empty_1);
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                  }
                }
                else {
                  q_thread_12[0] = true;//sysj\conveyor_controller.sysj line: 48, column: 5
                  S2848=0;
                  o_thread_12 = false;//sysj\conveyor_controller.sysj line: 15, column: 9
                  c_thread_12 = false;//sysj\conveyor_controller.sysj line: 15, column: 9
                  System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 17, column: 5
                  for(int i_thread_12 = 0; i_thread_12 < q_thread_12.length; i_thread_12 = i_thread_12 + 1) {//sysj\conveyor_controller.sysj line: 18, column: 34
                    if(q_thread_12[i_thread_12]) {//sysj\conveyor_controller.sysj line: 19, column: 6
                      o_thread_12 = true;//sysj\conveyor_controller.sysj line: 20, column: 7
                    }
                    System.out.print(" " + (q_thread_12[i_thread_12] ? 1 : 0));//sysj\conveyor_controller.sysj line: 21, column: 6
                  }
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
                  if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 25, column: 13
                    simF_9.setPresent();//sysj\conveyor_controller.sysj line: 26, column: 6
                    currsigs.addElement(simF_9);
                    simF_9.setValue(q_thread_12[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 26, column: 6
                    simC_9.setPresent();//sysj\conveyor_controller.sysj line: 27, column: 6
                    currsigs.addElement(simC_9);
                    simC_9.setValue(q_thread_12[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 27, column: 6
                    S2827=0;
                    if(o_thread_12){//sysj\conveyor_controller.sysj line: 30, column: 5
                      S2835=0;
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    else {
                      S2835=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
                      currsigs.addElement(empty_1);
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                  }
                  else {
                    S2827=0;
                    if(o_thread_12){//sysj\conveyor_controller.sysj line: 30, column: 5
                      S2835=0;
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    else {
                      S2835=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
                      currsigs.addElement(empty_1);
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                  }
                }
              }
              else {
                switch(S2827){
                  case 0 : 
                    switch(S2835){
                      case 0 : 
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                        break;
                      
                      case 1 : 
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
                        currsigs.addElement(empty_1);
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    S2848=0;
                    o_thread_12 = false;//sysj\conveyor_controller.sysj line: 15, column: 9
                    c_thread_12 = false;//sysj\conveyor_controller.sysj line: 15, column: 9
                    System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 17, column: 5
                    for(int i_thread_12 = 0; i_thread_12 < q_thread_12.length; i_thread_12 = i_thread_12 + 1) {//sysj\conveyor_controller.sysj line: 18, column: 34
                      if(q_thread_12[i_thread_12]) {//sysj\conveyor_controller.sysj line: 19, column: 6
                        o_thread_12 = true;//sysj\conveyor_controller.sysj line: 20, column: 7
                      }
                      System.out.print(" " + (q_thread_12[i_thread_12] ? 1 : 0));//sysj\conveyor_controller.sysj line: 21, column: 6
                    }
                    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
                    if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 25, column: 13
                      simF_9.setPresent();//sysj\conveyor_controller.sysj line: 26, column: 6
                      currsigs.addElement(simF_9);
                      simF_9.setValue(q_thread_12[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 26, column: 6
                      simC_9.setPresent();//sysj\conveyor_controller.sysj line: 27, column: 6
                      currsigs.addElement(simC_9);
                      simC_9.setValue(q_thread_12[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 27, column: 6
                      S2827=0;
                      if(o_thread_12){//sysj\conveyor_controller.sysj line: 30, column: 5
                        S2835=0;
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      else {
                        S2835=1;
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
                        currsigs.addElement(empty_1);
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                    }
                    else {
                      S2827=0;
                      if(o_thread_12){//sysj\conveyor_controller.sysj line: 30, column: 5
                        S2835=0;
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      else {
                        S2835=1;
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
                        currsigs.addElement(empty_1);
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                    }
                    break;
                  
                }
              }
              break;
            
            case 1 : 
              S2848=0;
              o_thread_12 = false;//sysj\conveyor_controller.sysj line: 15, column: 9
              c_thread_12 = false;//sysj\conveyor_controller.sysj line: 15, column: 9
              System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 17, column: 5
              for(int i_thread_12 = 0; i_thread_12 < q_thread_12.length; i_thread_12 = i_thread_12 + 1) {//sysj\conveyor_controller.sysj line: 18, column: 34
                if(q_thread_12[i_thread_12]) {//sysj\conveyor_controller.sysj line: 19, column: 6
                  o_thread_12 = true;//sysj\conveyor_controller.sysj line: 20, column: 7
                }
                System.out.print(" " + (q_thread_12[i_thread_12] ? 1 : 0));//sysj\conveyor_controller.sysj line: 21, column: 6
              }
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
              if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 25, column: 13
                simF_9.setPresent();//sysj\conveyor_controller.sysj line: 26, column: 6
                currsigs.addElement(simF_9);
                simF_9.setValue(q_thread_12[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 26, column: 6
                simC_9.setPresent();//sysj\conveyor_controller.sysj line: 27, column: 6
                currsigs.addElement(simC_9);
                simC_9.setValue(q_thread_12[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 27, column: 6
                S2827=0;
                if(o_thread_12){//sysj\conveyor_controller.sysj line: 30, column: 5
                  S2835=0;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  S2835=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
                  currsigs.addElement(empty_1);
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
              }
              else {
                S2827=0;
                if(o_thread_12){//sysj\conveyor_controller.sysj line: 30, column: 5
                  S2835=0;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  S2835=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
                  currsigs.addElement(empty_1);
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
              }
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread24419(int [] tdone, int [] ends){
        switch(S2826){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S2640){
          case 0 : 
            if(simC_9.getprestatus()){//sysj\conveyor_controller.sysj line: 9, column: 14
              S2640=1;
              S2602=0;
              if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 9, column: 27
                simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 9, column: 27
                S2602=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S2597=0;
                if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 9, column: 27
                  simCapper_o.setVal((simC_9.getpreval() == null ? null : ((Boolean)simC_9.getpreval())));//sysj\conveyor_controller.sysj line: 9, column: 27
                  S2597=1;
                  if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 9, column: 27
                    simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 9, column: 27
                    ends[11]=2;
                    ;//sysj\conveyor_controller.sysj line: 9, column: 27
                    S2640=0;
                    active[11]=1;
                    ends[11]=1;
                    tdone[11]=1;
                  }
                  else {
                    active[11]=1;
                    ends[11]=1;
                    tdone[11]=1;
                  }
                }
                else {
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
              }
            }
            else {
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            switch(S2602){
              case 0 : 
                if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 9, column: 27
                  simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 9, column: 27
                  S2602=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S2597){
                    case 0 : 
                      if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 9, column: 27
                        simCapper_o.setVal((simC_9.getpreval() == null ? null : ((Boolean)simC_9.getpreval())));//sysj\conveyor_controller.sysj line: 9, column: 27
                        S2597=1;
                        if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 9, column: 27
                          simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 9, column: 27
                          ends[11]=2;
                          ;//sysj\conveyor_controller.sysj line: 9, column: 27
                          S2640=0;
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                        else {
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                      }
                      else {
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 9, column: 27
                        simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 9, column: 27
                        ends[11]=2;
                        ;//sysj\conveyor_controller.sysj line: 9, column: 27
                        S2640=0;
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      else {
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S2602=1;
                S2602=0;
                if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 9, column: 27
                  simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 9, column: 27
                  S2602=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S2597=0;
                  if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 9, column: 27
                    simCapper_o.setVal((simC_9.getpreval() == null ? null : ((Boolean)simC_9.getpreval())));//sysj\conveyor_controller.sysj line: 9, column: 27
                    S2597=1;
                    if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 9, column: 27
                      simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 9, column: 27
                      ends[11]=2;
                      ;//sysj\conveyor_controller.sysj line: 9, column: 27
                      S2640=0;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                  }
                  else {
                    active[11]=1;
                    ends[11]=1;
                    tdone[11]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread24418(int [] tdone, int [] ends){
        switch(S2594){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S2408){
          case 0 : 
            if(simF_9.getprestatus()){//sysj\conveyor_controller.sysj line: 7, column: 14
              S2408=1;
              S2370=0;
              if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 7, column: 27
                simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                S2370=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S2365=0;
                if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                  simFiller_o.setVal((simF_9.getpreval() == null ? null : ((Boolean)simF_9.getpreval())));//sysj\conveyor_controller.sysj line: 7, column: 27
                  S2365=1;
                  if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                    simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                    ends[10]=2;
                    ;//sysj\conveyor_controller.sysj line: 7, column: 27
                    S2408=0;
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
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            switch(S2370){
              case 0 : 
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 7, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                  S2370=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S2365){
                    case 0 : 
                      if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                        simFiller_o.setVal((simF_9.getpreval() == null ? null : ((Boolean)simF_9.getpreval())));//sysj\conveyor_controller.sysj line: 7, column: 27
                        S2365=1;
                        if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                          simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                          ends[10]=2;
                          ;//sysj\conveyor_controller.sysj line: 7, column: 27
                          S2408=0;
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
                      if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                        simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                        ends[10]=2;
                        ;//sysj\conveyor_controller.sysj line: 7, column: 27
                        S2408=0;
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
                S2370=1;
                S2370=0;
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 7, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                  S2370=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S2365=0;
                  if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                    simFiller_o.setVal((simF_9.getpreval() == null ? null : ((Boolean)simF_9.getpreval())));//sysj\conveyor_controller.sysj line: 7, column: 27
                    S2365=1;
                    if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                      simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                      ends[10]=2;
                      ;//sysj\conveyor_controller.sysj line: 7, column: 27
                      S2408=0;
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
        break;
      
    }
  }

  public void thread24417(int [] tdone, int [] ends){
        switch(S3294){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        simF_9.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
        simC_9.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
        thread24418(tdone,ends);
        thread24419(tdone,ends);
        thread24420(tdone,ends);
        int biggest24421 = 0;
        if(ends[10]>=biggest24421){
          biggest24421=ends[10];
        }
        if(ends[11]>=biggest24421){
          biggest24421=ends[11];
        }
        if(ends[12]>=biggest24421){
          biggest24421=ends[12];
        }
        if(biggest24421 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        //FINXME code
        if(biggest24421 == 0){
          S3294=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread24416(int [] tdone, int [] ends){
        switch(S2359){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S2311){
          case 0 : 
            switch(S2295){
              case 0 : 
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 138, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 138, column: 4
                  S2295=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S2290){
                    case 0 : 
                      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 138, column: 4
                        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 138, column: 4
                        S2290=1;
                        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 138, column: 4
                          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 138, column: 4
                          ends[8]=2;
                          ;//sysj\conveyor_controller.sysj line: 138, column: 4
                          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 139, column: 4
                          currsigs.addElement(rotaryRotated_1);
                          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 140, column: 4
                          S2311=1;
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                        else {
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                      }
                      else {
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 138, column: 4
                        rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 138, column: 4
                        ends[8]=2;
                        ;//sysj\conveyor_controller.sysj line: 138, column: 4
                        rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 139, column: 4
                        currsigs.addElement(rotaryRotated_1);
                        System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 140, column: 4
                        S2311=1;
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      else {
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S2295=1;
                S2295=0;
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 138, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 138, column: 4
                  S2295=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S2290=0;
                  if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 138, column: 4
                    rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 138, column: 4
                    S2290=1;
                    if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 138, column: 4
                      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 138, column: 4
                      ends[8]=2;
                      ;//sysj\conveyor_controller.sysj line: 138, column: 4
                      rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 139, column: 4
                      currsigs.addElement(rotaryRotated_1);
                      System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 140, column: 4
                      S2311=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                  }
                  else {
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S2311=1;
            S2311=0;
            S2295=0;
            if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 138, column: 4
              rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 138, column: 4
              S2295=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S2290=0;
              if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 138, column: 4
                rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 138, column: 4
                S2290=1;
                if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 138, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 138, column: 4
                  ends[8]=2;
                  ;//sysj\conveyor_controller.sysj line: 138, column: 4
                  rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 139, column: 4
                  currsigs.addElement(rotaryRotated_1);
                  System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 140, column: 4
                  S2311=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread24414(int [] tdone, int [] ends){
        switch(S2187){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus() || bottleLeftPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 124, column: 27
          System.out.println("*Conveyor - Bottle Reached Pos1*");//sysj\conveyor_controller.sysj line: 125, column: 21
          ends[7]=2;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread24413(int [] tdone, int [] ends){
        switch(S2183){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 119, column: 21
        currsigs.addElement(motConveyorOnOff);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread24411(int [] tdone, int [] ends){
        S2187=1;
    System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 123, column: 21
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread24410(int [] tdone, int [] ends){
        S2183=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor_controller.sysj line: 118, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 119, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread24409(int [] tdone, int [] ends){
        switch(S2288){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2202){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 115, column: 19
              S2202=1;
              thread24410(tdone,ends);
              thread24411(tdone,ends);
              int biggest24412 = 0;
              if(ends[6]>=biggest24412){
                biggest24412=ends[6];
              }
              if(ends[7]>=biggest24412){
                biggest24412=ends[7];
              }
              if(biggest24412 == 1){
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
            thread24413(tdone,ends);
            thread24414(tdone,ends);
            int biggest24415 = 0;
            if(ends[6]>=biggest24415){
              biggest24415=ends[6];
            }
            if(ends[7]>=biggest24415){
              biggest24415=ends[7];
            }
            if(biggest24415 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest24415 == 2){
              ends[5]=2;
              ;//sysj\conveyor_controller.sysj line: 116, column: 13
              S2202=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest24415 == 0){
              S2202=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread24407(int [] tdone, int [] ends){
        switch(S1514){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1469){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 95, column: 34
              S1469=1;
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
            S1469=1;
            S1469=2;
            S1476=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 97, column: 18
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 97, column: 18
              S1476=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S1471=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 97, column: 18
                convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 97, column: 18
                S1471=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 97, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 97, column: 18
                  ends[4]=2;
                  ;//sysj\conveyor_controller.sysj line: 97, column: 18
                  S1514=0;
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
            switch(S1476){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 97, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 97, column: 18
                  S1476=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S1471){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 97, column: 18
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 97, column: 18
                        S1471=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 97, column: 18
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 97, column: 18
                          ends[4]=2;
                          ;//sysj\conveyor_controller.sysj line: 97, column: 18
                          S1514=0;
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
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 97, column: 18
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 97, column: 18
                        ends[4]=2;
                        ;//sysj\conveyor_controller.sysj line: 97, column: 18
                        S1514=0;
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
                S1476=1;
                S1476=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 97, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 97, column: 18
                  S1476=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S1471=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 97, column: 18
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 97, column: 18
                    S1471=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 97, column: 18
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 97, column: 18
                      ends[4]=2;
                      ;//sysj\conveyor_controller.sysj line: 97, column: 18
                      S1514=0;
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

  public void thread24406(int [] tdone, int [] ends){
        switch(S1467){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1466){
          case 0 : 
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 89, column: 27
              S1466=1;
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
            S1466=1;
            convReady_o.setPreempted();//sysj\conveyor_controller.sysj line: 91, column: 21
            ends[3]=2;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread24404(int [] tdone, int [] ends){
        S1514=1;
    S1469=0;
    if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 95, column: 34
      S1469=1;
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

  public void thread24403(int [] tdone, int [] ends){
        S1467=1;
    S1466=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread24402(int [] tdone, int [] ends){
        switch(S2174){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1464){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 85, column: 19
              S1464=1;
              thread24403(tdone,ends);
              thread24404(tdone,ends);
              int biggest24405 = 0;
              if(ends[3]>=biggest24405){
                biggest24405=ends[3];
              }
              if(ends[4]>=biggest24405){
                biggest24405=ends[4];
              }
              if(biggest24405 == 1){
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
            thread24406(tdone,ends);
            thread24407(tdone,ends);
            int biggest24408 = 0;
            if(ends[3]>=biggest24408){
              biggest24408=ends[3];
            }
            if(ends[4]>=biggest24408){
              biggest24408=ends[4];
            }
            if(biggest24408 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest24408 == 2){
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 87, column: 13
              S1464=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest24408 == 0){
              S1464=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S1464=2;
            insert_1.setPresent();//sysj\conveyor_controller.sysj line: 101, column: 13
            currsigs.addElement(insert_1);
            System.out.println("*Conveyor - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 102, column: 13
            S1464=3;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            S1464=3;
            S1464=4;
            S1573=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 105, column: 8
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 105, column: 8
              S1573=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S1568=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 105, column: 8
                convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 105, column: 8
                S1568=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 105, column: 8
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 105, column: 8
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 105, column: 8
                  S1464=5;
                  S1617=0;
                  if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 106, column: 13
                    convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 106, column: 13
                    S1617=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S1612=0;
                    if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 106, column: 13
                      convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 106, column: 13
                      S1612=1;
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 106, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 106, column: 13
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 106, column: 13
                        S1464=6;
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
          
          case 4 : 
            switch(S1573){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 105, column: 8
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 105, column: 8
                  S1573=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S1568){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 105, column: 8
                        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 105, column: 8
                        S1568=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 105, column: 8
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 105, column: 8
                          ends[2]=2;
                          ;//sysj\conveyor_controller.sysj line: 105, column: 8
                          S1464=5;
                          S1617=0;
                          if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 106, column: 13
                            convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 106, column: 13
                            S1617=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S1612=0;
                            if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 106, column: 13
                              convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 106, column: 13
                              S1612=1;
                              if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 106, column: 13
                                convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 106, column: 13
                                ends[2]=2;
                                ;//sysj\conveyor_controller.sysj line: 106, column: 13
                                S1464=6;
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
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 105, column: 8
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 105, column: 8
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 105, column: 8
                        S1464=5;
                        S1617=0;
                        if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 106, column: 13
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 106, column: 13
                          S1617=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S1612=0;
                          if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 106, column: 13
                            convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 106, column: 13
                            S1612=1;
                            if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 106, column: 13
                              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 106, column: 13
                              ends[2]=2;
                              ;//sysj\conveyor_controller.sysj line: 106, column: 13
                              S1464=6;
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
                S1573=1;
                S1573=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 105, column: 8
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 105, column: 8
                  S1573=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S1568=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 105, column: 8
                    convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 105, column: 8
                    S1568=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 105, column: 8
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 105, column: 8
                      ends[2]=2;
                      ;//sysj\conveyor_controller.sysj line: 105, column: 8
                      S1464=5;
                      S1617=0;
                      if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 106, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 106, column: 13
                        S1617=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S1612=0;
                        if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 106, column: 13
                          convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 106, column: 13
                          S1612=1;
                          if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 106, column: 13
                            convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 106, column: 13
                            ends[2]=2;
                            ;//sysj\conveyor_controller.sysj line: 106, column: 13
                            S1464=6;
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
          
          case 5 : 
            switch(S1617){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 106, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 106, column: 13
                  S1617=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S1612){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 106, column: 13
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 106, column: 13
                        S1612=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 106, column: 13
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 106, column: 13
                          ends[2]=2;
                          ;//sysj\conveyor_controller.sysj line: 106, column: 13
                          S1464=6;
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
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 106, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 106, column: 13
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 106, column: 13
                        S1464=6;
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
                S1617=1;
                S1617=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 106, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 106, column: 13
                  S1617=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S1612=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 106, column: 13
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 106, column: 13
                    S1612=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 106, column: 13
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 106, column: 13
                      ends[2]=2;
                      ;//sysj\conveyor_controller.sysj line: 106, column: 13
                      S1464=6;
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
          
          case 6 : 
            S1464=6;
            System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 84, column: 10
            S1464=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread24399(int [] tdone, int [] ends){
        S3292=1;
    q_thread_12 = new boolean[5];//sysj\conveyor_controller.sysj line: 13, column: 3
    S2848=0;
    o_thread_12 = false;//sysj\conveyor_controller.sysj line: 15, column: 9
    c_thread_12 = false;//sysj\conveyor_controller.sysj line: 15, column: 9
    System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 17, column: 5
    for(int i_thread_12 = 0; i_thread_12 < q_thread_12.length; i_thread_12 = i_thread_12 + 1) {//sysj\conveyor_controller.sysj line: 18, column: 34
      if(q_thread_12[i_thread_12]) {//sysj\conveyor_controller.sysj line: 19, column: 6
        o_thread_12 = true;//sysj\conveyor_controller.sysj line: 20, column: 7
      }
      System.out.print(" " + (q_thread_12[i_thread_12] ? 1 : 0));//sysj\conveyor_controller.sysj line: 21, column: 6
    }
    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
    if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 25, column: 13
      simF_9.setPresent();//sysj\conveyor_controller.sysj line: 26, column: 6
      currsigs.addElement(simF_9);
      simF_9.setValue(q_thread_12[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 26, column: 6
      simC_9.setPresent();//sysj\conveyor_controller.sysj line: 27, column: 6
      currsigs.addElement(simC_9);
      simC_9.setValue(q_thread_12[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 27, column: 6
      S2827=0;
      if(o_thread_12){//sysj\conveyor_controller.sysj line: 30, column: 5
        S2835=0;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
      else {
        S2835=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
        currsigs.addElement(empty_1);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
    else {
      S2827=0;
      if(o_thread_12){//sysj\conveyor_controller.sysj line: 30, column: 5
        S2835=0;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
      else {
        S2835=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 33, column: 6
        currsigs.addElement(empty_1);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread24398(int [] tdone, int [] ends){
        S2826=1;
    S2640=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread24397(int [] tdone, int [] ends){
        S2594=1;
    S2408=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread24396(int [] tdone, int [] ends){
        S3294=1;
    simF_9.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
    simC_9.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
    thread24397(tdone,ends);
    thread24398(tdone,ends);
    thread24399(tdone,ends);
    int biggest24400 = 0;
    if(ends[10]>=biggest24400){
      biggest24400=ends[10];
    }
    if(ends[11]>=biggest24400){
      biggest24400=ends[11];
    }
    if(ends[12]>=biggest24400){
      biggest24400=ends[12];
    }
    if(biggest24400 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread24395(int [] tdone, int [] ends){
        S2359=1;
    S2311=0;
    S2295=0;
    if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 138, column: 4
      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 138, column: 4
      S2295=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S2290=0;
      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 138, column: 4
        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 138, column: 4
        S2290=1;
        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 138, column: 4
          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 138, column: 4
          ends[8]=2;
          ;//sysj\conveyor_controller.sysj line: 138, column: 4
          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 139, column: 4
          currsigs.addElement(rotaryRotated_1);
          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 140, column: 4
          S2311=1;
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
  }

  public void thread24394(int [] tdone, int [] ends){
        S2288=1;
    S2202=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread24393(int [] tdone, int [] ends){
        S2174=1;
    System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 84, column: 10
    S1464=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S3362){
        case 0 : 
          S3362=0;
          break RUN;
        
        case 1 : 
          S3362=2;
          S3362=2;
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 81, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 81, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 81, column: 2
          S3361=0;
          thread24393(tdone,ends);
          thread24394(tdone,ends);
          thread24395(tdone,ends);
          thread24396(tdone,ends);
          int biggest24401 = 0;
          if(ends[2]>=biggest24401){
            biggest24401=ends[2];
          }
          if(ends[5]>=biggest24401){
            biggest24401=ends[5];
          }
          if(ends[8]>=biggest24401){
            biggest24401=ends[8];
          }
          if(ends[9]>=biggest24401){
            biggest24401=ends[9];
          }
          if(biggest24401 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          if(biggest24401 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 81, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 81, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 81, column: 2
          switch(S3361){
            case 0 : 
              thread24402(tdone,ends);
              thread24409(tdone,ends);
              thread24416(tdone,ends);
              thread24417(tdone,ends);
              int biggest24422 = 0;
              if(ends[2]>=biggest24422){
                biggest24422=ends[2];
              }
              if(ends[5]>=biggest24422){
                biggest24422=ends[5];
              }
              if(ends[8]>=biggest24422){
                biggest24422=ends[8];
              }
              if(ends[9]>=biggest24422){
                biggest24422=ends[9];
              }
              if(biggest24422 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest24422 == 0){
                S3361=1;
                S3305=0;
                if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 148, column: 19
                  thread24423(tdone,ends);
                  thread24424(tdone,ends);
                  int biggest24425 = 0;
                  if(ends[13]>=biggest24425){
                    biggest24425=ends[13];
                  }
                  if(ends[14]>=biggest24425){
                    biggest24425=ends[14];
                  }
                  if(biggest24425 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S3305=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 1 : 
              switch(S3305){
                case 0 : 
                  thread24426(tdone,ends);
                  thread24427(tdone,ends);
                  int biggest24428 = 0;
                  if(ends[13]>=biggest24428){
                    biggest24428=ends[13];
                  }
                  if(ends[14]>=biggest24428){
                    biggest24428=ends[14];
                  }
                  if(biggest24428 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  if(biggest24428 == 2){
                    ends[1]=2;
                    ;//sysj\conveyor_controller.sysj line: 149, column: 11
                    S3305=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest24428 == 0){
                    S3305=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S3305=1;
                  S3305=0;
                  if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 148, column: 19
                    thread24429(tdone,ends);
                    thread24430(tdone,ends);
                    int biggest24431 = 0;
                    if(ends[13]>=biggest24431){
                      biggest24431=ends[13];
                    }
                    if(ends[14]>=biggest24431){
                      biggest24431=ends[14];
                    }
                    if(biggest24431 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S3305=1;
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
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    rotaryRotated_1 = new Signal();
    empty_1 = new Signal();
    insert_1 = new Signal();
    simF_9 = new Signal();
    simC_9 = new Signal();
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
      simF_9.setpreclear();
      simC_9.setpreclear();
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
      simF_9.setClear();
      simC_9.setClear();
      rotated_in.sethook();
      convReady_o.sethook();
      simFiller_o.sethook();
      simCapper_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        rotated_in.gethook();
        convReady_o.gethook();
        simFiller_o.gethook();
        simCapper_o.gethook();
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
