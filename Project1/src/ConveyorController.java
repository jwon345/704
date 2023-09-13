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
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread182646(int [] tdone, int [] ends){
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

  public void thread182645(int [] tdone, int [] ends){
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

  public void thread182644(int [] tdone, int [] ends){
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

  public void thread182643(int [] tdone, int [] ends){
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

  public void thread182642(int [] tdone, int [] ends){
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

  public void thread182641(int [] tdone, int [] ends){
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

  public void thread182640(int [] tdone, int [] ends){
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
        thread182641(tdone,ends);
        thread182642(tdone,ends);
        thread182643(tdone,ends);
        thread182644(tdone,ends);
        thread182645(tdone,ends);
        thread182646(tdone,ends);
        int biggest182647 = 0;
        if(ends[20]>=biggest182647){
          biggest182647=ends[20];
        }
        if(ends[21]>=biggest182647){
          biggest182647=ends[21];
        }
        if(ends[22]>=biggest182647){
          biggest182647=ends[22];
        }
        if(ends[23]>=biggest182647){
          biggest182647=ends[23];
        }
        if(ends[24]>=biggest182647){
          biggest182647=ends[24];
        }
        if(ends[25]>=biggest182647){
          biggest182647=ends[25];
        }
        if(biggest182647 == 1){
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        //FINXME code
        if(biggest182647 == 0){
          S3627=0;
          active[19]=0;
          ends[19]=0;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread182637(int [] tdone, int [] ends){
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

  public void thread182636(int [] tdone, int [] ends){
        S1726=1;
    bottleLeftPos5E.setPresent();//sysj\conveyor_controller.sysj line: 211, column: 19
    currsigs.addElement(bottleLeftPos5E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread182634(int [] tdone, int [] ends){
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

  public void thread182633(int [] tdone, int [] ends){
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

  public void thread182632(int [] tdone, int [] ends){
        switch(S1795){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S1745){
          case 0 : 
            thread182633(tdone,ends);
            thread182634(tdone,ends);
            int biggest182635 = 0;
            if(ends[17]>=biggest182635){
              biggest182635=ends[17];
            }
            if(ends[18]>=biggest182635){
              biggest182635=ends[18];
            }
            if(biggest182635 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            if(biggest182635 == 2){
              ends[16]=2;
              ;//sysj\conveyor_controller.sysj line: 210, column: 11
              S1745=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest182635 == 0){
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
              thread182636(tdone,ends);
              thread182637(tdone,ends);
              int biggest182638 = 0;
              if(ends[17]>=biggest182638){
                biggest182638=ends[17];
              }
              if(ends[18]>=biggest182638){
                biggest182638=ends[18];
              }
              if(biggest182638 == 1){
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              if(biggest182638 == 2){
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

  public void thread182630(int [] tdone, int [] ends){
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

  public void thread182629(int [] tdone, int [] ends){
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

  public void thread182627(int [] tdone, int [] ends){
        S1662=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread182626(int [] tdone, int [] ends){
        S1659=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 194, column: 22
    currsigs.addElement(bottleDeployedE);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread182625(int [] tdone, int [] ends){
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
                thread182626(tdone,ends);
                thread182627(tdone,ends);
                int biggest182628 = 0;
                if(ends[14]>=biggest182628){
                  biggest182628=ends[14];
                }
                if(ends[15]>=biggest182628){
                  biggest182628=ends[15];
                }
                if(biggest182628 == 1){
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
            thread182629(tdone,ends);
            thread182630(tdone,ends);
            int biggest182631 = 0;
            if(ends[14]>=biggest182631){
              biggest182631=ends[14];
            }
            if(ends[15]>=biggest182631){
              biggest182631=ends[15];
            }
            if(biggest182631 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            if(biggest182631 == 2){
              ends[13]=2;
              ;//sysj\conveyor_controller.sysj line: 192, column: 11
              S1675=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            //FINXME code
            if(biggest182631 == 0){
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

  public void thread182624(int [] tdone, int [] ends){
        switch(S1797){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        thread182625(tdone,ends);
        thread182632(tdone,ends);
        int biggest182639 = 0;
        if(ends[13]>=biggest182639){
          biggest182639=ends[13];
        }
        if(ends[16]>=biggest182639){
          biggest182639=ends[16];
        }
        if(biggest182639 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        //FINXME code
        if(biggest182639 == 0){
          S1797=0;
          active[12]=0;
          ends[12]=0;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread182623(int [] tdone, int [] ends){
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

  public void thread182622(int [] tdone, int [] ends){
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

  public void thread182620(int [] tdone, int [] ends){
        switch(S914){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S909){
          case 0 : 
            if(com.systemj.Timer.getMs() - __start_thread_9 >= 500){//sysj\conveyor_controller.sysj line: 151, column: 17
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

  public void thread182619(int [] tdone, int [] ends){
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

  public void thread182617(int [] tdone, int [] ends){
        S914=1;
    S909=0;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 151, column: 17
    if(com.systemj.Timer.getMs() - __start_thread_9 >= 500){//sysj\conveyor_controller.sysj line: 151, column: 17
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

  public void thread182616(int [] tdone, int [] ends){
        S894=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor_controller.sysj line: 147, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 148, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread182614(int [] tdone, int [] ends){
        S914=1;
    S909=0;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 151, column: 17
    if(com.systemj.Timer.getMs() - __start_thread_9 >= 500){//sysj\conveyor_controller.sysj line: 151, column: 17
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

  public void thread182613(int [] tdone, int [] ends){
        S894=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor_controller.sysj line: 147, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 148, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread182612(int [] tdone, int [] ends){
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
                thread182613(tdone,ends);
                thread182614(tdone,ends);
                int biggest182615 = 0;
                if(ends[8]>=biggest182615){
                  biggest182615=ends[8];
                }
                if(ends[9]>=biggest182615){
                  biggest182615=ends[9];
                }
                if(biggest182615 == 1){
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
              thread182616(tdone,ends);
              thread182617(tdone,ends);
              int biggest182618 = 0;
              if(ends[8]>=biggest182618){
                biggest182618=ends[8];
              }
              if(ends[9]>=biggest182618){
                biggest182618=ends[9];
              }
              if(biggest182618 == 1){
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
            thread182619(tdone,ends);
            thread182620(tdone,ends);
            int biggest182621 = 0;
            if(ends[8]>=biggest182621){
              biggest182621=ends[8];
            }
            if(ends[9]>=biggest182621){
              biggest182621=ends[9];
            }
            if(biggest182621 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest182621 == 2){
              ends[7]=2;
              ;//sysj\conveyor_controller.sysj line: 145, column: 13
              S856=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest182621 == 0){
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

  public void thread182610(int [] tdone, int [] ends){
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

  public void thread182609(int [] tdone, int [] ends){
        S6=1;
    S5=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread182607(int [] tdone, int [] ends){
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

  public void thread182606(int [] tdone, int [] ends){
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

  public void thread182604(int [] tdone, int [] ends){
        S205=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread182603(int [] tdone, int [] ends){
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

  public void thread182601(int [] tdone, int [] ends){
        S205=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread182600(int [] tdone, int [] ends){
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

  public void thread182598(int [] tdone, int [] ends){
        S205=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread182597(int [] tdone, int [] ends){
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

  public void thread182595(int [] tdone, int [] ends){
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

  public void thread182594(int [] tdone, int [] ends){
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

  public void thread182593(int [] tdone, int [] ends){
        switch(S854){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S106){
          case 0 : 
            thread182594(tdone,ends);
            thread182595(tdone,ends);
            int biggest182596 = 0;
            if(ends[3]>=biggest182596){
              biggest182596=ends[3];
            }
            if(ends[4]>=biggest182596){
              biggest182596=ends[4];
            }
            if(biggest182596 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest182596 == 2){
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 105, column: 13
              S106=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest182596 == 0){
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
              thread182597(tdone,ends);
              thread182598(tdone,ends);
              int biggest182599 = 0;
              if(ends[5]>=biggest182599){
                biggest182599=ends[5];
              }
              if(ends[6]>=biggest182599){
                biggest182599=ends[6];
              }
              if(biggest182599 == 1){
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
                  thread182600(tdone,ends);
                  thread182601(tdone,ends);
                  int biggest182602 = 0;
                  if(ends[5]>=biggest182602){
                    biggest182602=ends[5];
                  }
                  if(ends[6]>=biggest182602){
                    biggest182602=ends[6];
                  }
                  if(biggest182602 == 1){
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
                  thread182603(tdone,ends);
                  thread182604(tdone,ends);
                  int biggest182605 = 0;
                  if(ends[5]>=biggest182605){
                    biggest182605=ends[5];
                  }
                  if(ends[6]>=biggest182605){
                    biggest182605=ends[6];
                  }
                  if(biggest182605 == 1){
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
            thread182606(tdone,ends);
            thread182607(tdone,ends);
            int biggest182608 = 0;
            if(ends[5]>=biggest182608){
              biggest182608=ends[5];
            }
            if(ends[6]>=biggest182608){
              biggest182608=ends[6];
            }
            if(biggest182608 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest182608 == 0){
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
            thread182609(tdone,ends);
            thread182610(tdone,ends);
            int biggest182611 = 0;
            if(ends[3]>=biggest182611){
              biggest182611=ends[3];
            }
            if(ends[4]>=biggest182611){
              biggest182611=ends[4];
            }
            if(biggest182611 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread182590(int [] tdone, int [] ends){
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

  public void thread182589(int [] tdone, int [] ends){
        S2963=1;
    S2777=0;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread182588(int [] tdone, int [] ends){
        S2731=1;
    S2545=0;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread182587(int [] tdone, int [] ends){
        S2499=1;
    S2313=0;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread182586(int [] tdone, int [] ends){
        S2267=1;
    S2081=0;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread182585(int [] tdone, int [] ends){
        S2035=1;
    S1849=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread182584(int [] tdone, int [] ends){
        S3627=1;
    simF_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simC_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simFive_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simThree_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    simOne_19.setClear();//sysj\conveyor_controller.sysj line: 7, column: 2
    thread182585(tdone,ends);
    thread182586(tdone,ends);
    thread182587(tdone,ends);
    thread182588(tdone,ends);
    thread182589(tdone,ends);
    thread182590(tdone,ends);
    int biggest182591 = 0;
    if(ends[20]>=biggest182591){
      biggest182591=ends[20];
    }
    if(ends[21]>=biggest182591){
      biggest182591=ends[21];
    }
    if(ends[22]>=biggest182591){
      biggest182591=ends[22];
    }
    if(ends[23]>=biggest182591){
      biggest182591=ends[23];
    }
    if(ends[24]>=biggest182591){
      biggest182591=ends[24];
    }
    if(ends[25]>=biggest182591){
      biggest182591=ends[25];
    }
    if(biggest182591 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread182581(int [] tdone, int [] ends){
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

  public void thread182580(int [] tdone, int [] ends){
        S1726=1;
    bottleLeftPos5E.setPresent();//sysj\conveyor_controller.sysj line: 211, column: 19
    currsigs.addElement(bottleLeftPos5E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread182579(int [] tdone, int [] ends){
        S1795=1;
    S1745=0;
    if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor_controller.sysj line: 209, column: 19
      thread182580(tdone,ends);
      thread182581(tdone,ends);
      int biggest182582 = 0;
      if(ends[17]>=biggest182582){
        biggest182582=ends[17];
      }
      if(ends[18]>=biggest182582){
        biggest182582=ends[18];
      }
      if(biggest182582 == 1){
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
      if(biggest182582 == 2){
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

  public void thread182578(int [] tdone, int [] ends){
        S1721=1;
    S1675=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread182577(int [] tdone, int [] ends){
        S1797=1;
    thread182578(tdone,ends);
    thread182579(tdone,ends);
    int biggest182583 = 0;
    if(ends[13]>=biggest182583){
      biggest182583=ends[13];
    }
    if(ends[16]>=biggest182583){
      biggest182583=ends[16];
    }
    if(biggest182583 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread182576(int [] tdone, int [] ends){
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

  public void thread182575(int [] tdone, int [] ends){
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

  public void thread182574(int [] tdone, int [] ends){
        S1448=1;
    S856=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread182572(int [] tdone, int [] ends){
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

  public void thread182571(int [] tdone, int [] ends){
        S6=1;
    S5=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread182570(int [] tdone, int [] ends){
        S854=1;
    System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 103, column: 10
    S106=0;
    thread182571(tdone,ends);
    thread182572(tdone,ends);
    int biggest182573 = 0;
    if(ends[3]>=biggest182573){
      biggest182573=ends[3];
    }
    if(ends[4]>=biggest182573){
      biggest182573=ends[4];
    }
    if(biggest182573 == 1){
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
          thread182570(tdone,ends);
          thread182574(tdone,ends);
          thread182575(tdone,ends);
          thread182576(tdone,ends);
          thread182577(tdone,ends);
          thread182584(tdone,ends);
          int biggest182592 = 0;
          if(ends[2]>=biggest182592){
            biggest182592=ends[2];
          }
          if(ends[7]>=biggest182592){
            biggest182592=ends[7];
          }
          if(ends[10]>=biggest182592){
            biggest182592=ends[10];
          }
          if(ends[11]>=biggest182592){
            biggest182592=ends[11];
          }
          if(ends[12]>=biggest182592){
            biggest182592=ends[12];
          }
          if(ends[19]>=biggest182592){
            biggest182592=ends[19];
          }
          if(biggest182592 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          if(biggest182592 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotaryRotated_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          empty_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          insert_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          bottleLeftPos5_1.setClear();//sysj\conveyor_controller.sysj line: 100, column: 2
          thread182593(tdone,ends);
          thread182612(tdone,ends);
          thread182622(tdone,ends);
          thread182623(tdone,ends);
          thread182624(tdone,ends);
          thread182640(tdone,ends);
          int biggest182648 = 0;
          if(ends[2]>=biggest182648){
            biggest182648=ends[2];
          }
          if(ends[7]>=biggest182648){
            biggest182648=ends[7];
          }
          if(ends[10]>=biggest182648){
            biggest182648=ends[10];
          }
          if(ends[11]>=biggest182648){
            biggest182648=ends[11];
          }
          if(ends[12]>=biggest182648){
            biggest182648=ends[12];
          }
          if(ends[19]>=biggest182648){
            biggest182648=ends[19];
          }
          if(biggest182648 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest182648 == 0){
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
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
