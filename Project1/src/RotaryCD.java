import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class RotaryCD extends ClockDomain{
  public RotaryCD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public input_Channel fillerReady_in = new input_Channel();
  public input_Channel capperReady_in = new input_Channel();
  public input_Channel convReady_in = new input_Channel();
  public input_Channel baxterReady_in = new input_Channel();
  public output_Channel rotated_o = new output_Channel();
  private Signal fR_1;
  private Signal cR_1;
  private Signal cvR_1;
  private Signal bR_1;
  private long __start_thread_8;//sysj\rotarytable_controller.sysj line: 18, column: 37
  private long __start_thread_2;//sysj\rotarytable_controller.sysj line: 10, column: 3
  private int S4537 = 1;
  private int S4137 = 1;
  private int S2836 = 1;
  private int S2822 = 1;
  private int S2825 = 1;
  private int S2828 = 1;
  private int S2831 = 1;
  private int S2841 = 1;
  private int S2857 = 1;
  private int S2843 = 1;
  private int S2914 = 1;
  private int S2909 = 1;
  private int S4535 = 1;
  private int S4236 = 1;
  private int S4170 = 1;
  private int S4162 = 1;
  private int S4161 = 1;
  private int S4145 = 1;
  private int S4140 = 1;
  private int S4168 = 1;
  private int S4335 = 1;
  private int S4269 = 1;
  private int S4261 = 1;
  private int S4260 = 1;
  private int S4244 = 1;
  private int S4239 = 1;
  private int S4267 = 1;
  private int S4434 = 1;
  private int S4368 = 1;
  private int S4360 = 1;
  private int S4359 = 1;
  private int S4343 = 1;
  private int S4338 = 1;
  private int S4366 = 1;
  private int S4533 = 1;
  private int S4467 = 1;
  private int S4459 = 1;
  private int S4458 = 1;
  private int S4442 = 1;
  private int S4437 = 1;
  private int S4465 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread4631(int [] tdone, int [] ends){
        S4465=1;
    if((baxterReady_in.getVal() == null ? null : ((Boolean)baxterReady_in.getVal()))){//sysj\rotarytable_controller.sysj line: 7, column: 9
      bR_1.setPresent();//sysj\rotarytable_controller.sysj line: 7, column: 20
      currsigs.addElement(bR_1);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S4465=0;
      active[21]=0;
      ends[21]=0;
      tdone[21]=1;
    }
  }

  public void thread4630(int [] tdone, int [] ends){
        S4459=1;
    S4458=0;
    S4442=0;
    if(!baxterReady_in.isPartnerPresent() || baxterReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
      baxterReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
      S4442=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S4437=0;
      if(!baxterReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
        baxterReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
        S4437=1;
        if(baxterReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
          baxterReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
          ends[20]=2;
          ;//sysj\rotarytable_controller.sysj line: 5, column: 5
          S4458=1;
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

  public void thread4628(int [] tdone, int [] ends){
        switch(S4465){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        bR_1.setPresent();//sysj\rotarytable_controller.sysj line: 7, column: 20
        currsigs.addElement(bR_1);
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread4627(int [] tdone, int [] ends){
        switch(S4459){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S4458){
          case 0 : 
            switch(S4442){
              case 0 : 
                if(!baxterReady_in.isPartnerPresent() || baxterReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                  baxterReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                  S4442=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  switch(S4437){
                    case 0 : 
                      if(!baxterReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                        baxterReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
                        S4437=1;
                        if(baxterReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                          baxterReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                          ends[20]=2;
                          ;//sysj\rotarytable_controller.sysj line: 5, column: 5
                          S4458=1;
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
                      if(baxterReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                        baxterReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                        ends[20]=2;
                        ;//sysj\rotarytable_controller.sysj line: 5, column: 5
                        S4458=1;
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
                S4442=1;
                S4442=0;
                if(!baxterReady_in.isPartnerPresent() || baxterReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                  baxterReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                  S4442=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  S4437=0;
                  if(!baxterReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                    baxterReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
                    S4437=1;
                    if(baxterReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                      baxterReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                      ends[20]=2;
                      ;//sysj\rotarytable_controller.sysj line: 5, column: 5
                      S4458=1;
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
          
          case 1 : 
            S4458=1;
            S4458=2;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
            break;
          
          case 2 : 
            S4458=2;
            baxterReady_in.setPreempted();//sysj\rotarytable_controller.sysj line: 5, column: 36
            ends[20]=2;
            tdone[20]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread4626(int [] tdone, int [] ends){
        switch(S4533){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S4467){
          case 0 : 
            thread4627(tdone,ends);
            thread4628(tdone,ends);
            int biggest4629 = 0;
            if(ends[20]>=biggest4629){
              biggest4629=ends[20];
            }
            if(ends[21]>=biggest4629){
              biggest4629=ends[21];
            }
            if(biggest4629 == 1){
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            if(biggest4629 == 2){
              ends[19]=2;
              ;//sysj\rotarytable_controller.sysj line: 4, column: 3
              S4467=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            //FINXME code
            if(biggest4629 == 0){
              S4467=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            S4467=1;
            S4467=0;
            thread4630(tdone,ends);
            thread4631(tdone,ends);
            int biggest4632 = 0;
            if(ends[20]>=biggest4632){
              biggest4632=ends[20];
            }
            if(ends[21]>=biggest4632){
              biggest4632=ends[21];
            }
            if(biggest4632 == 1){
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4624(int [] tdone, int [] ends){
        S4366=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotarytable_controller.sysj line: 7, column: 9
      cvR_1.setPresent();//sysj\rotarytable_controller.sysj line: 7, column: 20
      currsigs.addElement(cvR_1);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S4366=0;
      active[18]=0;
      ends[18]=0;
      tdone[18]=1;
    }
  }

  public void thread4623(int [] tdone, int [] ends){
        S4360=1;
    S4359=0;
    S4343=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
      convReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
      S4343=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      S4338=0;
      if(!convReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
        convReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
        S4338=1;
        if(convReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
          convReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
          ends[17]=2;
          ;//sysj\rotarytable_controller.sysj line: 5, column: 5
          S4359=1;
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

  public void thread4621(int [] tdone, int [] ends){
        switch(S4366){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        cvR_1.setPresent();//sysj\rotarytable_controller.sysj line: 7, column: 20
        currsigs.addElement(cvR_1);
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
        break;
      
    }
  }

  public void thread4620(int [] tdone, int [] ends){
        switch(S4360){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S4359){
          case 0 : 
            switch(S4343){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                  convReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                  S4343=1;
                  active[17]=1;
                  ends[17]=1;
                  tdone[17]=1;
                }
                else {
                  switch(S4338){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                        convReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
                        S4338=1;
                        if(convReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                          convReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                          ends[17]=2;
                          ;//sysj\rotarytable_controller.sysj line: 5, column: 5
                          S4359=1;
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
                      if(convReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                        convReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                        ends[17]=2;
                        ;//sysj\rotarytable_controller.sysj line: 5, column: 5
                        S4359=1;
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
                S4343=1;
                S4343=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                  convReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                  S4343=1;
                  active[17]=1;
                  ends[17]=1;
                  tdone[17]=1;
                }
                else {
                  S4338=0;
                  if(!convReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                    convReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
                    S4338=1;
                    if(convReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                      convReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                      ends[17]=2;
                      ;//sysj\rotarytable_controller.sysj line: 5, column: 5
                      S4359=1;
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
          
          case 1 : 
            S4359=1;
            S4359=2;
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
            break;
          
          case 2 : 
            S4359=2;
            convReady_in.setPreempted();//sysj\rotarytable_controller.sysj line: 5, column: 36
            ends[17]=2;
            tdone[17]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread4619(int [] tdone, int [] ends){
        switch(S4434){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S4368){
          case 0 : 
            thread4620(tdone,ends);
            thread4621(tdone,ends);
            int biggest4622 = 0;
            if(ends[17]>=biggest4622){
              biggest4622=ends[17];
            }
            if(ends[18]>=biggest4622){
              biggest4622=ends[18];
            }
            if(biggest4622 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            if(biggest4622 == 2){
              ends[16]=2;
              ;//sysj\rotarytable_controller.sysj line: 4, column: 3
              S4368=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest4622 == 0){
              S4368=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            S4368=1;
            S4368=0;
            thread4623(tdone,ends);
            thread4624(tdone,ends);
            int biggest4625 = 0;
            if(ends[17]>=biggest4625){
              biggest4625=ends[17];
            }
            if(ends[18]>=biggest4625){
              biggest4625=ends[18];
            }
            if(biggest4625 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4617(int [] tdone, int [] ends){
        S4267=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotarytable_controller.sysj line: 7, column: 9
      cR_1.setPresent();//sysj\rotarytable_controller.sysj line: 7, column: 20
      currsigs.addElement(cR_1);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S4267=0;
      active[15]=0;
      ends[15]=0;
      tdone[15]=1;
    }
  }

  public void thread4616(int [] tdone, int [] ends){
        S4261=1;
    S4260=0;
    S4244=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
      capperReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
      S4244=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S4239=0;
      if(!capperReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
        capperReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
        S4239=1;
        if(capperReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
          capperReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
          ends[14]=2;
          ;//sysj\rotarytable_controller.sysj line: 5, column: 5
          S4260=1;
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

  public void thread4614(int [] tdone, int [] ends){
        switch(S4267){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        cR_1.setPresent();//sysj\rotarytable_controller.sysj line: 7, column: 20
        currsigs.addElement(cR_1);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread4613(int [] tdone, int [] ends){
        switch(S4261){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S4260){
          case 0 : 
            switch(S4244){
              case 0 : 
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                  capperReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                  S4244=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  switch(S4239){
                    case 0 : 
                      if(!capperReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                        capperReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
                        S4239=1;
                        if(capperReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                          capperReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                          ends[14]=2;
                          ;//sysj\rotarytable_controller.sysj line: 5, column: 5
                          S4260=1;
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
                      if(capperReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                        capperReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                        ends[14]=2;
                        ;//sysj\rotarytable_controller.sysj line: 5, column: 5
                        S4260=1;
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
                S4244=1;
                S4244=0;
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                  capperReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                  S4244=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  S4239=0;
                  if(!capperReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                    capperReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
                    S4239=1;
                    if(capperReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                      capperReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                      ends[14]=2;
                      ;//sysj\rotarytable_controller.sysj line: 5, column: 5
                      S4260=1;
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
          
          case 1 : 
            S4260=1;
            S4260=2;
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
          case 2 : 
            S4260=2;
            capperReady_in.setPreempted();//sysj\rotarytable_controller.sysj line: 5, column: 36
            ends[14]=2;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread4612(int [] tdone, int [] ends){
        switch(S4335){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S4269){
          case 0 : 
            thread4613(tdone,ends);
            thread4614(tdone,ends);
            int biggest4615 = 0;
            if(ends[14]>=biggest4615){
              biggest4615=ends[14];
            }
            if(ends[15]>=biggest4615){
              biggest4615=ends[15];
            }
            if(biggest4615 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            if(biggest4615 == 2){
              ends[13]=2;
              ;//sysj\rotarytable_controller.sysj line: 4, column: 3
              S4269=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            //FINXME code
            if(biggest4615 == 0){
              S4269=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S4269=1;
            S4269=0;
            thread4616(tdone,ends);
            thread4617(tdone,ends);
            int biggest4618 = 0;
            if(ends[14]>=biggest4618){
              biggest4618=ends[14];
            }
            if(ends[15]>=biggest4618){
              biggest4618=ends[15];
            }
            if(biggest4618 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4610(int [] tdone, int [] ends){
        S4168=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotarytable_controller.sysj line: 7, column: 9
      fR_1.setPresent();//sysj\rotarytable_controller.sysj line: 7, column: 20
      currsigs.addElement(fR_1);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S4168=0;
      active[12]=0;
      ends[12]=0;
      tdone[12]=1;
    }
  }

  public void thread4609(int [] tdone, int [] ends){
        S4162=1;
    S4161=0;
    S4145=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
      fillerReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
      S4145=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S4140=0;
      if(!fillerReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
        fillerReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
        S4140=1;
        if(fillerReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
          fillerReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
          ends[11]=2;
          ;//sysj\rotarytable_controller.sysj line: 5, column: 5
          S4161=1;
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

  public void thread4607(int [] tdone, int [] ends){
        switch(S4168){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        fR_1.setPresent();//sysj\rotarytable_controller.sysj line: 7, column: 20
        currsigs.addElement(fR_1);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread4606(int [] tdone, int [] ends){
        switch(S4162){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S4161){
          case 0 : 
            switch(S4145){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                  fillerReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                  S4145=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S4140){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                        fillerReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
                        S4140=1;
                        if(fillerReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                          fillerReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                          ends[11]=2;
                          ;//sysj\rotarytable_controller.sysj line: 5, column: 5
                          S4161=1;
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
                      if(fillerReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                        fillerReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                        ends[11]=2;
                        ;//sysj\rotarytable_controller.sysj line: 5, column: 5
                        S4161=1;
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
                S4145=1;
                S4145=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                  fillerReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                  S4145=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S4140=0;
                  if(!fillerReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                    fillerReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
                    S4140=1;
                    if(fillerReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
                      fillerReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
                      ends[11]=2;
                      ;//sysj\rotarytable_controller.sysj line: 5, column: 5
                      S4161=1;
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
          
          case 1 : 
            S4161=1;
            S4161=2;
            active[11]=1;
            ends[11]=1;
            tdone[11]=1;
            break;
          
          case 2 : 
            S4161=2;
            fillerReady_in.setPreempted();//sysj\rotarytable_controller.sysj line: 5, column: 36
            ends[11]=2;
            tdone[11]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread4605(int [] tdone, int [] ends){
        switch(S4236){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S4170){
          case 0 : 
            thread4606(tdone,ends);
            thread4607(tdone,ends);
            int biggest4608 = 0;
            if(ends[11]>=biggest4608){
              biggest4608=ends[11];
            }
            if(ends[12]>=biggest4608){
              biggest4608=ends[12];
            }
            if(biggest4608 == 1){
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            if(biggest4608 == 2){
              ends[10]=2;
              ;//sysj\rotarytable_controller.sysj line: 4, column: 3
              S4170=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            //FINXME code
            if(biggest4608 == 0){
              S4170=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S4170=1;
            S4170=0;
            thread4609(tdone,ends);
            thread4610(tdone,ends);
            int biggest4611 = 0;
            if(ends[11]>=biggest4611){
              biggest4611=ends[11];
            }
            if(ends[12]>=biggest4611){
              biggest4611=ends[12];
            }
            if(biggest4611 == 1){
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4604(int [] tdone, int [] ends){
        switch(S4535){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        thread4605(tdone,ends);
        thread4612(tdone,ends);
        thread4619(tdone,ends);
        thread4626(tdone,ends);
        int biggest4633 = 0;
        if(ends[10]>=biggest4633){
          biggest4633=ends[10];
        }
        if(ends[13]>=biggest4633){
          biggest4633=ends[13];
        }
        if(ends[16]>=biggest4633){
          biggest4633=ends[16];
        }
        if(ends[19]>=biggest4633){
          biggest4633=ends[19];
        }
        if(biggest4633 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        //FINXME code
        if(biggest4633 == 0){
          S4535=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread4602(int [] tdone, int [] ends){
        S2831=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread4601(int [] tdone, int [] ends){
        S2828=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4600(int [] tdone, int [] ends){
        S2825=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread4599(int [] tdone, int [] ends){
        S2822=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4597(int [] tdone, int [] ends){
        S2831=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread4596(int [] tdone, int [] ends){
        S2828=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4595(int [] tdone, int [] ends){
        S2825=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread4594(int [] tdone, int [] ends){
        S2822=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4592(int [] tdone, int [] ends){
        S2831=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread4591(int [] tdone, int [] ends){
        S2828=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4590(int [] tdone, int [] ends){
        S2825=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread4589(int [] tdone, int [] ends){
        S2822=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4587(int [] tdone, int [] ends){
        S2831=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread4586(int [] tdone, int [] ends){
        S2828=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4585(int [] tdone, int [] ends){
        S2825=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread4584(int [] tdone, int [] ends){
        S2822=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4582(int [] tdone, int [] ends){
        S2831=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread4581(int [] tdone, int [] ends){
        S2828=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4580(int [] tdone, int [] ends){
        S2825=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread4579(int [] tdone, int [] ends){
        S2822=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4577(int [] tdone, int [] ends){
        switch(S2857){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S2843){
          case 0 : 
            S2843=0;
            if(com.systemj.Timer.getMs() - __start_thread_8 >= 100){//sysj\rotarytable_controller.sysj line: 18, column: 37
              ends[8]=3;
              ;//sysj\rotarytable_controller.sysj line: 18, column: 37
              ends[8]=2;
              tdone[8]=1;
            }
            else {
              S2843=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S2843=1;
            S2843=0;
            if(com.systemj.Timer.getMs() - __start_thread_8 >= 100){//sysj\rotarytable_controller.sysj line: 18, column: 37
              ends[8]=3;
              ;//sysj\rotarytable_controller.sysj line: 18, column: 37
              ends[8]=2;
              tdone[8]=1;
            }
            else {
              S2843=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4576(int [] tdone, int [] ends){
        switch(S2841){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\rotarytable_controller.sysj line: 18, column: 7
        currsigs.addElement(rotaryTableTrigger);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread4574(int [] tdone, int [] ends){
        S2857=1;
    __start_thread_8 = com.systemj.Timer.getMs();//sysj\rotarytable_controller.sysj line: 18, column: 37
    S2843=0;
    if(com.systemj.Timer.getMs() - __start_thread_8 >= 100){//sysj\rotarytable_controller.sysj line: 18, column: 37
      ends[8]=3;
      ;//sysj\rotarytable_controller.sysj line: 18, column: 37
      ends[8]=2;
      tdone[8]=1;
    }
    else {
      S2843=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread4573(int [] tdone, int [] ends){
        S2841=1;
    rotaryTableTrigger.setPresent();//sysj\rotarytable_controller.sysj line: 18, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread4571(int [] tdone, int [] ends){
        S2857=1;
    __start_thread_8 = com.systemj.Timer.getMs();//sysj\rotarytable_controller.sysj line: 18, column: 37
    S2843=0;
    if(com.systemj.Timer.getMs() - __start_thread_8 >= 100){//sysj\rotarytable_controller.sysj line: 18, column: 37
      ends[8]=3;
      ;//sysj\rotarytable_controller.sysj line: 18, column: 37
      ends[8]=2;
      tdone[8]=1;
    }
    else {
      S2843=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread4570(int [] tdone, int [] ends){
        S2841=1;
    rotaryTableTrigger.setPresent();//sysj\rotarytable_controller.sysj line: 18, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread4568(int [] tdone, int [] ends){
        switch(S2831){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bR_1.getprestatus()){//sysj\rotarytable_controller.sysj line: 12, column: 55
          S2831=0;
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

  public void thread4567(int [] tdone, int [] ends){
        switch(S2828){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(cvR_1.getprestatus()){//sysj\rotarytable_controller.sysj line: 12, column: 40
          S2828=0;
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

  public void thread4566(int [] tdone, int [] ends){
        switch(S2825){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(cR_1.getprestatus()){//sysj\rotarytable_controller.sysj line: 12, column: 26
          S2825=0;
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

  public void thread4565(int [] tdone, int [] ends){
        switch(S2822){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(fR_1.getprestatus()){//sysj\rotarytable_controller.sysj line: 12, column: 12
          S2822=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread4564(int [] tdone, int [] ends){
        switch(S4137){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2836){
          case 0 : 
            thread4565(tdone,ends);
            thread4566(tdone,ends);
            thread4567(tdone,ends);
            thread4568(tdone,ends);
            int biggest4569 = 0;
            if(ends[3]>=biggest4569){
              biggest4569=ends[3];
            }
            if(ends[4]>=biggest4569){
              biggest4569=ends[4];
            }
            if(ends[5]>=biggest4569){
              biggest4569=ends[5];
            }
            if(ends[6]>=biggest4569){
              biggest4569=ends[6];
            }
            if(biggest4569 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest4569 == 0){
              S2836=1;
              if(bottleAtPos5.getprestatus()){//sysj\rotarytable_controller.sysj line: 13, column: 14
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S2836=2;
                thread4570(tdone,ends);
                thread4571(tdone,ends);
                int biggest4572 = 0;
                if(ends[7]>=biggest4572){
                  biggest4572=ends[7];
                }
                if(ends[8]>=biggest4572){
                  biggest4572=ends[8];
                }
                if(biggest4572 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                if(biggest4572 == 2){
                  ends[2]=2;
                  ;//sysj\rotarytable_controller.sysj line: 17, column: 5
                  S2836=3;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            break;
          
          case 1 : 
            if(!bottleAtPos5.getprestatus()){//sysj\rotarytable_controller.sysj line: 14, column: 12
              S2836=2;
              thread4573(tdone,ends);
              thread4574(tdone,ends);
              int biggest4575 = 0;
              if(ends[7]>=biggest4575){
                biggest4575=ends[7];
              }
              if(ends[8]>=biggest4575){
                biggest4575=ends[8];
              }
              if(biggest4575 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest4575 == 2){
                ends[2]=2;
                ;//sysj\rotarytable_controller.sysj line: 17, column: 5
                S2836=3;
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
          
          case 2 : 
            thread4576(tdone,ends);
            thread4577(tdone,ends);
            int biggest4578 = 0;
            if(ends[7]>=biggest4578){
              biggest4578=ends[7];
            }
            if(ends[8]>=biggest4578){
              biggest4578=ends[8];
            }
            if(biggest4578 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest4578 == 2){
              ends[2]=2;
              ;//sysj\rotarytable_controller.sysj line: 17, column: 5
              S2836=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest4578 == 0){
              S2836=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\rotarytable_controller.sysj line: 21, column: 11
              S2836=4;
              S2914=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 22, column: 5
                rotated_o.setREQ(false);//sysj\rotarytable_controller.sysj line: 22, column: 5
                S2914=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S2909=0;
                if(rotated_o.isACK()){//sysj\rotarytable_controller.sysj line: 22, column: 5
                  rotated_o.setVal(SBoolean.TRUE);//sysj\rotarytable_controller.sysj line: 22, column: 5
                  S2909=1;
                  if(!rotated_o.isACK()){//sysj\rotarytable_controller.sysj line: 22, column: 5
                    rotated_o.setREQ(false);//sysj\rotarytable_controller.sysj line: 22, column: 5
                    ends[2]=2;
                    ;//sysj\rotarytable_controller.sysj line: 22, column: 5
                    S2836=5;
                    __start_thread_2 = com.systemj.Timer.getMs();//sysj\rotarytable_controller.sysj line: 10, column: 3
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//sysj\rotarytable_controller.sysj line: 10, column: 3
                      ends[2]=2;
                      ;//sysj\rotarytable_controller.sysj line: 10, column: 3
                      S2836=0;
                      thread4579(tdone,ends);
                      thread4580(tdone,ends);
                      thread4581(tdone,ends);
                      thread4582(tdone,ends);
                      int biggest4583 = 0;
                      if(ends[3]>=biggest4583){
                        biggest4583=ends[3];
                      }
                      if(ends[4]>=biggest4583){
                        biggest4583=ends[4];
                      }
                      if(ends[5]>=biggest4583){
                        biggest4583=ends[5];
                      }
                      if(ends[6]>=biggest4583){
                        biggest4583=ends[6];
                      }
                      if(biggest4583 == 1){
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
          
          case 4 : 
            switch(S2914){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 22, column: 5
                  rotated_o.setREQ(false);//sysj\rotarytable_controller.sysj line: 22, column: 5
                  S2914=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S2909){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\rotarytable_controller.sysj line: 22, column: 5
                        rotated_o.setVal(SBoolean.TRUE);//sysj\rotarytable_controller.sysj line: 22, column: 5
                        S2909=1;
                        if(!rotated_o.isACK()){//sysj\rotarytable_controller.sysj line: 22, column: 5
                          rotated_o.setREQ(false);//sysj\rotarytable_controller.sysj line: 22, column: 5
                          ends[2]=2;
                          ;//sysj\rotarytable_controller.sysj line: 22, column: 5
                          S2836=5;
                          __start_thread_2 = com.systemj.Timer.getMs();//sysj\rotarytable_controller.sysj line: 10, column: 3
                          if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//sysj\rotarytable_controller.sysj line: 10, column: 3
                            ends[2]=2;
                            ;//sysj\rotarytable_controller.sysj line: 10, column: 3
                            S2836=0;
                            thread4584(tdone,ends);
                            thread4585(tdone,ends);
                            thread4586(tdone,ends);
                            thread4587(tdone,ends);
                            int biggest4588 = 0;
                            if(ends[3]>=biggest4588){
                              biggest4588=ends[3];
                            }
                            if(ends[4]>=biggest4588){
                              biggest4588=ends[4];
                            }
                            if(ends[5]>=biggest4588){
                              biggest4588=ends[5];
                            }
                            if(ends[6]>=biggest4588){
                              biggest4588=ends[6];
                            }
                            if(biggest4588 == 1){
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
                      if(!rotated_o.isACK()){//sysj\rotarytable_controller.sysj line: 22, column: 5
                        rotated_o.setREQ(false);//sysj\rotarytable_controller.sysj line: 22, column: 5
                        ends[2]=2;
                        ;//sysj\rotarytable_controller.sysj line: 22, column: 5
                        S2836=5;
                        __start_thread_2 = com.systemj.Timer.getMs();//sysj\rotarytable_controller.sysj line: 10, column: 3
                        if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//sysj\rotarytable_controller.sysj line: 10, column: 3
                          ends[2]=2;
                          ;//sysj\rotarytable_controller.sysj line: 10, column: 3
                          S2836=0;
                          thread4589(tdone,ends);
                          thread4590(tdone,ends);
                          thread4591(tdone,ends);
                          thread4592(tdone,ends);
                          int biggest4593 = 0;
                          if(ends[3]>=biggest4593){
                            biggest4593=ends[3];
                          }
                          if(ends[4]>=biggest4593){
                            biggest4593=ends[4];
                          }
                          if(ends[5]>=biggest4593){
                            biggest4593=ends[5];
                          }
                          if(ends[6]>=biggest4593){
                            biggest4593=ends[6];
                          }
                          if(biggest4593 == 1){
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
                S2914=1;
                S2914=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 22, column: 5
                  rotated_o.setREQ(false);//sysj\rotarytable_controller.sysj line: 22, column: 5
                  S2914=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2909=0;
                  if(rotated_o.isACK()){//sysj\rotarytable_controller.sysj line: 22, column: 5
                    rotated_o.setVal(SBoolean.TRUE);//sysj\rotarytable_controller.sysj line: 22, column: 5
                    S2909=1;
                    if(!rotated_o.isACK()){//sysj\rotarytable_controller.sysj line: 22, column: 5
                      rotated_o.setREQ(false);//sysj\rotarytable_controller.sysj line: 22, column: 5
                      ends[2]=2;
                      ;//sysj\rotarytable_controller.sysj line: 22, column: 5
                      S2836=5;
                      __start_thread_2 = com.systemj.Timer.getMs();//sysj\rotarytable_controller.sysj line: 10, column: 3
                      if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//sysj\rotarytable_controller.sysj line: 10, column: 3
                        ends[2]=2;
                        ;//sysj\rotarytable_controller.sysj line: 10, column: 3
                        S2836=0;
                        thread4594(tdone,ends);
                        thread4595(tdone,ends);
                        thread4596(tdone,ends);
                        thread4597(tdone,ends);
                        int biggest4598 = 0;
                        if(ends[3]>=biggest4598){
                          biggest4598=ends[3];
                        }
                        if(ends[4]>=biggest4598){
                          biggest4598=ends[4];
                        }
                        if(ends[5]>=biggest4598){
                          biggest4598=ends[5];
                        }
                        if(ends[6]>=biggest4598){
                          biggest4598=ends[6];
                        }
                        if(biggest4598 == 1){
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
            if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//sysj\rotarytable_controller.sysj line: 10, column: 3
              ends[2]=2;
              ;//sysj\rotarytable_controller.sysj line: 10, column: 3
              S2836=0;
              thread4599(tdone,ends);
              thread4600(tdone,ends);
              thread4601(tdone,ends);
              thread4602(tdone,ends);
              int biggest4603 = 0;
              if(ends[3]>=biggest4603){
                biggest4603=ends[3];
              }
              if(ends[4]>=biggest4603){
                biggest4603=ends[4];
              }
              if(ends[5]>=biggest4603){
                biggest4603=ends[5];
              }
              if(ends[6]>=biggest4603){
                biggest4603=ends[6];
              }
              if(biggest4603 == 1){
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
          
        }
        break;
      
    }
  }

  public void thread4560(int [] tdone, int [] ends){
        S4465=1;
    if((baxterReady_in.getVal() == null ? null : ((Boolean)baxterReady_in.getVal()))){//sysj\rotarytable_controller.sysj line: 7, column: 9
      bR_1.setPresent();//sysj\rotarytable_controller.sysj line: 7, column: 20
      currsigs.addElement(bR_1);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S4465=0;
      active[21]=0;
      ends[21]=0;
      tdone[21]=1;
    }
  }

  public void thread4559(int [] tdone, int [] ends){
        S4459=1;
    S4458=0;
    S4442=0;
    if(!baxterReady_in.isPartnerPresent() || baxterReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
      baxterReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
      S4442=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S4437=0;
      if(!baxterReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
        baxterReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
        S4437=1;
        if(baxterReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
          baxterReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
          ends[20]=2;
          ;//sysj\rotarytable_controller.sysj line: 5, column: 5
          S4458=1;
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

  public void thread4558(int [] tdone, int [] ends){
        S4533=1;
    S4467=0;
    thread4559(tdone,ends);
    thread4560(tdone,ends);
    int biggest4561 = 0;
    if(ends[20]>=biggest4561){
      biggest4561=ends[20];
    }
    if(ends[21]>=biggest4561){
      biggest4561=ends[21];
    }
    if(biggest4561 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread4556(int [] tdone, int [] ends){
        S4366=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotarytable_controller.sysj line: 7, column: 9
      cvR_1.setPresent();//sysj\rotarytable_controller.sysj line: 7, column: 20
      currsigs.addElement(cvR_1);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S4366=0;
      active[18]=0;
      ends[18]=0;
      tdone[18]=1;
    }
  }

  public void thread4555(int [] tdone, int [] ends){
        S4360=1;
    S4359=0;
    S4343=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
      convReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
      S4343=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      S4338=0;
      if(!convReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
        convReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
        S4338=1;
        if(convReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
          convReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
          ends[17]=2;
          ;//sysj\rotarytable_controller.sysj line: 5, column: 5
          S4359=1;
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

  public void thread4554(int [] tdone, int [] ends){
        S4434=1;
    S4368=0;
    thread4555(tdone,ends);
    thread4556(tdone,ends);
    int biggest4557 = 0;
    if(ends[17]>=biggest4557){
      biggest4557=ends[17];
    }
    if(ends[18]>=biggest4557){
      biggest4557=ends[18];
    }
    if(biggest4557 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread4552(int [] tdone, int [] ends){
        S4267=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotarytable_controller.sysj line: 7, column: 9
      cR_1.setPresent();//sysj\rotarytable_controller.sysj line: 7, column: 20
      currsigs.addElement(cR_1);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S4267=0;
      active[15]=0;
      ends[15]=0;
      tdone[15]=1;
    }
  }

  public void thread4551(int [] tdone, int [] ends){
        S4261=1;
    S4260=0;
    S4244=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
      capperReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
      S4244=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S4239=0;
      if(!capperReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
        capperReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
        S4239=1;
        if(capperReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
          capperReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
          ends[14]=2;
          ;//sysj\rotarytable_controller.sysj line: 5, column: 5
          S4260=1;
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

  public void thread4550(int [] tdone, int [] ends){
        S4335=1;
    S4269=0;
    thread4551(tdone,ends);
    thread4552(tdone,ends);
    int biggest4553 = 0;
    if(ends[14]>=biggest4553){
      biggest4553=ends[14];
    }
    if(ends[15]>=biggest4553){
      biggest4553=ends[15];
    }
    if(biggest4553 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread4548(int [] tdone, int [] ends){
        S4168=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotarytable_controller.sysj line: 7, column: 9
      fR_1.setPresent();//sysj\rotarytable_controller.sysj line: 7, column: 20
      currsigs.addElement(fR_1);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S4168=0;
      active[12]=0;
      ends[12]=0;
      tdone[12]=1;
    }
  }

  public void thread4547(int [] tdone, int [] ends){
        S4162=1;
    S4161=0;
    S4145=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotarytable_controller.sysj line: 5, column: 5
      fillerReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
      S4145=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S4140=0;
      if(!fillerReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
        fillerReady_in.setACK(true);//sysj\rotarytable_controller.sysj line: 5, column: 5
        S4140=1;
        if(fillerReady_in.isREQ()){//sysj\rotarytable_controller.sysj line: 5, column: 5
          fillerReady_in.setACK(false);//sysj\rotarytable_controller.sysj line: 5, column: 5
          ends[11]=2;
          ;//sysj\rotarytable_controller.sysj line: 5, column: 5
          S4161=1;
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

  public void thread4546(int [] tdone, int [] ends){
        S4236=1;
    S4170=0;
    thread4547(tdone,ends);
    thread4548(tdone,ends);
    int biggest4549 = 0;
    if(ends[11]>=biggest4549){
      biggest4549=ends[11];
    }
    if(ends[12]>=biggest4549){
      biggest4549=ends[12];
    }
    if(biggest4549 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread4545(int [] tdone, int [] ends){
        S4535=1;
    thread4546(tdone,ends);
    thread4550(tdone,ends);
    thread4554(tdone,ends);
    thread4558(tdone,ends);
    int biggest4562 = 0;
    if(ends[10]>=biggest4562){
      biggest4562=ends[10];
    }
    if(ends[13]>=biggest4562){
      biggest4562=ends[13];
    }
    if(ends[16]>=biggest4562){
      biggest4562=ends[16];
    }
    if(ends[19]>=biggest4562){
      biggest4562=ends[19];
    }
    if(biggest4562 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    if(biggest4562 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    if(biggest4562 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    if(biggest4562 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread4543(int [] tdone, int [] ends){
        S2831=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread4542(int [] tdone, int [] ends){
        S2828=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4541(int [] tdone, int [] ends){
        S2825=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread4540(int [] tdone, int [] ends){
        S2822=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4539(int [] tdone, int [] ends){
        S4137=1;
    S2836=0;
    thread4540(tdone,ends);
    thread4541(tdone,ends);
    thread4542(tdone,ends);
    thread4543(tdone,ends);
    int biggest4544 = 0;
    if(ends[3]>=biggest4544){
      biggest4544=ends[3];
    }
    if(ends[4]>=biggest4544){
      biggest4544=ends[4];
    }
    if(ends[5]>=biggest4544){
      biggest4544=ends[5];
    }
    if(ends[6]>=biggest4544){
      biggest4544=ends[6];
    }
    if(biggest4544 == 1){
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
      switch(S4537){
        case 0 : 
          S4537=0;
          break RUN;
        
        case 1 : 
          S4537=2;
          S4537=2;
          fR_1.setClear();//sysj\rotarytable_controller.sysj line: 8, column: 3
          cR_1.setClear();//sysj\rotarytable_controller.sysj line: 8, column: 3
          cvR_1.setClear();//sysj\rotarytable_controller.sysj line: 8, column: 3
          bR_1.setClear();//sysj\rotarytable_controller.sysj line: 8, column: 3
          thread4539(tdone,ends);
          thread4545(tdone,ends);
          int biggest4563 = 0;
          if(ends[2]>=biggest4563){
            biggest4563=ends[2];
          }
          if(ends[9]>=biggest4563){
            biggest4563=ends[9];
          }
          if(biggest4563 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          fR_1.setClear();//sysj\rotarytable_controller.sysj line: 8, column: 3
          cR_1.setClear();//sysj\rotarytable_controller.sysj line: 8, column: 3
          cvR_1.setClear();//sysj\rotarytable_controller.sysj line: 8, column: 3
          bR_1.setClear();//sysj\rotarytable_controller.sysj line: 8, column: 3
          thread4564(tdone,ends);
          thread4604(tdone,ends);
          int biggest4634 = 0;
          if(ends[2]>=biggest4634){
            biggest4634=ends[2];
          }
          if(ends[9]>=biggest4634){
            biggest4634=ends[9];
          }
          if(biggest4634 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest4634 == 0){
            S4537=0;
            active[1]=0;
            ends[1]=0;
            S4537=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    fR_1 = new Signal();
    cR_1 = new Signal();
    cvR_1 = new Signal();
    bR_1 = new Signal();
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
          fillerReady_in.gethook();
          capperReady_in.gethook();
          convReady_in.gethook();
          baxterReady_in.gethook();
          rotated_o.gethook();
          tableAlignedWithSensor.gethook();
          bottleAtPos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      rotaryTableTrigger.setpreclear();
      fR_1.setpreclear();
      cR_1.setpreclear();
      cvR_1.setpreclear();
      bR_1.setpreclear();
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
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      fR_1.setClear();
      cR_1.setClear();
      cvR_1.setClear();
      bR_1.setClear();
      fillerReady_in.sethook();
      capperReady_in.sethook();
      convReady_in.sethook();
      baxterReady_in.sethook();
      rotated_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        fillerReady_in.gethook();
        capperReady_in.gethook();
        convReady_in.gethook();
        baxterReady_in.gethook();
        rotated_o.gethook();
        tableAlignedWithSensor.gethook();
        bottleAtPos5.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
