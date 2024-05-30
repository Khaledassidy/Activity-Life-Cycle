//Activity Life Cycle:dawret l 7ayet ta3et l kel activity ela bedeye w ela neheye w been l bedeye w neheye btmro2 b 3edet mara7el
//aye acitvity b2alab aye application 2ela life cycle
//2awl ma 2efta7 l application le 3mlto 7aytem 2ested3e2 l activitys l enta samamtoun
//tyeb l code le enta katbto lal activity ween ketbo b method b2alb l android esma OnCreate
//kel l code le ana ketbo maktob b function esma OnCreate
//tyeb hal enta le 3mlt ested3e2 la method l OnCreate akeed la2 system howe la7alo 3mel call lal method l OnCreate
//ne7na 7kena eno 3atoul telka2eyan 2awl method btem ested3e2a l tanfez l code heye method l OnCreate mtl method l main le b2alb java
//iza mnla7ez method l OnCreate maktob faw2a overide ma3eneta eno hay l method kenet 3end l ab w tam 2e3edet ketebeta b mo7tawa jdeded b class l ebn 3ashen nafez l code le bade yeh le ana bektbo metl findview,le bade yeh
//fa telk2eyan 2awl ma sha8lt l application ra7 system law7do stad3a l function l OnCreate w nafaz l code le b2aba le be2ol 2e3red l ko7tawa w nafez kaza 3ameleye
//bas eja 2alak method l OnCreate la7ala ma btekfe 7akalk 2aw2at ana be7je nafez 3lyet b mara7el m3ayane b2alb l activity keef ya3ne:
//exmple ftered enta 3am teshte8l 3ala application te7soub ra2men ya3ne te5od 2awl ra2m tejm3o ma3 tene w te3roud l nateje ok
//bas 7akelak eno bade bas ta3mel back ya3ne button l back terja3 la wara bade system y7afez nateje b data base ya3ne ta3mel she
//tyeb l meshkle l wejhtne eno keef bade 2a3ref eno l user kabas 3ala kabset l back sa3be 2a3ref bl code ma fene ana 3ande function bas la ma tblesh shshe ma 3nde function bas ekbous kabset l back
//bas eja 7ekelk 3mlna function btestd3a telka2eyan  wa2t tetla3 mn l app 2aw l activity  ya3ne lama ta3mel back
//ya3ne function lama ta3mel back trou7 testd3a telk2eyan w tnafez l code l b2alba l howw 7afez l nateje b database mslan
//w 3mele kteer mara7el mtl eno ana ma bade wa2ef l application kolyen bade okbous 3al kabse l b nous l home w 2etla3 mn app partialy w bas bade aymta ma bade 2erja3 efta7 l app 3ade
//fa system 3mele kaza function wa7de bas 2awl ma sha8el shshe,wa7de 2awl ma wa2ef shshe,wa7de wa2t 2oloub shshe 3mele kaza function system la7alo byestad3eha
//ya3ne bade nafez code b mara7el mot3adede mn l activity w hay le besmoha Activity life cycle
//Activity life cycle:heye majmo3et function b 2alb kel activity b testd3a telk2eyan system la7lo byestd3eha w mn 5elele hal life cycle be2dar et7akam b kel mar7le mn mara7el l activity ya3ne kel mar7le mn fatrat 7eyeta lal activity mn 2awl ma teshte8l la tentehe be2dar ya3ne be2dar 2a3ref w nafez code wa2t l user ysha8ala la hay l activity wa2t ysakera  yetfeha ...kel sheee...
//ween kamen bsafed mena lal life cycle b 2eshya secrity masaln enta 3am ta3mel banking app badak 2awl ma yefta7 l app t5ale l user y7ot 7sebo w kaza w badak 2awl ma l user ysaker l application kel she information 7ata yel8eha 3ashen security
//so law ma3nde access 3al life cycle ta3et l activity ma fene 2el8e kel l ma3lomet le b7ota l user bas 2etla3 mn l application
//kel l function ta3wlet l life cycle mnsameha calls  backs ya3ne hawde function btem ested3e2a mn system mesh ana ba3mel ested3e2

//life cycle of activity and how function is call hawde l method jehze system la7lo 7ayestad3eha ana bas ba3mela call w system la7lo byestd3e kel wa7de b wa2t m3yan:

/*

                        Activity Lunched
                             |
                             |
|----------------------- OnCreate():2awl method byestad3eha w houn l activity btensha2 ma btkoun lesa design ma mbyen ma btkoun l activity mbyne lal user
|                            |
|                            |
|   |--------------------OnStart():houn l activity btblesh ma bekoun lesa l activity mbyne lal user
|   |                        |
|   |                        |
|   |      |-iza sakrta--OnResume():hayde ba3d l on start ba3d hay l method btseer l activity zahra lal user bye2dar yet7akam feha
|   |      |                 |  ya3ne 2awl ma tshof application zahra l activity 2edemak  3ref eno 3al akeed l 3 function l OnCreate(),OnStart(),OnResume() tam akeed ested3e2oun
|   |      |                 |
|   |      |           Activity running ya3ne btkoun l activivity mbyne lal user w fe yesta5dema
|   |      |                 |
|   |      |                 |
|   |      |  case (1)if another activity come in the foreground ya3ne ba3da l activity mbyne bas m3tme shway metl 3tebr enta fete7 calculator am ejek msg mn l watsap  btejelk msg 2am enta fe kabse bel notification esma  fast reply 2am btefta7lk watsap bas shshe z8ere bas ba3da l application le enta fete7a le heye calculator fet7a w 3am tshofa sha8le tabe3e bas eja faw2a shshe s8ere mn l watssap btl2eha eno m3tme shway l activity le ta7t l watssap l heye l calculator bas system mrakez 3al shshe ta3et l watsap ya3ne lama yeje dialog 2aw shshe mtl l wawasap fo2 application m3yan
|   |      |  b hay l 7ale btem ested3e function esma OnPause()
|   |      |  case (2) iza ana kenet l activity sha8ale 3ade w kabst l home button 7a etla3 mn l app Acitivity no longer visible bas 7adal sha8le bel back ground 7a ytem ta5zena (mo2akatnnnnn) btestd3e method l OnPause() ba3den l OnStop() w fe hay l 7ale btseer kamen iza 3ande activity 3adeye w eja faw2a activity jdede faw2a 2aw iza enta b activity m3ayane w jek notification mn watsap w kabst 3lyha fa 7a yefta7 l watsap kemel bas ba3da l activity l application sha8ale fa kamen 7a tfout bel onPause()--OnStop()
|   |      |  case (3) iza kabst kabset l back 7a etla3 koleyan mn l app w ma fe raj3a sa3eta 7a estad3e OnPause()-->OnStop()-->OnDestroy()
|   |      |                 |
|   |      |                 |
|   |      |_____________OnPause():ma3neta ekaaf mo2akat ya3ne fe she eja bel mokdame w 2akdet tarekez menak
|   |                        |   law ana ba3den sakrt heed l moraba3 ta3et l watsap le eja fo2 l activity 7a terja3 testad3e l method l OnResume() w ba3da bterja3 bteshte8l l activity tabe3e ya3ne l on pause bas tbatel tarkez 3ala hay l activity ya3ne l activity still visible but mano tarkez 3lyha
|   |                        |
|   |                        | case(2):activity no longer vissible
|   |____OnRestart()______OnStop():bestd3e l onPause() ba3den l onStop iza kabst l home button ya3ne l activity ma mbyne 2edeme bas m5zane fene erja3 fout 3lyha
|   1- iza rje3t fet 3al app |btestad3e 2awl she function: OnRestart()-->OnStart()--->OnResume() w bteshte8l tabe3e
|----2- iza ana bel onStop() |ya3ne kabst l home button  w ba3den fat7t application kteer tenyen w nseet tatbe2ak w mar kteer  wa2t ya3ne saret 2awlaweto d3efe fa momken system  l system sar be7aje la ram la7lo telk2eyan yrou7 ya3mel (AppProceess killed) ya3ne yetfelak application ta3elak nehyean bala ma y2olak fa ba3den jeet enta la terja3 tefta7o fa 7a yerja3 lal OnCreate() ma 7a ya3mel restart w ba3den onstart la 7a ya3mel OnCreate()-->OnStart()-->OnResume w yerja3 yeshte8l tabe3e
                             |
                         OnDestroy():the activity is finished or distroy by the system ya3ne l activity btetfe neh2yan (iza rj3t fat7ta lal app 2awl l activity bada taerja3 lal OnCreate()-->OnStart()-->OnResume())
                             |
                             |
                 Activity or application shut Down



Note wa2t no2loub l oriantation ta3et l activity ka2no damrna l activity le kenet b (portriat oriantation) w b 3mlna activity jdeedee

fa btseer heeek:
OnPause()-->OnStop()-->OnDestroy()-->OnCreate()-->OnStart()-->OnResume() w btensha2 l activity b oriantation jdeed

*/


//application of life cycle     bas note abl ma te2ra l code eje la raje3a m7ee l finish method() ba3den e5er she 7ot l finish:

package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //onCreate()
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Activity_life_cycle", "onCreate ");

    }

    //onStart()
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity_life_cycle", "onStart");

    }

    //onResume()
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity_life_cycle", "onResume");

    }

    //onpause()
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity_life_cycle", "onPause");

    }

    //onRestart()
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity_life_cycle", "onRestart");

    }

    //onStop()
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity_life_cycle", "onStop");

    }

    //onDestroy()
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity_life_cycle", "onDestroy");

    }

    //2awl ma teje traje3a ma7e hay l method w rja3 7ota bas tosal lal finish 3ashen tefham aktar
    @Override
    public void finish() {
        super.finish();
        Log.d("Activity_life_cycle", "finish");

    }

    //note:there is another method is called finish bas hay l method system meth howe bya3mela call developer bya3mela call:
    //ya3ne l far2 l wa7de bayna w bayn be2e l function eno developer bay3amela call meth system

    /* finish method:ne7na bas ykoun 3ana kaza activity wara ba3d fa hawde l activity b foto b 2alb stack 2e5er activity btkoun 2awl wa7de bel stack
    fa la n2ol ne7na 3mlna call la method finish fa hay l activity btrou7 w bteje l activity lal kenet waraha ya3ne hay l activity btetla3 mn l stack btbatel mawjoude
    btetla3 mn naviggation mode kabset l back button la7ala btestad3e l finish method l2no 7atbtel l activity mawjoude bel stack bteje she le waraha

    //example la n2ol ne7na stad3yna finish hala2 w 7atyna kamen log.d(finish) fa iza kabsna kabset l back button 7a testad3e l finish w ba3den pasuse w ba3den stop ba3den destroy
    //lesh stad3et l finish l2no ne7na kabsana kabset l back w hay l kabse betlae3 l activity mn l stack so stad3et l finish la7ala


    //l finish la7ala mesh metl destoroy
    //destroy bta3mel clean lal memory

    //ama l finish ma betlae3 l activity mn l stack bas ma bta3mel clean memory bta3mel (priaclly clean memory ya3ne momken teje factor metl eno 3ozna ram 2aw she sa3eta l system la7alo bye5od l 2arar w bya3mela distroy la hay l activity)

    //iza badak ta3mel call lal finish b 2aye activity bel Oncreate method bas ktob (finish()) bas heek

    */



    /*
    3ande kamen function zyede b life cycle

    2awl she 5alena nshof heed l exmaple:
    l application le ana 3mlto ta3el byo7soub l area iza ana 7asbt area m3ayane la rectangle masaln w 7atet nateje 3ala l textview:maslan (180)
    w jeet 3mlt rotate la landscape mtl ma mna3ref ne7na b rotate l activity bten3amal destroy w bseer 3ande activity jdeede damar l activity le kenet bl protrait w ansha2 activity jdede b land scape fa kel data le kont 7ateta ra7et ya3ne l 180 le kont 7atet 3al text view bada trou7 l2no sar destroy bas l data le b2alb edit text mtl l width w l height dalo bas le b2alb text view ra7o
    fa natejet l 180 5tafet hala2 w ma7a terja3 tbayen ela iza rje3t kabast calculate sabab eno metl ma 2olna 3ml tadmer lal activity lale kent w ansha2 activity jdede
    houne 3mlo heek la text view l2no howe ma7al bt3roud fe values ma bda5el fe values mtl l edit text


    fa lezm 7ola la hay sha8le fe 2 function bt7elel hay sha8le mn life cycle houne bas haw l function ma byet3mela ma3oun ela iza kont 3am et3emal ma3 nafs l activity mesh ma3 different activity bas iza 2alabt sheshe 8ayart 7ajm sheshe metl heek zrouf:
    ya3ne haw l tnene btem ested3a2oun bas iza sar she esmo (configuration change) ya3ne ta8your bel 2e3dadet w 2a7ad l configuration state eno te2loub shshe mn portrait la landscape w fee kteer amsela bseer fe configuration state
    w dalel 3a heed jarbna na3mel back la activity fa howe 7a yestad3e l onPause() ba3den l onStop() bas howe stad3a l onPause() bas ma stad3a waraha saveinstance so l back button hay mana configuration state w kamen l2no ana bas tle3t mena batalt 3am esta3mel nafs l activity nta2lt la activity tenye
    w 7ata wa2t rje3t lal activity fa 7a yestad3e l onCreate() ba3den l onstart() ba3den onresume() so stad3a l onstart() bas ma stad3a ba3da l restoreinstance so l2no l back button w l bas fout 3al shshe 2awl she manon configuration state w lama fata7t rje3t l application fata7t activity jdede enshe2 activity jdede ya3ne batlt 3am et3mela ma3 nafs l acitivity
    l2no haw l method l tnene bas bseer ested3e2 2eloun ela iza 3am net3amal ma3 nafs l activity w sar fe configuration change la hay l activity


    -OnSaveInstanceState(Bundle outState):hayde bta3mel save la data
    -OnRestoreInstanceState(Bundle savedInstanceState):hayde bta3mel restore esterja3 la data


    -OnSaveInstanceState(Bundle outState) byetem ested3e2a ba3d method l onPause()
    -OnRestoreInstanceState(Bundle savedInstanceState) byetem ested3e2a bl activity l jdede ba3d method l  onStart()

    ya3ne la 7el l methkle ta3ete lezm abl ma damer l activity l bl portriat 7afez data l heye 180 w 5azena b maken no3ayan
    w lama 2a3mel enshe2 lal activity tenye le heye landscape e5od l data le sayvta bl activity l 2ademe(portriat) w 2o3reda bl activity l jdede l heye l landscape
    bhay l 7ale bkoun damnt bhay l 7arake eno 5alet l user ysh3our eno ma fa2ad l data


     @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);

        //ana mafrouf ektob l code l 7ofz oktbo houn
    }
}



     @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //ana mafroud ektoub l code ta3el l restore houn
    }

    tyeb ana ween bade e7faz l data hawde le bade estarje3oun b she esmo (Bundle)

    Bundle:class mawjoud b sdk ta3el l android mn 5elela m5azen majmou3a mn l keyam
    bundle ma3nta 7ezma

    sho l far2 been bundle w package l 2no tnaynetoun ma3netoun 7ezma?

    package:heye 7ezmet malafet
    bundle:heye 7ezmet bayanet data keyam values


    bundle bta3mel save la numbers,text,symbol...others
    bundle momken kamen tsayev b2alba bundle kamen

    l OnSaveInstanceState(Bundle outState),OnRestoreInstanceState(Bundle savedInstanceState) haw l 2 function le btem ested3e2oun system (call back)


    l OnSaveInstanceState(Bundle outState),OnRestoreInstanceState(Bundle savedInstanceState) l parameter ta3ela l mod5al bundle bte5od bundle
    meeen byeb3at  hay l bundle lal lal 2 function system
    fa system bas yestd3e haw 2 function byeb3at ma3oun hay l bundle


    system bas ystad3e OnSaveInstanceState(Bundle outState) byeb3tla l bundle l outstate

    system bas yestd3e OnRestoreInstanceState(Bundle savedInstanceState) bye5od l bundle le heye bel savedinstancestate function w byerja3 byeb3ta bel restore function





    keef mnet3mal ma3 l bundle:
    1-mna3mel object mn bundle l2no heye class b nehye
    Bundle bundle=new Bundle();

    2 3ashen 5azen b2alba data besta3mel function b2alb l bundle esma put() fe put(string,int,float,bundle l bade yeh) bas b2olak 3ashen ta3mel put lezm ta3tene b 2alb l put 2 parameter 2awl parameter key tene wa7d l value lesh l2no t5ayl 3andak sando2 w heed sandou2 badak t7out fe aktr mn sha8le m5tlfen mesh lezm kel sha8le t7outa lezm ykoun ela esm 3ashen le bado yesta2belha ya3ref hay esma phone,hay esma clock,hay esma house ya3ne lezm kel data kel value bel bundle ela esm 3ashn bas testarje3a 2e2dar 2a3refa mn esma 3ashn heek fe she esmo (key) heed l key 3atoul string mn 7oto been 2 qutation la kel value bel bundle w tene parameter bel bundle l value le badak tsayfo exmple 3ande bundle badak t7out information ta3ete b2alba esme,3aylte,ra2m telephone fa l most2bel haw l ma3lomet ma bye2dar ymayzhoun eno heed esme ela mn 5elele l key:
     bundle.putString("my_name","khaled");
     bundle.putString("my_last_name","Assidi");
     bundle.putInt("my_phone_number",81906189);

     note 3ande putBundle(key,bundle) fene zeet kaza bundle b2alb bundle wa7de w lezm 2a3teha key
     w fe 3ande putAll(bundle)ma ela key l2no hay btzeed bundle wa7de b2alb bundel fa ma b7aje la key
     -bundle2.putAll(bundle);
     -bundle2.putBundle("new",bundle3);



    3-3ashen estrej data mn l bundle besta3mel function b2alb l bundle esma get() bt7ot get w bt7ot b2alba l get l key ta3et l value le 3am testarje3a exmple
      String myname=bundle.getString("my_name");
      String lastname=bundle.getString("my_last_name");
      int phone=bundle.getInt("my_phone_number");



    hala2 shofna ne7na l bundle hala2 badna nshof keef badna net3emal ma3 l function savedinstance,restoreinstance





     */

    //saveinstance bteb3tlk bundle bas testad3a howe object l bundle meen ansha2 l bundle hayde l outstate l system la7alo l bseer system 3atane hay l bundle 3ashn 7ot feha l data l bade yeh w reje3 ba3tle yeha b restoreinstance nafs l bundle 3ashn erja3 estarje3 haw l data
    //system 3atane sando2 jehez 7ot feha data w rej3 ba3tle yeh nafso zeto la heed sando2 3ahsn erja3 estad3e data


    //7a 2a3mel exmple bel activity save_restore_isntance
}
