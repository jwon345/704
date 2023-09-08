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
  private Signal rotaryRotated_1;
  private Signal empty_1;
  private Signal insert_1;
  private Signal simF_9;
  private Signal simC_9;
  private boolean[] q_thread_11;//sysj\conveyor_controller.sysj line: 12, column: 3
  private boolean o_thread_11;//sysj\conveyor_controller.sysj line: 14, column: 9
  private boolean c_thread_11;//sysj\conveyor_controller.sysj line: 14, column: 9
  private int S3886 = 1;
  private int S3885 = 1;
  private int S2930 = 1;
  private int S2220 = 1;
  private int S2223 = 1;
  private int S2222 = 1;
  private int S2270 = 1;
  private int S2225 = 1;
  private int S2232 = 1;
  private int S2227 = 1;
  private int S2329 = 1;
  private int S2324 = 1;
  private int S2373 = 1;
  private int S2368 = 1;
  private int S3044 = 1;
  private int S2958 = 1;
  private int S2939 = 1;
  private int S2943 = 1;
  private int S3115 = 1;
  private int S3067 = 1;
  private int S3051 = 1;
  private int S3046 = 1;
  private int S3818 = 1;
  private int S3350 = 1;
  private int S3164 = 1;
  private int S3126 = 1;
  private int S3121 = 1;
  private int S3816 = 1;
  private int S3372 = 1;
  private int S3351 = 1;
  private int S3359 = 1;
  private int S3829 = 1;
  private int S3823 = 1;
  private int S3826 = 1;
  
  private int[] ends = new int[37];
  private int[] tdone = new int[37];
  
  public void thread18739(int [] tdone, int [] ends){
        S3826=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread18738(int [] tdone, int [] ends){
        S3823=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 149, column: 22
    currsigs.addElement(bottleDeployedE);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread18736(int [] tdone, int [] ends){
        switch(S3826){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 153, column: 28
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

  public void thread18735(int [] tdone, int [] ends){
        switch(S3823){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 149, column: 22
        currsigs.addElement(bottleDeployedE);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread18733(int [] tdone, int [] ends){
        S3826=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread18732(int [] tdone, int [] ends){
        S3823=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 149, column: 22
    currsigs.addElement(bottleDeployedE);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread18729(int [] tdone, int [] ends){
        switch(S3816){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 11
          for(int i_thread_11 = q_thread_11.length - 1; i_thread_11 > 0; i_thread_11 = i_thread_11 - 1) {//sysj\conveyor_controller.sysj line: 34, column: 36
            q_thread_11[i_thread_11] = q_thread_11[i_thread_11 - 1];//sysj\conveyor_controller.sysj line: 35, column: 6
          }
          if(insert_1.getprestatus()){//sysj\conveyor_controller.sysj line: 37, column: 13
            q_thread_11[0] = true;//sysj\conveyor_controller.sysj line: 38, column: 6
            S3372=0;
            o_thread_11 = false;//sysj\conveyor_controller.sysj line: 14, column: 9
            c_thread_11 = false;//sysj\conveyor_controller.sysj line: 14, column: 9
            System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 16, column: 5
            for(int i_thread_11 = 0; i_thread_11 < q_thread_11.length; i_thread_11 = i_thread_11 + 1) {//sysj\conveyor_controller.sysj line: 17, column: 34
              if(q_thread_11[i_thread_11]) {//sysj\conveyor_controller.sysj line: 18, column: 6
                o_thread_11 = true;//sysj\conveyor_controller.sysj line: 19, column: 7
              }
              System.out.print(" " + (q_thread_11[i_thread_11] ? 1 : 0));//sysj\conveyor_controller.sysj line: 20, column: 6
            }
            System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 22, column: 5
            if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 24, column: 13
              simF_9.setPresent();//sysj\conveyor_controller.sysj line: 25, column: 6
              currsigs.addElement(simF_9);
              simF_9.setValue(q_thread_11[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 25, column: 6
              simC_9.setPresent();//sysj\conveyor_controller.sysj line: 26, column: 6
              currsigs.addElement(simC_9);
              simC_9.setValue(q_thread_11[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 26, column: 6
              S3351=0;
              if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                S3359=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S3359=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                currsigs.addElement(empty_1);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              S3351=0;
              if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                S3359=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S3359=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                currsigs.addElement(empty_1);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
          }
          else {
            q_thread_11[0] = false;//sysj\conveyor_controller.sysj line: 40, column: 6
            S3372=0;
            o_thread_11 = false;//sysj\conveyor_controller.sysj line: 14, column: 9
            c_thread_11 = false;//sysj\conveyor_controller.sysj line: 14, column: 9
            System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 16, column: 5
            for(int i_thread_11 = 0; i_thread_11 < q_thread_11.length; i_thread_11 = i_thread_11 + 1) {//sysj\conveyor_controller.sysj line: 17, column: 34
              if(q_thread_11[i_thread_11]) {//sysj\conveyor_controller.sysj line: 18, column: 6
                o_thread_11 = true;//sysj\conveyor_controller.sysj line: 19, column: 7
              }
              System.out.print(" " + (q_thread_11[i_thread_11] ? 1 : 0));//sysj\conveyor_controller.sysj line: 20, column: 6
            }
            System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 22, column: 5
            if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 24, column: 13
              simF_9.setPresent();//sysj\conveyor_controller.sysj line: 25, column: 6
              currsigs.addElement(simF_9);
              simF_9.setValue(q_thread_11[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 25, column: 6
              simC_9.setPresent();//sysj\conveyor_controller.sysj line: 26, column: 6
              currsigs.addElement(simC_9);
              simC_9.setValue(q_thread_11[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 26, column: 6
              S3351=0;
              if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                S3359=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S3359=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                currsigs.addElement(empty_1);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              S3351=0;
              if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                S3359=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S3359=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                currsigs.addElement(empty_1);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
          }
        }
        else {
          switch(S3372){
            case 0 : 
              if(insert_1.getprestatus()){//sysj\conveyor_controller.sysj line: 41, column: 12
                if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 42, column: 13
                  for(int i_thread_11 = q_thread_11.length - 1; i_thread_11 > 0; i_thread_11 = i_thread_11 - 1) {//sysj\conveyor_controller.sysj line: 43, column: 37
                    q_thread_11[i_thread_11] = q_thread_11[i_thread_11 - 1];//sysj\conveyor_controller.sysj line: 44, column: 7
                  }
                  q_thread_11[0] = true;//sysj\conveyor_controller.sysj line: 47, column: 5
                  S3372=0;
                  o_thread_11 = false;//sysj\conveyor_controller.sysj line: 14, column: 9
                  c_thread_11 = false;//sysj\conveyor_controller.sysj line: 14, column: 9
                  System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 16, column: 5
                  for(int i_thread_11 = 0; i_thread_11 < q_thread_11.length; i_thread_11 = i_thread_11 + 1) {//sysj\conveyor_controller.sysj line: 17, column: 34
                    if(q_thread_11[i_thread_11]) {//sysj\conveyor_controller.sysj line: 18, column: 6
                      o_thread_11 = true;//sysj\conveyor_controller.sysj line: 19, column: 7
                    }
                    System.out.print(" " + (q_thread_11[i_thread_11] ? 1 : 0));//sysj\conveyor_controller.sysj line: 20, column: 6
                  }
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 22, column: 5
                  if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 24, column: 13
                    simF_9.setPresent();//sysj\conveyor_controller.sysj line: 25, column: 6
                    currsigs.addElement(simF_9);
                    simF_9.setValue(q_thread_11[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 25, column: 6
                    simC_9.setPresent();//sysj\conveyor_controller.sysj line: 26, column: 6
                    currsigs.addElement(simC_9);
                    simC_9.setValue(q_thread_11[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 26, column: 6
                    S3351=0;
                    if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                      S3359=0;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S3359=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                      currsigs.addElement(empty_1);
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                  }
                  else {
                    S3351=0;
                    if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                      S3359=0;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S3359=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                      currsigs.addElement(empty_1);
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                  }
                }
                else {
                  q_thread_11[0] = true;//sysj\conveyor_controller.sysj line: 47, column: 5
                  S3372=0;
                  o_thread_11 = false;//sysj\conveyor_controller.sysj line: 14, column: 9
                  c_thread_11 = false;//sysj\conveyor_controller.sysj line: 14, column: 9
                  System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 16, column: 5
                  for(int i_thread_11 = 0; i_thread_11 < q_thread_11.length; i_thread_11 = i_thread_11 + 1) {//sysj\conveyor_controller.sysj line: 17, column: 34
                    if(q_thread_11[i_thread_11]) {//sysj\conveyor_controller.sysj line: 18, column: 6
                      o_thread_11 = true;//sysj\conveyor_controller.sysj line: 19, column: 7
                    }
                    System.out.print(" " + (q_thread_11[i_thread_11] ? 1 : 0));//sysj\conveyor_controller.sysj line: 20, column: 6
                  }
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 22, column: 5
                  if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 24, column: 13
                    simF_9.setPresent();//sysj\conveyor_controller.sysj line: 25, column: 6
                    currsigs.addElement(simF_9);
                    simF_9.setValue(q_thread_11[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 25, column: 6
                    simC_9.setPresent();//sysj\conveyor_controller.sysj line: 26, column: 6
                    currsigs.addElement(simC_9);
                    simC_9.setValue(q_thread_11[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 26, column: 6
                    S3351=0;
                    if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                      S3359=0;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S3359=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                      currsigs.addElement(empty_1);
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                  }
                  else {
                    S3351=0;
                    if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                      S3359=0;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S3359=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                      currsigs.addElement(empty_1);
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                  }
                }
              }
              else {
                switch(S3351){
                  case 0 : 
                    switch(S3359){
                      case 0 : 
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                        break;
                      
                      case 1 : 
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                        currsigs.addElement(empty_1);
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    S3372=0;
                    o_thread_11 = false;//sysj\conveyor_controller.sysj line: 14, column: 9
                    c_thread_11 = false;//sysj\conveyor_controller.sysj line: 14, column: 9
                    System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 16, column: 5
                    for(int i_thread_11 = 0; i_thread_11 < q_thread_11.length; i_thread_11 = i_thread_11 + 1) {//sysj\conveyor_controller.sysj line: 17, column: 34
                      if(q_thread_11[i_thread_11]) {//sysj\conveyor_controller.sysj line: 18, column: 6
                        o_thread_11 = true;//sysj\conveyor_controller.sysj line: 19, column: 7
                      }
                      System.out.print(" " + (q_thread_11[i_thread_11] ? 1 : 0));//sysj\conveyor_controller.sysj line: 20, column: 6
                    }
                    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 22, column: 5
                    if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 24, column: 13
                      simF_9.setPresent();//sysj\conveyor_controller.sysj line: 25, column: 6
                      currsigs.addElement(simF_9);
                      simF_9.setValue(q_thread_11[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 25, column: 6
                      simC_9.setPresent();//sysj\conveyor_controller.sysj line: 26, column: 6
                      currsigs.addElement(simC_9);
                      simC_9.setValue(q_thread_11[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 26, column: 6
                      S3351=0;
                      if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                        S3359=0;
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      else {
                        S3359=1;
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                        currsigs.addElement(empty_1);
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                    }
                    else {
                      S3351=0;
                      if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                        S3359=0;
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      else {
                        S3359=1;
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                        currsigs.addElement(empty_1);
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                    }
                    break;
                  
                }
              }
              break;
            
            case 1 : 
              S3372=0;
              o_thread_11 = false;//sysj\conveyor_controller.sysj line: 14, column: 9
              c_thread_11 = false;//sysj\conveyor_controller.sysj line: 14, column: 9
              System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 16, column: 5
              for(int i_thread_11 = 0; i_thread_11 < q_thread_11.length; i_thread_11 = i_thread_11 + 1) {//sysj\conveyor_controller.sysj line: 17, column: 34
                if(q_thread_11[i_thread_11]) {//sysj\conveyor_controller.sysj line: 18, column: 6
                  o_thread_11 = true;//sysj\conveyor_controller.sysj line: 19, column: 7
                }
                System.out.print(" " + (q_thread_11[i_thread_11] ? 1 : 0));//sysj\conveyor_controller.sysj line: 20, column: 6
              }
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 22, column: 5
              if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 24, column: 13
                simF_9.setPresent();//sysj\conveyor_controller.sysj line: 25, column: 6
                currsigs.addElement(simF_9);
                simF_9.setValue(q_thread_11[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 25, column: 6
                simC_9.setPresent();//sysj\conveyor_controller.sysj line: 26, column: 6
                currsigs.addElement(simC_9);
                simC_9.setValue(q_thread_11[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 26, column: 6
                S3351=0;
                if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                  S3359=0;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S3359=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                  currsigs.addElement(empty_1);
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
              }
              else {
                S3351=0;
                if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                  S3359=0;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S3359=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                  currsigs.addElement(empty_1);
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
              }
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread18728(int [] tdone, int [] ends){
        switch(S3350){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S3164){
          case 0 : 
            if(simF_9.getprestatus()){//sysj\conveyor_controller.sysj line: 7, column: 14
              S3164=1;
              S3126=0;
              if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 7, column: 27
                simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                S3126=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S3121=0;
                if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                  simFiller_o.setVal((simF_9.getpreval() == null ? null : ((Boolean)simF_9.getpreval())));//sysj\conveyor_controller.sysj line: 7, column: 27
                  S3121=1;
                  if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                    simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                    ends[10]=2;
                    ;//sysj\conveyor_controller.sysj line: 7, column: 27
                    S3164=0;
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
            switch(S3126){
              case 0 : 
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 7, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                  S3126=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S3121){
                    case 0 : 
                      if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                        simFiller_o.setVal((simF_9.getpreval() == null ? null : ((Boolean)simF_9.getpreval())));//sysj\conveyor_controller.sysj line: 7, column: 27
                        S3121=1;
                        if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                          simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                          ends[10]=2;
                          ;//sysj\conveyor_controller.sysj line: 7, column: 27
                          S3164=0;
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
                        S3164=0;
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
                S3126=1;
                S3126=0;
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 7, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                  S3126=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S3121=0;
                  if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                    simFiller_o.setVal((simF_9.getpreval() == null ? null : ((Boolean)simF_9.getpreval())));//sysj\conveyor_controller.sysj line: 7, column: 27
                    S3121=1;
                    if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                      simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                      ends[10]=2;
                      ;//sysj\conveyor_controller.sysj line: 7, column: 27
                      S3164=0;
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

  public void thread18727(int [] tdone, int [] ends){
        switch(S3818){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        simF_9.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
        simC_9.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
        thread18728(tdone,ends);
        thread18729(tdone,ends);
        int biggest18730 = 0;
        if(ends[10]>=biggest18730){
          biggest18730=ends[10];
        }
        if(ends[11]>=biggest18730){
          biggest18730=ends[11];
        }
        if(biggest18730 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        //FINXME code
        if(biggest18730 == 0){
          S3818=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread18726(int [] tdone, int [] ends){
        switch(S3115){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S3067){
          case 0 : 
            switch(S3051){
              case 0 : 
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 136, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
                  S3051=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S3046){
                    case 0 : 
                      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
                        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 136, column: 4
                        S3046=1;
                        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
                          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
                          ends[8]=2;
                          ;//sysj\conveyor_controller.sysj line: 136, column: 4
                          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 137, column: 4
                          currsigs.addElement(rotaryRotated_1);
                          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 138, column: 4
                          S3067=1;
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
                      if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
                        rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
                        ends[8]=2;
                        ;//sysj\conveyor_controller.sysj line: 136, column: 4
                        rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 137, column: 4
                        currsigs.addElement(rotaryRotated_1);
                        System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 138, column: 4
                        S3067=1;
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
                S3051=1;
                S3051=0;
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 136, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
                  S3051=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S3046=0;
                  if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
                    rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 136, column: 4
                    S3046=1;
                    if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
                      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
                      ends[8]=2;
                      ;//sysj\conveyor_controller.sysj line: 136, column: 4
                      rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 137, column: 4
                      currsigs.addElement(rotaryRotated_1);
                      System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 138, column: 4
                      S3067=1;
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
            S3067=1;
            S3067=0;
            S3051=0;
            if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 136, column: 4
              rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
              S3051=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S3046=0;
              if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
                rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 136, column: 4
                S3046=1;
                if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
                  ends[8]=2;
                  ;//sysj\conveyor_controller.sysj line: 136, column: 4
                  rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 137, column: 4
                  currsigs.addElement(rotaryRotated_1);
                  System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 138, column: 4
                  S3067=1;
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

  public void thread18724(int [] tdone, int [] ends){
        switch(S2943){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus() || bottleLeftPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 122, column: 27
          System.out.println("*Conveyor - Bottle Reached Pos1*");//sysj\conveyor_controller.sysj line: 123, column: 21
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

  public void thread18723(int [] tdone, int [] ends){
        switch(S2939){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 117, column: 21
        currsigs.addElement(motConveyorOnOff);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread18721(int [] tdone, int [] ends){
        S2943=1;
    System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 121, column: 21
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread18720(int [] tdone, int [] ends){
        S2939=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor_controller.sysj line: 116, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 117, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread18719(int [] tdone, int [] ends){
        switch(S3044){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2958){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 113, column: 19
              S2958=1;
              thread18720(tdone,ends);
              thread18721(tdone,ends);
              int biggest18722 = 0;
              if(ends[6]>=biggest18722){
                biggest18722=ends[6];
              }
              if(ends[7]>=biggest18722){
                biggest18722=ends[7];
              }
              if(biggest18722 == 1){
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
            thread18723(tdone,ends);
            thread18724(tdone,ends);
            int biggest18725 = 0;
            if(ends[6]>=biggest18725){
              biggest18725=ends[6];
            }
            if(ends[7]>=biggest18725){
              biggest18725=ends[7];
            }
            if(biggest18725 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest18725 == 2){
              ends[5]=2;
              ;//sysj\conveyor_controller.sysj line: 114, column: 13
              S2958=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest18725 == 0){
              S2958=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18717(int [] tdone, int [] ends){
        switch(S2270){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2225){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 93, column: 34
              S2225=1;
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
            S2225=1;
            S2225=2;
            S2232=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 95, column: 18
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 95, column: 18
              S2232=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2227=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 95, column: 18
                convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 95, column: 18
                S2227=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 95, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 95, column: 18
                  ends[4]=2;
                  ;//sysj\conveyor_controller.sysj line: 95, column: 18
                  S2270=0;
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
            switch(S2232){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 95, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 95, column: 18
                  S2232=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S2227){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 95, column: 18
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 95, column: 18
                        S2227=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 95, column: 18
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 95, column: 18
                          ends[4]=2;
                          ;//sysj\conveyor_controller.sysj line: 95, column: 18
                          S2270=0;
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
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 95, column: 18
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 95, column: 18
                        ends[4]=2;
                        ;//sysj\conveyor_controller.sysj line: 95, column: 18
                        S2270=0;
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
                S2232=1;
                S2232=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 95, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 95, column: 18
                  S2232=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S2227=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 95, column: 18
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 95, column: 18
                    S2227=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 95, column: 18
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 95, column: 18
                      ends[4]=2;
                      ;//sysj\conveyor_controller.sysj line: 95, column: 18
                      S2270=0;
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

  public void thread18716(int [] tdone, int [] ends){
        switch(S2223){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2222){
          case 0 : 
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 87, column: 27
              S2222=1;
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
            S2222=1;
            convReady_o.setPreempted();//sysj\conveyor_controller.sysj line: 89, column: 21
            ends[3]=2;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread18714(int [] tdone, int [] ends){
        S2270=1;
    S2225=0;
    if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 93, column: 34
      S2225=1;
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

  public void thread18713(int [] tdone, int [] ends){
        S2223=1;
    S2222=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread18712(int [] tdone, int [] ends){
        switch(S2930){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2220){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 83, column: 19
              S2220=1;
              thread18713(tdone,ends);
              thread18714(tdone,ends);
              int biggest18715 = 0;
              if(ends[3]>=biggest18715){
                biggest18715=ends[3];
              }
              if(ends[4]>=biggest18715){
                biggest18715=ends[4];
              }
              if(biggest18715 == 1){
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
            thread18716(tdone,ends);
            thread18717(tdone,ends);
            int biggest18718 = 0;
            if(ends[3]>=biggest18718){
              biggest18718=ends[3];
            }
            if(ends[4]>=biggest18718){
              biggest18718=ends[4];
            }
            if(biggest18718 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest18718 == 2){
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 85, column: 13
              S2220=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest18718 == 0){
              S2220=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S2220=2;
            insert_1.setPresent();//sysj\conveyor_controller.sysj line: 99, column: 13
            currsigs.addElement(insert_1);
            System.out.println("*Conveyor - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 100, column: 13
            S2220=3;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            S2220=3;
            S2220=4;
            S2329=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 103, column: 8
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 103, column: 8
              S2329=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2324=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 103, column: 8
                convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 103, column: 8
                S2324=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 103, column: 8
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 103, column: 8
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 103, column: 8
                  S2220=5;
                  S2373=0;
                  if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 104, column: 13
                    convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                    S2373=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S2368=0;
                    if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                      convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 104, column: 13
                      S2368=1;
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 104, column: 13
                        S2220=6;
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
            switch(S2329){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 103, column: 8
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 103, column: 8
                  S2329=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S2324){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 103, column: 8
                        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 103, column: 8
                        S2324=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 103, column: 8
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 103, column: 8
                          ends[2]=2;
                          ;//sysj\conveyor_controller.sysj line: 103, column: 8
                          S2220=5;
                          S2373=0;
                          if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 104, column: 13
                            convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                            S2373=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S2368=0;
                            if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                              convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 104, column: 13
                              S2368=1;
                              if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                                convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                                ends[2]=2;
                                ;//sysj\conveyor_controller.sysj line: 104, column: 13
                                S2220=6;
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
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 103, column: 8
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 103, column: 8
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 103, column: 8
                        S2220=5;
                        S2373=0;
                        if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 104, column: 13
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                          S2373=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S2368=0;
                          if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                            convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 104, column: 13
                            S2368=1;
                            if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                              ends[2]=2;
                              ;//sysj\conveyor_controller.sysj line: 104, column: 13
                              S2220=6;
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
                S2329=1;
                S2329=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 103, column: 8
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 103, column: 8
                  S2329=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2324=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 103, column: 8
                    convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 103, column: 8
                    S2324=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 103, column: 8
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 103, column: 8
                      ends[2]=2;
                      ;//sysj\conveyor_controller.sysj line: 103, column: 8
                      S2220=5;
                      S2373=0;
                      if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 104, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                        S2373=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S2368=0;
                        if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                          convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 104, column: 13
                          S2368=1;
                          if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                            convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                            ends[2]=2;
                            ;//sysj\conveyor_controller.sysj line: 104, column: 13
                            S2220=6;
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
            switch(S2373){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 104, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                  S2373=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S2368){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 104, column: 13
                        S2368=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                          ends[2]=2;
                          ;//sysj\conveyor_controller.sysj line: 104, column: 13
                          S2220=6;
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
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 104, column: 13
                        S2220=6;
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
                S2373=1;
                S2373=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 104, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                  S2373=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2368=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 104, column: 13
                    S2368=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                      ends[2]=2;
                      ;//sysj\conveyor_controller.sysj line: 104, column: 13
                      S2220=6;
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
            S2220=6;
            System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 82, column: 10
            S2220=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread18709(int [] tdone, int [] ends){
        S3816=1;
    q_thread_11 = new boolean[5];//sysj\conveyor_controller.sysj line: 12, column: 3
    S3372=0;
    o_thread_11 = false;//sysj\conveyor_controller.sysj line: 14, column: 9
    c_thread_11 = false;//sysj\conveyor_controller.sysj line: 14, column: 9
    System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 16, column: 5
    for(int i_thread_11 = 0; i_thread_11 < q_thread_11.length; i_thread_11 = i_thread_11 + 1) {//sysj\conveyor_controller.sysj line: 17, column: 34
      if(q_thread_11[i_thread_11]) {//sysj\conveyor_controller.sysj line: 18, column: 6
        o_thread_11 = true;//sysj\conveyor_controller.sysj line: 19, column: 7
      }
      System.out.print(" " + (q_thread_11[i_thread_11] ? 1 : 0));//sysj\conveyor_controller.sysj line: 20, column: 6
    }
    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 22, column: 5
    if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 24, column: 13
      simF_9.setPresent();//sysj\conveyor_controller.sysj line: 25, column: 6
      currsigs.addElement(simF_9);
      simF_9.setValue(q_thread_11[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 25, column: 6
      simC_9.setPresent();//sysj\conveyor_controller.sysj line: 26, column: 6
      currsigs.addElement(simC_9);
      simC_9.setValue(q_thread_11[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 26, column: 6
      S3351=0;
      if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
        S3359=0;
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        S3359=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
        currsigs.addElement(empty_1);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
    else {
      S3351=0;
      if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
        S3359=0;
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        S3359=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
        currsigs.addElement(empty_1);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
  }

  public void thread18708(int [] tdone, int [] ends){
        S3350=1;
    S3164=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread18707(int [] tdone, int [] ends){
        S3818=1;
    simF_9.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
    simC_9.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
    thread18708(tdone,ends);
    thread18709(tdone,ends);
    int biggest18710 = 0;
    if(ends[10]>=biggest18710){
      biggest18710=ends[10];
    }
    if(ends[11]>=biggest18710){
      biggest18710=ends[11];
    }
    if(biggest18710 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread18706(int [] tdone, int [] ends){
        S3115=1;
    S3067=0;
    S3051=0;
    if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 136, column: 4
      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
      S3051=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S3046=0;
      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 136, column: 4
        S3046=1;
        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
          ends[8]=2;
          ;//sysj\conveyor_controller.sysj line: 136, column: 4
          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 137, column: 4
          currsigs.addElement(rotaryRotated_1);
          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 138, column: 4
          S3067=1;
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

  public void thread18705(int [] tdone, int [] ends){
        S3044=1;
    S2958=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread18704(int [] tdone, int [] ends){
        S2930=1;
    System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 82, column: 10
    S2220=0;
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
      switch(S3886){
        case 0 : 
          S3886=0;
          break RUN;
        
        case 1 : 
          S3886=2;
          S3886=2;
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 79, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 79, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 79, column: 2
          S3885=0;
          thread18704(tdone,ends);
          thread18705(tdone,ends);
          thread18706(tdone,ends);
          thread18707(tdone,ends);
          int biggest18711 = 0;
          if(ends[2]>=biggest18711){
            biggest18711=ends[2];
          }
          if(ends[5]>=biggest18711){
            biggest18711=ends[5];
          }
          if(ends[8]>=biggest18711){
            biggest18711=ends[8];
          }
          if(ends[9]>=biggest18711){
            biggest18711=ends[9];
          }
          if(biggest18711 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          if(biggest18711 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 79, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 79, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 79, column: 2
          switch(S3885){
            case 0 : 
              thread18712(tdone,ends);
              thread18719(tdone,ends);
              thread18726(tdone,ends);
              thread18727(tdone,ends);
              int biggest18731 = 0;
              if(ends[2]>=biggest18731){
                biggest18731=ends[2];
              }
              if(ends[5]>=biggest18731){
                biggest18731=ends[5];
              }
              if(ends[8]>=biggest18731){
                biggest18731=ends[8];
              }
              if(ends[9]>=biggest18731){
                biggest18731=ends[9];
              }
              if(biggest18731 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest18731 == 0){
                S3885=1;
                S3829=0;
                if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 146, column: 19
                  thread18732(tdone,ends);
                  thread18733(tdone,ends);
                  int biggest18734 = 0;
                  if(ends[12]>=biggest18734){
                    biggest18734=ends[12];
                  }
                  if(ends[13]>=biggest18734){
                    biggest18734=ends[13];
                  }
                  if(biggest18734 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S3829=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 1 : 
              switch(S3829){
                case 0 : 
                  thread18735(tdone,ends);
                  thread18736(tdone,ends);
                  int biggest18737 = 0;
                  if(ends[12]>=biggest18737){
                    biggest18737=ends[12];
                  }
                  if(ends[13]>=biggest18737){
                    biggest18737=ends[13];
                  }
                  if(biggest18737 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  if(biggest18737 == 2){
                    ends[1]=2;
                    ;//sysj\conveyor_controller.sysj line: 147, column: 11
                    S3829=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest18737 == 0){
                    S3829=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S3829=1;
                  S3829=0;
                  if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 146, column: 19
                    thread18738(tdone,ends);
                    thread18739(tdone,ends);
                    int biggest18740 = 0;
                    if(ends[12]>=biggest18740){
                      biggest18740=ends[12];
                    }
                    if(ends[13]>=biggest18740){
                      biggest18740=ends[13];
                    }
                    if(biggest18740 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S3829=1;
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
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        rotated_in.gethook();
        convReady_o.gethook();
        simFiller_o.gethook();
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
