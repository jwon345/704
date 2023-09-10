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
  public Signal bottleDeployed = new Signal("bottleDeployed", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  public Signal bottleDeployedE = new Signal("bottleDeployedE", Signal.OUTPUT);
  public Signal rotaryTableTriggerE = new Signal("rotaryTableTriggerE", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
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
  private Signal bottleLeftPos5_1;
  private Signal simF_19;
  private Signal simC_19;
  private Signal simFive_19;
  private Signal simThree_19;
  private Signal simOne_19;
  private long __start_thread_2;//sysj\conveyor_controller.sysj line: 101, column: 5
  private long __start_thread_7;//sysj\conveyor_controller.sysj line: 135, column: 5
  private long __start_thread_9;//sysj\conveyor_controller.sysj line: 151, column: 17
  private long __start_thread_11;//sysj\conveyor_controller.sysj line: 178, column: 5
  private long __start_thread_18;//sysj\conveyor_controller.sysj line: 213, column: 18
  private boolean[] q_thread_25;//sysj\conveyor_controller.sysj line: 20, column: 3
  private boolean o_thread_25;//sysj\conveyor_controller.sysj line: 22, column: 9
  private boolean c_thread_25;//sysj\conveyor_controller.sysj line: 22, column: 9
  private int S5819 = 1;
  private int S3044 = 1;
  private int S2296 = 1;
  private int S2196 = 1;
  private int S2195 = 1;
  private int S2243 = 1;
  private int S2198 = 1;
  private int S2205 = 1;
  private int S2200 = 1;
  private int S2303 = 1;
  private int S2298 = 1;
  private int S2342 = 1;
  private int S2392 = 1;
  private int S2375 = 1;
  private int S2370 = 1;
  private int S2395 = 1;
  private int S3638 = 1;
  private int S3046 = 1;
  private int S3084 = 1;
  private int S3104 = 1;
  private int S3099 = 1;
  private int S3709 = 1;
  private int S3661 = 1;
  private int S3645 = 1;
  private int S3640 = 1;
  private int S3843 = 1;
  private int S3753 = 1;
  private int S3987 = 1;
  private int S3911 = 1;
  private int S3865 = 1;
  private int S3849 = 1;
  private int S3852 = 1;
  private int S3985 = 1;
  private int S3935 = 1;
  private int S3916 = 1;
  private int S3932 = 1;
  private int S5817 = 1;
  private int S4225 = 1;
  private int S4039 = 1;
  private int S4001 = 1;
  private int S3996 = 1;
  private int S4457 = 1;
  private int S4271 = 1;
  private int S4233 = 1;
  private int S4228 = 1;
  private int S4689 = 1;
  private int S4503 = 1;
  private int S4465 = 1;
  private int S4460 = 1;
  private int S4921 = 1;
  private int S4735 = 1;
  private int S4697 = 1;
  private int S4692 = 1;
  private int S5153 = 1;
  private int S4967 = 1;
  private int S4929 = 1;
  private int S4924 = 1;
  private int S5815 = 1;
  private int S5175 = 1;
  private int S5154 = 1;
  private int S5162 = 1;
  
  private int[] ends = new int[77];
  private int[] tdone = new int[77];
  
  public void thread35352(int [] tdone, int [] ends){
        switch(S5815){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 44, column: 11
          if(q_thread_25[4]){//sysj\conveyor_controller.sysj line: 46, column: 5
            bottleLeftPos5_1.setPresent();//sysj\conveyor_controller.sysj line: 47, column: 12
            currsigs.addElement(bottleLeftPos5_1);
            for(int i_thread_25 = q_thread_25.length - 1; i_thread_25 > 0; i_thread_25 = i_thread_25 - 1) {//sysj\conveyor_controller.sysj line: 51, column: 36
              q_thread_25[i_thread_25] = q_thread_25[i_thread_25 - 1];//sysj\conveyor_controller.sysj line: 52, column: 6
            }
            if(insert_1.getprestatus()){//sysj\conveyor_controller.sysj line: 54, column: 13
              q_thread_25[0] = true;//sysj\conveyor_controller.sysj line: 55, column: 6
              S5175=0;
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
              o_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
              c_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
              System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
              for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
                if(q_thread_25[i_thread_25]) {//sysj\conveyor_controller.sysj line: 27, column: 6
                  o_thread_25 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
                }
                System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
              }
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
              if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
                simOne_19.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
                currsigs.addElement(simOne_19);
                simOne_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
                simF_19.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
                currsigs.addElement(simF_19);
                simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
                simThree_19.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
                currsigs.addElement(simThree_19);
                simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
                simC_19.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                currsigs.addElement(simC_19);
                simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
                simFive_19.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
                currsigs.addElement(simFive_19);
                simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
                S5154=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S5162=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S5162=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S5154=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S5162=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S5162=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
            }
            else {
              q_thread_25[0] = false;//sysj\conveyor_controller.sysj line: 57, column: 6
              S5175=0;
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
              o_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
              c_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
              System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
              for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
                if(q_thread_25[i_thread_25]) {//sysj\conveyor_controller.sysj line: 27, column: 6
                  o_thread_25 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
                }
                System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
              }
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
              if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
                simOne_19.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
                currsigs.addElement(simOne_19);
                simOne_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
                simF_19.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
                currsigs.addElement(simF_19);
                simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
                simThree_19.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
                currsigs.addElement(simThree_19);
                simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
                simC_19.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                currsigs.addElement(simC_19);
                simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
                simFive_19.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
                currsigs.addElement(simFive_19);
                simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
                S5154=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S5162=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S5162=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S5154=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S5162=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S5162=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
            }
          }
          else {
            for(int i_thread_25 = q_thread_25.length - 1; i_thread_25 > 0; i_thread_25 = i_thread_25 - 1) {//sysj\conveyor_controller.sysj line: 51, column: 36
              q_thread_25[i_thread_25] = q_thread_25[i_thread_25 - 1];//sysj\conveyor_controller.sysj line: 52, column: 6
            }
            if(insert_1.getprestatus()){//sysj\conveyor_controller.sysj line: 54, column: 13
              q_thread_25[0] = true;//sysj\conveyor_controller.sysj line: 55, column: 6
              S5175=0;
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
              o_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
              c_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
              System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
              for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
                if(q_thread_25[i_thread_25]) {//sysj\conveyor_controller.sysj line: 27, column: 6
                  o_thread_25 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
                }
                System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
              }
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
              if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
                simOne_19.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
                currsigs.addElement(simOne_19);
                simOne_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
                simF_19.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
                currsigs.addElement(simF_19);
                simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
                simThree_19.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
                currsigs.addElement(simThree_19);
                simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
                simC_19.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                currsigs.addElement(simC_19);
                simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
                simFive_19.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
                currsigs.addElement(simFive_19);
                simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
                S5154=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S5162=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S5162=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S5154=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S5162=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S5162=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
            }
            else {
              q_thread_25[0] = false;//sysj\conveyor_controller.sysj line: 57, column: 6
              S5175=0;
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
              o_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
              c_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
              System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
              for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
                if(q_thread_25[i_thread_25]) {//sysj\conveyor_controller.sysj line: 27, column: 6
                  o_thread_25 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
                }
                System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
              }
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
              if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
                simOne_19.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
                currsigs.addElement(simOne_19);
                simOne_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
                simF_19.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
                currsigs.addElement(simF_19);
                simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
                simThree_19.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
                currsigs.addElement(simThree_19);
                simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
                simC_19.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                currsigs.addElement(simC_19);
                simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
                simFive_19.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
                currsigs.addElement(simFive_19);
                simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
                S5154=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S5162=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S5162=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S5154=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S5162=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S5162=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
            }
          }
        }
        else {
          switch(S5175){
            case 0 : 
              if(insert_1.getprestatus()){//sysj\conveyor_controller.sysj line: 58, column: 12
                if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 59, column: 13
                  for(int i_thread_25 = q_thread_25.length - 1; i_thread_25 > 0; i_thread_25 = i_thread_25 - 1) {//sysj\conveyor_controller.sysj line: 60, column: 37
                    q_thread_25[i_thread_25] = q_thread_25[i_thread_25 - 1];//sysj\conveyor_controller.sysj line: 61, column: 7
                  }
                  q_thread_25[0] = true;//sysj\conveyor_controller.sysj line: 64, column: 5
                  S5175=0;
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
                  o_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
                  c_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
                  System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
                  for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
                    if(q_thread_25[i_thread_25]) {//sysj\conveyor_controller.sysj line: 27, column: 6
                      o_thread_25 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
                    }
                    System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
                  }
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
                  if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
                    simOne_19.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
                    currsigs.addElement(simOne_19);
                    simOne_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
                    simF_19.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
                    currsigs.addElement(simF_19);
                    simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
                    simThree_19.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
                    currsigs.addElement(simThree_19);
                    simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
                    simC_19.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                    currsigs.addElement(simC_19);
                    simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
                    simFive_19.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
                    currsigs.addElement(simFive_19);
                    simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
                    S5154=0;
                    if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S5162=0;
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                    else {
                      S5162=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                      currsigs.addElement(empty_1);
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                  }
                  else {
                    S5154=0;
                    if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S5162=0;
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                    else {
                      S5162=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                      currsigs.addElement(empty_1);
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                  }
                }
                else {
                  q_thread_25[0] = true;//sysj\conveyor_controller.sysj line: 64, column: 5
                  S5175=0;
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
                  o_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
                  c_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
                  System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
                  for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
                    if(q_thread_25[i_thread_25]) {//sysj\conveyor_controller.sysj line: 27, column: 6
                      o_thread_25 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
                    }
                    System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
                  }
                  System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
                  if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
                    simOne_19.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
                    currsigs.addElement(simOne_19);
                    simOne_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
                    simF_19.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
                    currsigs.addElement(simF_19);
                    simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
                    simThree_19.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
                    currsigs.addElement(simThree_19);
                    simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
                    simC_19.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                    currsigs.addElement(simC_19);
                    simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
                    simFive_19.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
                    currsigs.addElement(simFive_19);
                    simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
                    S5154=0;
                    if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S5162=0;
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                    else {
                      S5162=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                      currsigs.addElement(empty_1);
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                  }
                  else {
                    S5154=0;
                    if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S5162=0;
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                    else {
                      S5162=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                      currsigs.addElement(empty_1);
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                  }
                }
              }
              else {
                switch(S5154){
                  case 0 : 
                    switch(S5162){
                      case 0 : 
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                        break;
                      
                      case 1 : 
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                        currsigs.addElement(empty_1);
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    S5175=0;
                    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
                    o_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
                    c_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
                    System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
                    for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
                      if(q_thread_25[i_thread_25]) {//sysj\conveyor_controller.sysj line: 27, column: 6
                        o_thread_25 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
                      }
                      System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
                    }
                    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
                    if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
                      simOne_19.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
                      currsigs.addElement(simOne_19);
                      simOne_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
                      simF_19.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
                      currsigs.addElement(simF_19);
                      simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
                      simThree_19.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
                      currsigs.addElement(simThree_19);
                      simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
                      simC_19.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                      currsigs.addElement(simC_19);
                      simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
                      simFive_19.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
                      currsigs.addElement(simFive_19);
                      simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
                      S5154=0;
                      if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                        S5162=0;
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                      }
                      else {
                        S5162=1;
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                        currsigs.addElement(empty_1);
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                      }
                    }
                    else {
                      S5154=0;
                      if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                        S5162=0;
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                      }
                      else {
                        S5162=1;
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                        currsigs.addElement(empty_1);
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                      }
                    }
                    break;
                  
                }
              }
              break;
            
            case 1 : 
              S5175=0;
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
              o_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
              c_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
              System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
              for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
                if(q_thread_25[i_thread_25]) {//sysj\conveyor_controller.sysj line: 27, column: 6
                  o_thread_25 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
                }
                System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
              }
              System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
              if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
                simOne_19.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
                currsigs.addElement(simOne_19);
                simOne_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
                simF_19.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
                currsigs.addElement(simF_19);
                simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
                simThree_19.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
                currsigs.addElement(simThree_19);
                simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
                simC_19.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
                currsigs.addElement(simC_19);
                simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
                simFive_19.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
                currsigs.addElement(simFive_19);
                simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
                S5154=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S5162=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S5162=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S5154=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S5162=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S5162=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread35351(int [] tdone, int [] ends){
        switch(S5153){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S4967){
          case 0 : 
            if(simOne_19.getprestatus()){//sysj\conveyor_controller.sysj line: 16, column: 14
              S4967=1;
              S4929=0;
              if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 16, column: 29
                checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                S4929=1;
                active[24]=1;
                ends[24]=1;
                tdone[24]=1;
              }
              else {
                S4924=0;
                if(checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                  checkOne_o.setVal((simOne_19.getpreval() == null ? null : ((Boolean)simOne_19.getpreval())));//sysj\conveyor_controller.sysj line: 16, column: 29
                  S4924=1;
                  if(!checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                    checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                    ends[24]=2;
                    ;//sysj\conveyor_controller.sysj line: 16, column: 29
                    S4967=0;
                    active[24]=1;
                    ends[24]=1;
                    tdone[24]=1;
                  }
                  else {
                    active[24]=1;
                    ends[24]=1;
                    tdone[24]=1;
                  }
                }
                else {
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
              }
            }
            else {
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 1 : 
            switch(S4929){
              case 0 : 
                if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 16, column: 29
                  checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                  S4929=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  switch(S4924){
                    case 0 : 
                      if(checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                        checkOne_o.setVal((simOne_19.getpreval() == null ? null : ((Boolean)simOne_19.getpreval())));//sysj\conveyor_controller.sysj line: 16, column: 29
                        S4924=1;
                        if(!checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                          checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                          ends[24]=2;
                          ;//sysj\conveyor_controller.sysj line: 16, column: 29
                          S4967=0;
                          active[24]=1;
                          ends[24]=1;
                          tdone[24]=1;
                        }
                        else {
                          active[24]=1;
                          ends[24]=1;
                          tdone[24]=1;
                        }
                      }
                      else {
                        active[24]=1;
                        ends[24]=1;
                        tdone[24]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                        checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                        ends[24]=2;
                        ;//sysj\conveyor_controller.sysj line: 16, column: 29
                        S4967=0;
                        active[24]=1;
                        ends[24]=1;
                        tdone[24]=1;
                      }
                      else {
                        active[24]=1;
                        ends[24]=1;
                        tdone[24]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4929=1;
                S4929=0;
                if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 16, column: 29
                  checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                  S4929=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  S4924=0;
                  if(checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                    checkOne_o.setVal((simOne_19.getpreval() == null ? null : ((Boolean)simOne_19.getpreval())));//sysj\conveyor_controller.sysj line: 16, column: 29
                    S4924=1;
                    if(!checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                      checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                      ends[24]=2;
                      ;//sysj\conveyor_controller.sysj line: 16, column: 29
                      S4967=0;
                      active[24]=1;
                      ends[24]=1;
                      tdone[24]=1;
                    }
                    else {
                      active[24]=1;
                      ends[24]=1;
                      tdone[24]=1;
                    }
                  }
                  else {
                    active[24]=1;
                    ends[24]=1;
                    tdone[24]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35350(int [] tdone, int [] ends){
        switch(S4921){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S4735){
          case 0 : 
            if(simThree_19.getprestatus()){//sysj\conveyor_controller.sysj line: 14, column: 14
              S4735=1;
              S4697=0;
              if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 31
                checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                S4697=1;
                active[23]=1;
                ends[23]=1;
                tdone[23]=1;
              }
              else {
                S4692=0;
                if(checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                  checkThree_o.setVal((simThree_19.getpreval() == null ? null : ((Boolean)simThree_19.getpreval())));//sysj\conveyor_controller.sysj line: 14, column: 31
                  S4692=1;
                  if(!checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                    checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                    ends[23]=2;
                    ;//sysj\conveyor_controller.sysj line: 14, column: 31
                    S4735=0;
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                  else {
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                else {
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
              }
            }
            else {
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
          case 1 : 
            switch(S4697){
              case 0 : 
                if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 31
                  checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                  S4697=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  switch(S4692){
                    case 0 : 
                      if(checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                        checkThree_o.setVal((simThree_19.getpreval() == null ? null : ((Boolean)simThree_19.getpreval())));//sysj\conveyor_controller.sysj line: 14, column: 31
                        S4692=1;
                        if(!checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                          checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                          ends[23]=2;
                          ;//sysj\conveyor_controller.sysj line: 14, column: 31
                          S4735=0;
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                        else {
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                        checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                        ends[23]=2;
                        ;//sysj\conveyor_controller.sysj line: 14, column: 31
                        S4735=0;
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4697=1;
                S4697=0;
                if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 31
                  checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                  S4697=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  S4692=0;
                  if(checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                    checkThree_o.setVal((simThree_19.getpreval() == null ? null : ((Boolean)simThree_19.getpreval())));//sysj\conveyor_controller.sysj line: 14, column: 31
                    S4692=1;
                    if(!checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                      checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                      ends[23]=2;
                      ;//sysj\conveyor_controller.sysj line: 14, column: 31
                      S4735=0;
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                    else {
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                  }
                  else {
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35349(int [] tdone, int [] ends){
        switch(S4689){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S4503){
          case 0 : 
            if(simFive_19.getprestatus()){//sysj\conveyor_controller.sysj line: 12, column: 14
              S4503=1;
              S4465=0;
              if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 12, column: 30
                checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                S4465=1;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S4460=0;
                if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                  checkFive_o.setVal((simFive_19.getpreval() == null ? null : ((Boolean)simFive_19.getpreval())));//sysj\conveyor_controller.sysj line: 12, column: 30
                  S4460=1;
                  if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                    checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                    ends[22]=2;
                    ;//sysj\conveyor_controller.sysj line: 12, column: 30
                    S4503=0;
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                  else {
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                }
                else {
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
              }
            }
            else {
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
          case 1 : 
            switch(S4465){
              case 0 : 
                if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 12, column: 30
                  checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                  S4465=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  switch(S4460){
                    case 0 : 
                      if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                        checkFive_o.setVal((simFive_19.getpreval() == null ? null : ((Boolean)simFive_19.getpreval())));//sysj\conveyor_controller.sysj line: 12, column: 30
                        S4460=1;
                        if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                          checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                          ends[22]=2;
                          ;//sysj\conveyor_controller.sysj line: 12, column: 30
                          S4503=0;
                          active[22]=1;
                          ends[22]=1;
                          tdone[22]=1;
                        }
                        else {
                          active[22]=1;
                          ends[22]=1;
                          tdone[22]=1;
                        }
                      }
                      else {
                        active[22]=1;
                        ends[22]=1;
                        tdone[22]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                        checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                        ends[22]=2;
                        ;//sysj\conveyor_controller.sysj line: 12, column: 30
                        S4503=0;
                        active[22]=1;
                        ends[22]=1;
                        tdone[22]=1;
                      }
                      else {
                        active[22]=1;
                        ends[22]=1;
                        tdone[22]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4465=1;
                S4465=0;
                if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 12, column: 30
                  checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                  S4465=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  S4460=0;
                  if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                    checkFive_o.setVal((simFive_19.getpreval() == null ? null : ((Boolean)simFive_19.getpreval())));//sysj\conveyor_controller.sysj line: 12, column: 30
                    S4460=1;
                    if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                      checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                      ends[22]=2;
                      ;//sysj\conveyor_controller.sysj line: 12, column: 30
                      S4503=0;
                      active[22]=1;
                      ends[22]=1;
                      tdone[22]=1;
                    }
                    else {
                      active[22]=1;
                      ends[22]=1;
                      tdone[22]=1;
                    }
                  }
                  else {
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35348(int [] tdone, int [] ends){
        switch(S4457){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S4271){
          case 0 : 
            if(simC_19.getprestatus()){//sysj\conveyor_controller.sysj line: 10, column: 14
              S4271=1;
              S4233=0;
              if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 27
                simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                S4233=1;
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              else {
                S4228=0;
                if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                  simCapper_o.setVal((simC_19.getpreval() == null ? null : ((Boolean)simC_19.getpreval())));//sysj\conveyor_controller.sysj line: 10, column: 27
                  S4228=1;
                  if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                    simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                    ends[21]=2;
                    ;//sysj\conveyor_controller.sysj line: 10, column: 27
                    S4271=0;
                    active[21]=1;
                    ends[21]=1;
                    tdone[21]=1;
                  }
                  else {
                    active[21]=1;
                    ends[21]=1;
                    tdone[21]=1;
                  }
                }
                else {
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
              }
            }
            else {
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            switch(S4233){
              case 0 : 
                if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 27
                  simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                  S4233=1;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  switch(S4228){
                    case 0 : 
                      if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                        simCapper_o.setVal((simC_19.getpreval() == null ? null : ((Boolean)simC_19.getpreval())));//sysj\conveyor_controller.sysj line: 10, column: 27
                        S4228=1;
                        if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                          simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                          ends[21]=2;
                          ;//sysj\conveyor_controller.sysj line: 10, column: 27
                          S4271=0;
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                      }
                      else {
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                        simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                        ends[21]=2;
                        ;//sysj\conveyor_controller.sysj line: 10, column: 27
                        S4271=0;
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      else {
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4233=1;
                S4233=0;
                if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 27
                  simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                  S4233=1;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  S4228=0;
                  if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                    simCapper_o.setVal((simC_19.getpreval() == null ? null : ((Boolean)simC_19.getpreval())));//sysj\conveyor_controller.sysj line: 10, column: 27
                    S4228=1;
                    if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                      simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                      ends[21]=2;
                      ;//sysj\conveyor_controller.sysj line: 10, column: 27
                      S4271=0;
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    active[21]=1;
                    ends[21]=1;
                    tdone[21]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35347(int [] tdone, int [] ends){
        switch(S4225){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S4039){
          case 0 : 
            if(simF_19.getprestatus()){//sysj\conveyor_controller.sysj line: 8, column: 14
              S4039=1;
              S4001=0;
              if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 27
                simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                S4001=1;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                S3996=0;
                if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                  simFiller_o.setVal((simF_19.getpreval() == null ? null : ((Boolean)simF_19.getpreval())));//sysj\conveyor_controller.sysj line: 8, column: 27
                  S3996=1;
                  if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                    simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                    ends[20]=2;
                    ;//sysj\conveyor_controller.sysj line: 8, column: 27
                    S4039=0;
                    active[20]=1;
                    ends[20]=1;
                    tdone[20]=1;
                  }
                  else {
                    active[20]=1;
                    ends[20]=1;
                    tdone[20]=1;
                  }
                }
                else {
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
              }
            }
            else {
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 1 : 
            switch(S4001){
              case 0 : 
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                  S4001=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  switch(S3996){
                    case 0 : 
                      if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                        simFiller_o.setVal((simF_19.getpreval() == null ? null : ((Boolean)simF_19.getpreval())));//sysj\conveyor_controller.sysj line: 8, column: 27
                        S3996=1;
                        if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                          simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                          ends[20]=2;
                          ;//sysj\conveyor_controller.sysj line: 8, column: 27
                          S4039=0;
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                        else {
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                        simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                        ends[20]=2;
                        ;//sysj\conveyor_controller.sysj line: 8, column: 27
                        S4039=0;
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4001=1;
                S4001=0;
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                  S4001=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  S3996=0;
                  if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                    simFiller_o.setVal((simF_19.getpreval() == null ? null : ((Boolean)simF_19.getpreval())));//sysj\conveyor_controller.sysj line: 8, column: 27
                    S3996=1;
                    if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                      simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                      ends[20]=2;
                      ;//sysj\conveyor_controller.sysj line: 8, column: 27
                      S4039=0;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    active[20]=1;
                    ends[20]=1;
                    tdone[20]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35346(int [] tdone, int [] ends){
        switch(S5817){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        simF_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
        simC_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
        simFive_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
        simThree_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
        simOne_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
        thread35347(tdone,ends);
        thread35348(tdone,ends);
        thread35349(tdone,ends);
        thread35350(tdone,ends);
        thread35351(tdone,ends);
        thread35352(tdone,ends);
        int biggest35353 = 0;
        if(ends[20]>=biggest35353){
          biggest35353=ends[20];
        }
        if(ends[21]>=biggest35353){
          biggest35353=ends[21];
        }
        if(ends[22]>=biggest35353){
          biggest35353=ends[22];
        }
        if(ends[23]>=biggest35353){
          biggest35353=ends[23];
        }
        if(ends[24]>=biggest35353){
          biggest35353=ends[24];
        }
        if(ends[25]>=biggest35353){
          biggest35353=ends[25];
        }
        if(biggest35353 == 1){
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        //FINXME code
        if(biggest35353 == 0){
          S5817=0;
          active[19]=0;
          ends[19]=0;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread35343(int [] tdone, int [] ends){
        S3932=1;
    __start_thread_18 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 213, column: 18
    if(com.systemj.Timer.getMs() - __start_thread_18 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 213, column: 18
      ends[18]=3;
      ;//sysj\conveyor_controller.sysj line: 213, column: 18
      System.out.println("*Bottle Sent to Collection Point");//sysj\conveyor_controller.sysj line: 215, column: 22
      ends[18]=2;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread35342(int [] tdone, int [] ends){
        S3916=1;
    bottleLeftPos5E.setPresent();//sysj\conveyor_controller.sysj line: 211, column: 19
    currsigs.addElement(bottleLeftPos5E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread35340(int [] tdone, int [] ends){
        switch(S3932){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_18 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 213, column: 18
          ends[18]=3;
          ;//sysj\conveyor_controller.sysj line: 213, column: 18
          System.out.println("*Bottle Sent to Collection Point");//sysj\conveyor_controller.sysj line: 215, column: 22
          ends[18]=2;
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

  public void thread35339(int [] tdone, int [] ends){
        switch(S3916){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        bottleLeftPos5E.setPresent();//sysj\conveyor_controller.sysj line: 211, column: 19
        currsigs.addElement(bottleLeftPos5E);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread35338(int [] tdone, int [] ends){
        switch(S3985){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S3935){
          case 0 : 
            thread35339(tdone,ends);
            thread35340(tdone,ends);
            int biggest35341 = 0;
            if(ends[17]>=biggest35341){
              biggest35341=ends[17];
            }
            if(ends[18]>=biggest35341){
              biggest35341=ends[18];
            }
            if(biggest35341 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            if(biggest35341 == 2){
              ends[16]=2;
              ;//sysj\conveyor_controller.sysj line: 210, column: 11
              S3935=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest35341 == 0){
              S3935=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            S3935=1;
            S3935=0;
            if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor_controller.sysj line: 209, column: 19
              thread35342(tdone,ends);
              thread35343(tdone,ends);
              int biggest35344 = 0;
              if(ends[17]>=biggest35344){
                biggest35344=ends[17];
              }
              if(ends[18]>=biggest35344){
                biggest35344=ends[18];
              }
              if(biggest35344 == 1){
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              if(biggest35344 == 2){
                ends[16]=2;
                ;//sysj\conveyor_controller.sysj line: 210, column: 11
                S3935=1;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
            }
            else {
              S3935=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35336(int [] tdone, int [] ends){
        switch(S3852){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 198, column: 28
          ends[15]=2;
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

  public void thread35335(int [] tdone, int [] ends){
        switch(S3849){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 194, column: 22
        currsigs.addElement(bottleDeployedE);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread35333(int [] tdone, int [] ends){
        S3852=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread35332(int [] tdone, int [] ends){
        S3849=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 194, column: 22
    currsigs.addElement(bottleDeployedE);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread35331(int [] tdone, int [] ends){
        switch(S3911){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S3865){
          case 0 : 
            if(!bottleLeftPos5E.getprestatus()){//sysj\conveyor_controller.sysj line: 190, column: 18
              S3865=1;
              if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 191, column: 19
                thread35332(tdone,ends);
                thread35333(tdone,ends);
                int biggest35334 = 0;
                if(ends[14]>=biggest35334){
                  biggest35334=ends[14];
                }
                if(ends[15]>=biggest35334){
                  biggest35334=ends[15];
                }
                if(biggest35334 == 1){
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
              else {
                S3865=2;
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
            thread35335(tdone,ends);
            thread35336(tdone,ends);
            int biggest35337 = 0;
            if(ends[14]>=biggest35337){
              biggest35337=ends[14];
            }
            if(ends[15]>=biggest35337){
              biggest35337=ends[15];
            }
            if(biggest35337 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            if(biggest35337 == 2){
              ends[13]=2;
              ;//sysj\conveyor_controller.sysj line: 192, column: 11
              S3865=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            //FINXME code
            if(biggest35337 == 0){
              S3865=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 2 : 
            S3865=2;
            S3865=0;
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread35330(int [] tdone, int [] ends){
        switch(S3987){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        thread35331(tdone,ends);
        thread35338(tdone,ends);
        int biggest35345 = 0;
        if(ends[13]>=biggest35345){
          biggest35345=ends[13];
        }
        if(ends[16]>=biggest35345){
          biggest35345=ends[16];
        }
        if(biggest35345 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        //FINXME code
        if(biggest35345 == 0){
          S3987=0;
          active[12]=0;
          ends[12]=0;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread35329(int [] tdone, int [] ends){
        switch(S3843){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S3753){
          case 0 : 
            if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor_controller.sysj line: 180, column: 23
              S3753=1;
              __start_thread_11 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 178, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_11 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 178, column: 5
                ends[11]=2;
                ;//sysj\conveyor_controller.sysj line: 178, column: 5
                S3753=2;
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
            if(com.systemj.Timer.getMs() - __start_thread_11 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 178, column: 5
              ends[11]=2;
              ;//sysj\conveyor_controller.sysj line: 178, column: 5
              S3753=2;
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
          
          case 2 : 
            S3753=2;
            System.out.println("*Bottle Left From Position 5 Of The Index Table, Still On The Conveyor");//sysj\conveyor_controller.sysj line: 183, column: 7
            S3753=0;
            if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor_controller.sysj line: 180, column: 23
              S3753=1;
              __start_thread_11 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 178, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_11 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 178, column: 5
                ends[11]=2;
                ;//sysj\conveyor_controller.sysj line: 178, column: 5
                S3753=2;
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
          
        }
        break;
      
    }
  }

  public void thread35328(int [] tdone, int [] ends){
        switch(S3709){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S3661){
          case 0 : 
            switch(S3645){
              case 0 : 
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 168, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
                  S3645=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S3640){
                    case 0 : 
                      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
                        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 168, column: 4
                        S3640=1;
                        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
                          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
                          ends[10]=2;
                          ;//sysj\conveyor_controller.sysj line: 168, column: 4
                          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 169, column: 4
                          currsigs.addElement(rotaryRotated_1);
                          rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 170, column: 6
                          currsigs.addElement(rotaryTableTriggerE);
                          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 171, column: 4
                          S3661=1;
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
                      if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
                        rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
                        ends[10]=2;
                        ;//sysj\conveyor_controller.sysj line: 168, column: 4
                        rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 169, column: 4
                        currsigs.addElement(rotaryRotated_1);
                        rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 170, column: 6
                        currsigs.addElement(rotaryTableTriggerE);
                        System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 171, column: 4
                        S3661=1;
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
                S3645=1;
                S3645=0;
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 168, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
                  S3645=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S3640=0;
                  if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
                    rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 168, column: 4
                    S3640=1;
                    if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
                      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
                      ends[10]=2;
                      ;//sysj\conveyor_controller.sysj line: 168, column: 4
                      rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 169, column: 4
                      currsigs.addElement(rotaryRotated_1);
                      rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 170, column: 6
                      currsigs.addElement(rotaryTableTriggerE);
                      System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 171, column: 4
                      S3661=1;
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
            S3661=1;
            S3661=0;
            S3645=0;
            if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 168, column: 4
              rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
              S3645=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S3640=0;
              if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
                rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 168, column: 4
                S3640=1;
                if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
                  ends[10]=2;
                  ;//sysj\conveyor_controller.sysj line: 168, column: 4
                  rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 169, column: 4
                  currsigs.addElement(rotaryRotated_1);
                  rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 170, column: 6
                  currsigs.addElement(rotaryTableTriggerE);
                  System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 171, column: 4
                  S3661=1;
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

  public void thread35326(int [] tdone, int [] ends){
        switch(S3104){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S3099){
          case 0 : 
            if(com.systemj.Timer.getMs() - __start_thread_9 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 151, column: 17
              ends[9]=3;
              ;//sysj\conveyor_controller.sysj line: 151, column: 17
              System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 153, column: 21
              S3099=1;
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
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 154, column: 27
              System.out.println("*Conveyor - Bottle Reached Pos1*");//sysj\conveyor_controller.sysj line: 155, column: 21
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

  public void thread35325(int [] tdone, int [] ends){
        switch(S3084){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 148, column: 21
        currsigs.addElement(motConveyorOnOff);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread35323(int [] tdone, int [] ends){
        S3104=1;
    S3099=0;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 151, column: 17
    if(com.systemj.Timer.getMs() - __start_thread_9 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 151, column: 17
      ends[9]=3;
      ;//sysj\conveyor_controller.sysj line: 151, column: 17
      System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 153, column: 21
      S3099=1;
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

  public void thread35322(int [] tdone, int [] ends){
        S3084=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor_controller.sysj line: 147, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 148, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread35320(int [] tdone, int [] ends){
        S3104=1;
    S3099=0;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 151, column: 17
    if(com.systemj.Timer.getMs() - __start_thread_9 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 151, column: 17
      ends[9]=3;
      ;//sysj\conveyor_controller.sysj line: 151, column: 17
      System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 153, column: 21
      S3099=1;
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

  public void thread35319(int [] tdone, int [] ends){
        S3084=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor_controller.sysj line: 147, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 148, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread35318(int [] tdone, int [] ends){
        switch(S3638){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S3046){
          case 0 : 
            if(!bottleLeftPos5E.getprestatus()){//sysj\conveyor_controller.sysj line: 138, column: 18
              S3046=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S3046=1;
            S3046=2;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
          case 2 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 140, column: 19
              S3046=3;
              __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 135, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 135, column: 5
                ends[7]=2;
                ;//sysj\conveyor_controller.sysj line: 135, column: 5
                S3046=4;
                thread35319(tdone,ends);
                thread35320(tdone,ends);
                int biggest35321 = 0;
                if(ends[8]>=biggest35321){
                  biggest35321=ends[8];
                }
                if(ends[9]>=biggest35321){
                  biggest35321=ends[9];
                }
                if(biggest35321 == 1){
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
          
          case 3 : 
            if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 135, column: 5
              ends[7]=2;
              ;//sysj\conveyor_controller.sysj line: 135, column: 5
              S3046=4;
              thread35322(tdone,ends);
              thread35323(tdone,ends);
              int biggest35324 = 0;
              if(ends[8]>=biggest35324){
                biggest35324=ends[8];
              }
              if(ends[9]>=biggest35324){
                biggest35324=ends[9];
              }
              if(biggest35324 == 1){
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
          
          case 4 : 
            thread35325(tdone,ends);
            thread35326(tdone,ends);
            int biggest35327 = 0;
            if(ends[8]>=biggest35327){
              biggest35327=ends[8];
            }
            if(ends[9]>=biggest35327){
              biggest35327=ends[9];
            }
            if(biggest35327 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest35327 == 2){
              ends[7]=2;
              ;//sysj\conveyor_controller.sysj line: 145, column: 13
              S3046=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest35327 == 0){
              S3046=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35316(int [] tdone, int [] ends){
        S2243=1;
    S2198=0;
    if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 113, column: 34
      S2198=1;
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

  public void thread35315(int [] tdone, int [] ends){
        S2196=1;
    S2195=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread35313(int [] tdone, int [] ends){
        switch(S2395){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 128, column: 20
          S2395=0;
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

  public void thread35312(int [] tdone, int [] ends){
        switch(S2392){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2375){
          case 0 : 
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 126, column: 14
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
              S2375=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S2370){
                case 0 : 
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
                    convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 126, column: 14
                    S2370=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
                      ends[5]=2;
                      ;//sysj\conveyor_controller.sysj line: 126, column: 14
                      S2392=0;
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
                  if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
                    convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
                    ends[5]=2;
                    ;//sysj\conveyor_controller.sysj line: 126, column: 14
                    S2392=0;
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
            S2375=1;
            S2375=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 126, column: 14
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
              S2375=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S2370=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
                convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 126, column: 14
                S2370=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
                  ends[5]=2;
                  ;//sysj\conveyor_controller.sysj line: 126, column: 14
                  S2392=0;
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

  public void thread35310(int [] tdone, int [] ends){
        S2395=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread35309(int [] tdone, int [] ends){
        S2392=1;
    S2375=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 126, column: 14
      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
      S2375=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S2370=0;
      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 126, column: 14
        S2370=1;
        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
          ends[5]=2;
          ;//sysj\conveyor_controller.sysj line: 126, column: 14
          S2392=0;
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

  public void thread35307(int [] tdone, int [] ends){
        S2395=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread35306(int [] tdone, int [] ends){
        S2392=1;
    S2375=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 126, column: 14
      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
      S2375=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S2370=0;
      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 126, column: 14
        S2370=1;
        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
          ends[5]=2;
          ;//sysj\conveyor_controller.sysj line: 126, column: 14
          S2392=0;
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

  public void thread35304(int [] tdone, int [] ends){
        S2395=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread35303(int [] tdone, int [] ends){
        S2392=1;
    S2375=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 126, column: 14
      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
      S2375=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S2370=0;
      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 126, column: 14
        S2370=1;
        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
          ends[5]=2;
          ;//sysj\conveyor_controller.sysj line: 126, column: 14
          S2392=0;
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

  public void thread35301(int [] tdone, int [] ends){
        switch(S2243){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2198){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 113, column: 34
              S2198=1;
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
            S2198=1;
            S2198=2;
            S2205=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 115, column: 18
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 18
              S2205=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2200=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 18
                convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 115, column: 18
                S2200=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 18
                  ends[4]=2;
                  ;//sysj\conveyor_controller.sysj line: 115, column: 18
                  System.out.println("*Empty...*");//sysj\conveyor_controller.sysj line: 116, column: 18
                  S2243=0;
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
            switch(S2205){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 115, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 18
                  S2205=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S2200){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 18
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 115, column: 18
                        S2200=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 18
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 18
                          ends[4]=2;
                          ;//sysj\conveyor_controller.sysj line: 115, column: 18
                          System.out.println("*Empty...*");//sysj\conveyor_controller.sysj line: 116, column: 18
                          S2243=0;
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
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 18
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 18
                        ends[4]=2;
                        ;//sysj\conveyor_controller.sysj line: 115, column: 18
                        System.out.println("*Empty...*");//sysj\conveyor_controller.sysj line: 116, column: 18
                        S2243=0;
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
                S2205=1;
                S2205=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 115, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 18
                  S2205=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S2200=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 18
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 115, column: 18
                    S2200=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 18
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 18
                      ends[4]=2;
                      ;//sysj\conveyor_controller.sysj line: 115, column: 18
                      System.out.println("*Empty...*");//sysj\conveyor_controller.sysj line: 116, column: 18
                      S2243=0;
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

  public void thread35300(int [] tdone, int [] ends){
        switch(S2196){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2195){
          case 0 : 
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 107, column: 27
              S2195=1;
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
            S2195=1;
            convReady_o.setPreempted();//sysj\conveyor_controller.sysj line: 109, column: 21
            ends[3]=2;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread35299(int [] tdone, int [] ends){
        switch(S3044){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2296){
          case 0 : 
            thread35300(tdone,ends);
            thread35301(tdone,ends);
            int biggest35302 = 0;
            if(ends[3]>=biggest35302){
              biggest35302=ends[3];
            }
            if(ends[4]>=biggest35302){
              biggest35302=ends[4];
            }
            if(biggest35302 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest35302 == 2){
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 105, column: 13
              S2296=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest35302 == 0){
              S2296=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S2296=1;
            insert_1.setPresent();//sysj\conveyor_controller.sysj line: 120, column: 13
            currsigs.addElement(insert_1);
            S2296=2;
            S2303=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 121, column: 13
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 121, column: 13
              S2303=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2298=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 121, column: 13
                convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 121, column: 13
                S2298=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 121, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 121, column: 13
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 121, column: 13
                  S2296=3;
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
            switch(S2303){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 121, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 121, column: 13
                  S2303=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S2298){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 121, column: 13
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 121, column: 13
                        S2298=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 121, column: 13
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 121, column: 13
                          ends[2]=2;
                          ;//sysj\conveyor_controller.sysj line: 121, column: 13
                          S2296=3;
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
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 121, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 121, column: 13
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 121, column: 13
                        S2296=3;
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
                S2303=1;
                S2303=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 121, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 121, column: 13
                  S2303=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2298=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 121, column: 13
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 121, column: 13
                    S2298=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 121, column: 13
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 121, column: 13
                      ends[2]=2;
                      ;//sysj\conveyor_controller.sysj line: 121, column: 13
                      S2296=3;
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
            S2296=3;
            S2296=4;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 101, column: 5
            S2342=0;
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 101, column: 5
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 101, column: 5
              S2296=5;
              thread35303(tdone,ends);
              thread35304(tdone,ends);
              int biggest35305 = 0;
              if(ends[5]>=biggest35305){
                biggest35305=ends[5];
              }
              if(ends[6]>=biggest35305){
                biggest35305=ends[6];
              }
              if(biggest35305 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S2342=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            switch(S2342){
              case 0 : 
                S2342=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 101, column: 5
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 101, column: 5
                  S2296=5;
                  thread35306(tdone,ends);
                  thread35307(tdone,ends);
                  int biggest35308 = 0;
                  if(ends[5]>=biggest35308){
                    biggest35308=ends[5];
                  }
                  if(ends[6]>=biggest35308){
                    biggest35308=ends[6];
                  }
                  if(biggest35308 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S2342=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S2342=1;
                S2342=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 101, column: 5
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 101, column: 5
                  S2296=5;
                  thread35309(tdone,ends);
                  thread35310(tdone,ends);
                  int biggest35311 = 0;
                  if(ends[5]>=biggest35311){
                    biggest35311=ends[5];
                  }
                  if(ends[6]>=biggest35311){
                    biggest35311=ends[6];
                  }
                  if(biggest35311 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S2342=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 5 : 
            thread35312(tdone,ends);
            thread35313(tdone,ends);
            int biggest35314 = 0;
            if(ends[5]>=biggest35314){
              biggest35314=ends[5];
            }
            if(ends[6]>=biggest35314){
              biggest35314=ends[6];
            }
            if(biggest35314 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest35314 == 0){
              S2296=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            S2296=6;
            System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 103, column: 10
            S2296=0;
            thread35315(tdone,ends);
            thread35316(tdone,ends);
            int biggest35317 = 0;
            if(ends[3]>=biggest35317){
              biggest35317=ends[3];
            }
            if(ends[4]>=biggest35317){
              biggest35317=ends[4];
            }
            if(biggest35317 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35296(int [] tdone, int [] ends){
        S5815=1;
    q_thread_25 = new boolean[5];//sysj\conveyor_controller.sysj line: 20, column: 3
    S5175=0;
    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 23, column: 5
    o_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
    c_thread_25 = false;//sysj\conveyor_controller.sysj line: 22, column: 9
    System.out.print("* Current bottle's locations :");//sysj\conveyor_controller.sysj line: 25, column: 5
    for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor_controller.sysj line: 26, column: 34
      if(q_thread_25[i_thread_25]) {//sysj\conveyor_controller.sysj line: 27, column: 6
        o_thread_25 = true;//sysj\conveyor_controller.sysj line: 28, column: 7
      }
      System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor_controller.sysj line: 29, column: 6
    }
    System.out.println("\n-------------------------");//sysj\conveyor_controller.sysj line: 31, column: 5
    if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 33, column: 13
      simOne_19.setPresent();//sysj\conveyor_controller.sysj line: 34, column: 6
      currsigs.addElement(simOne_19);
      simOne_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 34, column: 6
      simF_19.setPresent();//sysj\conveyor_controller.sysj line: 35, column: 6
      currsigs.addElement(simF_19);
      simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 35, column: 6
      simThree_19.setPresent();//sysj\conveyor_controller.sysj line: 36, column: 6
      currsigs.addElement(simThree_19);
      simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 36, column: 6
      simC_19.setPresent();//sysj\conveyor_controller.sysj line: 37, column: 6
      currsigs.addElement(simC_19);
      simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 37, column: 6
      simFive_19.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 6
      currsigs.addElement(simFive_19);
      simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 6
      S5154=0;
      if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
        S5162=0;
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
      else {
        S5162=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
        currsigs.addElement(empty_1);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
    else {
      S5154=0;
      if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
        S5162=0;
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
      else {
        S5162=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
        currsigs.addElement(empty_1);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
  }

  public void thread35295(int [] tdone, int [] ends){
        S5153=1;
    S4967=0;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread35294(int [] tdone, int [] ends){
        S4921=1;
    S4735=0;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread35293(int [] tdone, int [] ends){
        S4689=1;
    S4503=0;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread35292(int [] tdone, int [] ends){
        S4457=1;
    S4271=0;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread35291(int [] tdone, int [] ends){
        S4225=1;
    S4039=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread35290(int [] tdone, int [] ends){
        S5817=1;
    simF_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simC_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simFive_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simThree_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simOne_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    thread35291(tdone,ends);
    thread35292(tdone,ends);
    thread35293(tdone,ends);
    thread35294(tdone,ends);
    thread35295(tdone,ends);
    thread35296(tdone,ends);
    int biggest35297 = 0;
    if(ends[20]>=biggest35297){
      biggest35297=ends[20];
    }
    if(ends[21]>=biggest35297){
      biggest35297=ends[21];
    }
    if(ends[22]>=biggest35297){
      biggest35297=ends[22];
    }
    if(ends[23]>=biggest35297){
      biggest35297=ends[23];
    }
    if(ends[24]>=biggest35297){
      biggest35297=ends[24];
    }
    if(ends[25]>=biggest35297){
      biggest35297=ends[25];
    }
    if(biggest35297 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread35287(int [] tdone, int [] ends){
        S3932=1;
    __start_thread_18 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 213, column: 18
    if(com.systemj.Timer.getMs() - __start_thread_18 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 213, column: 18
      ends[18]=3;
      ;//sysj\conveyor_controller.sysj line: 213, column: 18
      System.out.println("*Bottle Sent to Collection Point");//sysj\conveyor_controller.sysj line: 215, column: 22
      ends[18]=2;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread35286(int [] tdone, int [] ends){
        S3916=1;
    bottleLeftPos5E.setPresent();//sysj\conveyor_controller.sysj line: 211, column: 19
    currsigs.addElement(bottleLeftPos5E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread35285(int [] tdone, int [] ends){
        S3985=1;
    S3935=0;
    if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor_controller.sysj line: 209, column: 19
      thread35286(tdone,ends);
      thread35287(tdone,ends);
      int biggest35288 = 0;
      if(ends[17]>=biggest35288){
        biggest35288=ends[17];
      }
      if(ends[18]>=biggest35288){
        biggest35288=ends[18];
      }
      if(biggest35288 == 1){
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
      if(biggest35288 == 2){
        ends[16]=2;
        ;//sysj\conveyor_controller.sysj line: 210, column: 11
        S3935=1;
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
    }
    else {
      S3935=1;
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread35284(int [] tdone, int [] ends){
        S3911=1;
    S3865=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread35283(int [] tdone, int [] ends){
        S3987=1;
    thread35284(tdone,ends);
    thread35285(tdone,ends);
    int biggest35289 = 0;
    if(ends[13]>=biggest35289){
      biggest35289=ends[13];
    }
    if(ends[16]>=biggest35289){
      biggest35289=ends[16];
    }
    if(biggest35289 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread35282(int [] tdone, int [] ends){
        S3843=1;
    S3753=0;
    if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor_controller.sysj line: 180, column: 23
      S3753=1;
      __start_thread_11 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 178, column: 5
      if(com.systemj.Timer.getMs() - __start_thread_11 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 178, column: 5
        ends[11]=2;
        ;//sysj\conveyor_controller.sysj line: 178, column: 5
        S3753=2;
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

  public void thread35281(int [] tdone, int [] ends){
        S3709=1;
    S3661=0;
    S3645=0;
    if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 168, column: 4
      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
      S3645=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S3640=0;
      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 168, column: 4
        S3640=1;
        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
          ends[10]=2;
          ;//sysj\conveyor_controller.sysj line: 168, column: 4
          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 169, column: 4
          currsigs.addElement(rotaryRotated_1);
          rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 170, column: 6
          currsigs.addElement(rotaryTableTriggerE);
          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 171, column: 4
          S3661=1;
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

  public void thread35280(int [] tdone, int [] ends){
        S3638=1;
    S3046=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread35278(int [] tdone, int [] ends){
        S2243=1;
    S2198=0;
    if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 113, column: 34
      S2198=1;
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

  public void thread35277(int [] tdone, int [] ends){
        S2196=1;
    S2195=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread35276(int [] tdone, int [] ends){
        S3044=1;
    System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 103, column: 10
    S2296=0;
    thread35277(tdone,ends);
    thread35278(tdone,ends);
    int biggest35279 = 0;
    if(ends[3]>=biggest35279){
      biggest35279=ends[3];
    }
    if(ends[4]>=biggest35279){
      biggest35279=ends[4];
    }
    if(biggest35279 == 1){
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
      switch(S5819){
        case 0 : 
          S5819=0;
          break RUN;
        
        case 1 : 
          S5819=2;
          S5819=2;
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          bottleLeftPos5_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          thread35276(tdone,ends);
          thread35280(tdone,ends);
          thread35281(tdone,ends);
          thread35282(tdone,ends);
          thread35283(tdone,ends);
          thread35290(tdone,ends);
          int biggest35298 = 0;
          if(ends[2]>=biggest35298){
            biggest35298=ends[2];
          }
          if(ends[7]>=biggest35298){
            biggest35298=ends[7];
          }
          if(ends[10]>=biggest35298){
            biggest35298=ends[10];
          }
          if(ends[11]>=biggest35298){
            biggest35298=ends[11];
          }
          if(ends[12]>=biggest35298){
            biggest35298=ends[12];
          }
          if(ends[19]>=biggest35298){
            biggest35298=ends[19];
          }
          if(biggest35298 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          if(biggest35298 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          bottleLeftPos5_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          thread35299(tdone,ends);
          thread35318(tdone,ends);
          thread35328(tdone,ends);
          thread35329(tdone,ends);
          thread35330(tdone,ends);
          thread35346(tdone,ends);
          int biggest35354 = 0;
          if(ends[2]>=biggest35354){
            biggest35354=ends[2];
          }
          if(ends[7]>=biggest35354){
            biggest35354=ends[7];
          }
          if(ends[10]>=biggest35354){
            biggest35354=ends[10];
          }
          if(ends[11]>=biggest35354){
            biggest35354=ends[11];
          }
          if(ends[12]>=biggest35354){
            biggest35354=ends[12];
          }
          if(ends[19]>=biggest35354){
            biggest35354=ends[19];
          }
          if(biggest35354 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest35354 == 0){
            S5819=0;
            active[1]=0;
            ends[1]=0;
            S5819=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    rotaryRotated_1 = new Signal();
    empty_1 = new Signal();
    insert_1 = new Signal();
    bottleLeftPos5_1 = new Signal();
    simF_19 = new Signal();
    simC_19 = new Signal();
    simFive_19 = new Signal();
    simThree_19 = new Signal();
    simOne_19 = new Signal();
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
          bottleDeployed.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1.setpreclear();
      bottleDeployed.setpreclear();
      motConveyorOnOff.setpreclear();
      bottleDeployedE.setpreclear();
      rotaryTableTriggerE.setpreclear();
      bottleLeftPos5E.setpreclear();
      rotaryRotated_1.setpreclear();
      empty_1.setpreclear();
      insert_1.setpreclear();
      bottleLeftPos5_1.setpreclear();
      simF_19.setpreclear();
      simC_19.setpreclear();
      simFive_19.setpreclear();
      simThree_19.setpreclear();
      simOne_19.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleDeployed.getStatus() ? bottleDeployed.setprepresent() : bottleDeployed.setpreclear();
      bottleDeployed.setpreval(bottleDeployed.getValue());
      bottleDeployed.setClear();
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      bottleDeployedE.sethook();
      bottleDeployedE.setClear();
      rotaryTableTriggerE.sethook();
      rotaryTableTriggerE.setClear();
      bottleLeftPos5E.sethook();
      bottleLeftPos5E.setClear();
      rotaryRotated_1.setClear();
      empty_1.setClear();
      insert_1.setClear();
      bottleLeftPos5_1.setClear();
      simF_19.setClear();
      simC_19.setClear();
      simFive_19.setClear();
      simThree_19.setClear();
      simOne_19.setClear();
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
