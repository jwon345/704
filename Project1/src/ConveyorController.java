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
  private int S3752 = 1;
  private int S3751 = 1;
  private int S2796 = 1;
  private int S2086 = 1;
  private int S2089 = 1;
  private int S2088 = 1;
  private int S2136 = 1;
  private int S2091 = 1;
  private int S2098 = 1;
  private int S2093 = 1;
  private int S2195 = 1;
  private int S2190 = 1;
  private int S2239 = 1;
  private int S2234 = 1;
  private int S2910 = 1;
  private int S2824 = 1;
  private int S2805 = 1;
  private int S2809 = 1;
  private int S2981 = 1;
  private int S2933 = 1;
  private int S2917 = 1;
  private int S2912 = 1;
  private int S3684 = 1;
  private int S3216 = 1;
  private int S3030 = 1;
  private int S2992 = 1;
  private int S2987 = 1;
  private int S3682 = 1;
  private int S3238 = 1;
  private int S3217 = 1;
  private int S3225 = 1;
  private int S3695 = 1;
  private int S3689 = 1;
  private int S3692 = 1;
  
  private int[] ends = new int[35];
  private int[] tdone = new int[35];
  
  public void thread18509(int [] tdone, int [] ends){
        S3692=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread18508(int [] tdone, int [] ends){
        S3689=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 149, column: 22
    currsigs.addElement(bottleDeployedE);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread18506(int [] tdone, int [] ends){
        switch(S3692){
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

  public void thread18505(int [] tdone, int [] ends){
        switch(S3689){
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

  public void thread18503(int [] tdone, int [] ends){
        S3692=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread18502(int [] tdone, int [] ends){
        S3689=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 149, column: 22
    currsigs.addElement(bottleDeployedE);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread18499(int [] tdone, int [] ends){
        switch(S3682){
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
            S3238=0;
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
              S3217=0;
              if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                S3225=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S3225=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                currsigs.addElement(empty_1);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              S3217=0;
              if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                S3225=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S3225=1;
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
            S3238=0;
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
              S3217=0;
              if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                S3225=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S3225=1;
                empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                currsigs.addElement(empty_1);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              S3217=0;
              if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                S3225=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S3225=1;
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
          switch(S3238){
            case 0 : 
              if(insert_1.getprestatus()){//sysj\conveyor_controller.sysj line: 41, column: 12
                if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 42, column: 13
                  for(int i_thread_11 = q_thread_11.length - 1; i_thread_11 > 0; i_thread_11 = i_thread_11 - 1) {//sysj\conveyor_controller.sysj line: 43, column: 37
                    q_thread_11[i_thread_11] = q_thread_11[i_thread_11 - 1];//sysj\conveyor_controller.sysj line: 44, column: 7
                  }
                  q_thread_11[0] = true;//sysj\conveyor_controller.sysj line: 47, column: 5
                  S3238=0;
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
                    S3217=0;
                    if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                      S3225=0;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S3225=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                      currsigs.addElement(empty_1);
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                  }
                  else {
                    S3217=0;
                    if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                      S3225=0;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S3225=1;
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
                  S3238=0;
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
                    S3217=0;
                    if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                      S3225=0;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S3225=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                      currsigs.addElement(empty_1);
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                  }
                  else {
                    S3217=0;
                    if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                      S3225=0;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S3225=1;
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
                switch(S3217){
                  case 0 : 
                    switch(S3225){
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
                    S3238=0;
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
                      S3217=0;
                      if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                        S3225=0;
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      else {
                        S3225=1;
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                        currsigs.addElement(empty_1);
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                    }
                    else {
                      S3217=0;
                      if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                        S3225=0;
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      else {
                        S3225=1;
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
              S3238=0;
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
                S3217=0;
                if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                  S3225=0;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S3225=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
                  currsigs.addElement(empty_1);
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
              }
              else {
                S3217=0;
                if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
                  S3225=0;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S3225=1;
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

  public void thread18498(int [] tdone, int [] ends){
        switch(S3216){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S3030){
          case 0 : 
            if(simF_9.getprestatus()){//sysj\conveyor_controller.sysj line: 7, column: 14
              S3030=1;
              S2992=0;
              if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 7, column: 27
                simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                S2992=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S2987=0;
                if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                  simFiller_o.setVal((simF_9.getpreval() == null ? null : ((Boolean)simF_9.getpreval())));//sysj\conveyor_controller.sysj line: 7, column: 27
                  S2987=1;
                  if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                    simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                    ends[10]=2;
                    ;//sysj\conveyor_controller.sysj line: 7, column: 27
                    S3030=0;
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
            switch(S2992){
              case 0 : 
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 7, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                  S2992=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S2987){
                    case 0 : 
                      if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                        simFiller_o.setVal((simF_9.getpreval() == null ? null : ((Boolean)simF_9.getpreval())));//sysj\conveyor_controller.sysj line: 7, column: 27
                        S2987=1;
                        if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                          simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                          ends[10]=2;
                          ;//sysj\conveyor_controller.sysj line: 7, column: 27
                          S3030=0;
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
                        S3030=0;
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
                S2992=1;
                S2992=0;
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 7, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                  S2992=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S2987=0;
                  if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                    simFiller_o.setVal((simF_9.getpreval() == null ? null : ((Boolean)simF_9.getpreval())));//sysj\conveyor_controller.sysj line: 7, column: 27
                    S2987=1;
                    if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 7, column: 27
                      simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 7, column: 27
                      ends[10]=2;
                      ;//sysj\conveyor_controller.sysj line: 7, column: 27
                      S3030=0;
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

  public void thread18497(int [] tdone, int [] ends){
        switch(S3684){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        simF_9.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
        simC_9.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
        thread18498(tdone,ends);
        thread18499(tdone,ends);
        int biggest18500 = 0;
        if(ends[10]>=biggest18500){
          biggest18500=ends[10];
        }
        if(ends[11]>=biggest18500){
          biggest18500=ends[11];
        }
        if(biggest18500 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        //FINXME code
        if(biggest18500 == 0){
          S3684=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread18496(int [] tdone, int [] ends){
        switch(S2981){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S2933){
          case 0 : 
            switch(S2917){
              case 0 : 
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 136, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
                  S2917=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S2912){
                    case 0 : 
                      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
                        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 136, column: 4
                        S2912=1;
                        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
                          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
                          ends[8]=2;
                          ;//sysj\conveyor_controller.sysj line: 136, column: 4
                          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 137, column: 4
                          currsigs.addElement(rotaryRotated_1);
                          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 138, column: 4
                          S2933=1;
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
                        S2933=1;
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
                S2917=1;
                S2917=0;
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 136, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
                  S2917=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S2912=0;
                  if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
                    rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 136, column: 4
                    S2912=1;
                    if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
                      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
                      ends[8]=2;
                      ;//sysj\conveyor_controller.sysj line: 136, column: 4
                      rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 137, column: 4
                      currsigs.addElement(rotaryRotated_1);
                      System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 138, column: 4
                      S2933=1;
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
            S2933=1;
            S2933=0;
            S2917=0;
            if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 136, column: 4
              rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
              S2917=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S2912=0;
              if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
                rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 136, column: 4
                S2912=1;
                if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
                  ends[8]=2;
                  ;//sysj\conveyor_controller.sysj line: 136, column: 4
                  rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 137, column: 4
                  currsigs.addElement(rotaryRotated_1);
                  System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 138, column: 4
                  S2933=1;
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

  public void thread18494(int [] tdone, int [] ends){
        switch(S2809){
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

  public void thread18493(int [] tdone, int [] ends){
        switch(S2805){
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

  public void thread18491(int [] tdone, int [] ends){
        S2809=1;
    System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 121, column: 21
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread18490(int [] tdone, int [] ends){
        S2805=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor_controller.sysj line: 116, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 117, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread18489(int [] tdone, int [] ends){
        switch(S2910){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2824){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 113, column: 19
              S2824=1;
              thread18490(tdone,ends);
              thread18491(tdone,ends);
              int biggest18492 = 0;
              if(ends[6]>=biggest18492){
                biggest18492=ends[6];
              }
              if(ends[7]>=biggest18492){
                biggest18492=ends[7];
              }
              if(biggest18492 == 1){
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
            thread18493(tdone,ends);
            thread18494(tdone,ends);
            int biggest18495 = 0;
            if(ends[6]>=biggest18495){
              biggest18495=ends[6];
            }
            if(ends[7]>=biggest18495){
              biggest18495=ends[7];
            }
            if(biggest18495 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest18495 == 2){
              ends[5]=2;
              ;//sysj\conveyor_controller.sysj line: 114, column: 13
              S2824=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest18495 == 0){
              S2824=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18487(int [] tdone, int [] ends){
        switch(S2136){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2091){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 93, column: 34
              S2091=1;
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
            S2091=1;
            S2091=2;
            S2098=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 95, column: 18
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 95, column: 18
              S2098=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2093=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 95, column: 18
                convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 95, column: 18
                S2093=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 95, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 95, column: 18
                  ends[4]=2;
                  ;//sysj\conveyor_controller.sysj line: 95, column: 18
                  S2136=0;
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
            switch(S2098){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 95, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 95, column: 18
                  S2098=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S2093){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 95, column: 18
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 95, column: 18
                        S2093=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 95, column: 18
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 95, column: 18
                          ends[4]=2;
                          ;//sysj\conveyor_controller.sysj line: 95, column: 18
                          S2136=0;
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
                        S2136=0;
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
                S2098=1;
                S2098=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 95, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 95, column: 18
                  S2098=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S2093=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 95, column: 18
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 95, column: 18
                    S2093=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 95, column: 18
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 95, column: 18
                      ends[4]=2;
                      ;//sysj\conveyor_controller.sysj line: 95, column: 18
                      S2136=0;
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

  public void thread18486(int [] tdone, int [] ends){
        switch(S2089){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2088){
          case 0 : 
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 87, column: 27
              S2088=1;
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
            S2088=1;
            convReady_o.setPreempted();//sysj\conveyor_controller.sysj line: 89, column: 21
            ends[3]=2;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread18484(int [] tdone, int [] ends){
        S2136=1;
    S2091=0;
    if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 93, column: 34
      S2091=1;
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

  public void thread18483(int [] tdone, int [] ends){
        S2089=1;
    S2088=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread18482(int [] tdone, int [] ends){
        switch(S2796){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2086){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 83, column: 19
              S2086=1;
              thread18483(tdone,ends);
              thread18484(tdone,ends);
              int biggest18485 = 0;
              if(ends[3]>=biggest18485){
                biggest18485=ends[3];
              }
              if(ends[4]>=biggest18485){
                biggest18485=ends[4];
              }
              if(biggest18485 == 1){
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
            thread18486(tdone,ends);
            thread18487(tdone,ends);
            int biggest18488 = 0;
            if(ends[3]>=biggest18488){
              biggest18488=ends[3];
            }
            if(ends[4]>=biggest18488){
              biggest18488=ends[4];
            }
            if(biggest18488 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest18488 == 2){
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 85, column: 13
              S2086=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest18488 == 0){
              S2086=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S2086=2;
            insert_1.setPresent();//sysj\conveyor_controller.sysj line: 99, column: 13
            currsigs.addElement(insert_1);
            System.out.println("*Conveyor - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 100, column: 13
            S2086=3;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            S2086=3;
            S2086=4;
            S2195=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 103, column: 8
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 103, column: 8
              S2195=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2190=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 103, column: 8
                convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 103, column: 8
                S2190=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 103, column: 8
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 103, column: 8
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 103, column: 8
                  S2086=5;
                  S2239=0;
                  if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 104, column: 13
                    convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                    S2239=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S2234=0;
                    if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                      convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 104, column: 13
                      S2234=1;
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 104, column: 13
                        S2086=6;
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
            switch(S2195){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 103, column: 8
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 103, column: 8
                  S2195=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S2190){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 103, column: 8
                        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 103, column: 8
                        S2190=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 103, column: 8
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 103, column: 8
                          ends[2]=2;
                          ;//sysj\conveyor_controller.sysj line: 103, column: 8
                          S2086=5;
                          S2239=0;
                          if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 104, column: 13
                            convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                            S2239=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S2234=0;
                            if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                              convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 104, column: 13
                              S2234=1;
                              if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                                convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                                ends[2]=2;
                                ;//sysj\conveyor_controller.sysj line: 104, column: 13
                                S2086=6;
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
                        S2086=5;
                        S2239=0;
                        if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 104, column: 13
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                          S2239=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S2234=0;
                          if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                            convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 104, column: 13
                            S2234=1;
                            if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                              ends[2]=2;
                              ;//sysj\conveyor_controller.sysj line: 104, column: 13
                              S2086=6;
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
                S2195=1;
                S2195=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 103, column: 8
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 103, column: 8
                  S2195=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2190=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 103, column: 8
                    convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 103, column: 8
                    S2190=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 103, column: 8
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 103, column: 8
                      ends[2]=2;
                      ;//sysj\conveyor_controller.sysj line: 103, column: 8
                      S2086=5;
                      S2239=0;
                      if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 104, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                        S2239=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S2234=0;
                        if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                          convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 104, column: 13
                          S2234=1;
                          if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                            convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                            ends[2]=2;
                            ;//sysj\conveyor_controller.sysj line: 104, column: 13
                            S2086=6;
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
            switch(S2239){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 104, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                  S2239=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S2234){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 104, column: 13
                        S2234=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                          ends[2]=2;
                          ;//sysj\conveyor_controller.sysj line: 104, column: 13
                          S2086=6;
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
                        S2086=6;
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
                S2239=1;
                S2239=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 104, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                  S2239=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2234=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 104, column: 13
                    S2234=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 104, column: 13
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 104, column: 13
                      ends[2]=2;
                      ;//sysj\conveyor_controller.sysj line: 104, column: 13
                      S2086=6;
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
            S2086=6;
            System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 82, column: 10
            S2086=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread18479(int [] tdone, int [] ends){
        S3682=1;
    q_thread_11 = new boolean[5];//sysj\conveyor_controller.sysj line: 12, column: 3
    S3238=0;
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
      S3217=0;
      if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
        S3225=0;
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        S3225=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
        currsigs.addElement(empty_1);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
    else {
      S3217=0;
      if(o_thread_11){//sysj\conveyor_controller.sysj line: 29, column: 5
        S3225=0;
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        S3225=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 32, column: 6
        currsigs.addElement(empty_1);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
  }

  public void thread18478(int [] tdone, int [] ends){
        S3216=1;
    S3030=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread18477(int [] tdone, int [] ends){
        S3684=1;
    simF_9.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
    simC_9.setClear();//sysj\conveyor_controller.sysj line: 6, column: 2
    thread18478(tdone,ends);
    thread18479(tdone,ends);
    int biggest18480 = 0;
    if(ends[10]>=biggest18480){
      biggest18480=ends[10];
    }
    if(ends[11]>=biggest18480){
      biggest18480=ends[11];
    }
    if(biggest18480 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread18476(int [] tdone, int [] ends){
        S2981=1;
    S2933=0;
    S2917=0;
    if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 136, column: 4
      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
      S2917=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S2912=0;
      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 136, column: 4
        S2912=1;
        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 136, column: 4
          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 136, column: 4
          ends[8]=2;
          ;//sysj\conveyor_controller.sysj line: 136, column: 4
          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 137, column: 4
          currsigs.addElement(rotaryRotated_1);
          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 138, column: 4
          S2933=1;
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

  public void thread18475(int [] tdone, int [] ends){
        S2910=1;
    S2824=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread18474(int [] tdone, int [] ends){
        S2796=1;
    System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 82, column: 10
    S2086=0;
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
      switch(S3752){
        case 0 : 
          S3752=0;
          break RUN;
        
        case 1 : 
          S3752=2;
          S3752=2;
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 79, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 79, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 79, column: 2
          S3751=0;
          thread18474(tdone,ends);
          thread18475(tdone,ends);
          thread18476(tdone,ends);
          thread18477(tdone,ends);
          int biggest18481 = 0;
          if(ends[2]>=biggest18481){
            biggest18481=ends[2];
          }
          if(ends[5]>=biggest18481){
            biggest18481=ends[5];
          }
          if(ends[8]>=biggest18481){
            biggest18481=ends[8];
          }
          if(ends[9]>=biggest18481){
            biggest18481=ends[9];
          }
          if(biggest18481 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          if(biggest18481 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 79, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 79, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 79, column: 2
          switch(S3751){
            case 0 : 
              thread18482(tdone,ends);
              thread18489(tdone,ends);
              thread18496(tdone,ends);
              thread18497(tdone,ends);
              int biggest18501 = 0;
              if(ends[2]>=biggest18501){
                biggest18501=ends[2];
              }
              if(ends[5]>=biggest18501){
                biggest18501=ends[5];
              }
              if(ends[8]>=biggest18501){
                biggest18501=ends[8];
              }
              if(ends[9]>=biggest18501){
                biggest18501=ends[9];
              }
              if(biggest18501 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest18501 == 0){
                S3751=1;
                S3695=0;
                if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 146, column: 19
                  thread18502(tdone,ends);
                  thread18503(tdone,ends);
                  int biggest18504 = 0;
                  if(ends[12]>=biggest18504){
                    biggest18504=ends[12];
                  }
                  if(ends[13]>=biggest18504){
                    biggest18504=ends[13];
                  }
                  if(biggest18504 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S3695=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 1 : 
              switch(S3695){
                case 0 : 
                  thread18505(tdone,ends);
                  thread18506(tdone,ends);
                  int biggest18507 = 0;
                  if(ends[12]>=biggest18507){
                    biggest18507=ends[12];
                  }
                  if(ends[13]>=biggest18507){
                    biggest18507=ends[13];
                  }
                  if(biggest18507 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  if(biggest18507 == 2){
                    ends[1]=2;
                    ;//sysj\conveyor_controller.sysj line: 147, column: 11
                    S3695=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest18507 == 0){
                    S3695=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S3695=1;
                  S3695=0;
                  if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 146, column: 19
                    thread18508(tdone,ends);
                    thread18509(tdone,ends);
                    int biggest18510 = 0;
                    if(ends[12]>=biggest18510){
                      biggest18510=ends[12];
                    }
                    if(ends[13]>=biggest18510){
                      biggest18510=ends[13];
                    }
                    if(biggest18510 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S3695=1;
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
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
