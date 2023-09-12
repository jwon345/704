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
  private int S3629 = 1;
  private int S854 = 1;
  private int S106 = 1;
  private int S6 = 1;
  private int S5 = 1;
  private int S53 = 1;
  private int S8 = 1;
  private int S15 = 1;
  private int S10 = 1;
  private int S113 = 1;
  private int S108 = 1;
  private int S152 = 1;
  private int S202 = 1;
  private int S185 = 1;
  private int S180 = 1;
  private int S205 = 1;
  private int S1448 = 1;
  private int S856 = 1;
  private int S894 = 1;
  private int S914 = 1;
  private int S909 = 1;
  private int S1519 = 1;
  private int S1471 = 1;
  private int S1455 = 1;
  private int S1450 = 1;
  private int S1653 = 1;
  private int S1563 = 1;
  private int S1797 = 1;
  private int S1721 = 1;
  private int S1675 = 1;
  private int S1659 = 1;
  private int S1662 = 1;
  private int S1795 = 1;
  private int S1745 = 1;
  private int S1726 = 1;
  private int S1742 = 1;
  private int S3627 = 1;
  private int S2035 = 1;
  private int S1849 = 1;
  private int S1811 = 1;
  private int S1806 = 1;
  private int S2267 = 1;
  private int S2081 = 1;
  private int S2043 = 1;
  private int S2038 = 1;
  private int S2499 = 1;
  private int S2313 = 1;
  private int S2275 = 1;
  private int S2270 = 1;
  private int S2731 = 1;
  private int S2545 = 1;
  private int S2507 = 1;
  private int S2502 = 1;
  private int S2963 = 1;
  private int S2777 = 1;
  private int S2739 = 1;
  private int S2734 = 1;
  private int S3625 = 1;
  private int S2985 = 1;
  private int S2964 = 1;
  private int S2972 = 1;
  
  private int[] ends = new int[88];
  private int[] tdone = new int[88];
  
  public void thread100880(int [] tdone, int [] ends){
        switch(S3625){
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
              S2985=0;
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
                S2964=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S2972=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S2972=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S2964=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S2972=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S2972=1;
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
              S2985=0;
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
                S2964=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S2972=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S2972=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S2964=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S2972=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S2972=1;
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
              S2985=0;
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
                S2964=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S2972=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S2972=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S2964=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S2972=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S2972=1;
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
              S2985=0;
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
                S2964=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S2972=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S2972=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S2964=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S2972=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S2972=1;
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
          switch(S2985){
            case 0 : 
              if(insert_1.getprestatus()){//sysj\conveyor_controller.sysj line: 58, column: 12
                if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 59, column: 13
                  for(int i_thread_25 = q_thread_25.length - 1; i_thread_25 > 0; i_thread_25 = i_thread_25 - 1) {//sysj\conveyor_controller.sysj line: 60, column: 37
                    q_thread_25[i_thread_25] = q_thread_25[i_thread_25 - 1];//sysj\conveyor_controller.sysj line: 61, column: 7
                  }
                  q_thread_25[0] = true;//sysj\conveyor_controller.sysj line: 64, column: 5
                  S2985=0;
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
                    S2964=0;
                    if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S2972=0;
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                    else {
                      S2972=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                      currsigs.addElement(empty_1);
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                  }
                  else {
                    S2964=0;
                    if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S2972=0;
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                    else {
                      S2972=1;
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
                  S2985=0;
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
                    S2964=0;
                    if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S2972=0;
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                    else {
                      S2972=1;
                      empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                      currsigs.addElement(empty_1);
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                  }
                  else {
                    S2964=0;
                    if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                      S2972=0;
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                    else {
                      S2972=1;
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
                switch(S2964){
                  case 0 : 
                    switch(S2972){
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
                    S2985=0;
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
                      S2964=0;
                      if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                        S2972=0;
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                      }
                      else {
                        S2972=1;
                        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                        currsigs.addElement(empty_1);
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                      }
                    }
                    else {
                      S2964=0;
                      if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                        S2972=0;
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                      }
                      else {
                        S2972=1;
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
              S2985=0;
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
                S2964=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S2972=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S2972=1;
                  empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S2964=0;
                if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
                  S2972=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S2972=1;
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

  public void thread100879(int [] tdone, int [] ends){
        switch(S2963){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S2777){
          case 0 : 
            if(simOne_19.getprestatus()){//sysj\conveyor_controller.sysj line: 16, column: 14
              S2777=1;
              S2739=0;
              if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 16, column: 29
                checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                S2739=1;
                active[24]=1;
                ends[24]=1;
                tdone[24]=1;
              }
              else {
                S2734=0;
                if(checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                  checkOne_o.setVal((simOne_19.getpreval() == null ? null : ((Boolean)simOne_19.getpreval())));//sysj\conveyor_controller.sysj line: 16, column: 29
                  S2734=1;
                  if(!checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                    checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                    ends[24]=2;
                    ;//sysj\conveyor_controller.sysj line: 16, column: 29
                    S2777=0;
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
            switch(S2739){
              case 0 : 
                if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 16, column: 29
                  checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                  S2739=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  switch(S2734){
                    case 0 : 
                      if(checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                        checkOne_o.setVal((simOne_19.getpreval() == null ? null : ((Boolean)simOne_19.getpreval())));//sysj\conveyor_controller.sysj line: 16, column: 29
                        S2734=1;
                        if(!checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                          checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                          ends[24]=2;
                          ;//sysj\conveyor_controller.sysj line: 16, column: 29
                          S2777=0;
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
                        S2777=0;
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
                S2739=1;
                S2739=0;
                if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 16, column: 29
                  checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                  S2739=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  S2734=0;
                  if(checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                    checkOne_o.setVal((simOne_19.getpreval() == null ? null : ((Boolean)simOne_19.getpreval())));//sysj\conveyor_controller.sysj line: 16, column: 29
                    S2734=1;
                    if(!checkOne_o.isACK()){//sysj\conveyor_controller.sysj line: 16, column: 29
                      checkOne_o.setREQ(false);//sysj\conveyor_controller.sysj line: 16, column: 29
                      ends[24]=2;
                      ;//sysj\conveyor_controller.sysj line: 16, column: 29
                      S2777=0;
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

  public void thread100878(int [] tdone, int [] ends){
        switch(S2731){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S2545){
          case 0 : 
            if(simThree_19.getprestatus()){//sysj\conveyor_controller.sysj line: 14, column: 14
              S2545=1;
              S2507=0;
              if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 31
                checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                S2507=1;
                active[23]=1;
                ends[23]=1;
                tdone[23]=1;
              }
              else {
                S2502=0;
                if(checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                  checkThree_o.setVal((simThree_19.getpreval() == null ? null : ((Boolean)simThree_19.getpreval())));//sysj\conveyor_controller.sysj line: 14, column: 31
                  S2502=1;
                  if(!checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                    checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                    ends[23]=2;
                    ;//sysj\conveyor_controller.sysj line: 14, column: 31
                    S2545=0;
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
            switch(S2507){
              case 0 : 
                if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 31
                  checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                  S2507=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  switch(S2502){
                    case 0 : 
                      if(checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                        checkThree_o.setVal((simThree_19.getpreval() == null ? null : ((Boolean)simThree_19.getpreval())));//sysj\conveyor_controller.sysj line: 14, column: 31
                        S2502=1;
                        if(!checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                          checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                          ends[23]=2;
                          ;//sysj\conveyor_controller.sysj line: 14, column: 31
                          S2545=0;
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
                        S2545=0;
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
                S2507=1;
                S2507=0;
                if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 31
                  checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                  S2507=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  S2502=0;
                  if(checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                    checkThree_o.setVal((simThree_19.getpreval() == null ? null : ((Boolean)simThree_19.getpreval())));//sysj\conveyor_controller.sysj line: 14, column: 31
                    S2502=1;
                    if(!checkThree_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 31
                      checkThree_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 31
                      ends[23]=2;
                      ;//sysj\conveyor_controller.sysj line: 14, column: 31
                      S2545=0;
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

  public void thread100877(int [] tdone, int [] ends){
        switch(S2499){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S2313){
          case 0 : 
            if(simFive_19.getprestatus()){//sysj\conveyor_controller.sysj line: 12, column: 14
              S2313=1;
              S2275=0;
              if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 12, column: 30
                checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                S2275=1;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S2270=0;
                if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                  checkFive_o.setVal((simFive_19.getpreval() == null ? null : ((Boolean)simFive_19.getpreval())));//sysj\conveyor_controller.sysj line: 12, column: 30
                  S2270=1;
                  if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                    checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                    ends[22]=2;
                    ;//sysj\conveyor_controller.sysj line: 12, column: 30
                    S2313=0;
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
            switch(S2275){
              case 0 : 
                if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 12, column: 30
                  checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                  S2275=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  switch(S2270){
                    case 0 : 
                      if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                        checkFive_o.setVal((simFive_19.getpreval() == null ? null : ((Boolean)simFive_19.getpreval())));//sysj\conveyor_controller.sysj line: 12, column: 30
                        S2270=1;
                        if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                          checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                          ends[22]=2;
                          ;//sysj\conveyor_controller.sysj line: 12, column: 30
                          S2313=0;
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
                        S2313=0;
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
                S2275=1;
                S2275=0;
                if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 12, column: 30
                  checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                  S2275=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  S2270=0;
                  if(checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                    checkFive_o.setVal((simFive_19.getpreval() == null ? null : ((Boolean)simFive_19.getpreval())));//sysj\conveyor_controller.sysj line: 12, column: 30
                    S2270=1;
                    if(!checkFive_o.isACK()){//sysj\conveyor_controller.sysj line: 12, column: 30
                      checkFive_o.setREQ(false);//sysj\conveyor_controller.sysj line: 12, column: 30
                      ends[22]=2;
                      ;//sysj\conveyor_controller.sysj line: 12, column: 30
                      S2313=0;
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

  public void thread100876(int [] tdone, int [] ends){
        switch(S2267){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S2081){
          case 0 : 
            if(simC_19.getprestatus()){//sysj\conveyor_controller.sysj line: 10, column: 14
              S2081=1;
              S2043=0;
              if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 27
                simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                S2043=1;
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              else {
                S2038=0;
                if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                  simCapper_o.setVal((simC_19.getpreval() == null ? null : ((Boolean)simC_19.getpreval())));//sysj\conveyor_controller.sysj line: 10, column: 27
                  S2038=1;
                  if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                    simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                    ends[21]=2;
                    ;//sysj\conveyor_controller.sysj line: 10, column: 27
                    S2081=0;
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
            switch(S2043){
              case 0 : 
                if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 27
                  simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                  S2043=1;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  switch(S2038){
                    case 0 : 
                      if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                        simCapper_o.setVal((simC_19.getpreval() == null ? null : ((Boolean)simC_19.getpreval())));//sysj\conveyor_controller.sysj line: 10, column: 27
                        S2038=1;
                        if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                          simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                          ends[21]=2;
                          ;//sysj\conveyor_controller.sysj line: 10, column: 27
                          S2081=0;
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
                        S2081=0;
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
                S2043=1;
                S2043=0;
                if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 27
                  simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                  S2043=1;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  S2038=0;
                  if(simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                    simCapper_o.setVal((simC_19.getpreval() == null ? null : ((Boolean)simC_19.getpreval())));//sysj\conveyor_controller.sysj line: 10, column: 27
                    S2038=1;
                    if(!simCapper_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 27
                      simCapper_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 27
                      ends[21]=2;
                      ;//sysj\conveyor_controller.sysj line: 10, column: 27
                      S2081=0;
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

  public void thread100875(int [] tdone, int [] ends){
        switch(S2035){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S1849){
          case 0 : 
            if(simF_19.getprestatus()){//sysj\conveyor_controller.sysj line: 8, column: 14
              S1849=1;
              S1811=0;
              if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 27
                simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                S1811=1;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                S1806=0;
                if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                  simFiller_o.setVal((simF_19.getpreval() == null ? null : ((Boolean)simF_19.getpreval())));//sysj\conveyor_controller.sysj line: 8, column: 27
                  S1806=1;
                  if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                    simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                    ends[20]=2;
                    ;//sysj\conveyor_controller.sysj line: 8, column: 27
                    S1849=0;
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
            switch(S1811){
              case 0 : 
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                  S1811=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  switch(S1806){
                    case 0 : 
                      if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                        simFiller_o.setVal((simF_19.getpreval() == null ? null : ((Boolean)simF_19.getpreval())));//sysj\conveyor_controller.sysj line: 8, column: 27
                        S1806=1;
                        if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                          simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                          ends[20]=2;
                          ;//sysj\conveyor_controller.sysj line: 8, column: 27
                          S1849=0;
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
                        S1849=0;
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
                S1811=1;
                S1811=0;
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                  S1811=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  S1806=0;
                  if(simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                    simFiller_o.setVal((simF_19.getpreval() == null ? null : ((Boolean)simF_19.getpreval())));//sysj\conveyor_controller.sysj line: 8, column: 27
                    S1806=1;
                    if(!simFiller_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 27
                      simFiller_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 27
                      ends[20]=2;
                      ;//sysj\conveyor_controller.sysj line: 8, column: 27
                      S1849=0;
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

  public void thread100874(int [] tdone, int [] ends){
        switch(S3627){
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
        thread100875(tdone,ends);
        thread100876(tdone,ends);
        thread100877(tdone,ends);
        thread100878(tdone,ends);
        thread100879(tdone,ends);
        thread100880(tdone,ends);
        int biggest100881 = 0;
        if(ends[20]>=biggest100881){
          biggest100881=ends[20];
        }
        if(ends[21]>=biggest100881){
          biggest100881=ends[21];
        }
        if(ends[22]>=biggest100881){
          biggest100881=ends[22];
        }
        if(ends[23]>=biggest100881){
          biggest100881=ends[23];
        }
        if(ends[24]>=biggest100881){
          biggest100881=ends[24];
        }
        if(ends[25]>=biggest100881){
          biggest100881=ends[25];
        }
        if(biggest100881 == 1){
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        //FINXME code
        if(biggest100881 == 0){
          S3627=0;
          active[19]=0;
          ends[19]=0;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread100871(int [] tdone, int [] ends){
        S1742=1;
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

  public void thread100870(int [] tdone, int [] ends){
        S1726=1;
    bottleLeftPos5E.setPresent();//sysj\conveyor_controller.sysj line: 211, column: 19
    currsigs.addElement(bottleLeftPos5E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread100868(int [] tdone, int [] ends){
        switch(S1742){
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

  public void thread100867(int [] tdone, int [] ends){
        switch(S1726){
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

  public void thread100866(int [] tdone, int [] ends){
        switch(S1795){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S1745){
          case 0 : 
            thread100867(tdone,ends);
            thread100868(tdone,ends);
            int biggest100869 = 0;
            if(ends[17]>=biggest100869){
              biggest100869=ends[17];
            }
            if(ends[18]>=biggest100869){
              biggest100869=ends[18];
            }
            if(biggest100869 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            if(biggest100869 == 2){
              ends[16]=2;
              ;//sysj\conveyor_controller.sysj line: 210, column: 11
              S1745=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest100869 == 0){
              S1745=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            S1745=1;
            S1745=0;
            if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor_controller.sysj line: 209, column: 19
              thread100870(tdone,ends);
              thread100871(tdone,ends);
              int biggest100872 = 0;
              if(ends[17]>=biggest100872){
                biggest100872=ends[17];
              }
              if(ends[18]>=biggest100872){
                biggest100872=ends[18];
              }
              if(biggest100872 == 1){
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              if(biggest100872 == 2){
                ends[16]=2;
                ;//sysj\conveyor_controller.sysj line: 210, column: 11
                S1745=1;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
            }
            else {
              S1745=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread100864(int [] tdone, int [] ends){
        switch(S1662){
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

  public void thread100863(int [] tdone, int [] ends){
        switch(S1659){
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

  public void thread100861(int [] tdone, int [] ends){
        S1662=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread100860(int [] tdone, int [] ends){
        S1659=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 194, column: 22
    currsigs.addElement(bottleDeployedE);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread100859(int [] tdone, int [] ends){
        switch(S1721){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S1675){
          case 0 : 
            if(!bottleLeftPos5E.getprestatus()){//sysj\conveyor_controller.sysj line: 190, column: 18
              S1675=1;
              if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 191, column: 19
                thread100860(tdone,ends);
                thread100861(tdone,ends);
                int biggest100862 = 0;
                if(ends[14]>=biggest100862){
                  biggest100862=ends[14];
                }
                if(ends[15]>=biggest100862){
                  biggest100862=ends[15];
                }
                if(biggest100862 == 1){
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
              else {
                S1675=2;
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
            thread100863(tdone,ends);
            thread100864(tdone,ends);
            int biggest100865 = 0;
            if(ends[14]>=biggest100865){
              biggest100865=ends[14];
            }
            if(ends[15]>=biggest100865){
              biggest100865=ends[15];
            }
            if(biggest100865 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            if(biggest100865 == 2){
              ends[13]=2;
              ;//sysj\conveyor_controller.sysj line: 192, column: 11
              S1675=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            //FINXME code
            if(biggest100865 == 0){
              S1675=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 2 : 
            S1675=2;
            S1675=0;
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread100858(int [] tdone, int [] ends){
        switch(S1797){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        thread100859(tdone,ends);
        thread100866(tdone,ends);
        int biggest100873 = 0;
        if(ends[13]>=biggest100873){
          biggest100873=ends[13];
        }
        if(ends[16]>=biggest100873){
          biggest100873=ends[16];
        }
        if(biggest100873 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        //FINXME code
        if(biggest100873 == 0){
          S1797=0;
          active[12]=0;
          ends[12]=0;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread100857(int [] tdone, int [] ends){
        switch(S1653){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S1563){
          case 0 : 
            if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor_controller.sysj line: 180, column: 23
              S1563=1;
              __start_thread_11 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 178, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_11 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 178, column: 5
                ends[11]=2;
                ;//sysj\conveyor_controller.sysj line: 178, column: 5
                S1563=2;
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
              S1563=2;
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
            S1563=2;
            System.out.println("*Bottle Left From Position 5 Of The Index Table, Still On The Conveyor");//sysj\conveyor_controller.sysj line: 183, column: 7
            S1563=0;
            if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor_controller.sysj line: 180, column: 23
              S1563=1;
              __start_thread_11 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 178, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_11 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 178, column: 5
                ends[11]=2;
                ;//sysj\conveyor_controller.sysj line: 178, column: 5
                S1563=2;
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

  public void thread100856(int [] tdone, int [] ends){
        switch(S1519){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S1471){
          case 0 : 
            switch(S1455){
              case 0 : 
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 168, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
                  S1455=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S1450){
                    case 0 : 
                      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
                        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 168, column: 4
                        S1450=1;
                        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
                          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
                          ends[10]=2;
                          ;//sysj\conveyor_controller.sysj line: 168, column: 4
                          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 169, column: 4
                          currsigs.addElement(rotaryRotated_1);
                          rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 170, column: 6
                          currsigs.addElement(rotaryTableTriggerE);
                          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 171, column: 4
                          S1471=1;
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
                        S1471=1;
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
                S1455=1;
                S1455=0;
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 168, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
                  S1455=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S1450=0;
                  if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
                    rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 168, column: 4
                    S1450=1;
                    if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
                      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
                      ends[10]=2;
                      ;//sysj\conveyor_controller.sysj line: 168, column: 4
                      rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 169, column: 4
                      currsigs.addElement(rotaryRotated_1);
                      rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 170, column: 6
                      currsigs.addElement(rotaryTableTriggerE);
                      System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 171, column: 4
                      S1471=1;
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
            S1471=1;
            S1471=0;
            S1455=0;
            if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 168, column: 4
              rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
              S1455=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S1450=0;
              if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
                rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 168, column: 4
                S1450=1;
                if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
                  rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
                  ends[10]=2;
                  ;//sysj\conveyor_controller.sysj line: 168, column: 4
                  rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 169, column: 4
                  currsigs.addElement(rotaryRotated_1);
                  rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 170, column: 6
                  currsigs.addElement(rotaryTableTriggerE);
                  System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 171, column: 4
                  S1471=1;
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

  public void thread100854(int [] tdone, int [] ends){
        switch(S914){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S909){
          case 0 : 
            if(com.systemj.Timer.getMs() - __start_thread_9 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 151, column: 17
              ends[9]=3;
              ;//sysj\conveyor_controller.sysj line: 151, column: 17
              System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 153, column: 21
              S909=1;
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

  public void thread100853(int [] tdone, int [] ends){
        switch(S894){
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

  public void thread100851(int [] tdone, int [] ends){
        S914=1;
    S909=0;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 151, column: 17
    if(com.systemj.Timer.getMs() - __start_thread_9 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 151, column: 17
      ends[9]=3;
      ;//sysj\conveyor_controller.sysj line: 151, column: 17
      System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 153, column: 21
      S909=1;
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

  public void thread100850(int [] tdone, int [] ends){
        S894=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor_controller.sysj line: 147, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 148, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread100848(int [] tdone, int [] ends){
        S914=1;
    S909=0;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 151, column: 17
    if(com.systemj.Timer.getMs() - __start_thread_9 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 151, column: 17
      ends[9]=3;
      ;//sysj\conveyor_controller.sysj line: 151, column: 17
      System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 153, column: 21
      S909=1;
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

  public void thread100847(int [] tdone, int [] ends){
        S894=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor_controller.sysj line: 147, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 148, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread100846(int [] tdone, int [] ends){
        switch(S1448){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S856){
          case 0 : 
            if(!bottleLeftPos5E.getprestatus()){//sysj\conveyor_controller.sysj line: 138, column: 18
              S856=1;
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
            S856=1;
            S856=2;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
          case 2 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 140, column: 19
              S856=3;
              __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 135, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 135, column: 5
                ends[7]=2;
                ;//sysj\conveyor_controller.sysj line: 135, column: 5
                S856=4;
                thread100847(tdone,ends);
                thread100848(tdone,ends);
                int biggest100849 = 0;
                if(ends[8]>=biggest100849){
                  biggest100849=ends[8];
                }
                if(ends[9]>=biggest100849){
                  biggest100849=ends[9];
                }
                if(biggest100849 == 1){
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
              S856=4;
              thread100850(tdone,ends);
              thread100851(tdone,ends);
              int biggest100852 = 0;
              if(ends[8]>=biggest100852){
                biggest100852=ends[8];
              }
              if(ends[9]>=biggest100852){
                biggest100852=ends[9];
              }
              if(biggest100852 == 1){
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
            thread100853(tdone,ends);
            thread100854(tdone,ends);
            int biggest100855 = 0;
            if(ends[8]>=biggest100855){
              biggest100855=ends[8];
            }
            if(ends[9]>=biggest100855){
              biggest100855=ends[9];
            }
            if(biggest100855 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest100855 == 2){
              ends[7]=2;
              ;//sysj\conveyor_controller.sysj line: 145, column: 13
              S856=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest100855 == 0){
              S856=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread100844(int [] tdone, int [] ends){
        S53=1;
    S8=0;
    if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 113, column: 34
      S8=1;
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

  public void thread100843(int [] tdone, int [] ends){
        S6=1;
    S5=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread100841(int [] tdone, int [] ends){
        switch(S205){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(rotaryRotated_1.getprestatus()){//sysj\conveyor_controller.sysj line: 128, column: 20
          S205=0;
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

  public void thread100840(int [] tdone, int [] ends){
        switch(S202){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S185){
          case 0 : 
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 126, column: 14
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
              S185=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S180){
                case 0 : 
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
                    convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 126, column: 14
                    S180=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
                      ends[5]=2;
                      ;//sysj\conveyor_controller.sysj line: 126, column: 14
                      S202=0;
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
                    S202=0;
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
            S185=1;
            S185=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 126, column: 14
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
              S185=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S180=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
                convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 126, column: 14
                S180=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
                  ends[5]=2;
                  ;//sysj\conveyor_controller.sysj line: 126, column: 14
                  S202=0;
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

  public void thread100838(int [] tdone, int [] ends){
        S205=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread100837(int [] tdone, int [] ends){
        S202=1;
    S185=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 126, column: 14
      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
      S185=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S180=0;
      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 126, column: 14
        S180=1;
        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
          ends[5]=2;
          ;//sysj\conveyor_controller.sysj line: 126, column: 14
          S202=0;
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

  public void thread100835(int [] tdone, int [] ends){
        S205=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread100834(int [] tdone, int [] ends){
        S202=1;
    S185=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 126, column: 14
      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
      S185=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S180=0;
      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 126, column: 14
        S180=1;
        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
          ends[5]=2;
          ;//sysj\conveyor_controller.sysj line: 126, column: 14
          S202=0;
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

  public void thread100832(int [] tdone, int [] ends){
        S205=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread100831(int [] tdone, int [] ends){
        S202=1;
    S185=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 126, column: 14
      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
      S185=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S180=0;
      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 126, column: 14
        S180=1;
        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 126, column: 14
          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 126, column: 14
          ends[5]=2;
          ;//sysj\conveyor_controller.sysj line: 126, column: 14
          S202=0;
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

  public void thread100829(int [] tdone, int [] ends){
        switch(S53){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S8){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 113, column: 34
              S8=1;
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
            S8=1;
            S8=2;
            S15=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 115, column: 18
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 18
              S15=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S10=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 18
                convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 115, column: 18
                S10=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 18
                  ends[4]=2;
                  ;//sysj\conveyor_controller.sysj line: 115, column: 18
                  System.out.println("*Empty...*");//sysj\conveyor_controller.sysj line: 116, column: 18
                  S53=0;
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
            switch(S15){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 115, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 18
                  S15=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S10){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 18
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 115, column: 18
                        S10=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 18
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 18
                          ends[4]=2;
                          ;//sysj\conveyor_controller.sysj line: 115, column: 18
                          System.out.println("*Empty...*");//sysj\conveyor_controller.sysj line: 116, column: 18
                          S53=0;
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
                        S53=0;
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
                S15=1;
                S15=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 115, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 18
                  S15=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S10=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 18
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 115, column: 18
                    S10=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 115, column: 18
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 115, column: 18
                      ends[4]=2;
                      ;//sysj\conveyor_controller.sysj line: 115, column: 18
                      System.out.println("*Empty...*");//sysj\conveyor_controller.sysj line: 116, column: 18
                      S53=0;
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

  public void thread100828(int [] tdone, int [] ends){
        switch(S6){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S5){
          case 0 : 
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 107, column: 27
              S5=1;
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
            S5=1;
            convReady_o.setPreempted();//sysj\conveyor_controller.sysj line: 109, column: 21
            ends[3]=2;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread100827(int [] tdone, int [] ends){
        switch(S854){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S106){
          case 0 : 
            thread100828(tdone,ends);
            thread100829(tdone,ends);
            int biggest100830 = 0;
            if(ends[3]>=biggest100830){
              biggest100830=ends[3];
            }
            if(ends[4]>=biggest100830){
              biggest100830=ends[4];
            }
            if(biggest100830 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest100830 == 2){
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 105, column: 13
              S106=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest100830 == 0){
              S106=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S106=1;
            insert_1.setPresent();//sysj\conveyor_controller.sysj line: 120, column: 13
            currsigs.addElement(insert_1);
            S106=2;
            S113=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 121, column: 13
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 121, column: 13
              S113=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S108=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 121, column: 13
                convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 121, column: 13
                S108=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 121, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 121, column: 13
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 121, column: 13
                  S106=3;
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
            switch(S113){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 121, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 121, column: 13
                  S113=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S108){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 121, column: 13
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 121, column: 13
                        S108=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 121, column: 13
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 121, column: 13
                          ends[2]=2;
                          ;//sysj\conveyor_controller.sysj line: 121, column: 13
                          S106=3;
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
                        S106=3;
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
                S113=1;
                S113=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 121, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 121, column: 13
                  S113=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S108=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 121, column: 13
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 121, column: 13
                    S108=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 121, column: 13
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 121, column: 13
                      ends[2]=2;
                      ;//sysj\conveyor_controller.sysj line: 121, column: 13
                      S106=3;
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
            S106=3;
            S106=4;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 101, column: 5
            S152=0;
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 101, column: 5
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 101, column: 5
              S106=5;
              thread100831(tdone,ends);
              thread100832(tdone,ends);
              int biggest100833 = 0;
              if(ends[5]>=biggest100833){
                biggest100833=ends[5];
              }
              if(ends[6]>=biggest100833){
                biggest100833=ends[6];
              }
              if(biggest100833 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S152=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            switch(S152){
              case 0 : 
                S152=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 101, column: 5
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 101, column: 5
                  S106=5;
                  thread100834(tdone,ends);
                  thread100835(tdone,ends);
                  int biggest100836 = 0;
                  if(ends[5]>=biggest100836){
                    biggest100836=ends[5];
                  }
                  if(ends[6]>=biggest100836){
                    biggest100836=ends[6];
                  }
                  if(biggest100836 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S152=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S152=1;
                S152=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 101, column: 5
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 101, column: 5
                  S106=5;
                  thread100837(tdone,ends);
                  thread100838(tdone,ends);
                  int biggest100839 = 0;
                  if(ends[5]>=biggest100839){
                    biggest100839=ends[5];
                  }
                  if(ends[6]>=biggest100839){
                    biggest100839=ends[6];
                  }
                  if(biggest100839 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S152=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 5 : 
            thread100840(tdone,ends);
            thread100841(tdone,ends);
            int biggest100842 = 0;
            if(ends[5]>=biggest100842){
              biggest100842=ends[5];
            }
            if(ends[6]>=biggest100842){
              biggest100842=ends[6];
            }
            if(biggest100842 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest100842 == 0){
              S106=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            S106=6;
            System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 103, column: 10
            S106=0;
            thread100843(tdone,ends);
            thread100844(tdone,ends);
            int biggest100845 = 0;
            if(ends[3]>=biggest100845){
              biggest100845=ends[3];
            }
            if(ends[4]>=biggest100845){
              biggest100845=ends[4];
            }
            if(biggest100845 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread100824(int [] tdone, int [] ends){
        S3625=1;
    q_thread_25 = new boolean[5];//sysj\conveyor_controller.sysj line: 20, column: 3
    S2985=0;
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
      S2964=0;
      if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
        S2972=0;
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
      else {
        S2972=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
        currsigs.addElement(empty_1);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
    else {
      S2964=0;
      if(o_thread_25){//sysj\conveyor_controller.sysj line: 40, column: 5
        S2972=0;
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
      else {
        S2972=1;
        empty_1.setPresent();//sysj\conveyor_controller.sysj line: 43, column: 6
        currsigs.addElement(empty_1);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
  }

  public void thread100823(int [] tdone, int [] ends){
        S2963=1;
    S2777=0;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread100822(int [] tdone, int [] ends){
        S2731=1;
    S2545=0;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread100821(int [] tdone, int [] ends){
        S2499=1;
    S2313=0;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread100820(int [] tdone, int [] ends){
        S2267=1;
    S2081=0;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread100819(int [] tdone, int [] ends){
        S2035=1;
    S1849=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread100818(int [] tdone, int [] ends){
        S3627=1;
    simF_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simC_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simFive_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simThree_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simOne_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    thread100819(tdone,ends);
    thread100820(tdone,ends);
    thread100821(tdone,ends);
    thread100822(tdone,ends);
    thread100823(tdone,ends);
    thread100824(tdone,ends);
    int biggest100825 = 0;
    if(ends[20]>=biggest100825){
      biggest100825=ends[20];
    }
    if(ends[21]>=biggest100825){
      biggest100825=ends[21];
    }
    if(ends[22]>=biggest100825){
      biggest100825=ends[22];
    }
    if(ends[23]>=biggest100825){
      biggest100825=ends[23];
    }
    if(ends[24]>=biggest100825){
      biggest100825=ends[24];
    }
    if(ends[25]>=biggest100825){
      biggest100825=ends[25];
    }
    if(biggest100825 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread100815(int [] tdone, int [] ends){
        S1742=1;
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

  public void thread100814(int [] tdone, int [] ends){
        S1726=1;
    bottleLeftPos5E.setPresent();//sysj\conveyor_controller.sysj line: 211, column: 19
    currsigs.addElement(bottleLeftPos5E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread100813(int [] tdone, int [] ends){
        S1795=1;
    S1745=0;
    if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor_controller.sysj line: 209, column: 19
      thread100814(tdone,ends);
      thread100815(tdone,ends);
      int biggest100816 = 0;
      if(ends[17]>=biggest100816){
        biggest100816=ends[17];
      }
      if(ends[18]>=biggest100816){
        biggest100816=ends[18];
      }
      if(biggest100816 == 1){
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
      if(biggest100816 == 2){
        ends[16]=2;
        ;//sysj\conveyor_controller.sysj line: 210, column: 11
        S1745=1;
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
    }
    else {
      S1745=1;
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread100812(int [] tdone, int [] ends){
        S1721=1;
    S1675=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread100811(int [] tdone, int [] ends){
        S1797=1;
    thread100812(tdone,ends);
    thread100813(tdone,ends);
    int biggest100817 = 0;
    if(ends[13]>=biggest100817){
      biggest100817=ends[13];
    }
    if(ends[16]>=biggest100817){
      biggest100817=ends[16];
    }
    if(biggest100817 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread100810(int [] tdone, int [] ends){
        S1653=1;
    S1563=0;
    if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor_controller.sysj line: 180, column: 23
      S1563=1;
      __start_thread_11 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 178, column: 5
      if(com.systemj.Timer.getMs() - __start_thread_11 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 178, column: 5
        ends[11]=2;
        ;//sysj\conveyor_controller.sysj line: 178, column: 5
        S1563=2;
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

  public void thread100809(int [] tdone, int [] ends){
        S1519=1;
    S1471=0;
    S1455=0;
    if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 168, column: 4
      rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
      S1455=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S1450=0;
      if(!rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
        rotated_in.setACK(true);//sysj\conveyor_controller.sysj line: 168, column: 4
        S1450=1;
        if(rotated_in.isREQ()){//sysj\conveyor_controller.sysj line: 168, column: 4
          rotated_in.setACK(false);//sysj\conveyor_controller.sysj line: 168, column: 4
          ends[10]=2;
          ;//sysj\conveyor_controller.sysj line: 168, column: 4
          rotaryRotated_1.setPresent();//sysj\conveyor_controller.sysj line: 169, column: 4
          currsigs.addElement(rotaryRotated_1);
          rotaryTableTriggerE.setPresent();//sysj\conveyor_controller.sysj line: 170, column: 6
          currsigs.addElement(rotaryTableTriggerE);
          System.out.println("*Rotary rotated");//sysj\conveyor_controller.sysj line: 171, column: 4
          S1471=1;
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

  public void thread100808(int [] tdone, int [] ends){
        S1448=1;
    S856=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread100806(int [] tdone, int [] ends){
        S53=1;
    S8=0;
    if(empty_1.getprestatus()){//sysj\conveyor_controller.sysj line: 113, column: 34
      S8=1;
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

  public void thread100805(int [] tdone, int [] ends){
        S6=1;
    S5=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread100804(int [] tdone, int [] ends){
        S854=1;
    System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 103, column: 10
    S106=0;
    thread100805(tdone,ends);
    thread100806(tdone,ends);
    int biggest100807 = 0;
    if(ends[3]>=biggest100807){
      biggest100807=ends[3];
    }
    if(ends[4]>=biggest100807){
      biggest100807=ends[4];
    }
    if(biggest100807 == 1){
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
      switch(S3629){
        case 0 : 
          S3629=0;
          break RUN;
        
        case 1 : 
          S3629=2;
          S3629=2;
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          bottleLeftPos5_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          thread100804(tdone,ends);
          thread100808(tdone,ends);
          thread100809(tdone,ends);
          thread100810(tdone,ends);
          thread100811(tdone,ends);
          thread100818(tdone,ends);
          int biggest100826 = 0;
          if(ends[2]>=biggest100826){
            biggest100826=ends[2];
          }
          if(ends[7]>=biggest100826){
            biggest100826=ends[7];
          }
          if(ends[10]>=biggest100826){
            biggest100826=ends[10];
          }
          if(ends[11]>=biggest100826){
            biggest100826=ends[11];
          }
          if(ends[12]>=biggest100826){
            biggest100826=ends[12];
          }
          if(ends[19]>=biggest100826){
            biggest100826=ends[19];
          }
          if(biggest100826 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          if(biggest100826 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          bottleLeftPos5_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          thread100827(tdone,ends);
          thread100846(tdone,ends);
          thread100856(tdone,ends);
          thread100857(tdone,ends);
          thread100858(tdone,ends);
          thread100874(tdone,ends);
          int biggest100882 = 0;
          if(ends[2]>=biggest100882){
            biggest100882=ends[2];
          }
          if(ends[7]>=biggest100882){
            biggest100882=ends[7];
          }
          if(ends[10]>=biggest100882){
            biggest100882=ends[10];
          }
          if(ends[11]>=biggest100882){
            biggest100882=ends[11];
          }
          if(ends[12]>=biggest100882){
            biggest100882=ends[12];
          }
          if(ends[19]>=biggest100882){
            biggest100882=ends[19];
          }
          if(biggest100882 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest100882 == 0){
            S3629=0;
            active[1]=0;
            ends[1]=0;
            S3629=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
