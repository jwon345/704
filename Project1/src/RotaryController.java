import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class RotaryController extends ClockDomain{
  public RotaryController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public input_Channel convReady_in = new input_Channel();
  public input_Channel fillerReady_in = new input_Channel();
  public input_Channel capperReady_in = new input_Channel();
  public output_Channel rotated_o = new output_Channel();
  private Signal cvR_11;
  private Signal fR_11;
  private Signal cR_11;
  private long __start_thread_16;//sysj\conveyor_controller.sysj line: 136, column: 20
  private long __start_thread_12;//sysj\conveyor_controller.sysj line: 107, column: 7
  private int S10024 = 1;
  private int S2841 = 1;
  private int S2737 = 1;
  private int S2732 = 1;
  private int S2759 = 1;
  private int S2754 = 1;
  private int S3838 = 1;
  private int S2848 = 1;
  private int S2844 = 1;
  private int S2847 = 1;
  private int S2862 = 1;
  private int S2851 = 1;
  private int S2888 = 1;
  private int S2904 = 1;
  private int S4038 = 1;
  private int S3937 = 1;
  private int S3871 = 1;
  private int S3863 = 1;
  private int S3862 = 1;
  private int S3846 = 1;
  private int S3841 = 1;
  private int S3869 = 1;
  private int S4036 = 1;
  private int S3970 = 1;
  private int S3962 = 1;
  private int S3961 = 1;
  private int S3945 = 1;
  private int S3940 = 1;
  private int S3968 = 1;
  
  private int[] ends = new int[29];
  private int[] tdone = new int[29];
  
  public void thread15942(int [] tdone, int [] ends){
        S3968=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      fR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(fR_11);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S3968=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread15941(int [] tdone, int [] ends){
        S3962=1;
    S3961=0;
    S3945=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3945=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S3940=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3940=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3961=1;
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

  public void thread15939(int [] tdone, int [] ends){
        switch(S3968){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        fR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
        currsigs.addElement(fR_11);
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
        break;
      
    }
  }

  public void thread15938(int [] tdone, int [] ends){
        switch(S3962){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S3961){
          case 0 : 
            switch(S3945){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
                  S3945=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  switch(S3940){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
                        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
                        S3940=1;
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
                          ends[22]=2;
                          ;//sysj\conveyor_controller.sysj line: 4, column: 5
                          S3961=1;
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
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
                        ends[22]=2;
                        ;//sysj\conveyor_controller.sysj line: 4, column: 5
                        S3961=1;
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
                S3945=1;
                S3945=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
                  S3945=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  S3940=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
                    S3940=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
                      ends[22]=2;
                      ;//sysj\conveyor_controller.sysj line: 4, column: 5
                      S3961=1;
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
          
          case 1 : 
            S3961=1;
            S3961=2;
            active[22]=1;
            ends[22]=1;
            tdone[22]=1;
            break;
          
          case 2 : 
            S3961=2;
            fillerReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 4, column: 36
            ends[22]=2;
            tdone[22]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread15937(int [] tdone, int [] ends){
        switch(S4036){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S3970){
          case 0 : 
            thread15938(tdone,ends);
            thread15939(tdone,ends);
            int biggest15940 = 0;
            if(ends[22]>=biggest15940){
              biggest15940=ends[22];
            }
            if(ends[23]>=biggest15940){
              biggest15940=ends[23];
            }
            if(biggest15940 == 1){
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            if(biggest15940 == 2){
              ends[21]=2;
              ;//sysj\conveyor_controller.sysj line: 3, column: 3
              S3970=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            //FINXME code
            if(biggest15940 == 0){
              S3970=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            S3970=1;
            S3970=0;
            thread15941(tdone,ends);
            thread15942(tdone,ends);
            int biggest15943 = 0;
            if(ends[22]>=biggest15943){
              biggest15943=ends[22];
            }
            if(ends[23]>=biggest15943){
              biggest15943=ends[23];
            }
            if(biggest15943 == 1){
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15935(int [] tdone, int [] ends){
        S3869=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      cvR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(cvR_11);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S3869=0;
      active[20]=0;
      ends[20]=0;
      tdone[20]=1;
    }
  }

  public void thread15934(int [] tdone, int [] ends){
        S3863=1;
    S3862=0;
    S3846=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3846=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S3841=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3841=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[19]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3862=1;
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

  public void thread15932(int [] tdone, int [] ends){
        switch(S3869){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        cvR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
        currsigs.addElement(cvR_11);
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
        break;
      
    }
  }

  public void thread15931(int [] tdone, int [] ends){
        switch(S3863){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S3862){
          case 0 : 
            switch(S3846){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
                  S3846=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  switch(S3841){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
                        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
                        S3841=1;
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
                          ends[19]=2;
                          ;//sysj\conveyor_controller.sysj line: 4, column: 5
                          S3862=1;
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
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
                        ends[19]=2;
                        ;//sysj\conveyor_controller.sysj line: 4, column: 5
                        S3862=1;
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
                S3846=1;
                S3846=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
                  S3846=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S3841=0;
                  if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
                    convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
                    S3841=1;
                    if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
                      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
                      ends[19]=2;
                      ;//sysj\conveyor_controller.sysj line: 4, column: 5
                      S3862=1;
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
          
          case 1 : 
            S3862=1;
            S3862=2;
            active[19]=1;
            ends[19]=1;
            tdone[19]=1;
            break;
          
          case 2 : 
            S3862=2;
            convReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 4, column: 36
            ends[19]=2;
            tdone[19]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread15930(int [] tdone, int [] ends){
        switch(S3937){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S3871){
          case 0 : 
            thread15931(tdone,ends);
            thread15932(tdone,ends);
            int biggest15933 = 0;
            if(ends[19]>=biggest15933){
              biggest15933=ends[19];
            }
            if(ends[20]>=biggest15933){
              biggest15933=ends[20];
            }
            if(biggest15933 == 1){
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            if(biggest15933 == 2){
              ends[18]=2;
              ;//sysj\conveyor_controller.sysj line: 3, column: 3
              S3871=1;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            //FINXME code
            if(biggest15933 == 0){
              S3871=1;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 1 : 
            S3871=1;
            S3871=0;
            thread15934(tdone,ends);
            thread15935(tdone,ends);
            int biggest15936 = 0;
            if(ends[19]>=biggest15936){
              biggest15936=ends[19];
            }
            if(ends[20]>=biggest15936){
              biggest15936=ends[20];
            }
            if(biggest15936 == 1){
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15929(int [] tdone, int [] ends){
        switch(S4038){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        thread15930(tdone,ends);
        thread15937(tdone,ends);
        int biggest15944 = 0;
        if(ends[18]>=biggest15944){
          biggest15944=ends[18];
        }
        if(ends[21]>=biggest15944){
          biggest15944=ends[21];
        }
        if(biggest15944 == 1){
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        //FINXME code
        if(biggest15944 == 0){
          S4038=0;
          active[17]=0;
          ends[17]=0;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread15927(int [] tdone, int [] ends){
        S2847=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread15926(int [] tdone, int [] ends){
        S2844=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread15924(int [] tdone, int [] ends){
        S2847=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread15923(int [] tdone, int [] ends){
        S2844=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread15921(int [] tdone, int [] ends){
        switch(S2904){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\conveyor_controller.sysj line: 136, column: 20
          ends[16]=3;
          ;//sysj\conveyor_controller.sysj line: 136, column: 20
          ends[16]=2;
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

  public void thread15920(int [] tdone, int [] ends){
        switch(S2888){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 133, column: 24
        currsigs.addElement(rotaryTableTrigger);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread15918(int [] tdone, int [] ends){
        S2904=1;
    __start_thread_16 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 136, column: 20
    if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\conveyor_controller.sysj line: 136, column: 20
      ends[16]=3;
      ;//sysj\conveyor_controller.sysj line: 136, column: 20
      ends[16]=2;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread15917(int [] tdone, int [] ends){
        S2888=1;
    System.out.println("*Rotary - Rotating*");//sysj\conveyor_controller.sysj line: 132, column: 24
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 133, column: 24
    currsigs.addElement(rotaryTableTrigger);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread15915(int [] tdone, int [] ends){
        S2904=1;
    __start_thread_16 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 136, column: 20
    if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\conveyor_controller.sysj line: 136, column: 20
      ends[16]=3;
      ;//sysj\conveyor_controller.sysj line: 136, column: 20
      ends[16]=2;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread15914(int [] tdone, int [] ends){
        S2888=1;
    System.out.println("*Rotary - Rotating*");//sysj\conveyor_controller.sysj line: 132, column: 24
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 133, column: 24
    currsigs.addElement(rotaryTableTrigger);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread15912(int [] tdone, int [] ends){
        S2904=1;
    __start_thread_16 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 136, column: 20
    if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\conveyor_controller.sysj line: 136, column: 20
      ends[16]=3;
      ;//sysj\conveyor_controller.sysj line: 136, column: 20
      ends[16]=2;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread15911(int [] tdone, int [] ends){
        S2888=1;
    System.out.println("*Rotary - Rotating*");//sysj\conveyor_controller.sysj line: 132, column: 24
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 133, column: 24
    currsigs.addElement(rotaryTableTrigger);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread15909(int [] tdone, int [] ends){
        S2904=1;
    __start_thread_16 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 136, column: 20
    if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\conveyor_controller.sysj line: 136, column: 20
      ends[16]=3;
      ;//sysj\conveyor_controller.sysj line: 136, column: 20
      ends[16]=2;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread15908(int [] tdone, int [] ends){
        S2888=1;
    System.out.println("*Rotary - Rotating*");//sysj\conveyor_controller.sysj line: 132, column: 24
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 133, column: 24
    currsigs.addElement(rotaryTableTrigger);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread15906(int [] tdone, int [] ends){
        switch(S2847){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(cvR_11.getprestatus()){//sysj\conveyor_controller.sysj line: 110, column: 31
          S2847=0;
          active[14]=0;
          ends[14]=0;
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

  public void thread15905(int [] tdone, int [] ends){
        switch(S2844){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(fR_11.getprestatus()){//sysj\conveyor_controller.sysj line: 110, column: 17
          S2844=0;
          active[13]=0;
          ends[13]=0;
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

  public void thread15904(int [] tdone, int [] ends){
        switch(S3838){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S2848){
          case 0 : 
            thread15905(tdone,ends);
            thread15906(tdone,ends);
            int biggest15907 = 0;
            if(ends[13]>=biggest15907){
              biggest15907=ends[13];
            }
            if(ends[14]>=biggest15907){
              biggest15907=ends[14];
            }
            if(biggest15907 == 1){
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            //FINXME code
            if(biggest15907 == 0){
              System.out.println("*Rotary - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 112, column: 10
              System.out.println("*Rotary - All controllers are ready*");//sysj\conveyor_controller.sysj line: 115, column: 10
              S2848=1;
              if(bottleAtPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 118, column: 18
                S2862=0;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S2848=2;
                thread15908(tdone,ends);
                thread15909(tdone,ends);
                int biggest15910 = 0;
                if(ends[15]>=biggest15910){
                  biggest15910=ends[15];
                }
                if(ends[16]>=biggest15910){
                  biggest15910=ends[16];
                }
                if(biggest15910 == 1){
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                if(biggest15910 == 2){
                  ends[12]=2;
                  ;//sysj\conveyor_controller.sysj line: 130, column: 16
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 142, column: 16
                  S2848=3;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
              }
            }
            break;
          
          case 1 : 
            switch(S2862){
              case 0 : 
                if(!bottleAtPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 120, column: 19
                  S2862=1;
                  S2851=0;
                  if(bottleAtPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 122, column: 22
                    S2851=1;
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                  else {
                    ends[12]=2;
                    ;//sysj\conveyor_controller.sysj line: 119, column: 12
                    S2848=2;
                    thread15911(tdone,ends);
                    thread15912(tdone,ends);
                    int biggest15913 = 0;
                    if(ends[15]>=biggest15913){
                      biggest15913=ends[15];
                    }
                    if(ends[16]>=biggest15913){
                      biggest15913=ends[16];
                    }
                    if(biggest15913 == 1){
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    if(biggest15913 == 2){
                      ends[12]=2;
                      ;//sysj\conveyor_controller.sysj line: 130, column: 16
                      System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 142, column: 16
                      S2848=3;
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
                switch(S2851){
                  case 0 : 
                    S2851=0;
                    if(bottleAtPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 122, column: 22
                      S2851=1;
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    else {
                      ends[12]=2;
                      ;//sysj\conveyor_controller.sysj line: 119, column: 12
                      S2848=2;
                      thread15914(tdone,ends);
                      thread15915(tdone,ends);
                      int biggest15916 = 0;
                      if(ends[15]>=biggest15916){
                        biggest15916=ends[15];
                      }
                      if(ends[16]>=biggest15916){
                        biggest15916=ends[16];
                      }
                      if(biggest15916 == 1){
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      if(biggest15916 == 2){
                        ends[12]=2;
                        ;//sysj\conveyor_controller.sysj line: 130, column: 16
                        System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 142, column: 16
                        S2848=3;
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                    }
                    break;
                  
                  case 1 : 
                    S2851=1;
                    S2851=0;
                    if(bottleAtPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 122, column: 22
                      S2851=1;
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    else {
                      ends[12]=2;
                      ;//sysj\conveyor_controller.sysj line: 119, column: 12
                      S2848=2;
                      thread15917(tdone,ends);
                      thread15918(tdone,ends);
                      int biggest15919 = 0;
                      if(ends[15]>=biggest15919){
                        biggest15919=ends[15];
                      }
                      if(ends[16]>=biggest15919){
                        biggest15919=ends[16];
                      }
                      if(biggest15919 == 1){
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      if(biggest15919 == 2){
                        ends[12]=2;
                        ;//sysj\conveyor_controller.sysj line: 130, column: 16
                        System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 142, column: 16
                        S2848=3;
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
          
          case 2 : 
            thread15920(tdone,ends);
            thread15921(tdone,ends);
            int biggest15922 = 0;
            if(ends[15]>=biggest15922){
              biggest15922=ends[15];
            }
            if(ends[16]>=biggest15922){
              biggest15922=ends[16];
            }
            if(biggest15922 == 1){
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            if(biggest15922 == 2){
              ends[12]=2;
              ;//sysj\conveyor_controller.sysj line: 130, column: 16
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 142, column: 16
              S2848=3;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            //FINXME code
            if(biggest15922 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 142, column: 16
              S2848=3;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_controller.sysj line: 143, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\conveyor_controller.sysj line: 144, column: 16
              S2848=4;
              __start_thread_12 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 107, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_12 >= 500){//sysj\conveyor_controller.sysj line: 107, column: 7
                ends[12]=2;
                ;//sysj\conveyor_controller.sysj line: 107, column: 7
                S2848=0;
                thread15923(tdone,ends);
                thread15924(tdone,ends);
                int biggest15925 = 0;
                if(ends[13]>=biggest15925){
                  biggest15925=ends[13];
                }
                if(ends[14]>=biggest15925){
                  biggest15925=ends[14];
                }
                if(biggest15925 == 1){
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
            else {
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 4 : 
            if(com.systemj.Timer.getMs() - __start_thread_12 >= 500){//sysj\conveyor_controller.sysj line: 107, column: 7
              ends[12]=2;
              ;//sysj\conveyor_controller.sysj line: 107, column: 7
              S2848=0;
              thread15926(tdone,ends);
              thread15927(tdone,ends);
              int biggest15928 = 0;
              if(ends[13]>=biggest15928){
                biggest15928=ends[13];
              }
              if(ends[14]>=biggest15928){
                biggest15928=ends[14];
              }
              if(biggest15928 == 1){
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
          
        }
        break;
      
    }
  }

  public void thread15900(int [] tdone, int [] ends){
        S3968=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      fR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(fR_11);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S3968=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread15899(int [] tdone, int [] ends){
        S3962=1;
    S3961=0;
    S3945=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3945=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S3940=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3940=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3961=1;
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

  public void thread15898(int [] tdone, int [] ends){
        S4036=1;
    S3970=0;
    thread15899(tdone,ends);
    thread15900(tdone,ends);
    int biggest15901 = 0;
    if(ends[22]>=biggest15901){
      biggest15901=ends[22];
    }
    if(ends[23]>=biggest15901){
      biggest15901=ends[23];
    }
    if(biggest15901 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread15896(int [] tdone, int [] ends){
        S3869=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      cvR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(cvR_11);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S3869=0;
      active[20]=0;
      ends[20]=0;
      tdone[20]=1;
    }
  }

  public void thread15895(int [] tdone, int [] ends){
        S3863=1;
    S3862=0;
    S3846=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3846=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S3841=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3841=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[19]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3862=1;
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

  public void thread15894(int [] tdone, int [] ends){
        S3937=1;
    S3871=0;
    thread15895(tdone,ends);
    thread15896(tdone,ends);
    int biggest15897 = 0;
    if(ends[19]>=biggest15897){
      biggest15897=ends[19];
    }
    if(ends[20]>=biggest15897){
      biggest15897=ends[20];
    }
    if(biggest15897 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread15893(int [] tdone, int [] ends){
        S4038=1;
    thread15894(tdone,ends);
    thread15898(tdone,ends);
    int biggest15902 = 0;
    if(ends[18]>=biggest15902){
      biggest15902=ends[18];
    }
    if(ends[21]>=biggest15902){
      biggest15902=ends[21];
    }
    if(biggest15902 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    if(biggest15902 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread15891(int [] tdone, int [] ends){
        S2847=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread15890(int [] tdone, int [] ends){
        S2844=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread15889(int [] tdone, int [] ends){
        S3838=1;
    S2848=0;
    thread15890(tdone,ends);
    thread15891(tdone,ends);
    int biggest15892 = 0;
    if(ends[13]>=biggest15892){
      biggest15892=ends[13];
    }
    if(ends[14]>=biggest15892){
      biggest15892=ends[14];
    }
    if(biggest15892 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread15885(int [] tdone, int [] ends){
        S3968=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      fR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(fR_11);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S3968=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread15884(int [] tdone, int [] ends){
        S3962=1;
    S3961=0;
    S3945=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3945=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S3940=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3940=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3961=1;
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

  public void thread15883(int [] tdone, int [] ends){
        S4036=1;
    S3970=0;
    thread15884(tdone,ends);
    thread15885(tdone,ends);
    int biggest15886 = 0;
    if(ends[22]>=biggest15886){
      biggest15886=ends[22];
    }
    if(ends[23]>=biggest15886){
      biggest15886=ends[23];
    }
    if(biggest15886 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread15881(int [] tdone, int [] ends){
        S3869=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      cvR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(cvR_11);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S3869=0;
      active[20]=0;
      ends[20]=0;
      tdone[20]=1;
    }
  }

  public void thread15880(int [] tdone, int [] ends){
        S3863=1;
    S3862=0;
    S3846=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3846=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S3841=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3841=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[19]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3862=1;
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

  public void thread15879(int [] tdone, int [] ends){
        S3937=1;
    S3871=0;
    thread15880(tdone,ends);
    thread15881(tdone,ends);
    int biggest15882 = 0;
    if(ends[19]>=biggest15882){
      biggest15882=ends[19];
    }
    if(ends[20]>=biggest15882){
      biggest15882=ends[20];
    }
    if(biggest15882 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread15878(int [] tdone, int [] ends){
        S4038=1;
    thread15879(tdone,ends);
    thread15883(tdone,ends);
    int biggest15887 = 0;
    if(ends[18]>=biggest15887){
      biggest15887=ends[18];
    }
    if(ends[21]>=biggest15887){
      biggest15887=ends[21];
    }
    if(biggest15887 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    if(biggest15887 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread15876(int [] tdone, int [] ends){
        S2847=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread15875(int [] tdone, int [] ends){
        S2844=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread15874(int [] tdone, int [] ends){
        S3838=1;
    S2848=0;
    thread15875(tdone,ends);
    thread15876(tdone,ends);
    int biggest15877 = 0;
    if(ends[13]>=biggest15877){
      biggest15877=ends[13];
    }
    if(ends[14]>=biggest15877){
      biggest15877=ends[14];
    }
    if(biggest15877 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread15870(int [] tdone, int [] ends){
        S3968=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      fR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(fR_11);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S3968=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread15869(int [] tdone, int [] ends){
        S3962=1;
    S3961=0;
    S3945=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3945=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S3940=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3940=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3961=1;
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

  public void thread15868(int [] tdone, int [] ends){
        S4036=1;
    S3970=0;
    thread15869(tdone,ends);
    thread15870(tdone,ends);
    int biggest15871 = 0;
    if(ends[22]>=biggest15871){
      biggest15871=ends[22];
    }
    if(ends[23]>=biggest15871){
      biggest15871=ends[23];
    }
    if(biggest15871 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread15866(int [] tdone, int [] ends){
        S3869=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      cvR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(cvR_11);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S3869=0;
      active[20]=0;
      ends[20]=0;
      tdone[20]=1;
    }
  }

  public void thread15865(int [] tdone, int [] ends){
        S3863=1;
    S3862=0;
    S3846=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3846=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S3841=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3841=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[19]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3862=1;
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

  public void thread15864(int [] tdone, int [] ends){
        S3937=1;
    S3871=0;
    thread15865(tdone,ends);
    thread15866(tdone,ends);
    int biggest15867 = 0;
    if(ends[19]>=biggest15867){
      biggest15867=ends[19];
    }
    if(ends[20]>=biggest15867){
      biggest15867=ends[20];
    }
    if(biggest15867 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread15863(int [] tdone, int [] ends){
        S4038=1;
    thread15864(tdone,ends);
    thread15868(tdone,ends);
    int biggest15872 = 0;
    if(ends[18]>=biggest15872){
      biggest15872=ends[18];
    }
    if(ends[21]>=biggest15872){
      biggest15872=ends[21];
    }
    if(biggest15872 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    if(biggest15872 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread15861(int [] tdone, int [] ends){
        S2847=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread15860(int [] tdone, int [] ends){
        S2844=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread15859(int [] tdone, int [] ends){
        S3838=1;
    S2848=0;
    thread15860(tdone,ends);
    thread15861(tdone,ends);
    int biggest15862 = 0;
    if(ends[13]>=biggest15862){
      biggest15862=ends[13];
    }
    if(ends[14]>=biggest15862){
      biggest15862=ends[14];
    }
    if(biggest15862 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread15855(int [] tdone, int [] ends){
        S3968=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      fR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(fR_11);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S3968=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread15854(int [] tdone, int [] ends){
        S3962=1;
    S3961=0;
    S3945=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3945=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S3940=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3940=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3961=1;
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

  public void thread15853(int [] tdone, int [] ends){
        S4036=1;
    S3970=0;
    thread15854(tdone,ends);
    thread15855(tdone,ends);
    int biggest15856 = 0;
    if(ends[22]>=biggest15856){
      biggest15856=ends[22];
    }
    if(ends[23]>=biggest15856){
      biggest15856=ends[23];
    }
    if(biggest15856 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread15851(int [] tdone, int [] ends){
        S3869=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      cvR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(cvR_11);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S3869=0;
      active[20]=0;
      ends[20]=0;
      tdone[20]=1;
    }
  }

  public void thread15850(int [] tdone, int [] ends){
        S3863=1;
    S3862=0;
    S3846=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3846=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S3841=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3841=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[19]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3862=1;
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

  public void thread15849(int [] tdone, int [] ends){
        S3937=1;
    S3871=0;
    thread15850(tdone,ends);
    thread15851(tdone,ends);
    int biggest15852 = 0;
    if(ends[19]>=biggest15852){
      biggest15852=ends[19];
    }
    if(ends[20]>=biggest15852){
      biggest15852=ends[20];
    }
    if(biggest15852 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread15848(int [] tdone, int [] ends){
        S4038=1;
    thread15849(tdone,ends);
    thread15853(tdone,ends);
    int biggest15857 = 0;
    if(ends[18]>=biggest15857){
      biggest15857=ends[18];
    }
    if(ends[21]>=biggest15857){
      biggest15857=ends[21];
    }
    if(biggest15857 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    if(biggest15857 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread15846(int [] tdone, int [] ends){
        S2847=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread15845(int [] tdone, int [] ends){
        S2844=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread15844(int [] tdone, int [] ends){
        S3838=1;
    S2848=0;
    thread15845(tdone,ends);
    thread15846(tdone,ends);
    int biggest15847 = 0;
    if(ends[13]>=biggest15847){
      biggest15847=ends[13];
    }
    if(ends[14]>=biggest15847){
      biggest15847=ends[14];
    }
    if(biggest15847 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread15840(int [] tdone, int [] ends){
        S3968=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      fR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(fR_11);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S3968=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread15839(int [] tdone, int [] ends){
        S3962=1;
    S3961=0;
    S3945=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3945=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S3940=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3940=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3961=1;
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

  public void thread15838(int [] tdone, int [] ends){
        S4036=1;
    S3970=0;
    thread15839(tdone,ends);
    thread15840(tdone,ends);
    int biggest15841 = 0;
    if(ends[22]>=biggest15841){
      biggest15841=ends[22];
    }
    if(ends[23]>=biggest15841){
      biggest15841=ends[23];
    }
    if(biggest15841 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread15836(int [] tdone, int [] ends){
        S3869=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      cvR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(cvR_11);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S3869=0;
      active[20]=0;
      ends[20]=0;
      tdone[20]=1;
    }
  }

  public void thread15835(int [] tdone, int [] ends){
        S3863=1;
    S3862=0;
    S3846=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3846=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S3841=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3841=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[19]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3862=1;
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

  public void thread15834(int [] tdone, int [] ends){
        S3937=1;
    S3871=0;
    thread15835(tdone,ends);
    thread15836(tdone,ends);
    int biggest15837 = 0;
    if(ends[19]>=biggest15837){
      biggest15837=ends[19];
    }
    if(ends[20]>=biggest15837){
      biggest15837=ends[20];
    }
    if(biggest15837 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread15833(int [] tdone, int [] ends){
        S4038=1;
    thread15834(tdone,ends);
    thread15838(tdone,ends);
    int biggest15842 = 0;
    if(ends[18]>=biggest15842){
      biggest15842=ends[18];
    }
    if(ends[21]>=biggest15842){
      biggest15842=ends[21];
    }
    if(biggest15842 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    if(biggest15842 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread15831(int [] tdone, int [] ends){
        S2847=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread15830(int [] tdone, int [] ends){
        S2844=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread15829(int [] tdone, int [] ends){
        S3838=1;
    S2848=0;
    thread15830(tdone,ends);
    thread15831(tdone,ends);
    int biggest15832 = 0;
    if(ends[13]>=biggest15832){
      biggest15832=ends[13];
    }
    if(ends[14]>=biggest15832){
      biggest15832=ends[14];
    }
    if(biggest15832 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread15825(int [] tdone, int [] ends){
        S3968=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      fR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(fR_11);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S3968=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread15824(int [] tdone, int [] ends){
        S3962=1;
    S3961=0;
    S3945=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3945=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S3940=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3940=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3961=1;
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

  public void thread15823(int [] tdone, int [] ends){
        S4036=1;
    S3970=0;
    thread15824(tdone,ends);
    thread15825(tdone,ends);
    int biggest15826 = 0;
    if(ends[22]>=biggest15826){
      biggest15826=ends[22];
    }
    if(ends[23]>=biggest15826){
      biggest15826=ends[23];
    }
    if(biggest15826 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread15821(int [] tdone, int [] ends){
        S3869=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      cvR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(cvR_11);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S3869=0;
      active[20]=0;
      ends[20]=0;
      tdone[20]=1;
    }
  }

  public void thread15820(int [] tdone, int [] ends){
        S3863=1;
    S3862=0;
    S3846=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3846=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S3841=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3841=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[19]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3862=1;
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

  public void thread15819(int [] tdone, int [] ends){
        S3937=1;
    S3871=0;
    thread15820(tdone,ends);
    thread15821(tdone,ends);
    int biggest15822 = 0;
    if(ends[19]>=biggest15822){
      biggest15822=ends[19];
    }
    if(ends[20]>=biggest15822){
      biggest15822=ends[20];
    }
    if(biggest15822 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread15818(int [] tdone, int [] ends){
        S4038=1;
    thread15819(tdone,ends);
    thread15823(tdone,ends);
    int biggest15827 = 0;
    if(ends[18]>=biggest15827){
      biggest15827=ends[18];
    }
    if(ends[21]>=biggest15827){
      biggest15827=ends[21];
    }
    if(biggest15827 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    if(biggest15827 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread15816(int [] tdone, int [] ends){
        S2847=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread15815(int [] tdone, int [] ends){
        S2844=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread15814(int [] tdone, int [] ends){
        S3838=1;
    S2848=0;
    thread15815(tdone,ends);
    thread15816(tdone,ends);
    int biggest15817 = 0;
    if(ends[13]>=biggest15817){
      biggest15817=ends[13];
    }
    if(ends[14]>=biggest15817){
      biggest15817=ends[14];
    }
    if(biggest15817 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread15810(int [] tdone, int [] ends){
        S3968=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      fR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(fR_11);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S3968=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread15809(int [] tdone, int [] ends){
        S3962=1;
    S3961=0;
    S3945=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3945=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S3940=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3940=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3961=1;
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

  public void thread15808(int [] tdone, int [] ends){
        S4036=1;
    S3970=0;
    thread15809(tdone,ends);
    thread15810(tdone,ends);
    int biggest15811 = 0;
    if(ends[22]>=biggest15811){
      biggest15811=ends[22];
    }
    if(ends[23]>=biggest15811){
      biggest15811=ends[23];
    }
    if(biggest15811 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread15806(int [] tdone, int [] ends){
        S3869=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 6, column: 9
      cvR_11.setPresent();//sysj\conveyor_controller.sysj line: 6, column: 20
      currsigs.addElement(cvR_11);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S3869=0;
      active[20]=0;
      ends[20]=0;
      tdone[20]=1;
    }
  }

  public void thread15805(int [] tdone, int [] ends){
        S3863=1;
    S3862=0;
    S3846=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 4, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
      S3846=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S3841=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 4, column: 5
        S3841=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 4, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 4, column: 5
          ends[19]=2;
          ;//sysj\conveyor_controller.sysj line: 4, column: 5
          S3862=1;
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

  public void thread15804(int [] tdone, int [] ends){
        S3937=1;
    S3871=0;
    thread15805(tdone,ends);
    thread15806(tdone,ends);
    int biggest15807 = 0;
    if(ends[19]>=biggest15807){
      biggest15807=ends[19];
    }
    if(ends[20]>=biggest15807){
      biggest15807=ends[20];
    }
    if(biggest15807 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread15803(int [] tdone, int [] ends){
        S4038=1;
    thread15804(tdone,ends);
    thread15808(tdone,ends);
    int biggest15812 = 0;
    if(ends[18]>=biggest15812){
      biggest15812=ends[18];
    }
    if(ends[21]>=biggest15812){
      biggest15812=ends[21];
    }
    if(biggest15812 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    if(biggest15812 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread15801(int [] tdone, int [] ends){
        S2847=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread15800(int [] tdone, int [] ends){
        S2844=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread15799(int [] tdone, int [] ends){
        S3838=1;
    S2848=0;
    thread15800(tdone,ends);
    thread15801(tdone,ends);
    int biggest15802 = 0;
    if(ends[13]>=biggest15802){
      biggest15802=ends[13];
    }
    if(ends[14]>=biggest15802){
      biggest15802=ends[14];
    }
    if(biggest15802 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S10024){
        case 0 : 
          S10024=0;
          break RUN;
        
        case 1 : 
          S10024=2;
          S10024=2;
          cvR_11.setClear();//sysj\conveyor_controller.sysj line: 104, column: 7
          fR_11.setClear();//sysj\conveyor_controller.sysj line: 104, column: 7
          cR_11.setClear();//sysj\conveyor_controller.sysj line: 104, column: 7
          S2841=0;
          S2737=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 105, column: 7
            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 105, column: 7
            S2737=1;
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
          else {
            S2732=0;
            if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 105, column: 7
              convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 105, column: 7
              S2732=1;
              if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 105, column: 7
                convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 105, column: 7
                ends[11]=2;
                ;//sysj\conveyor_controller.sysj line: 105, column: 7
                S2841=1;
                S2759=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 106, column: 7
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 106, column: 7
                  S2759=1;
                  active[11]=1;
                  ends[11]=1;
                  break RUN;
                }
                else {
                  S2754=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 106, column: 7
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 106, column: 7
                    S2754=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 106, column: 7
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 106, column: 7
                      ends[11]=2;
                      ;//sysj\conveyor_controller.sysj line: 106, column: 7
                      S2841=2;
                      thread15799(tdone,ends);
                      thread15803(tdone,ends);
                      int biggest15813 = 0;
                      if(ends[12]>=biggest15813){
                        biggest15813=ends[12];
                      }
                      if(ends[17]>=biggest15813){
                        biggest15813=ends[17];
                      }
                      if(biggest15813 == 1){
                        active[11]=1;
                        ends[11]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[11]=1;
                      ends[11]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[11]=1;
                    ends[11]=1;
                    break RUN;
                  }
                }
              }
              else {
                active[11]=1;
                ends[11]=1;
                break RUN;
              }
            }
            else {
              active[11]=1;
              ends[11]=1;
              break RUN;
            }
          }
        
        case 2 : 
          cvR_11.setClear();//sysj\conveyor_controller.sysj line: 104, column: 7
          fR_11.setClear();//sysj\conveyor_controller.sysj line: 104, column: 7
          cR_11.setClear();//sysj\conveyor_controller.sysj line: 104, column: 7
          switch(S2841){
            case 0 : 
              switch(S2737){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 105, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 105, column: 7
                    S2737=1;
                    active[11]=1;
                    ends[11]=1;
                    break RUN;
                  }
                  else {
                    switch(S2732){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 105, column: 7
                          convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 105, column: 7
                          S2732=1;
                          if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 105, column: 7
                            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 105, column: 7
                            ends[11]=2;
                            ;//sysj\conveyor_controller.sysj line: 105, column: 7
                            S2841=1;
                            S2759=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 106, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 106, column: 7
                              S2759=1;
                              active[11]=1;
                              ends[11]=1;
                              break RUN;
                            }
                            else {
                              S2754=0;
                              if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 106, column: 7
                                fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 106, column: 7
                                S2754=1;
                                if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 106, column: 7
                                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 106, column: 7
                                  ends[11]=2;
                                  ;//sysj\conveyor_controller.sysj line: 106, column: 7
                                  S2841=2;
                                  thread15814(tdone,ends);
                                  thread15818(tdone,ends);
                                  int biggest15828 = 0;
                                  if(ends[12]>=biggest15828){
                                    biggest15828=ends[12];
                                  }
                                  if(ends[17]>=biggest15828){
                                    biggest15828=ends[17];
                                  }
                                  if(biggest15828 == 1){
                                    active[11]=1;
                                    ends[11]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[11]=1;
                                  ends[11]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[11]=1;
                                ends[11]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[11]=1;
                            ends[11]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[11]=1;
                          ends[11]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 105, column: 7
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 105, column: 7
                          ends[11]=2;
                          ;//sysj\conveyor_controller.sysj line: 105, column: 7
                          S2841=1;
                          S2759=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 106, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 106, column: 7
                            S2759=1;
                            active[11]=1;
                            ends[11]=1;
                            break RUN;
                          }
                          else {
                            S2754=0;
                            if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 106, column: 7
                              fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 106, column: 7
                              S2754=1;
                              if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 106, column: 7
                                fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 106, column: 7
                                ends[11]=2;
                                ;//sysj\conveyor_controller.sysj line: 106, column: 7
                                S2841=2;
                                thread15829(tdone,ends);
                                thread15833(tdone,ends);
                                int biggest15843 = 0;
                                if(ends[12]>=biggest15843){
                                  biggest15843=ends[12];
                                }
                                if(ends[17]>=biggest15843){
                                  biggest15843=ends[17];
                                }
                                if(biggest15843 == 1){
                                  active[11]=1;
                                  ends[11]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[11]=1;
                                ends[11]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[11]=1;
                              ends[11]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[11]=1;
                          ends[11]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S2737=1;
                  S2737=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 105, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 105, column: 7
                    S2737=1;
                    active[11]=1;
                    ends[11]=1;
                    break RUN;
                  }
                  else {
                    S2732=0;
                    if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 105, column: 7
                      convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 105, column: 7
                      S2732=1;
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 105, column: 7
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 105, column: 7
                        ends[11]=2;
                        ;//sysj\conveyor_controller.sysj line: 105, column: 7
                        S2841=1;
                        S2759=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 106, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 106, column: 7
                          S2759=1;
                          active[11]=1;
                          ends[11]=1;
                          break RUN;
                        }
                        else {
                          S2754=0;
                          if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 106, column: 7
                            fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 106, column: 7
                            S2754=1;
                            if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 106, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 106, column: 7
                              ends[11]=2;
                              ;//sysj\conveyor_controller.sysj line: 106, column: 7
                              S2841=2;
                              thread15844(tdone,ends);
                              thread15848(tdone,ends);
                              int biggest15858 = 0;
                              if(ends[12]>=biggest15858){
                                biggest15858=ends[12];
                              }
                              if(ends[17]>=biggest15858){
                                biggest15858=ends[17];
                              }
                              if(biggest15858 == 1){
                                active[11]=1;
                                ends[11]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[11]=1;
                              ends[11]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[11]=1;
                            ends[11]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[11]=1;
                        ends[11]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[11]=1;
                      ends[11]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S2759){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 106, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 106, column: 7
                    S2759=1;
                    active[11]=1;
                    ends[11]=1;
                    break RUN;
                  }
                  else {
                    switch(S2754){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 106, column: 7
                          fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 106, column: 7
                          S2754=1;
                          if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 106, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 106, column: 7
                            ends[11]=2;
                            ;//sysj\conveyor_controller.sysj line: 106, column: 7
                            S2841=2;
                            thread15859(tdone,ends);
                            thread15863(tdone,ends);
                            int biggest15873 = 0;
                            if(ends[12]>=biggest15873){
                              biggest15873=ends[12];
                            }
                            if(ends[17]>=biggest15873){
                              biggest15873=ends[17];
                            }
                            if(biggest15873 == 1){
                              active[11]=1;
                              ends[11]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[11]=1;
                            ends[11]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[11]=1;
                          ends[11]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 106, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 106, column: 7
                          ends[11]=2;
                          ;//sysj\conveyor_controller.sysj line: 106, column: 7
                          S2841=2;
                          thread15874(tdone,ends);
                          thread15878(tdone,ends);
                          int biggest15888 = 0;
                          if(ends[12]>=biggest15888){
                            biggest15888=ends[12];
                          }
                          if(ends[17]>=biggest15888){
                            biggest15888=ends[17];
                          }
                          if(biggest15888 == 1){
                            active[11]=1;
                            ends[11]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[11]=1;
                          ends[11]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S2759=1;
                  S2759=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 106, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 106, column: 7
                    S2759=1;
                    active[11]=1;
                    ends[11]=1;
                    break RUN;
                  }
                  else {
                    S2754=0;
                    if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 106, column: 7
                      fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 106, column: 7
                      S2754=1;
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 106, column: 7
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 106, column: 7
                        ends[11]=2;
                        ;//sysj\conveyor_controller.sysj line: 106, column: 7
                        S2841=2;
                        thread15889(tdone,ends);
                        thread15893(tdone,ends);
                        int biggest15903 = 0;
                        if(ends[12]>=biggest15903){
                          biggest15903=ends[12];
                        }
                        if(ends[17]>=biggest15903){
                          biggest15903=ends[17];
                        }
                        if(biggest15903 == 1){
                          active[11]=1;
                          ends[11]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[11]=1;
                        ends[11]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[11]=1;
                      ends[11]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 2 : 
              thread15904(tdone,ends);
              thread15929(tdone,ends);
              int biggest15945 = 0;
              if(ends[12]>=biggest15945){
                biggest15945=ends[12];
              }
              if(ends[17]>=biggest15945){
                biggest15945=ends[17];
              }
              if(biggest15945 == 1){
                active[11]=1;
                ends[11]=1;
                break RUN;
              }
              //FINXME code
              if(biggest15945 == 0){
                S10024=0;
                active[11]=0;
                ends[11]=0;
                S10024=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    cvR_11 = new Signal();
    fR_11 = new Signal();
    cR_11 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[11] != 0){
      int index = 11;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[11]!=0 || suspended[11]!=0 || active[11]!=1);
      else{
        if(!df){
          convReady_in.gethook();
          fillerReady_in.gethook();
          capperReady_in.gethook();
          rotated_o.gethook();
          tableAlignedWithSensor.gethook();
          bottleAtPos5.gethook();
          capOnBottleAtPos1.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      rotaryTableTrigger.setpreclear();
      cvR_11.setpreclear();
      fR_11.setpreclear();
      cR_11.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      cvR_11.setClear();
      fR_11.setClear();
      cR_11.setClear();
      convReady_in.sethook();
      fillerReady_in.sethook();
      capperReady_in.sethook();
      rotated_o.sethook();
      if(paused[11]!=0 || suspended[11]!=0 || active[11]!=1);
      else{
        convReady_in.gethook();
        fillerReady_in.gethook();
        capperReady_in.gethook();
        rotated_o.gethook();
        tableAlignedWithSensor.gethook();
        bottleAtPos5.gethook();
        capOnBottleAtPos1.gethook();
      }
      runFinisher();
      if(active[11] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
