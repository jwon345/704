import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor.sysj line: 1, column: 1
import run.socketListener;//sysj\conveyor.sysj line: 2, column: 1

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
  private long __start_thread_2;//sysj\conveyor.sysj line: 35, column: 5
  private long __start_thread_7;//sysj\conveyor.sysj line: 69, column: 5
  private long __start_thread_9;//sysj\conveyor.sysj line: 85, column: 17
  private long __start_thread_11;//sysj\conveyor.sysj line: 112, column: 5
  private long __start_thread_18;//sysj\conveyor.sysj line: 147, column: 18
  private boolean[] q_thread_25;//sysj\conveyor.sysj line: 20, column: 3
  private boolean o_thread_25;//sysj\conveyor.sysj line: 22, column: 9
  private boolean c_thread_25;//sysj\conveyor.sysj line: 22, column: 9
  private int S9930 = 1;
  private int S7115 = 1;
  private int S6367 = 1;
  private int S6267 = 1;
  private int S6266 = 1;
  private int S6314 = 1;
  private int S6269 = 1;
  private int S6276 = 1;
  private int S6271 = 1;
  private int S6374 = 1;
  private int S6369 = 1;
  private int S6413 = 1;
  private int S6463 = 1;
  private int S6446 = 1;
  private int S6441 = 1;
  private int S6466 = 1;
  private int S7709 = 1;
  private int S7117 = 1;
  private int S7155 = 1;
  private int S7175 = 1;
  private int S7170 = 1;
  private int S7780 = 1;
  private int S7732 = 1;
  private int S7716 = 1;
  private int S7711 = 1;
  private int S7914 = 1;
  private int S7824 = 1;
  private int S8058 = 1;
  private int S7982 = 1;
  private int S7936 = 1;
  private int S7920 = 1;
  private int S7923 = 1;
  private int S8056 = 1;
  private int S8006 = 1;
  private int S7987 = 1;
  private int S8003 = 1;
  private int S9928 = 1;
  private int S8296 = 1;
  private int S8110 = 1;
  private int S8072 = 1;
  private int S8067 = 1;
  private int S8528 = 1;
  private int S8342 = 1;
  private int S8304 = 1;
  private int S8299 = 1;
  private int S8760 = 1;
  private int S8574 = 1;
  private int S8536 = 1;
  private int S8531 = 1;
  private int S8992 = 1;
  private int S8806 = 1;
  private int S8768 = 1;
  private int S8763 = 1;
  private int S9224 = 1;
  private int S9038 = 1;
  private int S9000 = 1;
  private int S8995 = 1;
  private int S9926 = 1;
  private int S9248 = 1;
  private int S9225 = 1;
  private int S9233 = 1;
  
  private int[] ends = new int[31];
  private int[] tdone = new int[31];
  
  public void thread10062(int [] tdone, int [] ends){
        switch(S9926){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(rotaryRotated_1.getprestatus()){//sysj\conveyor.sysj line: 45, column: 11
          if(q_thread_25[4]){//sysj\conveyor.sysj line: 47, column: 5
            bottleLeftPos5_1.setPresent();//sysj\conveyor.sysj line: 48, column: 12
            currsigs.addElement(bottleLeftPos5_1);
            for(int i_thread_25 = q_thread_25.length - 1; i_thread_25 > 0; i_thread_25 = i_thread_25 - 1) {//sysj\conveyor.sysj line: 52, column: 36
              q_thread_25[i_thread_25] = q_thread_25[i_thread_25 - 1];//sysj\conveyor.sysj line: 53, column: 6
            }
            if(insert_1.getprestatus()){//sysj\conveyor.sysj line: 55, column: 13
              q_thread_25[0] = true;//sysj\conveyor.sysj line: 56, column: 6
              S9248=0;
              System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 23, column: 5
              o_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
              c_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
              System.out.print("* Current bottle's locations :");//sysj\conveyor.sysj line: 25, column: 5
              for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor.sysj line: 26, column: 34
                if(q_thread_25[i_thread_25]) {//sysj\conveyor.sysj line: 27, column: 6
                  o_thread_25 = true;//sysj\conveyor.sysj line: 28, column: 7
                }
                System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor.sysj line: 29, column: 6
              }
              System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 31, column: 5
              if(rotaryRotated_1.getprestatus()){//sysj\conveyor.sysj line: 33, column: 13
                simOne_19.setPresent();//sysj\conveyor.sysj line: 34, column: 6
                currsigs.addElement(simOne_19);
                simOne_19.setValue(q_thread_25[0] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 34, column: 6
                simF_19.setPresent();//sysj\conveyor.sysj line: 35, column: 6
                currsigs.addElement(simF_19);
                simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 35, column: 6
                simThree_19.setPresent();//sysj\conveyor.sysj line: 36, column: 6
                currsigs.addElement(simThree_19);
                simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 36, column: 6
                simC_19.setPresent();//sysj\conveyor.sysj line: 37, column: 6
                currsigs.addElement(simC_19);
                simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 37, column: 6
                simFive_19.setPresent();//sysj\conveyor.sysj line: 38, column: 6
                currsigs.addElement(simFive_19);
                simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 38, column: 6
                S9225=0;
                if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                  S9233=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S9233=1;
                  empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S9225=0;
                if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                  S9233=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S9233=1;
                  empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
            }
            else {
              q_thread_25[0] = false;//sysj\conveyor.sysj line: 59, column: 6
              S9248=0;
              System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 23, column: 5
              o_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
              c_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
              System.out.print("* Current bottle's locations :");//sysj\conveyor.sysj line: 25, column: 5
              for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor.sysj line: 26, column: 34
                if(q_thread_25[i_thread_25]) {//sysj\conveyor.sysj line: 27, column: 6
                  o_thread_25 = true;//sysj\conveyor.sysj line: 28, column: 7
                }
                System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor.sysj line: 29, column: 6
              }
              System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 31, column: 5
              if(rotaryRotated_1.getprestatus()){//sysj\conveyor.sysj line: 33, column: 13
                simOne_19.setPresent();//sysj\conveyor.sysj line: 34, column: 6
                currsigs.addElement(simOne_19);
                simOne_19.setValue(q_thread_25[0] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 34, column: 6
                simF_19.setPresent();//sysj\conveyor.sysj line: 35, column: 6
                currsigs.addElement(simF_19);
                simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 35, column: 6
                simThree_19.setPresent();//sysj\conveyor.sysj line: 36, column: 6
                currsigs.addElement(simThree_19);
                simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 36, column: 6
                simC_19.setPresent();//sysj\conveyor.sysj line: 37, column: 6
                currsigs.addElement(simC_19);
                simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 37, column: 6
                simFive_19.setPresent();//sysj\conveyor.sysj line: 38, column: 6
                currsigs.addElement(simFive_19);
                simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 38, column: 6
                S9225=0;
                if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                  S9233=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S9233=1;
                  empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S9225=0;
                if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                  S9233=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S9233=1;
                  empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
            }
          }
          else {
            for(int i_thread_25 = q_thread_25.length - 1; i_thread_25 > 0; i_thread_25 = i_thread_25 - 1) {//sysj\conveyor.sysj line: 52, column: 36
              q_thread_25[i_thread_25] = q_thread_25[i_thread_25 - 1];//sysj\conveyor.sysj line: 53, column: 6
            }
            if(insert_1.getprestatus()){//sysj\conveyor.sysj line: 55, column: 13
              q_thread_25[0] = true;//sysj\conveyor.sysj line: 56, column: 6
              S9248=0;
              System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 23, column: 5
              o_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
              c_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
              System.out.print("* Current bottle's locations :");//sysj\conveyor.sysj line: 25, column: 5
              for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor.sysj line: 26, column: 34
                if(q_thread_25[i_thread_25]) {//sysj\conveyor.sysj line: 27, column: 6
                  o_thread_25 = true;//sysj\conveyor.sysj line: 28, column: 7
                }
                System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor.sysj line: 29, column: 6
              }
              System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 31, column: 5
              if(rotaryRotated_1.getprestatus()){//sysj\conveyor.sysj line: 33, column: 13
                simOne_19.setPresent();//sysj\conveyor.sysj line: 34, column: 6
                currsigs.addElement(simOne_19);
                simOne_19.setValue(q_thread_25[0] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 34, column: 6
                simF_19.setPresent();//sysj\conveyor.sysj line: 35, column: 6
                currsigs.addElement(simF_19);
                simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 35, column: 6
                simThree_19.setPresent();//sysj\conveyor.sysj line: 36, column: 6
                currsigs.addElement(simThree_19);
                simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 36, column: 6
                simC_19.setPresent();//sysj\conveyor.sysj line: 37, column: 6
                currsigs.addElement(simC_19);
                simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 37, column: 6
                simFive_19.setPresent();//sysj\conveyor.sysj line: 38, column: 6
                currsigs.addElement(simFive_19);
                simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 38, column: 6
                S9225=0;
                if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                  S9233=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S9233=1;
                  empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S9225=0;
                if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                  S9233=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S9233=1;
                  empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
            }
            else {
              q_thread_25[0] = false;//sysj\conveyor.sysj line: 59, column: 6
              S9248=0;
              System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 23, column: 5
              o_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
              c_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
              System.out.print("* Current bottle's locations :");//sysj\conveyor.sysj line: 25, column: 5
              for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor.sysj line: 26, column: 34
                if(q_thread_25[i_thread_25]) {//sysj\conveyor.sysj line: 27, column: 6
                  o_thread_25 = true;//sysj\conveyor.sysj line: 28, column: 7
                }
                System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor.sysj line: 29, column: 6
              }
              System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 31, column: 5
              if(rotaryRotated_1.getprestatus()){//sysj\conveyor.sysj line: 33, column: 13
                simOne_19.setPresent();//sysj\conveyor.sysj line: 34, column: 6
                currsigs.addElement(simOne_19);
                simOne_19.setValue(q_thread_25[0] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 34, column: 6
                simF_19.setPresent();//sysj\conveyor.sysj line: 35, column: 6
                currsigs.addElement(simF_19);
                simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 35, column: 6
                simThree_19.setPresent();//sysj\conveyor.sysj line: 36, column: 6
                currsigs.addElement(simThree_19);
                simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 36, column: 6
                simC_19.setPresent();//sysj\conveyor.sysj line: 37, column: 6
                currsigs.addElement(simC_19);
                simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 37, column: 6
                simFive_19.setPresent();//sysj\conveyor.sysj line: 38, column: 6
                currsigs.addElement(simFive_19);
                simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 38, column: 6
                S9225=0;
                if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                  S9233=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S9233=1;
                  empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S9225=0;
                if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                  S9233=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S9233=1;
                  empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
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
          switch(S9248){
            case 0 : 
              if(insert_1.getprestatus()){//sysj\conveyor.sysj line: 60, column: 12
                simOne_19.setPresent();//sysj\conveyor.sysj line: 62, column: 5
                currsigs.addElement(simOne_19);
                simOne_19.setValue(Boolean.TRUE);//sysj\conveyor.sysj line: 62, column: 5
                if(rotaryRotated_1.getprestatus()){//sysj\conveyor.sysj line: 64, column: 13
                  for(int i_thread_25 = q_thread_25.length - 1; i_thread_25 > 0; i_thread_25 = i_thread_25 - 1) {//sysj\conveyor.sysj line: 65, column: 37
                    q_thread_25[i_thread_25] = q_thread_25[i_thread_25 - 1];//sysj\conveyor.sysj line: 66, column: 7
                  }
                  q_thread_25[0] = true;//sysj\conveyor.sysj line: 69, column: 5
                  S9248=0;
                  System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 23, column: 5
                  o_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
                  c_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
                  System.out.print("* Current bottle's locations :");//sysj\conveyor.sysj line: 25, column: 5
                  for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor.sysj line: 26, column: 34
                    if(q_thread_25[i_thread_25]) {//sysj\conveyor.sysj line: 27, column: 6
                      o_thread_25 = true;//sysj\conveyor.sysj line: 28, column: 7
                    }
                    System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor.sysj line: 29, column: 6
                  }
                  System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 31, column: 5
                  if(rotaryRotated_1.getprestatus()){//sysj\conveyor.sysj line: 33, column: 13
                    simOne_19.setPresent();//sysj\conveyor.sysj line: 34, column: 6
                    currsigs.addElement(simOne_19);
                    simOne_19.setValue(q_thread_25[0] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 34, column: 6
                    simF_19.setPresent();//sysj\conveyor.sysj line: 35, column: 6
                    currsigs.addElement(simF_19);
                    simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 35, column: 6
                    simThree_19.setPresent();//sysj\conveyor.sysj line: 36, column: 6
                    currsigs.addElement(simThree_19);
                    simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 36, column: 6
                    simC_19.setPresent();//sysj\conveyor.sysj line: 37, column: 6
                    currsigs.addElement(simC_19);
                    simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 37, column: 6
                    simFive_19.setPresent();//sysj\conveyor.sysj line: 38, column: 6
                    currsigs.addElement(simFive_19);
                    simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 38, column: 6
                    S9225=0;
                    if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                      S9233=0;
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                    else {
                      S9233=1;
                      empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
                      currsigs.addElement(empty_1);
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                  }
                  else {
                    S9225=0;
                    if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                      S9233=0;
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                    else {
                      S9233=1;
                      empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
                      currsigs.addElement(empty_1);
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                  }
                }
                else {
                  q_thread_25[0] = true;//sysj\conveyor.sysj line: 69, column: 5
                  S9248=0;
                  System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 23, column: 5
                  o_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
                  c_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
                  System.out.print("* Current bottle's locations :");//sysj\conveyor.sysj line: 25, column: 5
                  for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor.sysj line: 26, column: 34
                    if(q_thread_25[i_thread_25]) {//sysj\conveyor.sysj line: 27, column: 6
                      o_thread_25 = true;//sysj\conveyor.sysj line: 28, column: 7
                    }
                    System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor.sysj line: 29, column: 6
                  }
                  System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 31, column: 5
                  if(rotaryRotated_1.getprestatus()){//sysj\conveyor.sysj line: 33, column: 13
                    simOne_19.setPresent();//sysj\conveyor.sysj line: 34, column: 6
                    currsigs.addElement(simOne_19);
                    simOne_19.setValue(q_thread_25[0] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 34, column: 6
                    simF_19.setPresent();//sysj\conveyor.sysj line: 35, column: 6
                    currsigs.addElement(simF_19);
                    simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 35, column: 6
                    simThree_19.setPresent();//sysj\conveyor.sysj line: 36, column: 6
                    currsigs.addElement(simThree_19);
                    simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 36, column: 6
                    simC_19.setPresent();//sysj\conveyor.sysj line: 37, column: 6
                    currsigs.addElement(simC_19);
                    simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 37, column: 6
                    simFive_19.setPresent();//sysj\conveyor.sysj line: 38, column: 6
                    currsigs.addElement(simFive_19);
                    simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 38, column: 6
                    S9225=0;
                    if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                      S9233=0;
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                    else {
                      S9233=1;
                      empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
                      currsigs.addElement(empty_1);
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                  }
                  else {
                    S9225=0;
                    if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                      S9233=0;
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                    else {
                      S9233=1;
                      empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
                      currsigs.addElement(empty_1);
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                  }
                }
              }
              else {
                switch(S9225){
                  case 0 : 
                    switch(S9233){
                      case 0 : 
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                        break;
                      
                      case 1 : 
                        empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
                        currsigs.addElement(empty_1);
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    S9248=0;
                    System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 23, column: 5
                    o_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
                    c_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
                    System.out.print("* Current bottle's locations :");//sysj\conveyor.sysj line: 25, column: 5
                    for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor.sysj line: 26, column: 34
                      if(q_thread_25[i_thread_25]) {//sysj\conveyor.sysj line: 27, column: 6
                        o_thread_25 = true;//sysj\conveyor.sysj line: 28, column: 7
                      }
                      System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor.sysj line: 29, column: 6
                    }
                    System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 31, column: 5
                    if(rotaryRotated_1.getprestatus()){//sysj\conveyor.sysj line: 33, column: 13
                      simOne_19.setPresent();//sysj\conveyor.sysj line: 34, column: 6
                      currsigs.addElement(simOne_19);
                      simOne_19.setValue(q_thread_25[0] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 34, column: 6
                      simF_19.setPresent();//sysj\conveyor.sysj line: 35, column: 6
                      currsigs.addElement(simF_19);
                      simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 35, column: 6
                      simThree_19.setPresent();//sysj\conveyor.sysj line: 36, column: 6
                      currsigs.addElement(simThree_19);
                      simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 36, column: 6
                      simC_19.setPresent();//sysj\conveyor.sysj line: 37, column: 6
                      currsigs.addElement(simC_19);
                      simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 37, column: 6
                      simFive_19.setPresent();//sysj\conveyor.sysj line: 38, column: 6
                      currsigs.addElement(simFive_19);
                      simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 38, column: 6
                      S9225=0;
                      if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                        S9233=0;
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                      }
                      else {
                        S9233=1;
                        empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
                        currsigs.addElement(empty_1);
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                      }
                    }
                    else {
                      S9225=0;
                      if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                        S9233=0;
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                      }
                      else {
                        S9233=1;
                        empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
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
              S9248=0;
              System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 23, column: 5
              o_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
              c_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
              System.out.print("* Current bottle's locations :");//sysj\conveyor.sysj line: 25, column: 5
              for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor.sysj line: 26, column: 34
                if(q_thread_25[i_thread_25]) {//sysj\conveyor.sysj line: 27, column: 6
                  o_thread_25 = true;//sysj\conveyor.sysj line: 28, column: 7
                }
                System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor.sysj line: 29, column: 6
              }
              System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 31, column: 5
              if(rotaryRotated_1.getprestatus()){//sysj\conveyor.sysj line: 33, column: 13
                simOne_19.setPresent();//sysj\conveyor.sysj line: 34, column: 6
                currsigs.addElement(simOne_19);
                simOne_19.setValue(q_thread_25[0] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 34, column: 6
                simF_19.setPresent();//sysj\conveyor.sysj line: 35, column: 6
                currsigs.addElement(simF_19);
                simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 35, column: 6
                simThree_19.setPresent();//sysj\conveyor.sysj line: 36, column: 6
                currsigs.addElement(simThree_19);
                simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 36, column: 6
                simC_19.setPresent();//sysj\conveyor.sysj line: 37, column: 6
                currsigs.addElement(simC_19);
                simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 37, column: 6
                simFive_19.setPresent();//sysj\conveyor.sysj line: 38, column: 6
                currsigs.addElement(simFive_19);
                simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 38, column: 6
                S9225=0;
                if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                  S9233=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S9233=1;
                  empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
                  currsigs.addElement(empty_1);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
              else {
                S9225=0;
                if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
                  S9233=0;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S9233=1;
                  empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
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

  public void thread10061(int [] tdone, int [] ends){
        switch(S9224){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S9038){
          case 0 : 
            if(simOne_19.getprestatus()){//sysj\conveyor.sysj line: 16, column: 14
              S9038=1;
              S9000=0;
              if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 16, column: 29
                checkOne_o.setREQ(false);//sysj\conveyor.sysj line: 16, column: 29
                S9000=1;
                active[24]=1;
                ends[24]=1;
                tdone[24]=1;
              }
              else {
                S8995=0;
                if(checkOne_o.isACK()){//sysj\conveyor.sysj line: 16, column: 29
                  checkOne_o.setVal((simOne_19.getpreval() == null ? null : ((Boolean)simOne_19.getpreval())));//sysj\conveyor.sysj line: 16, column: 29
                  S8995=1;
                  if(!checkOne_o.isACK()){//sysj\conveyor.sysj line: 16, column: 29
                    checkOne_o.setREQ(false);//sysj\conveyor.sysj line: 16, column: 29
                    ends[24]=2;
                    ;//sysj\conveyor.sysj line: 16, column: 29
                    S9038=0;
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
            switch(S9000){
              case 0 : 
                if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 16, column: 29
                  checkOne_o.setREQ(false);//sysj\conveyor.sysj line: 16, column: 29
                  S9000=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  switch(S8995){
                    case 0 : 
                      if(checkOne_o.isACK()){//sysj\conveyor.sysj line: 16, column: 29
                        checkOne_o.setVal((simOne_19.getpreval() == null ? null : ((Boolean)simOne_19.getpreval())));//sysj\conveyor.sysj line: 16, column: 29
                        S8995=1;
                        if(!checkOne_o.isACK()){//sysj\conveyor.sysj line: 16, column: 29
                          checkOne_o.setREQ(false);//sysj\conveyor.sysj line: 16, column: 29
                          ends[24]=2;
                          ;//sysj\conveyor.sysj line: 16, column: 29
                          S9038=0;
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
                      if(!checkOne_o.isACK()){//sysj\conveyor.sysj line: 16, column: 29
                        checkOne_o.setREQ(false);//sysj\conveyor.sysj line: 16, column: 29
                        ends[24]=2;
                        ;//sysj\conveyor.sysj line: 16, column: 29
                        S9038=0;
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
                S9000=1;
                S9000=0;
                if(!checkOne_o.isPartnerPresent() || checkOne_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 16, column: 29
                  checkOne_o.setREQ(false);//sysj\conveyor.sysj line: 16, column: 29
                  S9000=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  S8995=0;
                  if(checkOne_o.isACK()){//sysj\conveyor.sysj line: 16, column: 29
                    checkOne_o.setVal((simOne_19.getpreval() == null ? null : ((Boolean)simOne_19.getpreval())));//sysj\conveyor.sysj line: 16, column: 29
                    S8995=1;
                    if(!checkOne_o.isACK()){//sysj\conveyor.sysj line: 16, column: 29
                      checkOne_o.setREQ(false);//sysj\conveyor.sysj line: 16, column: 29
                      ends[24]=2;
                      ;//sysj\conveyor.sysj line: 16, column: 29
                      S9038=0;
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

  public void thread10060(int [] tdone, int [] ends){
        switch(S8992){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S8806){
          case 0 : 
            if(simThree_19.getprestatus()){//sysj\conveyor.sysj line: 14, column: 14
              S8806=1;
              S8768=0;
              if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 14, column: 31
                checkThree_o.setREQ(false);//sysj\conveyor.sysj line: 14, column: 31
                S8768=1;
                active[23]=1;
                ends[23]=1;
                tdone[23]=1;
              }
              else {
                S8763=0;
                if(checkThree_o.isACK()){//sysj\conveyor.sysj line: 14, column: 31
                  checkThree_o.setVal((simThree_19.getpreval() == null ? null : ((Boolean)simThree_19.getpreval())));//sysj\conveyor.sysj line: 14, column: 31
                  S8763=1;
                  if(!checkThree_o.isACK()){//sysj\conveyor.sysj line: 14, column: 31
                    checkThree_o.setREQ(false);//sysj\conveyor.sysj line: 14, column: 31
                    ends[23]=2;
                    ;//sysj\conveyor.sysj line: 14, column: 31
                    S8806=0;
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
            switch(S8768){
              case 0 : 
                if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 14, column: 31
                  checkThree_o.setREQ(false);//sysj\conveyor.sysj line: 14, column: 31
                  S8768=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  switch(S8763){
                    case 0 : 
                      if(checkThree_o.isACK()){//sysj\conveyor.sysj line: 14, column: 31
                        checkThree_o.setVal((simThree_19.getpreval() == null ? null : ((Boolean)simThree_19.getpreval())));//sysj\conveyor.sysj line: 14, column: 31
                        S8763=1;
                        if(!checkThree_o.isACK()){//sysj\conveyor.sysj line: 14, column: 31
                          checkThree_o.setREQ(false);//sysj\conveyor.sysj line: 14, column: 31
                          ends[23]=2;
                          ;//sysj\conveyor.sysj line: 14, column: 31
                          S8806=0;
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
                      if(!checkThree_o.isACK()){//sysj\conveyor.sysj line: 14, column: 31
                        checkThree_o.setREQ(false);//sysj\conveyor.sysj line: 14, column: 31
                        ends[23]=2;
                        ;//sysj\conveyor.sysj line: 14, column: 31
                        S8806=0;
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
                S8768=1;
                S8768=0;
                if(!checkThree_o.isPartnerPresent() || checkThree_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 14, column: 31
                  checkThree_o.setREQ(false);//sysj\conveyor.sysj line: 14, column: 31
                  S8768=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  S8763=0;
                  if(checkThree_o.isACK()){//sysj\conveyor.sysj line: 14, column: 31
                    checkThree_o.setVal((simThree_19.getpreval() == null ? null : ((Boolean)simThree_19.getpreval())));//sysj\conveyor.sysj line: 14, column: 31
                    S8763=1;
                    if(!checkThree_o.isACK()){//sysj\conveyor.sysj line: 14, column: 31
                      checkThree_o.setREQ(false);//sysj\conveyor.sysj line: 14, column: 31
                      ends[23]=2;
                      ;//sysj\conveyor.sysj line: 14, column: 31
                      S8806=0;
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

  public void thread10059(int [] tdone, int [] ends){
        switch(S8760){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S8574){
          case 0 : 
            if(simFive_19.getprestatus()){//sysj\conveyor.sysj line: 12, column: 14
              S8574=1;
              S8536=0;
              if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 12, column: 30
                checkFive_o.setREQ(false);//sysj\conveyor.sysj line: 12, column: 30
                S8536=1;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S8531=0;
                if(checkFive_o.isACK()){//sysj\conveyor.sysj line: 12, column: 30
                  checkFive_o.setVal((simFive_19.getpreval() == null ? null : ((Boolean)simFive_19.getpreval())));//sysj\conveyor.sysj line: 12, column: 30
                  S8531=1;
                  if(!checkFive_o.isACK()){//sysj\conveyor.sysj line: 12, column: 30
                    checkFive_o.setREQ(false);//sysj\conveyor.sysj line: 12, column: 30
                    ends[22]=2;
                    ;//sysj\conveyor.sysj line: 12, column: 30
                    S8574=0;
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
            switch(S8536){
              case 0 : 
                if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 12, column: 30
                  checkFive_o.setREQ(false);//sysj\conveyor.sysj line: 12, column: 30
                  S8536=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  switch(S8531){
                    case 0 : 
                      if(checkFive_o.isACK()){//sysj\conveyor.sysj line: 12, column: 30
                        checkFive_o.setVal((simFive_19.getpreval() == null ? null : ((Boolean)simFive_19.getpreval())));//sysj\conveyor.sysj line: 12, column: 30
                        S8531=1;
                        if(!checkFive_o.isACK()){//sysj\conveyor.sysj line: 12, column: 30
                          checkFive_o.setREQ(false);//sysj\conveyor.sysj line: 12, column: 30
                          ends[22]=2;
                          ;//sysj\conveyor.sysj line: 12, column: 30
                          S8574=0;
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
                      if(!checkFive_o.isACK()){//sysj\conveyor.sysj line: 12, column: 30
                        checkFive_o.setREQ(false);//sysj\conveyor.sysj line: 12, column: 30
                        ends[22]=2;
                        ;//sysj\conveyor.sysj line: 12, column: 30
                        S8574=0;
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
                S8536=1;
                S8536=0;
                if(!checkFive_o.isPartnerPresent() || checkFive_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 12, column: 30
                  checkFive_o.setREQ(false);//sysj\conveyor.sysj line: 12, column: 30
                  S8536=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  S8531=0;
                  if(checkFive_o.isACK()){//sysj\conveyor.sysj line: 12, column: 30
                    checkFive_o.setVal((simFive_19.getpreval() == null ? null : ((Boolean)simFive_19.getpreval())));//sysj\conveyor.sysj line: 12, column: 30
                    S8531=1;
                    if(!checkFive_o.isACK()){//sysj\conveyor.sysj line: 12, column: 30
                      checkFive_o.setREQ(false);//sysj\conveyor.sysj line: 12, column: 30
                      ends[22]=2;
                      ;//sysj\conveyor.sysj line: 12, column: 30
                      S8574=0;
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

  public void thread10058(int [] tdone, int [] ends){
        switch(S8528){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S8342){
          case 0 : 
            if(simC_19.getprestatus()){//sysj\conveyor.sysj line: 10, column: 14
              S8342=1;
              S8304=0;
              if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 10, column: 27
                simCapper_o.setREQ(false);//sysj\conveyor.sysj line: 10, column: 27
                S8304=1;
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              else {
                S8299=0;
                if(simCapper_o.isACK()){//sysj\conveyor.sysj line: 10, column: 27
                  simCapper_o.setVal((simC_19.getpreval() == null ? null : ((Boolean)simC_19.getpreval())));//sysj\conveyor.sysj line: 10, column: 27
                  S8299=1;
                  if(!simCapper_o.isACK()){//sysj\conveyor.sysj line: 10, column: 27
                    simCapper_o.setREQ(false);//sysj\conveyor.sysj line: 10, column: 27
                    ends[21]=2;
                    ;//sysj\conveyor.sysj line: 10, column: 27
                    S8342=0;
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
            switch(S8304){
              case 0 : 
                if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 10, column: 27
                  simCapper_o.setREQ(false);//sysj\conveyor.sysj line: 10, column: 27
                  S8304=1;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  switch(S8299){
                    case 0 : 
                      if(simCapper_o.isACK()){//sysj\conveyor.sysj line: 10, column: 27
                        simCapper_o.setVal((simC_19.getpreval() == null ? null : ((Boolean)simC_19.getpreval())));//sysj\conveyor.sysj line: 10, column: 27
                        S8299=1;
                        if(!simCapper_o.isACK()){//sysj\conveyor.sysj line: 10, column: 27
                          simCapper_o.setREQ(false);//sysj\conveyor.sysj line: 10, column: 27
                          ends[21]=2;
                          ;//sysj\conveyor.sysj line: 10, column: 27
                          S8342=0;
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
                      if(!simCapper_o.isACK()){//sysj\conveyor.sysj line: 10, column: 27
                        simCapper_o.setREQ(false);//sysj\conveyor.sysj line: 10, column: 27
                        ends[21]=2;
                        ;//sysj\conveyor.sysj line: 10, column: 27
                        S8342=0;
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
                S8304=1;
                S8304=0;
                if(!simCapper_o.isPartnerPresent() || simCapper_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 10, column: 27
                  simCapper_o.setREQ(false);//sysj\conveyor.sysj line: 10, column: 27
                  S8304=1;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  S8299=0;
                  if(simCapper_o.isACK()){//sysj\conveyor.sysj line: 10, column: 27
                    simCapper_o.setVal((simC_19.getpreval() == null ? null : ((Boolean)simC_19.getpreval())));//sysj\conveyor.sysj line: 10, column: 27
                    S8299=1;
                    if(!simCapper_o.isACK()){//sysj\conveyor.sysj line: 10, column: 27
                      simCapper_o.setREQ(false);//sysj\conveyor.sysj line: 10, column: 27
                      ends[21]=2;
                      ;//sysj\conveyor.sysj line: 10, column: 27
                      S8342=0;
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

  public void thread10057(int [] tdone, int [] ends){
        switch(S8296){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S8110){
          case 0 : 
            if(simF_19.getprestatus()){//sysj\conveyor.sysj line: 8, column: 14
              S8110=1;
              S8072=0;
              if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 8, column: 27
                simFiller_o.setREQ(false);//sysj\conveyor.sysj line: 8, column: 27
                S8072=1;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                S8067=0;
                if(simFiller_o.isACK()){//sysj\conveyor.sysj line: 8, column: 27
                  simFiller_o.setVal((simF_19.getpreval() == null ? null : ((Boolean)simF_19.getpreval())));//sysj\conveyor.sysj line: 8, column: 27
                  S8067=1;
                  if(!simFiller_o.isACK()){//sysj\conveyor.sysj line: 8, column: 27
                    simFiller_o.setREQ(false);//sysj\conveyor.sysj line: 8, column: 27
                    ends[20]=2;
                    ;//sysj\conveyor.sysj line: 8, column: 27
                    S8110=0;
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
            switch(S8072){
              case 0 : 
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 8, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor.sysj line: 8, column: 27
                  S8072=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  switch(S8067){
                    case 0 : 
                      if(simFiller_o.isACK()){//sysj\conveyor.sysj line: 8, column: 27
                        simFiller_o.setVal((simF_19.getpreval() == null ? null : ((Boolean)simF_19.getpreval())));//sysj\conveyor.sysj line: 8, column: 27
                        S8067=1;
                        if(!simFiller_o.isACK()){//sysj\conveyor.sysj line: 8, column: 27
                          simFiller_o.setREQ(false);//sysj\conveyor.sysj line: 8, column: 27
                          ends[20]=2;
                          ;//sysj\conveyor.sysj line: 8, column: 27
                          S8110=0;
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
                      if(!simFiller_o.isACK()){//sysj\conveyor.sysj line: 8, column: 27
                        simFiller_o.setREQ(false);//sysj\conveyor.sysj line: 8, column: 27
                        ends[20]=2;
                        ;//sysj\conveyor.sysj line: 8, column: 27
                        S8110=0;
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
                S8072=1;
                S8072=0;
                if(!simFiller_o.isPartnerPresent() || simFiller_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 8, column: 27
                  simFiller_o.setREQ(false);//sysj\conveyor.sysj line: 8, column: 27
                  S8072=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  S8067=0;
                  if(simFiller_o.isACK()){//sysj\conveyor.sysj line: 8, column: 27
                    simFiller_o.setVal((simF_19.getpreval() == null ? null : ((Boolean)simF_19.getpreval())));//sysj\conveyor.sysj line: 8, column: 27
                    S8067=1;
                    if(!simFiller_o.isACK()){//sysj\conveyor.sysj line: 8, column: 27
                      simFiller_o.setREQ(false);//sysj\conveyor.sysj line: 8, column: 27
                      ends[20]=2;
                      ;//sysj\conveyor.sysj line: 8, column: 27
                      S8110=0;
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

  public void thread10056(int [] tdone, int [] ends){
        switch(S9928){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        simF_19.setClear();//sysj\conveyor.sysj line: 7, column: 2
        simC_19.setClear();//sysj\conveyor.sysj line: 7, column: 2
        simFive_19.setClear();//sysj\conveyor.sysj line: 7, column: 2
        simThree_19.setClear();//sysj\conveyor.sysj line: 7, column: 2
        simOne_19.setClear();//sysj\conveyor.sysj line: 7, column: 2
        thread10057(tdone,ends);
        thread10058(tdone,ends);
        thread10059(tdone,ends);
        thread10060(tdone,ends);
        thread10061(tdone,ends);
        thread10062(tdone,ends);
        int biggest10063 = 0;
        if(ends[20]>=biggest10063){
          biggest10063=ends[20];
        }
        if(ends[21]>=biggest10063){
          biggest10063=ends[21];
        }
        if(ends[22]>=biggest10063){
          biggest10063=ends[22];
        }
        if(ends[23]>=biggest10063){
          biggest10063=ends[23];
        }
        if(ends[24]>=biggest10063){
          biggest10063=ends[24];
        }
        if(ends[25]>=biggest10063){
          biggest10063=ends[25];
        }
        if(biggest10063 == 1){
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        //FINXME code
        if(biggest10063 == 0){
          S9928=0;
          active[19]=0;
          ends[19]=0;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread10053(int [] tdone, int [] ends){
        S8003=1;
    __start_thread_18 = com.systemj.Timer.getMs();//sysj\conveyor.sysj line: 147, column: 18
    if(com.systemj.Timer.getMs() - __start_thread_18 >= (1) * 1000){//sysj\conveyor.sysj line: 147, column: 18
      ends[18]=3;
      ;//sysj\conveyor.sysj line: 147, column: 18
      System.out.println("*Bottle Sent to Collection Point");//sysj\conveyor.sysj line: 149, column: 22
      ends[18]=2;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread10052(int [] tdone, int [] ends){
        S7987=1;
    bottleLeftPos5E.setPresent();//sysj\conveyor.sysj line: 145, column: 19
    currsigs.addElement(bottleLeftPos5E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread10050(int [] tdone, int [] ends){
        switch(S8003){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_18 >= (1) * 1000){//sysj\conveyor.sysj line: 147, column: 18
          ends[18]=3;
          ;//sysj\conveyor.sysj line: 147, column: 18
          System.out.println("*Bottle Sent to Collection Point");//sysj\conveyor.sysj line: 149, column: 22
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

  public void thread10049(int [] tdone, int [] ends){
        switch(S7987){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        bottleLeftPos5E.setPresent();//sysj\conveyor.sysj line: 145, column: 19
        currsigs.addElement(bottleLeftPos5E);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread10048(int [] tdone, int [] ends){
        switch(S8056){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S8006){
          case 0 : 
            thread10049(tdone,ends);
            thread10050(tdone,ends);
            int biggest10051 = 0;
            if(ends[17]>=biggest10051){
              biggest10051=ends[17];
            }
            if(ends[18]>=biggest10051){
              biggest10051=ends[18];
            }
            if(biggest10051 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            if(biggest10051 == 2){
              ends[16]=2;
              ;//sysj\conveyor.sysj line: 144, column: 11
              S8006=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest10051 == 0){
              S8006=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            S8006=1;
            S8006=0;
            if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor.sysj line: 143, column: 19
              thread10052(tdone,ends);
              thread10053(tdone,ends);
              int biggest10054 = 0;
              if(ends[17]>=biggest10054){
                biggest10054=ends[17];
              }
              if(ends[18]>=biggest10054){
                biggest10054=ends[18];
              }
              if(biggest10054 == 1){
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              if(biggest10054 == 2){
                ends[16]=2;
                ;//sysj\conveyor.sysj line: 144, column: 11
                S8006=1;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
            }
            else {
              S8006=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10046(int [] tdone, int [] ends){
        switch(S7923){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\conveyor.sysj line: 132, column: 28
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

  public void thread10045(int [] tdone, int [] ends){
        switch(S7920){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        bottleDeployedE.setPresent();//sysj\conveyor.sysj line: 128, column: 22
        currsigs.addElement(bottleDeployedE);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread10043(int [] tdone, int [] ends){
        S7923=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread10042(int [] tdone, int [] ends){
        S7920=1;
    bottleDeployedE.setPresent();//sysj\conveyor.sysj line: 128, column: 22
    currsigs.addElement(bottleDeployedE);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread10041(int [] tdone, int [] ends){
        switch(S7982){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S7936){
          case 0 : 
            if(!bottleLeftPos5E.getprestatus()){//sysj\conveyor.sysj line: 124, column: 18
              S7936=1;
              if(bottleDeployed.getprestatus()){//sysj\conveyor.sysj line: 125, column: 19
                thread10042(tdone,ends);
                thread10043(tdone,ends);
                int biggest10044 = 0;
                if(ends[14]>=biggest10044){
                  biggest10044=ends[14];
                }
                if(ends[15]>=biggest10044){
                  biggest10044=ends[15];
                }
                if(biggest10044 == 1){
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
              else {
                S7936=2;
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
            thread10045(tdone,ends);
            thread10046(tdone,ends);
            int biggest10047 = 0;
            if(ends[14]>=biggest10047){
              biggest10047=ends[14];
            }
            if(ends[15]>=biggest10047){
              biggest10047=ends[15];
            }
            if(biggest10047 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            if(biggest10047 == 2){
              ends[13]=2;
              ;//sysj\conveyor.sysj line: 126, column: 11
              S7936=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            //FINXME code
            if(biggest10047 == 0){
              S7936=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 2 : 
            S7936=2;
            S7936=0;
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10040(int [] tdone, int [] ends){
        switch(S8058){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        thread10041(tdone,ends);
        thread10048(tdone,ends);
        int biggest10055 = 0;
        if(ends[13]>=biggest10055){
          biggest10055=ends[13];
        }
        if(ends[16]>=biggest10055){
          biggest10055=ends[16];
        }
        if(biggest10055 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        //FINXME code
        if(biggest10055 == 0){
          S8058=0;
          active[12]=0;
          ends[12]=0;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread10039(int [] tdone, int [] ends){
        switch(S7914){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S7824){
          case 0 : 
            if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor.sysj line: 114, column: 23
              S7824=1;
              __start_thread_11 = com.systemj.Timer.getMs();//sysj\conveyor.sysj line: 112, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_11 >= (1) * 1000){//sysj\conveyor.sysj line: 112, column: 5
                ends[11]=2;
                ;//sysj\conveyor.sysj line: 112, column: 5
                S7824=2;
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
            if(com.systemj.Timer.getMs() - __start_thread_11 >= (1) * 1000){//sysj\conveyor.sysj line: 112, column: 5
              ends[11]=2;
              ;//sysj\conveyor.sysj line: 112, column: 5
              S7824=2;
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
            S7824=2;
            System.out.println("*Bottle Left From Position 5 Of The Index Table, Still On The Conveyor");//sysj\conveyor.sysj line: 117, column: 7
            S7824=0;
            if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor.sysj line: 114, column: 23
              S7824=1;
              __start_thread_11 = com.systemj.Timer.getMs();//sysj\conveyor.sysj line: 112, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_11 >= (1) * 1000){//sysj\conveyor.sysj line: 112, column: 5
                ends[11]=2;
                ;//sysj\conveyor.sysj line: 112, column: 5
                S7824=2;
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

  public void thread10038(int [] tdone, int [] ends){
        switch(S7780){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S7732){
          case 0 : 
            switch(S7716){
              case 0 : 
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor.sysj line: 102, column: 4
                  rotated_in.setACK(false);//sysj\conveyor.sysj line: 102, column: 4
                  S7716=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S7711){
                    case 0 : 
                      if(!rotated_in.isREQ()){//sysj\conveyor.sysj line: 102, column: 4
                        rotated_in.setACK(true);//sysj\conveyor.sysj line: 102, column: 4
                        S7711=1;
                        if(rotated_in.isREQ()){//sysj\conveyor.sysj line: 102, column: 4
                          rotated_in.setACK(false);//sysj\conveyor.sysj line: 102, column: 4
                          ends[10]=2;
                          ;//sysj\conveyor.sysj line: 102, column: 4
                          rotaryRotated_1.setPresent();//sysj\conveyor.sysj line: 103, column: 4
                          currsigs.addElement(rotaryRotated_1);
                          rotaryTableTriggerE.setPresent();//sysj\conveyor.sysj line: 104, column: 6
                          currsigs.addElement(rotaryTableTriggerE);
                          System.out.println("*Rotary rotated");//sysj\conveyor.sysj line: 105, column: 4
                          S7732=1;
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
                      if(rotated_in.isREQ()){//sysj\conveyor.sysj line: 102, column: 4
                        rotated_in.setACK(false);//sysj\conveyor.sysj line: 102, column: 4
                        ends[10]=2;
                        ;//sysj\conveyor.sysj line: 102, column: 4
                        rotaryRotated_1.setPresent();//sysj\conveyor.sysj line: 103, column: 4
                        currsigs.addElement(rotaryRotated_1);
                        rotaryTableTriggerE.setPresent();//sysj\conveyor.sysj line: 104, column: 6
                        currsigs.addElement(rotaryTableTriggerE);
                        System.out.println("*Rotary rotated");//sysj\conveyor.sysj line: 105, column: 4
                        S7732=1;
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
                S7716=1;
                S7716=0;
                if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor.sysj line: 102, column: 4
                  rotated_in.setACK(false);//sysj\conveyor.sysj line: 102, column: 4
                  S7716=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S7711=0;
                  if(!rotated_in.isREQ()){//sysj\conveyor.sysj line: 102, column: 4
                    rotated_in.setACK(true);//sysj\conveyor.sysj line: 102, column: 4
                    S7711=1;
                    if(rotated_in.isREQ()){//sysj\conveyor.sysj line: 102, column: 4
                      rotated_in.setACK(false);//sysj\conveyor.sysj line: 102, column: 4
                      ends[10]=2;
                      ;//sysj\conveyor.sysj line: 102, column: 4
                      rotaryRotated_1.setPresent();//sysj\conveyor.sysj line: 103, column: 4
                      currsigs.addElement(rotaryRotated_1);
                      rotaryTableTriggerE.setPresent();//sysj\conveyor.sysj line: 104, column: 6
                      currsigs.addElement(rotaryTableTriggerE);
                      System.out.println("*Rotary rotated");//sysj\conveyor.sysj line: 105, column: 4
                      S7732=1;
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
            S7732=1;
            S7732=0;
            S7716=0;
            if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor.sysj line: 102, column: 4
              rotated_in.setACK(false);//sysj\conveyor.sysj line: 102, column: 4
              S7716=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S7711=0;
              if(!rotated_in.isREQ()){//sysj\conveyor.sysj line: 102, column: 4
                rotated_in.setACK(true);//sysj\conveyor.sysj line: 102, column: 4
                S7711=1;
                if(rotated_in.isREQ()){//sysj\conveyor.sysj line: 102, column: 4
                  rotated_in.setACK(false);//sysj\conveyor.sysj line: 102, column: 4
                  ends[10]=2;
                  ;//sysj\conveyor.sysj line: 102, column: 4
                  rotaryRotated_1.setPresent();//sysj\conveyor.sysj line: 103, column: 4
                  currsigs.addElement(rotaryRotated_1);
                  rotaryTableTriggerE.setPresent();//sysj\conveyor.sysj line: 104, column: 6
                  currsigs.addElement(rotaryTableTriggerE);
                  System.out.println("*Rotary rotated");//sysj\conveyor.sysj line: 105, column: 4
                  S7732=1;
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

  public void thread10036(int [] tdone, int [] ends){
        switch(S7175){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S7170){
          case 0 : 
            if(com.systemj.Timer.getMs() - __start_thread_9 >= 500){//sysj\conveyor.sysj line: 85, column: 17
              ends[9]=3;
              ;//sysj\conveyor.sysj line: 85, column: 17
              System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor.sysj line: 87, column: 21
              S7170=1;
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
            if(bottleAtPos1.getprestatus()){//sysj\conveyor.sysj line: 88, column: 27
              System.out.println("*Conveyor - Bottle Reached Pos1*");//sysj\conveyor.sysj line: 89, column: 21
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

  public void thread10035(int [] tdone, int [] ends){
        switch(S7155){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\conveyor.sysj line: 82, column: 21
        currsigs.addElement(motConveyorOnOff);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread10033(int [] tdone, int [] ends){
        S7175=1;
    S7170=0;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\conveyor.sysj line: 85, column: 17
    if(com.systemj.Timer.getMs() - __start_thread_9 >= 500){//sysj\conveyor.sysj line: 85, column: 17
      ends[9]=3;
      ;//sysj\conveyor.sysj line: 85, column: 17
      System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor.sysj line: 87, column: 21
      S7170=1;
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

  public void thread10032(int [] tdone, int [] ends){
        S7155=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor.sysj line: 81, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor.sysj line: 82, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread10030(int [] tdone, int [] ends){
        S7175=1;
    S7170=0;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\conveyor.sysj line: 85, column: 17
    if(com.systemj.Timer.getMs() - __start_thread_9 >= 500){//sysj\conveyor.sysj line: 85, column: 17
      ends[9]=3;
      ;//sysj\conveyor.sysj line: 85, column: 17
      System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor.sysj line: 87, column: 21
      S7170=1;
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

  public void thread10029(int [] tdone, int [] ends){
        S7155=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor.sysj line: 81, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor.sysj line: 82, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread10028(int [] tdone, int [] ends){
        switch(S7709){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S7117){
          case 0 : 
            if(!bottleLeftPos5E.getprestatus()){//sysj\conveyor.sysj line: 72, column: 18
              S7117=1;
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
            S7117=1;
            S7117=2;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
          case 2 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor.sysj line: 74, column: 19
              S7117=3;
              __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor.sysj line: 69, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\conveyor.sysj line: 69, column: 5
                ends[7]=2;
                ;//sysj\conveyor.sysj line: 69, column: 5
                S7117=4;
                thread10029(tdone,ends);
                thread10030(tdone,ends);
                int biggest10031 = 0;
                if(ends[8]>=biggest10031){
                  biggest10031=ends[8];
                }
                if(ends[9]>=biggest10031){
                  biggest10031=ends[9];
                }
                if(biggest10031 == 1){
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
            if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\conveyor.sysj line: 69, column: 5
              ends[7]=2;
              ;//sysj\conveyor.sysj line: 69, column: 5
              S7117=4;
              thread10032(tdone,ends);
              thread10033(tdone,ends);
              int biggest10034 = 0;
              if(ends[8]>=biggest10034){
                biggest10034=ends[8];
              }
              if(ends[9]>=biggest10034){
                biggest10034=ends[9];
              }
              if(biggest10034 == 1){
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
            thread10035(tdone,ends);
            thread10036(tdone,ends);
            int biggest10037 = 0;
            if(ends[8]>=biggest10037){
              biggest10037=ends[8];
            }
            if(ends[9]>=biggest10037){
              biggest10037=ends[9];
            }
            if(biggest10037 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest10037 == 2){
              ends[7]=2;
              ;//sysj\conveyor.sysj line: 79, column: 13
              S7117=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest10037 == 0){
              S7117=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10026(int [] tdone, int [] ends){
        S6314=1;
    S6269=0;
    if(empty_1.getprestatus()){//sysj\conveyor.sysj line: 47, column: 34
      S6269=1;
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

  public void thread10025(int [] tdone, int [] ends){
        S6267=1;
    S6266=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread10023(int [] tdone, int [] ends){
        switch(S6466){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(rotaryRotated_1.getprestatus()){//sysj\conveyor.sysj line: 62, column: 20
          S6466=0;
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

  public void thread10022(int [] tdone, int [] ends){
        switch(S6463){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S6446){
          case 0 : 
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 60, column: 14
              convReady_o.setREQ(false);//sysj\conveyor.sysj line: 60, column: 14
              S6446=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S6441){
                case 0 : 
                  if(convReady_o.isACK()){//sysj\conveyor.sysj line: 60, column: 14
                    convReady_o.setVal(Boolean.TRUE);//sysj\conveyor.sysj line: 60, column: 14
                    S6441=1;
                    if(!convReady_o.isACK()){//sysj\conveyor.sysj line: 60, column: 14
                      convReady_o.setREQ(false);//sysj\conveyor.sysj line: 60, column: 14
                      ends[5]=2;
                      ;//sysj\conveyor.sysj line: 60, column: 14
                      S6463=0;
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
                  if(!convReady_o.isACK()){//sysj\conveyor.sysj line: 60, column: 14
                    convReady_o.setREQ(false);//sysj\conveyor.sysj line: 60, column: 14
                    ends[5]=2;
                    ;//sysj\conveyor.sysj line: 60, column: 14
                    S6463=0;
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
            S6446=1;
            S6446=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 60, column: 14
              convReady_o.setREQ(false);//sysj\conveyor.sysj line: 60, column: 14
              S6446=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S6441=0;
              if(convReady_o.isACK()){//sysj\conveyor.sysj line: 60, column: 14
                convReady_o.setVal(Boolean.TRUE);//sysj\conveyor.sysj line: 60, column: 14
                S6441=1;
                if(!convReady_o.isACK()){//sysj\conveyor.sysj line: 60, column: 14
                  convReady_o.setREQ(false);//sysj\conveyor.sysj line: 60, column: 14
                  ends[5]=2;
                  ;//sysj\conveyor.sysj line: 60, column: 14
                  S6463=0;
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

  public void thread10020(int [] tdone, int [] ends){
        S6466=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread10019(int [] tdone, int [] ends){
        S6463=1;
    S6446=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 60, column: 14
      convReady_o.setREQ(false);//sysj\conveyor.sysj line: 60, column: 14
      S6446=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S6441=0;
      if(convReady_o.isACK()){//sysj\conveyor.sysj line: 60, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor.sysj line: 60, column: 14
        S6441=1;
        if(!convReady_o.isACK()){//sysj\conveyor.sysj line: 60, column: 14
          convReady_o.setREQ(false);//sysj\conveyor.sysj line: 60, column: 14
          ends[5]=2;
          ;//sysj\conveyor.sysj line: 60, column: 14
          S6463=0;
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

  public void thread10017(int [] tdone, int [] ends){
        S6466=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread10016(int [] tdone, int [] ends){
        S6463=1;
    S6446=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 60, column: 14
      convReady_o.setREQ(false);//sysj\conveyor.sysj line: 60, column: 14
      S6446=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S6441=0;
      if(convReady_o.isACK()){//sysj\conveyor.sysj line: 60, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor.sysj line: 60, column: 14
        S6441=1;
        if(!convReady_o.isACK()){//sysj\conveyor.sysj line: 60, column: 14
          convReady_o.setREQ(false);//sysj\conveyor.sysj line: 60, column: 14
          ends[5]=2;
          ;//sysj\conveyor.sysj line: 60, column: 14
          S6463=0;
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

  public void thread10014(int [] tdone, int [] ends){
        S6466=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread10013(int [] tdone, int [] ends){
        S6463=1;
    S6446=0;
    if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 60, column: 14
      convReady_o.setREQ(false);//sysj\conveyor.sysj line: 60, column: 14
      S6446=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S6441=0;
      if(convReady_o.isACK()){//sysj\conveyor.sysj line: 60, column: 14
        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor.sysj line: 60, column: 14
        S6441=1;
        if(!convReady_o.isACK()){//sysj\conveyor.sysj line: 60, column: 14
          convReady_o.setREQ(false);//sysj\conveyor.sysj line: 60, column: 14
          ends[5]=2;
          ;//sysj\conveyor.sysj line: 60, column: 14
          S6463=0;
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

  public void thread10011(int [] tdone, int [] ends){
        switch(S6314){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S6269){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\conveyor.sysj line: 47, column: 34
              S6269=1;
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
            S6269=1;
            S6269=2;
            S6276=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 49, column: 18
              convReady_o.setREQ(false);//sysj\conveyor.sysj line: 49, column: 18
              S6276=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S6271=0;
              if(convReady_o.isACK()){//sysj\conveyor.sysj line: 49, column: 18
                convReady_o.setVal(Boolean.FALSE);//sysj\conveyor.sysj line: 49, column: 18
                S6271=1;
                if(!convReady_o.isACK()){//sysj\conveyor.sysj line: 49, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor.sysj line: 49, column: 18
                  ends[4]=2;
                  ;//sysj\conveyor.sysj line: 49, column: 18
                  System.out.println("*Empty...*");//sysj\conveyor.sysj line: 50, column: 18
                  S6314=0;
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
            switch(S6276){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 49, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor.sysj line: 49, column: 18
                  S6276=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S6271){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor.sysj line: 49, column: 18
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor.sysj line: 49, column: 18
                        S6271=1;
                        if(!convReady_o.isACK()){//sysj\conveyor.sysj line: 49, column: 18
                          convReady_o.setREQ(false);//sysj\conveyor.sysj line: 49, column: 18
                          ends[4]=2;
                          ;//sysj\conveyor.sysj line: 49, column: 18
                          System.out.println("*Empty...*");//sysj\conveyor.sysj line: 50, column: 18
                          S6314=0;
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
                      if(!convReady_o.isACK()){//sysj\conveyor.sysj line: 49, column: 18
                        convReady_o.setREQ(false);//sysj\conveyor.sysj line: 49, column: 18
                        ends[4]=2;
                        ;//sysj\conveyor.sysj line: 49, column: 18
                        System.out.println("*Empty...*");//sysj\conveyor.sysj line: 50, column: 18
                        S6314=0;
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
                S6276=1;
                S6276=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 49, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor.sysj line: 49, column: 18
                  S6276=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S6271=0;
                  if(convReady_o.isACK()){//sysj\conveyor.sysj line: 49, column: 18
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor.sysj line: 49, column: 18
                    S6271=1;
                    if(!convReady_o.isACK()){//sysj\conveyor.sysj line: 49, column: 18
                      convReady_o.setREQ(false);//sysj\conveyor.sysj line: 49, column: 18
                      ends[4]=2;
                      ;//sysj\conveyor.sysj line: 49, column: 18
                      System.out.println("*Empty...*");//sysj\conveyor.sysj line: 50, column: 18
                      S6314=0;
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

  public void thread10010(int [] tdone, int [] ends){
        switch(S6267){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S6266){
          case 0 : 
            if(bottleAtPos1.getprestatus()){//sysj\conveyor.sysj line: 41, column: 27
              S6266=1;
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
            S6266=1;
            convReady_o.setPreempted();//sysj\conveyor.sysj line: 43, column: 21
            ends[3]=2;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10009(int [] tdone, int [] ends){
        switch(S7115){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S6367){
          case 0 : 
            thread10010(tdone,ends);
            thread10011(tdone,ends);
            int biggest10012 = 0;
            if(ends[3]>=biggest10012){
              biggest10012=ends[3];
            }
            if(ends[4]>=biggest10012){
              biggest10012=ends[4];
            }
            if(biggest10012 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest10012 == 2){
              ends[2]=2;
              ;//sysj\conveyor.sysj line: 39, column: 13
              S6367=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest10012 == 0){
              S6367=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S6367=1;
            insert_1.setPresent();//sysj\conveyor.sysj line: 54, column: 13
            currsigs.addElement(insert_1);
            S6367=2;
            S6374=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 55, column: 13
              convReady_o.setREQ(false);//sysj\conveyor.sysj line: 55, column: 13
              S6374=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S6369=0;
              if(convReady_o.isACK()){//sysj\conveyor.sysj line: 55, column: 13
                convReady_o.setVal(Boolean.FALSE);//sysj\conveyor.sysj line: 55, column: 13
                S6369=1;
                if(!convReady_o.isACK()){//sysj\conveyor.sysj line: 55, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor.sysj line: 55, column: 13
                  ends[2]=2;
                  ;//sysj\conveyor.sysj line: 55, column: 13
                  S6367=3;
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
            switch(S6374){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 55, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor.sysj line: 55, column: 13
                  S6374=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S6369){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor.sysj line: 55, column: 13
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor.sysj line: 55, column: 13
                        S6369=1;
                        if(!convReady_o.isACK()){//sysj\conveyor.sysj line: 55, column: 13
                          convReady_o.setREQ(false);//sysj\conveyor.sysj line: 55, column: 13
                          ends[2]=2;
                          ;//sysj\conveyor.sysj line: 55, column: 13
                          S6367=3;
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
                      if(!convReady_o.isACK()){//sysj\conveyor.sysj line: 55, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor.sysj line: 55, column: 13
                        ends[2]=2;
                        ;//sysj\conveyor.sysj line: 55, column: 13
                        S6367=3;
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
                S6374=1;
                S6374=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor.sysj line: 55, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor.sysj line: 55, column: 13
                  S6374=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S6369=0;
                  if(convReady_o.isACK()){//sysj\conveyor.sysj line: 55, column: 13
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor.sysj line: 55, column: 13
                    S6369=1;
                    if(!convReady_o.isACK()){//sysj\conveyor.sysj line: 55, column: 13
                      convReady_o.setREQ(false);//sysj\conveyor.sysj line: 55, column: 13
                      ends[2]=2;
                      ;//sysj\conveyor.sysj line: 55, column: 13
                      S6367=3;
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
            S6367=3;
            S6367=4;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj\conveyor.sysj line: 35, column: 5
            S6413=0;
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor.sysj line: 35, column: 5
              ends[2]=2;
              ;//sysj\conveyor.sysj line: 35, column: 5
              S6367=5;
              thread10013(tdone,ends);
              thread10014(tdone,ends);
              int biggest10015 = 0;
              if(ends[5]>=biggest10015){
                biggest10015=ends[5];
              }
              if(ends[6]>=biggest10015){
                biggest10015=ends[6];
              }
              if(biggest10015 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S6413=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            switch(S6413){
              case 0 : 
                S6413=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor.sysj line: 35, column: 5
                  ends[2]=2;
                  ;//sysj\conveyor.sysj line: 35, column: 5
                  S6367=5;
                  thread10016(tdone,ends);
                  thread10017(tdone,ends);
                  int biggest10018 = 0;
                  if(ends[5]>=biggest10018){
                    biggest10018=ends[5];
                  }
                  if(ends[6]>=biggest10018){
                    biggest10018=ends[6];
                  }
                  if(biggest10018 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S6413=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S6413=1;
                S6413=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\conveyor.sysj line: 35, column: 5
                  ends[2]=2;
                  ;//sysj\conveyor.sysj line: 35, column: 5
                  S6367=5;
                  thread10019(tdone,ends);
                  thread10020(tdone,ends);
                  int biggest10021 = 0;
                  if(ends[5]>=biggest10021){
                    biggest10021=ends[5];
                  }
                  if(ends[6]>=biggest10021){
                    biggest10021=ends[6];
                  }
                  if(biggest10021 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S6413=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 5 : 
            thread10022(tdone,ends);
            thread10023(tdone,ends);
            int biggest10024 = 0;
            if(ends[5]>=biggest10024){
              biggest10024=ends[5];
            }
            if(ends[6]>=biggest10024){
              biggest10024=ends[6];
            }
            if(biggest10024 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest10024 == 0){
              S6367=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            S6367=6;
            System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor.sysj line: 37, column: 10
            S6367=0;
            thread10025(tdone,ends);
            thread10026(tdone,ends);
            int biggest10027 = 0;
            if(ends[3]>=biggest10027){
              biggest10027=ends[3];
            }
            if(ends[4]>=biggest10027){
              biggest10027=ends[4];
            }
            if(biggest10027 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10006(int [] tdone, int [] ends){
        S9926=1;
    q_thread_25 = new boolean[5];//sysj\conveyor.sysj line: 20, column: 3
    S9248=0;
    System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 23, column: 5
    o_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
    c_thread_25 = false;//sysj\conveyor.sysj line: 22, column: 9
    System.out.print("* Current bottle's locations :");//sysj\conveyor.sysj line: 25, column: 5
    for(int i_thread_25 = 0; i_thread_25 < q_thread_25.length; i_thread_25 = i_thread_25 + 1) {//sysj\conveyor.sysj line: 26, column: 34
      if(q_thread_25[i_thread_25]) {//sysj\conveyor.sysj line: 27, column: 6
        o_thread_25 = true;//sysj\conveyor.sysj line: 28, column: 7
      }
      System.out.print(" " + (q_thread_25[i_thread_25] ? 1 : 0));//sysj\conveyor.sysj line: 29, column: 6
    }
    System.out.println("\n-------------------------");//sysj\conveyor.sysj line: 31, column: 5
    if(rotaryRotated_1.getprestatus()){//sysj\conveyor.sysj line: 33, column: 13
      simOne_19.setPresent();//sysj\conveyor.sysj line: 34, column: 6
      currsigs.addElement(simOne_19);
      simOne_19.setValue(q_thread_25[0] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 34, column: 6
      simF_19.setPresent();//sysj\conveyor.sysj line: 35, column: 6
      currsigs.addElement(simF_19);
      simF_19.setValue(q_thread_25[1] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 35, column: 6
      simThree_19.setPresent();//sysj\conveyor.sysj line: 36, column: 6
      currsigs.addElement(simThree_19);
      simThree_19.setValue(q_thread_25[2] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 36, column: 6
      simC_19.setPresent();//sysj\conveyor.sysj line: 37, column: 6
      currsigs.addElement(simC_19);
      simC_19.setValue(q_thread_25[3] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 37, column: 6
      simFive_19.setPresent();//sysj\conveyor.sysj line: 38, column: 6
      currsigs.addElement(simFive_19);
      simFive_19.setValue(q_thread_25[4] ? Boolean.TRUE : Boolean.FALSE);//sysj\conveyor.sysj line: 38, column: 6
      S9225=0;
      if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
        S9233=0;
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
      else {
        S9233=1;
        empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
        currsigs.addElement(empty_1);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
    else {
      S9225=0;
      if(o_thread_25){//sysj\conveyor.sysj line: 41, column: 5
        S9233=0;
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
      else {
        S9233=1;
        empty_1.setPresent();//sysj\conveyor.sysj line: 44, column: 6
        currsigs.addElement(empty_1);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
  }

  public void thread10005(int [] tdone, int [] ends){
        S9224=1;
    S9038=0;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread10004(int [] tdone, int [] ends){
        S8992=1;
    S8806=0;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread10003(int [] tdone, int [] ends){
        S8760=1;
    S8574=0;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread10002(int [] tdone, int [] ends){
        S8528=1;
    S8342=0;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread10001(int [] tdone, int [] ends){
        S8296=1;
    S8110=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread10000(int [] tdone, int [] ends){
        S9928=1;
    simF_19.setClear();//sysj\conveyor.sysj line: 7, column: 2
    simC_19.setClear();//sysj\conveyor.sysj line: 7, column: 2
    simFive_19.setClear();//sysj\conveyor.sysj line: 7, column: 2
    simThree_19.setClear();//sysj\conveyor.sysj line: 7, column: 2
    simOne_19.setClear();//sysj\conveyor.sysj line: 7, column: 2
    thread10001(tdone,ends);
    thread10002(tdone,ends);
    thread10003(tdone,ends);
    thread10004(tdone,ends);
    thread10005(tdone,ends);
    thread10006(tdone,ends);
    int biggest10007 = 0;
    if(ends[20]>=biggest10007){
      biggest10007=ends[20];
    }
    if(ends[21]>=biggest10007){
      biggest10007=ends[21];
    }
    if(ends[22]>=biggest10007){
      biggest10007=ends[22];
    }
    if(ends[23]>=biggest10007){
      biggest10007=ends[23];
    }
    if(ends[24]>=biggest10007){
      biggest10007=ends[24];
    }
    if(ends[25]>=biggest10007){
      biggest10007=ends[25];
    }
    if(biggest10007 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread9997(int [] tdone, int [] ends){
        S8003=1;
    __start_thread_18 = com.systemj.Timer.getMs();//sysj\conveyor.sysj line: 147, column: 18
    if(com.systemj.Timer.getMs() - __start_thread_18 >= (1) * 1000){//sysj\conveyor.sysj line: 147, column: 18
      ends[18]=3;
      ;//sysj\conveyor.sysj line: 147, column: 18
      System.out.println("*Bottle Sent to Collection Point");//sysj\conveyor.sysj line: 149, column: 22
      ends[18]=2;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread9996(int [] tdone, int [] ends){
        S7987=1;
    bottleLeftPos5E.setPresent();//sysj\conveyor.sysj line: 145, column: 19
    currsigs.addElement(bottleLeftPos5E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread9995(int [] tdone, int [] ends){
        S8056=1;
    S8006=0;
    if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor.sysj line: 143, column: 19
      thread9996(tdone,ends);
      thread9997(tdone,ends);
      int biggest9998 = 0;
      if(ends[17]>=biggest9998){
        biggest9998=ends[17];
      }
      if(ends[18]>=biggest9998){
        biggest9998=ends[18];
      }
      if(biggest9998 == 1){
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
      if(biggest9998 == 2){
        ends[16]=2;
        ;//sysj\conveyor.sysj line: 144, column: 11
        S8006=1;
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
    }
    else {
      S8006=1;
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread9994(int [] tdone, int [] ends){
        S7982=1;
    S7936=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread9993(int [] tdone, int [] ends){
        S8058=1;
    thread9994(tdone,ends);
    thread9995(tdone,ends);
    int biggest9999 = 0;
    if(ends[13]>=biggest9999){
      biggest9999=ends[13];
    }
    if(ends[16]>=biggest9999){
      biggest9999=ends[16];
    }
    if(biggest9999 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread9992(int [] tdone, int [] ends){
        S7914=1;
    S7824=0;
    if(bottleLeftPos5_1.getprestatus()){//sysj\conveyor.sysj line: 114, column: 23
      S7824=1;
      __start_thread_11 = com.systemj.Timer.getMs();//sysj\conveyor.sysj line: 112, column: 5
      if(com.systemj.Timer.getMs() - __start_thread_11 >= (1) * 1000){//sysj\conveyor.sysj line: 112, column: 5
        ends[11]=2;
        ;//sysj\conveyor.sysj line: 112, column: 5
        S7824=2;
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

  public void thread9991(int [] tdone, int [] ends){
        S7780=1;
    S7732=0;
    S7716=0;
    if(!rotated_in.isPartnerPresent() || rotated_in.isPartnerPreempted()){//sysj\conveyor.sysj line: 102, column: 4
      rotated_in.setACK(false);//sysj\conveyor.sysj line: 102, column: 4
      S7716=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S7711=0;
      if(!rotated_in.isREQ()){//sysj\conveyor.sysj line: 102, column: 4
        rotated_in.setACK(true);//sysj\conveyor.sysj line: 102, column: 4
        S7711=1;
        if(rotated_in.isREQ()){//sysj\conveyor.sysj line: 102, column: 4
          rotated_in.setACK(false);//sysj\conveyor.sysj line: 102, column: 4
          ends[10]=2;
          ;//sysj\conveyor.sysj line: 102, column: 4
          rotaryRotated_1.setPresent();//sysj\conveyor.sysj line: 103, column: 4
          currsigs.addElement(rotaryRotated_1);
          rotaryTableTriggerE.setPresent();//sysj\conveyor.sysj line: 104, column: 6
          currsigs.addElement(rotaryTableTriggerE);
          System.out.println("*Rotary rotated");//sysj\conveyor.sysj line: 105, column: 4
          S7732=1;
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

  public void thread9990(int [] tdone, int [] ends){
        S7709=1;
    S7117=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread9988(int [] tdone, int [] ends){
        S6314=1;
    S6269=0;
    if(empty_1.getprestatus()){//sysj\conveyor.sysj line: 47, column: 34
      S6269=1;
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

  public void thread9987(int [] tdone, int [] ends){
        S6267=1;
    S6266=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread9986(int [] tdone, int [] ends){
        S7115=1;
    System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor.sysj line: 37, column: 10
    S6367=0;
    thread9987(tdone,ends);
    thread9988(tdone,ends);
    int biggest9989 = 0;
    if(ends[3]>=biggest9989){
      biggest9989=ends[3];
    }
    if(ends[4]>=biggest9989){
      biggest9989=ends[4];
    }
    if(biggest9989 == 1){
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
      switch(S9930){
        case 0 : 
          S9930=0;
          break RUN;
        
        case 1 : 
          S9930=2;
          S9930=2;
          rotaryRotated_1.setClear();//sysj\conveyor.sysj line: 34, column: 2
          empty_1.setClear();//sysj\conveyor.sysj line: 34, column: 2
          insert_1.setClear();//sysj\conveyor.sysj line: 34, column: 2
          bottleLeftPos5_1.setClear();//sysj\conveyor.sysj line: 34, column: 2
          thread9986(tdone,ends);
          thread9990(tdone,ends);
          thread9991(tdone,ends);
          thread9992(tdone,ends);
          thread9993(tdone,ends);
          thread10000(tdone,ends);
          int biggest10008 = 0;
          if(ends[2]>=biggest10008){
            biggest10008=ends[2];
          }
          if(ends[7]>=biggest10008){
            biggest10008=ends[7];
          }
          if(ends[10]>=biggest10008){
            biggest10008=ends[10];
          }
          if(ends[11]>=biggest10008){
            biggest10008=ends[11];
          }
          if(ends[12]>=biggest10008){
            biggest10008=ends[12];
          }
          if(ends[19]>=biggest10008){
            biggest10008=ends[19];
          }
          if(biggest10008 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          if(biggest10008 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rotaryRotated_1.setClear();//sysj\conveyor.sysj line: 34, column: 2
          empty_1.setClear();//sysj\conveyor.sysj line: 34, column: 2
          insert_1.setClear();//sysj\conveyor.sysj line: 34, column: 2
          bottleLeftPos5_1.setClear();//sysj\conveyor.sysj line: 34, column: 2
          thread10009(tdone,ends);
          thread10028(tdone,ends);
          thread10038(tdone,ends);
          thread10039(tdone,ends);
          thread10040(tdone,ends);
          thread10056(tdone,ends);
          int biggest10064 = 0;
          if(ends[2]>=biggest10064){
            biggest10064=ends[2];
          }
          if(ends[7]>=biggest10064){
            biggest10064=ends[7];
          }
          if(ends[10]>=biggest10064){
            biggest10064=ends[10];
          }
          if(ends[11]>=biggest10064){
            biggest10064=ends[11];
          }
          if(ends[12]>=biggest10064){
            biggest10064=ends[12];
          }
          if(ends[19]>=biggest10064){
            biggest10064=ends[19];
          }
          if(biggest10064 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest10064 == 0){
            S9930=0;
            active[1]=0;
            ends[1]=0;
            S9930=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
