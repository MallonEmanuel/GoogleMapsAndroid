package com.app;

import java.util.Arrays;
import java.util.List;

/**
 * Para tener en cuenta, un recorrido puede ser un conjunto de tramos.
 * Data tiene una lista de lista. Porque tiene un conjunto de recorridos, que puede
 * tener 1 o mas tramos.
 */
public class Data {


    //0
    private final static String LINE0 = "aplrBrw~xRxAsM~BuRbBTdAoD|BoCjBmAnm@m]tNaIHg@Nc@\\E`@?tLgH|fSq_LxJgIblBekH~`BmeBzD}AbGc@xsBeBly@k@xD}AbFmEf|AymAxrAao@`oAwk@`CaC`DsD`C}EzDmL`D{GrT{i@fQmb@fEkJ~DwD`FqAph@kMbNgC~Ks@rWXtJ~F|KbHnKbHhDj@hDQxIyCjFiCbMuRhEqCp^}HfAPt@XpErDdBXxG`@fBbAfEpClBr@zN]pARv@nA\\nAB~ABvC|@xArGvGvF~Ev@tA|@jDb@lCZv@p@|@tA|@|CjBpAb@`BJdCNbCDzGWfBe@|Ag@n@HfCpAbAHpBUtBO|C^h@AvD}AvGq@d@HdBfAn@ZbC?ZFdBnB^VfAOv@Kv@m@r@BpA`@rA`@bBCbHObCo@pAFhA|@nAfBp@XxBFtCInE{@~@CtAf@vCBxC[lBkBrCi@l@YViDAmBvB}B`Bo@zBkBrAkMf@gCd@aAdAq@v@_@hB[|UyCfKqAlB_AhB}BzBcBzAYfAH~GdBfBLhA?~Di@~BYlBoAjAiEhCgKCwAs@{AsBoDKkALcAbAyAvGaAfGm@`B@|@P`B@dCcA`D{@vDg@~@eApA{FtBgDfB{B??^}FLm@r@c@bAOzAHhANxAS~BqArASbAFt@?h@Uj@gAZ_AjAaAr@_Al@}AAw@o@{@gA]sAGi@Kk@e@[o@DmA`@u@^Sd@Mh@I~@Y`@k@Bs@[o@kAcB]qAJwBTsAdAi@lAi@b@Sr@QtBG~DaAxAw@PeAUiCcAeFsAsDm@{@qBq@c@gAPiAv@qBIeBb@wA~AwC`BoCXs@Ca@g@mAk@eAIi@Ss@y@y@k@}@EiAvAwJyCiHKaA^y@`@aBwC_Da@eCsAuKwC}Ka@}CIcI@wEhEqL`[ey@`Wcq@bMa[lb@q[zKyH~FcErd@{Ebq@sHpRkDhIYvHwOxH}EbMgGpo@_]bq@g^v^_StG}CzM{BbNqAdCh@x@n@JdE~@xCdAdB`DBpGC|Cn@t@dBfA~@dAW~@gD\\gBpC_AxDaDnEa@xBiCjD_JrDiGfAa@rHFfC}AvEoF`HuHxCcD]}Ez@cCnAoBnAInFhAtAiArDeIvH}CvCyCxAQnBv@tCfA|D[lHqBnDmCzFkEfDmC`AYdEw@l@s@Z}B\\iEHcCeAwEg@c@mDoA}FwD}HwEyA_AQoAPiCoAqA}@e@}@i@eAsAu@Ok@Rm@v@i@r@u@d@??m@@e@UuAk@m@_@]WQs@Am@Ta@b@Ob@MvJyAvIwAtE[tDWv@]\\_AFcADs@BaFXw@TUh@_@j@Gx@An@Zn@X??l@`@n@Tp@Db@AbBE|Gg@xKcAbBc@f@k@d@eAhBeEtDiCfJcGrL}HzB_AbB]nAI~AIfGGzFQjCFdBT|Cf@vAZdC\\jFf@pIFdDq@~EcC~L{GrH{GvB}B|CmAbCFbBh@`EbE??tBxBdB~@nDr@zDEzDQvy@qCzJc@~LqC|OoEbXiHvEyAjW{Gt]qCht@gF~J_AbGyC`EcGfMkQtD{FhFeF~F}EtFqErPsLbDkBtAUvD[~@g@j@c@`@{@bCeH`D}E~@aAhJyAtBi@lD_DnRcSvCgCfDWbBEhBsB|DuHlEuPhGeIjIyApHiAhA_AnAeCtB_KtBmNzMcP~NcK|HgCbDoBhAsE~@iBlAi@nDV|DHjDMlDoAxMoD|RiGdJwGnEsCpFNfNz@xHUrCLhCeAjFwEdAiDn@gAjAQzDBdA_AvAkCVoCUiCyAcA}@c@[o@g@mAmAc@}BLw@Mi@m@w@mAu@aAkB}@oAoAa@_Aa@mCa@mBqBeCu@_Am@qB??}@{@gDiAkBy@_A}@m@_Aq@uBB_An@qBl@}Aj@uAhBgDZ{@|BcFb@}@jAy@n@?f@?z@Zh@PnBjA`Bt@pB^jAf@`AfAbAnC??hAvB~@`Bd@rAXvBt@rBdAv@tAH|BKbBO~@i@pBuBfAwA`A}F|B}NfEsYtAaGjEiOfBoE??xB_D~FaIhF{GpFcE|AwANcBYoCIoBn@eBhDkBjBaAf@gALoBTaRTwTl@yBdEiIvHkO~Pw]lGiMjFgQbD_LlJi[~L}`@lOag@hC_IzAmEYoDw@eE`@kBzC{EvAwFf@q@v@YlAOjAW??xAs@x@K`AJvAj@lABlBBjABv@SdBwA^{AoA}CGo@L_CWm@{AsAeCeB_@eAIa@EoA^gAdAgAt@q@f@m@Dq@Kw@]g@_@i@??Qu@Jk@R]j@Y`AQf@u@^}@x@qDh@oA~@}@j@g@t@iArAaC|@g@lD]dA_@p@w@AeEWiGd@_Ep@wCj@e@vAQfAS`Aa@RiA`@}CfEsFbA{BYkDqD{DiC{Bc@eGeMoSkD}F[wAL}@VyA??vLm^tKkRdLuQ|QcZxL}QzBuL~@oMJ}G\\qBnAaCdEcI~AqI~AaHzC}DMaD??iGwOgBaA}C{@YkAx@cA??xC_@VwAWcAcDuEmC_Gq@kAKqA^q@fAe@j@u@jAwCdAgArA_Ar@cAv@}C?qCsAm@sAg@{@cBe@eBiBaBwAmAo@kA??D_Cb@}Jp@qBjB{AtAm@bD\\dBo@dFuCbCChAKJwAc@_BiAu@UkATc@VOr@Cb@?XCl@]^y@Vc@n@KbADhA?j@{@`@iAXcBoAqAw@{@mAGe@l@MbA]~@wAt@{@Iu@s@]s@DgBBmB@yBPiLhAaDtBuCtMeKlCoBtGgEhABNb@Bx@??Qt@Bd@??Vf@b@Ad@Ud@s@f@iBl@Ej@Dp@C`@Rr@Af@sAPeD@mBz@]hAEvAPzB?hAgAf@cBp@}@pA@bBUb@sAY_Ba@qAc@aAZ}@bCyDp@Id@Dn@JhAL??hC}AvAeApAe@??|B_AT{@McBmA_AiAGs@k@m@y@iAKgAd@oARoAQsAk@w@{@Os@AmAf@a@x@H??bBJh@Ux@}@Ty@r@e@z@G|@Tv@^fAVlARj@k@LkAOgAk@eC]uBmA{AmCiByBw@gCoAW{@P]j@MvA]??pBm@rAm@v@cAa@mFsAgA{RuIO{@H_A|@iBdEgL??j@g@tBp@`AId@aA\\kBlAgJt@q@??zA]t@Lr@j@dAhA~@`@t@[|@m@T}@f@Y|@[h@c@d@u@A}Ak@aAKy@ZiA??zAa@??jBKzBFlCT~A^hAUv@wA_@eBiAgAoB_CQyBFwAtAwBzCkCz@{DJcDSwBg@mBeAmAmDuC_D_B??{DaAuBI_Cy@yAqCMgAR}A`AkBxFgCpBuAf@eDk@{EI_Db@aBjBsBjCiDXwC]gB_@mDNgB?kDo@iAaFiFyDmDq@_CeCiD{BoDs@kCCm@GaDrAiHxEoOdCsFdAg@v@H??`Al@Rj@tBXpAYv@wBz@{Cd@eB`@YbAD`@r@X|@\\|@f@h@d@@j@QlEuChFeDbBo@d@If@KZe@@i@IaBDgB^s@^a@`@Cj@?b@Dh@h@`AbA^Nz@E`@s@Ti@??dBmB|EmDpAaApAOb@Cj@Nh@Vj@P??nALxA}@??rCkBnB]pBE??lCDHQ`@a@Bk@i@k@s@So@UOe@Lo@jEgC??n@i@Jw@As@Iq@i@k@mAA}@c@Sy@`@kB??\\wBOaAg@g@{@?sDr@o@pA_ALeBOkAt@}@B[]?cAr@c@JcAs@yAW}@b@y@dATjAZhCqDKuBi@iAl@gAxAeAYuAiCTuBv@u@cA\\qAr@qA?cA}B_AqBrAu@b@mC]cDGm@o@J}@fCqBtCwBk@gEPgAjAG??dCxApHQp@aA_@gByAaFFwBuAiDUu@Rg@nAUpC}@AoAaAc@qAIWw@VaAzCcBCgBqAaAeEgAkCDaCm@sCx@cGKc@eDuASeCb@wAy@WgAr@{@fEiA~CWh@k@PmAf@[??hAFl@OXgAI{AMiAwAuA{@oB]wAJ[RKb@GRFRFz@\\p@?t@Gl@JlA`Bz@Xl@GX_@Li@SeAi@m@k@gAHm@h@g@d@g@??bBuDKsAo@q@{@Ki@a@gAoBWkCPyBr@eErA}@r@???\\j@tDjFXT??l@LjBu@jAo@`@J^\\N\\Fz@@T\\Lh@A\\YTy@RaBI{ASgAc@mBu@q@kBo@i@u@WeBUiBnAqEz@a@h@PRZOx@Kz@?x@d@Pd@BVGdAe@b@wALk@ZQj@OX`@??bBfAl@@\\MPsA??l@q@v@K??nBDbA^L`@RbATj@f@N`AThBPv@_AxAuBXe@Ki@YYq@@sAf@w@EOg@??Tw@b@It@_@Ju@GeAu@iBMgAMmA_A_@yA`@}@v@c@`@_@?O[G[?c@Nm@Dm@Fg@Ou@e@i@[[Mq@JS^S|@I|@Lt@Lr@J??xHj@hB@hBe@jAoA`C{CvC{B~AwDbBaB\\}ASy@_AeAm@a@_@oAN{A^cASeAq@gAy@g@{@PsDJg@Vk@Pw@DiC{AeAgAyBeCuAoA{@OoBTgBIyDCsBUwBV_AMm@cAcAmAmAk@gAZo@lAk@v@_Al@s@_@QiAB}Aj@}ADeAUmCe@iB[a@o@DaC@W]Oc@C]j@w@??xCaC~AsBd@eBNaC]eBm@_CEkBj@eE~@qA??j@InAZb@Px@fAbCnBV~@hA|B??t@x@hBv@bBbAJj@?hAH^b@VfFvCd@t@FjAFn@VJZ?v@ObBe@vA@fC\\~@p@j@zAnAp@t@RtAe@n@_ANuBNs@pAy@d@?`@{Ar@o@pAJ|@JrDnA|@E`AYd@i@^{@DyA?eCPs@`@Mx@IhAMj@e@j@iAGw@c@oDDa@`@e@??xAc@bBgA|@{ATwCPqEb@sC??`@o@x@_@nCeAdAsAd@}BpA_Iz@cAt@i@p@MrCa@^U^cB^wAh@W`@A??~AE`@YZ{BLaLVsAvHaUXcIl@iClGoTJuAeCwYa@g@_@WoAi@{Ay@}AgEQcBGcHe@aB_AgA_AQgAMi@]Oi@@mA??PkCM}@Y_@iAmAIaAJaBXeES{@i@e@c@GoAg@Wm@mAyC_EsBk@CiBTiGjAe@ZSf@s@r@m@@[S??cByBk@WiCQu@W]g@E]NaFEsA}@oDm@aAkD{A}AuA{@yCfAeEtAyCGgCo@yB{DgAiA{@Aw@z@gC??qKqKy@aBEmB`AqBbBwClBqBvB_@|ABhHp@??dHqB|ToF??hQcEfRwAdHKdIgBrQeE`BeAb@iCn@sEpGmFhF}HfBqGcAoC[yBq@gBkEwC_@{@j@cAbBCxA`@|@GlB_Br@aIf@c@f@B\\p@`@hB??bAZlEBz@mAhBqOs@gBIoAf@[f@Tv@d@j@jAb@x@p@d@n@Ip@Oj@Wn@c@Rs@E_AGkA??Bq@PUhCuEl@[d@K~Aq@n@g@Xm@n@uBn@mAdDeEVa@L]Fw@Ak@IiCOe@SWSMYKWIk@YKUOe@c@u@[SWIY?_@Dm@HYEKM??M_@?Qh@sA?_@KY_@[oBqA??i@c@We@s@_CO]UM??]KcB@YEMUGQ@OPa@`EiCLSDU?WMu@oAgFMW[Y[OUGaAG[GSKSQuBsBMSKc@Q_@MSUUUG]@UF{@Lq@L[?WEQMMUEUBYJYt@}AA_@MY]a@Ya@Ma@A[Je@??ToAGi@Ke@a@o@QaAJc@T]rCeDp@kBjAcBHUD_@AWASK]KM[SQIo@E]FYLWR]f@Y`@_@^YNi@Pc@@UEOEWU]c@qA}BQSMIQE??UA[Ha@L[Nc@F??_@CqBMuAY_Ac@][a@i@Wm@Qy@?{@Ls@jD{Pl@wAjAyArAcA`HmCl@]dBiBzAuBdPgLbCqBPa@Jo@NkAC]??OgA????e@{D?a@Hm@??Pq@b@s@z@k@vCgA??JGv@k@??tBaEh@uA^oAPmBIkAYw@i@i@qDsB}@{@Yq@MaAHw@Jo@jBaELgAEy@YeAkA_CY{@Eu@RuBb@}DlBkLv@{D??|AiH\\}BFm@Cs@IaAUoAuCwIQ{@Ao@Fc@Ng@^m@b@e@zAaARYPe@Aa@K_@a@k@sA{@UYG]?]DYRW\\Sn@]j@k@`@yAB}@A_@Me@_@[c@O{BYq@B}@^g@?oB_@i@]Uq@@]DSX_@|@g@nJsDZKNA^?T?`D|@b@Fj@Df@AZHRDPJLRFh@Rz@RTZLZCvCw@j@Ev@GZKL_@B_@Kc@QYgAkAKc@FWP]t@g@d@OT@VLVPd@h@\\Rf@INKPW?}@LgGH[b@[f@i@Pc@Gk@a@UaCEQ[Ec@UqAWe@??_@Uy@Qo@QUU??E]@SPc@^q@Ny@F{BBmA??l@qEDq@Ko@Qg@m@eAQg@?g@DWT_@nDiEb@g@Ps@Bc@BaASwWJcAlA{FAc@Og@iBwFCs@Dg@Rq@\\c@h@c@`AYd@Cj@@nANp@Gp@a@jGuJT]jFcSDi@@i@G_@g@qCD]L]TOZCx@?p@K^]pA}ClBgI@YESO[QMg@?e@Dw@Fg@MUUMc@Oe@Ka@[[_@WiCaAy@HkAVqATo@Bg@QYSM]k@y@_@O}@Fs@Ne@KWUy@w@??a@Q{A[_@SQc@Ke@cBcNBo@Lk@^[\\Sp@YZK`DgCjAYxAJtA^fAb@rAb@z@KlAw@dLsIz@g@|Dm@~Bq@`A_@hBWTGxFGh@Od@W\\c@~Nmu@l@sFxCoZz@}CzAqCzB}DhA_CnGqYh@_AjH_IpDoF??zBiF?o@Yu@k@w@mAcAWq@Jk@t@wBf@cD\\_Cp@}@bAu@^a@XoA~@_AnCs@??z@c@Xu@R}@KaAo@sA_FmGO_AD_A??j@aDd@k@z@_@P_AGu@qCeEc@cAM}@XmAxAqI@o@OqA}@gCHkAJk@l@e@l@Wv@E|D^p@[L}@Mm@_@w@G_@?]`@c@n@UbAi@Zk@Lo@?iG{@kCy@}CeAsCy@q@oA]gCcA_AiBWwCQiBm@{D]yAu@_AuBu@wBQwAVkCvAqDtBsBx@wBX_DJ}AIgCs@kDmBgC{@mCAy@e@c@s@CgAHsDd@qAr@s@v@i@~BaAT_ATw@d@kAn@e@f@SfB[t@i@Z]@{@?k@Yy@?_APc@|@k@b@AhDKd@Cf@U`@STg@jEsHB_A?k@MkAa@u@}BkBmEsCyA}As@iCaAqCk@kBc@yAuAiAkBqAw@gAIs@YoBcAgBaBmBsBmBm@y@s@uBm@qB}@wA{@}A]y@Fy@j@iAf@y@`A{At@]hA?tAPfBZhBT`Bd@nA^`Br@nCnA|BbAhAVpAUf@Yl@o@|@uA~C{D~EaGjJyInB}Bx@cAHm@b@kAr@yBf@y@|@qBt@u@j@y@lAwAlA{@bB{@fAk@??dAa@v]cIxAo@vBeCdDgEbAmAxAu@rQeJ??j@[f@{@vCkIZk@b@w@t@g@~NoL~@_AhEmH`QuY^{@\\kArBeKFoAAgBKkBgCcc@LoAV{@x@aA`OoMnAgBbAoAlEeK`EgKzDkJvEkI~Uy`@pB{BdD{AtKcDvAcAtCcCpHuG`AaBxs@ulCfHsT~D}L~DgKbQm[z@}Ar@kBlAcEzOwr@tEgRdPyZrI}OpPoS|ReUbI_KfFeIvGwKj@iBTwA@qCg@qIcAkBaDuC_AsB?sB^kDzEw[P_B[sAuPua@o@wAa@wAG}C`@cCj@oBjEaFpJ{Jx@wA??lAqBpFyO`B}BnBeAnBo@lIc@`DPzB`@xB^jAOl@Sz@{@ZoBO{GIgBh@mBjCaCrC{B|AsB|FyKf@{BfEyUzC_QHo@??EiBs@qAqBwCy@sBOgBCgB????`@}BfBcCfHsFp@}@`@kAGcB_@sA_BkAwBsAqAaAo@iAQyARw^ToB`@eAx@aAjVoUfAqAh@sAXq@TmBKmG[kB]eAqBaDcBgCi@kAg@}AAsCN_B^eBd@uAbBuCt@wA`A}HrAkH~@mB~A_BpDuBjB}AxAiB`B_Dp@eF`@cEz@sLZ{AvFwOfH{RjCwFbCiCxA}AhFuCdQ_IpA{@zAwAlAiB`A}B`@aEP{CP_Le@sII_EZeB|@cBdAkB~C}EbC{Eh@oCHiBDkDEmDmD_N}HyZe@}@o@y@aBwBm@wAUsB@_CbBoFTsBMkAqBoFMeALoAj@yAvA_ArCk@|Ao@r@q@~@qAV_ALaADeA_@gBe@qB{CoJiAmM_@{IPoA`A}DR{AXwJn@_DvM}c@d@_CNuBB_CKqBw@eIGyBPuBNuAj@qAjJeNfA{B^sBXkBN{BC{AuAeu@RqD??PuAt@cAr@mBzEeH??rAsDv@mDfAmMDwCKkCuBaOEs@Ho@nAgFNwBUs@c@{@_CuBo@_AW}APqAp@sCrSyl@f@aCt@yDvA{J^iBp@_BVsBKsAg@q@qAu@eAMiBLwBPgBFqB[cAu@]q@k@iCsCcQ{BkMgAkGB}B@w@p@sBn@}@l@s@bAg@`Bm@dAIt@F??bBJjCCfAW`Cy@fAu@hAeAjDwG??ZaAB{CCcDPcBl@mArFmLj@kBhAwJxEqe@BmCGwA_@}BwBsEgQsV_@kAA{@R_A~@cAfA_Br@cA~F}KrAqCp@qDJkCS_Eu@eDwAiCuHiLwDsFkBkDyCqMuEwS{@yETgHv@kLd@eDp@{B~IwRnC_HrAoBvAaA`Bk@????v@Ep@Db@Pb@@l@UL]VUh@?\\SzAg@xGwD|E}CtBgClAmDjDyN~DiIhCoET}@HiA?eAKmBQkB??_@qCu@{DkBwEwA{DaAaDWmBKoDZ_Dp@eCzAiCjB}CxDaFhIuKzJkNdCgDhAaAfAaBlB_DvB}CzAgEh@kDEuCi@uCqB_HoCqJeCwHk@kC??KyBCgFZsEr@cGpA{Kn@eIPyCn@gJt@eDf@eBvAkBpEsDbc@i]nBqBv@kBx@uC^uB@oCs@cHc@aFqAoKaAkK[aDPuF~@cDfFsIlGuIr@mCIeB_GyVGwCZoF`AsRk@yNg@eL]}A{@aBcBaBwBuBaAsAi@cB?{CTuDnA_OBiB[kQk@g[u@y`@TyBZuAj@iAx@cAvDoC??jD}BtAiAr@y@ZkBnAsL~BsYbBkRnDyd@rDka@bCaZ~AsTfWwiDkr@egCcGkTaCyLcCeQEgBR_CvIoV~L_\\tAyDj@wA";
    //1
    private final static String LINE1 = "aplrBtw~xRa@hCgCOeCbBsDdC}AdAiBjAeBdAgBpAo@d@c@Fc@RqFpDgAp@eAn@aC~AoBtAkFlDcDpBcAj@eBlA}BzAeBjAaC~Aw@d@_@ZiBnAsAz@eDvB}CpBiCbBcAn@??wA`A{AbAwE~C_G~DYN_EhCgAt@cBjA{@j@eAn@g@^cBjAkAv@cAp@oAz@wBvAcAp@iDxBiFdDsBxAa@Z[JQJgAb@u@Pk@Ne@ROJa@`@YZe@p@e@n@i@^eAr@kBlAaBdAiBhAi@Zg@Le@Fi@@g@Ay@CUAg@Bg@L]XMTILITAT@t@Tt@\\l@f@^";
    //2
    private final static String LINE2 = "}xqrBlzmyR]eDg@sEAIQw@O_@S[WSOKSKMEGCUEi@CUCUAUAe@C_@CQAWA]AGA]AMAQAWAOASAOAUC[EYC]CSC]CYCWCUCYCWC]Ee@E[C]Ca@EQASAQ?O?U@WFMFSL{ArAg@b@SRKHo@^YHYDi@BWA]Gk@Mg@OcAWi@Oo@Qs@Qu@Sg@M_@Kg@Oo@Qo@Oe@OiA[{@Wy@Se@M_AWo@Qe@Ms@S{@Wi@QUMw@q@[]OU[m@[q@cAkBq@oAi@eAk@cASc@ES?S?QBUHc@Li@Vy@`@oA`@uAb@uA^iA|@oCV{@Ro@Pk@DOBGPe@Pc@NWTQ^SnAYdAUtA[|@Sj@Or@QpA]~Aa@rCs@zD{@jEcA`Bc@|EkA`FkA`B]VKNETGD?PKBAFGDELQFOHSBK@E?E???O?O??AOAOCOKm@G]Ke@Kq@Ie@CW??AWIi@O}@K_AMkASiBMgAQ}AOqAQ_BSkBM_AOsASgBKeAS}Ag@mEMgAOkAGi@MmAOsAMeAUsBKy@KaA_@_DOqAYkCUqBOsAQaBSuBIs@EeA@q@@y@BaBDeCHcEH}CHmDD_BDaBDkCHuCBwAHaDFmCHqD@k@@a@@e@FkCHaDHsD@i@@{@DsA@c@BkADsBBeABiA@_@Bs@@u@Bu@@w@@U@u@@o@@m@B}@?Q@QGUESEQESI]Qc@_@m@q@q@i@c@";
    //3
    private final static String LINE3 = "wyqrBhvmyRl@rFx@rHh@fFh@jFn@jF^xD\\hDb@hGTxDF|BLhBL~BZpFLtCPxDV~EZrDT~Bl@hLb@lG~@hHl@dFr@pFz@nGdA`Ix@bGh@`El@xEbBxLd@|D??AjAEnD??KvC??DfAMlCWpG??YlFYpF]nH??Y|FWvFKvBUpD??WjEYzFShD_@bI]pG[pGm@nL??OtCc@rIk@fLe@lISzDUbEQzD[~F[nGQfDMpBGrAQ|DW|E[tGQjDa@hH[fGSrC_@vDa@dEYbDUpAWv@m@lAeAvBYr@Kd@Q`AOn@Qx@St@S`@QVKL??IHw@j@i@\\[Xc@`@_@d@Yd@i@`A_@t@KVETCRAV?R@RD^DRHZLd@@DFd@Bd@Ep@I^IRoArBk@x@UZ]\\]PYFI@Y@]AQESIo@]aAm@[UWQg@_@UIUCM@O@MBKBMHMLKNILMTKR]t@OXIJKHGDA@UHQDQ@QAIAMCUIIISUAAa@}@q@wAGKOSKGa@QEAe@GE?M@G@MBG@YL[Na@To@X[Pg@VYL[LG@E@IBK@I?G?E?QCWGQGQOOQKQ??M]Os@G_@EUGQIMIMYWOIMEMESES?W???UBSBa@Ha@He@J}@Py@P_AR{@PaARa@Hq@Lk@Lm@L}@Pw@PeARYFy@NeATg@Ja@Js@PWJ]R_@V]\\Y^w@nAu@hAi@v@s@fAaAxA]h@SXk@x@u@jA}@rAkAhBeBnCy@lAkBpCU\\_B`Cy@lAg@t@]f@qHzKyHlLkH|KgJhNyLxQSRSNSP]R[Py@b@iEzBaDdB}DpB_@L{Bj@{Bf@iBb@gDx@qDv@qCr@sCp@mDt@eDt@kCl@wD|@mFlAaE|@wCr@eE`A_Dr@mEdAcE|@}D|@kEbAaE~@}D~@uEfAoGxAkHbBaDr@_A\\qA|@q@l@iCzCqB|B}CvD{ChDgDvDaDnD}EzFkGdHiFbGoD~DgE~EgJjKwCjDkB|BeAxA}AbC{B`F}@fCu@|Cc@hCg@xDQtCKdC@rA@rC@zFF|HB|FF|HFrD@zD@zFHrIBvJNzQ@`FBhFLjOBdKJnKHtID|IN|PHzKDvJDpHJrID`F@rB@d@????Bf@Dj@Dp@LbAPdAZzA\\dAJ\\f@dAdAxBhBxDf@xAH`@Db@?l@KdAY`BSbASh@]h@_@^s@d@w@h@e@Z[`@m@jAWl@_A`C{ApE{AvEoBtFkAjD??oAtD[fAIf@Gb@A~@?n@Hz@VbBhAnGtA`IfBrJrA|HlD|RfDdRp@`DT|AHjA?p@IxAQhBSjBA`@@f@Bd@Fb@Jl@^vAPx@B`@A^?P?VKn@Ql@Ud@aA`B}@|Aq@xAKVE\\CHInBGz@G`@Uh@a@f@SP]L??QDa@DQ@c@CUE??w@W_@Mo@U??SEMCq@Cg@???S@QDm@Nq@Ji@PqAb@s@V}@^aA^[P_@Xi@f@m@p@u@vAO`@_@`BGf@GrAEhBEbBGhCIxDCpBEpCEtCE`DG`CE|BGrCKdAOt@Oj@k@lAu@lAo@hAwA`CiArBmAbCENG\\EZ?X@`@Jd@L\\\\|@^|@~@nBjAfCVh@bAxA^d@~@~@`A~@xBtBPPf@\\h@^XJt@Nn@D^@r@ApACpBEhA?|AA|@Fb@JXJTFZPVN`@ZZPXTZR`@\\XRVXXVNRPTPZLPP^Vt@Tv@Ln@Ff@Bb@Bh@?PAj@Cj@Cb@G^I`@I\\Qh@Sf@Sd@S^Ub@MV]n@Yh@U`@Yd@eBbD{@rAOPa@X]LGBWBYD[?W?OASEQEOEm@[eAi@{BgAoB_AiCoAw@WQCWAS?U?[Bm@H??UDa@L_Ch@}@Rg@Lg@Jg@Ls@Pg@Nc@NGBg@X_Ar@aAv@}@r@_At@i@`@s@j@y@p@q@h@e@^YT_@ZgA|@y@p@o@d@a@\\c@Zw@n@kA`AwBfBiDpC{FvEoH~FyGrFaBzAaCbCgFhF}EbFkFrFqCtCiDjDeEjEmDpD{E`F_D`De@f@SZe@x@sBhFiBtEqB~Eo@`Bi@~@e@h@m@n@gBhAmCl@aBX_C^{AXcDf@{@Lk@J[FiAR_APuAR}AVmC`@kARqAToARiBZy@J_APwATi@L_@Pi@^e@b@??g@r@Up@U`AGl@EnAE~LCvD?|@InTA~EApE?nDC|B?jBCvCE~A??K|AWlBy@zCkBnGyCbJuCnJmBhGi@lBE^C\\?XBh@Hz@Ll@r@tBd@zANh@DZBXDd@?l@Iv@On@_@bAsBtFq@nAs@|@eBnA}ClBsCdBcFpBwAh@mC~@kBr@_Af@[VWVSXy@~@qAfB}@jAYVUPWP??yAh@a@JmARgARe@LSD_@PYXUb@MVKt@@x@DxAJtBJhCJbCDfA@\\Ab@Cl@Gh@Mj@g@vAe@hA??g@dAg@fA[z@E^@h@PhBPlBBr@Ar@Mx@K\\]d@MP]XSHe@TOJKLKZE^?^D^F^??D^@PAJI^MXURYPYNw@F{AJw@FMJ{@FiAHyALsDX}Fb@i@@gAAw@Is@MuA_@cAo@y@m@cA}@mBcBeDqC_@YmAq@eBk@c@KyBU}AAgABgAH}ALeBLoBNqAJ_CNmDXcDV{@Lu@Te@Pk@Zo@b@g@d@a@^sAxA{@|@qArAyB`CqBzBwDdE_DfDaAz@oBbBuAbAuAdAkBtAaAr@wAfAwCtBs@j@u@l@yAfAi@d@WVSXu@bA]p@Up@Y~@Ox@QbA[hBWzAe@jCYbBc@tCUlBGlAAbB@~@F~AD~@L`CH`B??NtCFrAJ`CHhBBx@?hAClAIpAKdAS`AWdAc@rA_@`Ac@z@q@fAk@~@{@rAmAjBkAhBgAdBe@t@c@p@k@dAc@n@o@dAc@x@c@z@m@nAu@xAo@pAcAvB}@nB??s@vAe@bA}@jBs@~Ae@`AIRGLGLMVIPOXMXKRIPKTINIPOZINMXGJMVOXMTKRMT[V";
    //4
    private final static String LINE10 = "moa}BfmuiR^ZnCrBv@l@fBrAlBxA`ChBB@FFlA|@jA|@`BnAvC|Bf@^jLdJjCpBbChBzAhAb@\\vCzB`BrA`BnAhBrA|BfBjKbI`BpAvAlAXX\\XFF@@RNJHxArARPnCdCt@n@jGvFtEjEB@VTHJzDjDpBhBrG~F|@z@xDlD|HdHlBbBrEbE^^rF~EVRVVpChCdFrEd@b@LLrBjBnBfBxAnAbBzAFFFDzAtA~KbK~CpCjAbAnAfAzE~DhA~@`UzQtCzBhFdEPL@@@@@@JHBBDD\\VrEvD~G~FnFhEvEvDtD|CpAdAhBxArC`Cz@r@rBdBXTTT~ApAh@^`Ax@`Ar@hAz@zE|Dt@l@|@r@nCzBVRpAdA|AnAhA~@b@^vBfBdA|@lCzB~BnBl@d@r@h@xAhA`CjBHH`EbDXT|E`EjDrCv@n@pHbG`DjCzQzNdI|GNJ|FtE`BxAzBfB@?NN`At@nDdD|CpCjAfAlC`C|EpEb@^rBnBpCfCrDjDtChCNN~BtBxArAj@j@JJ^\\xApArAjAjAbA`FvEdC|BdA~@lAbAdB`Bf@`@r@h@n@`@^PdAd@zBx@PFfO~DLBn@Pt@TpQ~ExGfBdIvB|DfAjEjAjIzBjEpApHlBd@JD@vL~CtI~B^JbO~DnDdAfSlFbAXrHtBtD`AdEhAzJrC|EtAhBd@jCp@fEdArFvApFzAr@PRDfJdCfBf@|@VTFd@NPDp@P|Ad@xA`@fFpA`Dz@vCv@pDdA|Cx@~Af@lC~@lAf@|Av@z@f@z@h@x@l@lFfE`DbCfClBTPjRhOjBvAlKhIhJfHvMbK|CxBbF`ExFrEr@h@JJpJpHbAv@dAz@zBfBdKbIlNzK^X`b@f\\zFnErGbF`MtJtKpI|HhGtKrIHDFFDD@??@JFhLdJbBnAlElDbE`D`@ZDDr@l@p@h@dAx@tBbBzFrE^\\^VpDtCfBrAXXb@d@TX\\d@Zh@Vj@Tl@V`ALx@@DPhBZbE^hEz@rKNhBFr@BRl@jHRlBTrBXfB^hBXfADPjCtIjCzIt@`C~@zCrAnEhD~Kn@|Bz@lCnAlEzBdGxAfEHV@BDPLb@h@jBtAnFXjAV|@ZlANf@rClJLb@nBpGxBlHpChJbBtFjCvInBtGpAhEtCrJbBzFDHnAnEBFTfAHn@@Z@X?|BE|B?B?XIhDQ`K_@fTOfQIzIK|LKvJA~AGzFEfEE`GCtBEpEApBIdHO|NQ|Q?Bg@hi@An@?p@IlKm@ze@CzBItIExDCrDE`DCzB?HChC?bB@jA@t@?PDx@Bj@HdAJlAP~AXhCNtAbB~T^dFRzB^jEVjCl@nEPhA@LBTz@`Gj@xDjBfNh@`F|@pIn@|F~@bJ`CdU|@rHhAbKjA~JNrATjB^|CXzCFt@B|@Al@Af@E`@QjBEZCX[lCIx@Ix@EdA?n@BfBBt@F|@LhAz@vHrEba@X|BjFvd@~@dI|@vHrAhLD^nFhe@nBvPV~BbHtm@Fl@tGzj@Fj@fHtm@LfA^dD?@@Jz@lHHRBLNh@Rn@LZJVLVPZPZ^f@NRt@`ANRBBHJBB|FfHX^RVv@|@bEdFrGlIjBbC`BrBtA`BPR^b@\\d@bAnAlAzALRlAvA~ApB~@lA~BtCf@n@X`@|DfFhDnE|@fATZbAjA^h@|@fA\\`@`AlArAhBFHRTNVBFZp@Pb@^tABJBLb@bCjDjUJr@TlBHh@F^NbAN`Aj@`DF^^fCJj@BD?D@DFVRn@Z`Af@fAVf@\\h@^j@Vb@Z`@";
    private final static String LINE11 = "m`m{BvrfmREHAFAFAFARGv@Mv@W~@_@rAQn@Mt@";
    private final static String LINE12 = "_{r{Blm{kRn@~@|D|FRVXb@x@jAz@rAx@jAz@rArBxCx@lAtJxNfFtHbA~AdAzAf@t@@@R\\dEhG`AzAFFjAdBzAzBlGjJtChET`@r@dAt@fAfDfFfDxEjAbBl@`ALRlDdFjBrC`AxAnAjBrBzClC|DhBnCtMvR~A`Ct@fA@@BD@BrCdExP~VzHfL`QjW`A~AHPj@pA^jA^vAP~@Jp@LzAVzEp@`MVxEPdDJlB`Cfc@d@dJ^dGFn@?D@\\BJBf@Bb@nA|TV`FJrAD|@\\rG?DhBr\\^jG@XBt@^`GRtDd@dIBTZdGRzDFpA@XT|DpDho@TzEdBn[h@|JDj@tBha@r@~Kn@pKpAvTVtE@JNbCR`ELzCnDhn@JfBl@fLNfEFjA?~@?p@Cr@G~@uAzMaDpZm@xFy@jHM`AGp@[rC}@bI}E`e@kBxPK`Ay@`II~@eDtZeBpPqApLmEva@EXq@xGYlCYjCGr@Ex@Cx@G`AAnAAlA@|@@x@FhBPlDR`DVhEJhBR|CHlABf@B^HtAHxAJvADv@b@~H?TDnCA|@InDCr@C`@Gn@Ir@q@jEaDrS]|BOz@O`AsApIo@fE_AlGa@hCQ`AOdAq@dEU~AKp@GXAPI\\Gb@_@zBSrAAHWfBMt@W`Bq@`EOlAOlAIdAG|@E`BAlDDfB@^LbF@f@JhF`@lR`@dSXfN@d@r@hYF~D@hBBbAFnB@xBLhEJrE";
    private final static String LINE13 = "idm{Bv_gmRIf@?FCT?j@?h@Dn@Ln@Tv@Zj@LVpIzHn@h@~ArAbAt@n@p@b@h@RRHJjC|Cv@~@dE~EtA`B`BnBzWv[pGzHpP~R\\`@jB~Bv@z@zJvLbE|EfArAh@p@x@~@~@jAhAxA~@vAh@|@T`@n@rA^z@h@vA^bAZjAJZPr@Pt@VlAVrAFVd@jCBJh@`DhB|IVlAnAzG@DjCvMlDrQXxAd@dCj@tCb@zBf@hCd@~Bp@rDr@lDpAxGTdADT\\dBRdATpAb@fC~@xEn@bDThAf@bCh@bCh@lCJf@FX^nBf@lCrB`LZ~ARbAH\\pCzN^hB^lBPz@^bBHZFPL\\HVL\\DHTb@PZJRFJn@`A|@lAR\\`@j@rAtBPVJNHHNRp@t@FFTRNLTNx@b@BBB@@BDBDBTLHFj@\\";
    private final static String LINE14 = "ggf{Bn{smRZLdAV";
    private final static String LINE16 = "qff{Bx`tmR@DHf@zApKJp@D\\LdADf@BTBZB\\@T@X@jCIxAOtDMdDAN?NIhB?TANAZA^K|CEhAErAAn@?JCZ@@MlCSrEIVAFGd@OvCIrAA`@IlCBrABVFv@TdADPNj@DN|@tBJXfApCb@dAdA~B^`A\\|@~@nBBHVt@Rh@HTbA`CLT^n@";
    private final static String LINE17 = "wzz|Bvp~sRRJRJVPVPTR^^h@h@LRtAtBr@fAn@bAXf@X`@r@hALPh@x@`@r@Zn@\\x@Vp@Vz@Pt@Nv@Jr@Jx@RxBPzBNdBDZ@TBTnGnu@D^?@Fr@tBhVBXPjBRbCD|@Bt@@hA?d@?F@\\A~E?hD?T?X?P?dA?L@pEAnB@~C?tK@`@?XHbBP`DNvCNjDThEPrDj@xJD`A@FN`Df@bJN~Cf@nJBf@FhADLL~BB~@NjBHj@bAhFX|@JZ\\bALb@BFt@tBRj@Xl@P\\";
    private final static String LINE18 = "u{o|B|hjpR^pAZbALj@Fh@F~@BzAC~AOvC{@jJGdAIbAKl@KZKZSb@k@z@_@j@QX[d@mAhBQ\\O\\MXGZI\\CXC\\?TAR@XDb@^lE~@fKt@`IZxDf@|EP|@TrAl@dCLb@H\\d@vA\\|@Rl@f@fA@@j@hAZl@d@~@x@|At@xAp@nAvBdEl@jAjFfKrB`EjHhNHNR^zAtCbApB`B|CvCzFNZ~@~Bb@vAXnAfAhE\\v@Vd@z@hA|@nAtBxCjAxA|@hAxBxCv@z@|CnE~AzB~CbEpBvCjBbCNVp@fAVj@Vl@Pf@Nh@b@jBvApI";
    private final static String LINE19 = "k_k|BrpxpRCDA@?@?@A@?@?@?@?@?@?@?@?@@B@@?@@BB@@@@@@@B?tAfC@?@@@?H@Xj@bAlBP^`@dAb@tAJh@JdALlD?nC?J@~A?d@@p@?l@NxLXfa@@h@DdE@|DCpCGfCAt@OrEAxAEnAEnAC`AAn@G~BCrAGdCCf@MpEAf@GtBC|@Y|JkA~b@ALGfDCf@kAnc@GhCaBpn@oAfc@ClB_Bhm@s@vWSzGmAnd@q@xW[dMUhIGbBGlCi@~SKhEGhB}Ahk@ElAKjD]dMa@bOAVErBExAA^CvBMrE]nLCp@CbAI|CM`EOfFCpA?FI|Aa@pFQtBs@vHuApPKhA[|DEf@KlA[lDEj@q@jIoArNObBc@pFcAnLYtDYdDkBrUuAhQ_AhKAP{@zIU|Cm@pH{@~JcAxLqCr\\QlBGr@?BmAvNmA|NcAzLUlCcBfSaC`YYjDGr@{Djd@u@hJW|C_@nEe@`GkCl[gC|Ze@rFQjBCb@E\\_AdLI`Ac@tFuAbQs@lIiDbb@Gn@k@dHAPiAfNEf@QzBEd@Ed@Eb@Ed@Ed@Ed@Ed@Ed@C\\C\\E\\C^E\\C\\C\\E^c@|Ei@xGCXEf@c@nFS`CuAtP[xDUlCAPCl@Bt@B\\P|@Lb@NZd@n@TT~AlAlErCx@j@hG`Ep@l@`AhAd@t@d@dAhA~Cz@|BxBfGxDvKXv@\\bA`FjNjFbOfDlJvBfGnCzHlHvSv@xBpC~HBJpFjOjDxJnD|J^hARl@\\`A^dARl@Tz@Jd@F^Jz@BZ@zAEPE|AEzACf@QbDIvBU~EARMjBGrAKdCIxAAVGrAKtDKbCEfAAN?DEx@Cd@I~@Ix@Kv@In@Mr@Ux@ENc@|AIXMf@m@hBELWt@Yx@Q`@GREVGZGLOZaAzAq@~@cBpCILi@z@cBdCw@hAgBlCaAvAg@x@k@z@a@p@qAlBc@l@eA~AcIrLoBtC_FrHsDvFQXqPdWe@p@{FtIu@fAiAdBcBfCiCzD[j@[t@Sf@Un@g@~BUrAsAjLShB_D|We@bEUzAIp@UbAMh@Ql@Un@[r@g@fAYb@q@bAqBlCUf@Sd@IVGXEd@?X?VBVBRH`@Rn@t@xB~GhSV`ATv@Lt@PzABt@?Z?d@Cn@GbAa@vGqAbUuDjn@MbCyAdWYxEg@hJA\\@h@Bp@Fv@Jp@X~A|@`FnCzN~BxL`CtMDj@@f@?l@Cb@Ef@QdAmAfGiCnM_BrIsA|G_DzOQv@eArFe@`CqB~J[zAG\\_AxEoDrQg@lCSbAaCxL}DlSI^c@xBw@zDkFtXeBpI_@lBUhAG^e@dCy@jE{AvHaCvLkA|F{@lEwGj]Qr@Oj@O`@Wf@[d@c@h@kJjLiGtHa@f@]b@_DzD{AjBQRmA|AeAtAINGJMXKPITMb@w@|DGXi@lCgAxFwB|Ks@tD{Hpa@uAfHYnAWdAYlAc@vAM^CJa@jAs@pB{FjO_AbCqBrF_BnE[r@Wp@MVs@tBITCDMZcAxCqClH{DnKq@fBqAjDoAlD_BjEiB|Ey@xBeBrEgAtCm@pAWj@Yh@sAjCgAtBoA`C{@vAqAfCoEnIUb@qA`Cs@xAO^Of@Mt@EZC~@?vE@jMDvFEtACh@E`@EZI`@O`@Of@OZGTMX_CtF{AtDy@tByA~COX_@fAuEzKc@fAg@jAELo@zA}@zBEDg@nAUp@Yr@mAzCq@~Ag@lAyElLg@pAIPiIbSELs@fBeAhCgAlCkBpEkCvGkArCMVoAzCeChGiAnC}A|DMXk@|A]nAa@bBYhAqC|Lu@vCsB|ImBbIGVADOp@k@bCo@lCi@`CUbAIZoAzFs@|CWz@Kb@Mh@Mj@]xAc@fBEPMj@U|@Mf@e@rBS|@gAtEIZ_A~DsA|Fy@jD]zAKf@Id@E\\E^AZ?f@@b@Bn@Fr@Jb@r@rC`AhDL`@Pv@Jj@B`@?\\CZKh@Uz@[|@Wv@mAxDIXGTCRAT?RBXDVFVj@xAHTFTDZBV@P?R?VCf@I`A[pDQxBGj@Gb@Mh@Uj@a@|@i@`AYl@GRGXCNCP?P?D@P@JBN@F@HJZP^n@jAdAhBBFb@t@@Bb@t@b@v@Pb@LZPj@Jd@F\\Fl@BT@\\?l@?v@ArAInFAVCjDSdO?PG|EEdFCzBMhG?XAPCJIbEAh@CvBCfC?F?@?FEfCEpC";private final static String LINE15 ="exz|Bbs~sRGJCDEHEDCBE@E@MBGAGAICi@YSQCGCG?E?GBGBGDGDEFCFAJARA";
    private final static String LINE20 = "c}o|BvdjpR?J@D@FVx@Pp@";
    private final static String LINE21 = "{se{BvcxmRPpBFXERG^ERo@dDs@hEk@pDGb@AHm@fCSz@s@jEu@lEWxAa@nBUvA]vBYvA_@pBQ~@I^ShACNCJ_AxFShAEVa@~BYhB_AjF]tBk@tCcAvFsA~HMl@ERMj@[pBcAfFmAjF_ApDADw@|COn@W|@u@`Dq@nCyAdGe@lB?B_@vA]|AEP}@fDu@zCS|@}@zDABg@xBq@lCk@`Cc@bBOj@q@rCsBlIaBrGo@lCuEzRMj@YlA_@zAa@`B]vA[nAc@jBYfAU`ASz@_@vA[fAc@lBmA~EoBbI{@jD[tAGRQt@}@|DY~@_@bA_@z@qAtByAhBoBbCyBrCeArAUXmA|A}BlCcBzBA?mB~Bc@j@sBbCWZcApA}@hAi@l@QTQRuBlCa@h@i@v@u@pAMVYr@Ut@Uz@Mt@Mx@OpAA^Cj@AXG~CGxDChCIhEApBAlAChBAnCBv@?t@Ar@Ep@OfEK~AARGx@UzCEb@I|AKzAAVA^Gx@MnAOvCSzCOtBGv@E\\Kh@K^MZWj@]r@U\\UVST]V[ROJUHULg@P]Lk@Tq@XkAd@SHa@T_@XSRMNGJITGPGZCRAPAXAt@?vHAxA?~BEn@E\\I^Ml@KXWl@c@v@W`@]\\YXa@\\YRq@\\UFk@NOD[Fe@Dg@B_@@aA?wDGS@c@AqDCqFEkFCeGAi@?_AAuOGyUKeBAgYMmQK_RMuJEyJCeA?uWIaFC}FEwDEmA?kAAeJGa@Be@Dc@Hq@N_AVuAj@aC`Au@XcCdAkDvAiDtAUJsAj@}Ar@u@ZeE`BUJgA^YFm@Fy@D[@e@?{Ea@gCOoF_@oG]wBQe@CMAeAGi@Cy@Gc@Gc@Gg@K]GYI]My@Yk@Uk@UgAe@KEq@YA?A?A?A?C?A?AA[IO?SA]AY@YDSBo@LsAd@i@XSLWNWRSPINABIHW^OZOZSh@OjAIhAc@hFaA`NAPCXm@~IQhCCd@eAdNMfBC\\AJE^K\\Sf@Ud@ILONKLSROJUL]PWJi@N_@DOBQ?M@aAE}D[gD[A?_@C[?_@?_@B[D[Hc@NYL_@X[VMFQRMNABa@t@Qb@OTsAbC{A|Cg@z@S\\k@dAKRoErIETQXi@hAU`@yB~DKRk@fASd@Sl@Qn@G^Kn@Gp@Ep@E|@Ej@El@Et@MfBK`B[dEIdAm@`JGp@AXEXGhAKlAKn@Mj@Sv@w@~Ay@rA}AfCW`@aBrCmHtLiAnBiAjBo@hA}GdLy@rA_CzDaE|GaA`ByA`C}Vnb@_FhIaKpPOXaYpe@yJnP]h@eAlBGLM\\ETCJ?FAD?FAR?TB^BVBRLb@Tf@h@dAnAfCbApBp@hBPn@ZrANv@Fh@BPH`A@`@Bt@JnIn@v`@H|ED~DPbJAb@Cd@Ef@O|@Uv@Yr@_@n@a@j@e@b@}@l@eAf@eH|B}C~@kJxCw@Xe@X_@\\[\\i@~@S|@Mv@CdAJ~B`@dIL~BH`BN`DBj@JtBPlCZxG|@bRVvD@f@Al@Ah@EZId@K^O^QZi@t@_@d@gApA[f@O\\Ib@CTAT@L?N@LBLBPHVN\\t@tAv@vATf@J^FVF^D`@@d@AzGA`L?p@Enl@?rIArFChH?zD?PAfI?rBAvB?fC?~C?~AAt@?lB?x@?jA?L?PAz@AdB@pADfBHjALbAJn@d@pBpD|MzIt\\`@zAh@nB\\fB@V@R@R?RCb@C\\EZQj@KXQ\\Yb@]^cAbAcA~@g@j@m@t@a@t@]t@Qf@Oh@Mn@Ih@I~@Ev@Ax@B~@LtBB^`@dFPrBBVdAnNvB|XRlCzAzR~@bM\\jE@Pb@~Fp@vIL`BLpBTdCHnABnA?x@C`AMtBIzAO~Bg@jIIpAw@~Ke@tIIhAIn@CZI`@IPIPKTSTOP[Vi@\\GDs@`@QJqPpJeFvCwHlEqThM{KrGiBdA{CfBy@d@iAr@u@j@c@^e@f@]^aAvAaCtDwAzBgDlFgAlBUh@]`A]pA[dBYfCY~DWtD{@~L]~E_@dFS|CY|DOdBM|BQrASp@Ud@[f@k@j@e@^o@V}@RkAHeAH_BH}Mx@aEVo@BaABkAA_CQeCa@kEo@g@GsDg@qP}BsG_AsAQgAKsAEwA@aHVsI^sDNaFTsDN}CLqAFsFV{ER}AD}CL}@DkEPa@@_@BiDNoEPqBH{@HC@_ARc@Ni@Ri@^g@`@[\\k@v@e@`A[x@Or@Mz@EhAThEV~D@NPvBHzA?VL`BZnEJrATrC?rA?jAClBKhAk@hGMzAATEhB?~AHpG@fI?LDnCDjGB|CBhB?jAAxAClAE`AKzAANOhA}BpNyAbJ{BrNyBfNyBdNwBhMaDtScBpKEZ}ApJwDdVgA~GqCjQgCbOiApHO~@u@xEgCtOeFd[aIrg@k@rDoJ|l@yC~Q{BjN{@vFi@|BQd@e@bAk@~@y@bAs@l@k@d@sAn@qBz@sBx@qDxAcCfAiEdBcBl@iAV}@NcBNq@DwBF__@~@iABu@@gAE{@GmAQiASu@SqAc@eAa@_Bm@eG{By@[g@OYEa@Ck@Bm@HuAXk@L_@Fg@BY@YAi@Ka@Ku@[k@WsGwCUGUGQCQ?K?KBG@EBMFKHOPIPIPCPAP?RBTDVFNFNjAjBnBnDPZRp@H\\Dz@?XC\\Eh@CVGh@ARAR@^DRHRJRJJXPJBp@RbB^z@VNHNNFJFNHj@?VG^OZQVYRg@Rs@Xa@TUR[`@w@pA_@n@c@l@YVk@b@e@PaBp@IBcBb@sBl@QDWFs@T_@NUNg@^[ZY\\QZSd@K`@K`@Gt@Ap@BdAT|EFxAFt@BLDJHNJLHJHBNFNBTBP?d@@n@CV?XB`@JZJbCfArExBZRLNJLHRDPBP@R?VCRIVK\\Wt@Oh@ETER?T@`@HZP\\JNJN`AhAn@x@NTZh@JZBXNpBHlBDp@?v@A^ERg@nBKl@AX?^@^Fh@Dd@?RA`@MbB?`@B^Lb@Vr@~@vBj@jAtBzEXp@b@`ALXL`@Jb@BPBR?\\OhAS|A_@dDa@jCa@|CAZ@ZF`@Nb@\\j@V\\zBrBdGfGtBpBhCjCZ\\Zb@NZFPNt@?H@\\AZCRI^Wh@SVQPUNg@Ps@PwFjAuDx@iEbAo@NsIjB}@Ti@N_@T_@ZWTW\\a@v@KZGXIj@CP?JAJ?L@\\@\\DTBVDTHXHVHRLTLRp@dAz@pAPT";
    private final static String LINE22 = "uql|B~fspRH`@PlA\\tBTxA@HBLJv@Jl@BN@N@D?@?@@FBLNjALt@Jn@Hb@^vBPhAPhAVxA`@jCRlALx@N~@Lx@Jb@Hl@Nx@Rz@Fp@Jf@j@vDl@~Dn@lDXpB`@dCb@lCVbBt@pE^bCN`A`@pCLz@b@vCTtAF^BLDTRpALv@Jh@V~ABTj@jDJp@VzATxAHf@F`@Nt@XbATt@FNf@lAj@hAhBvDd@bAv@hBRTFZfBhD";

    //5
    private final static String LINE23 = "m`m{BtagmRGzA?@MbCOnBIbAU`BYjB]|BQ`AG\\qDjU?@Kf@aCzNGZGZs@pEKj@CJaBpJmA~HMnAKvAEf@GbBChB@`CD`BZrDb@zCh@fD`@|BXjBV|BJtAH~ADhC?|AAxAOhCWfC]fCw@bE[dBSjAGZEP_BvI_@pBWrAa@tBETET_Izb@iAfGA@AHs@vDc@|B]tAWnAUjAIl@a@pCo@zCg@rCUjAY`BOx@WtA]hB[`BUpAKf@AHKd@EPCHQ`A_AlFo@lDiC~M_@xBkAbHcCxOiBbNG`@Gb@c@dDm@xE_AnHQvAM~@QnAEVs@pFs@vEOlAIp@Gp@]|Ca@fDg@pE[fC_@lC]pCi@~DUtBIv@Gr@KzAKnCCbBAdBDxC@t@@Z@NHtAJpAPtB\\dDd@lEtExd@PdB`@xDvC|Y^pDdAnKHz@BVDVJ~@l@vFn@fG|Ir|@xB~TD^D\\rYxsChBjQRpBhBzQJfADP~@vI`ArJz@`JB\\B\\t@nH\\bCRlA`AtE^zAPp@\\hAb@nAr@nBrCpH`A`CFRHP~AfEnA`D`BfEFPFPDHzC~HxAxDtBlFn@zAz@fBv@fBhApBbBlC\\b@x@bAp@p@`Av@n@h@z@n@r@`@dAp@nBz@^NRJLF|GbDtCbBf@Tf@VPHp@X|BdAnMlGxAt@xL`G~GjD`B|@fAt@p@f@fA`Ap@t@Zb@^d@t@fAlAxB^x@";

    private final static String DESCRIPCION_0 = "Acalpican - Tecoman\nAzul\n260 kilómetros";
    private final static String DESCRIPCION_1 = "Tecomán - Tecomán\nVerde\n4.5 kilómetros";
    private final static String DESCRIPCION_2 = "Tecoman - Armería\nMorado\n9.5 kilómetros.\n";
    private final static String DESCRIPCION_3 = "Armería - Manzanillo\nNaranja\n5 kilómetros.\n";
    private final static String DESCRIPCION_4 = "Acalpican - Tecoman\nAzul\n260 kilómetros";
    private final static String DESCRIPCION_5 = "?";

    private List<List> recorridos;
    private List<String> descripciones;
    public Data() {
        //Al recorrido 0 le corresponde la descripcion 0, al 1 la desc 1....
        // Se debe tener en cuenta que las descripciones se deben arreglar.
        List recorrido0 = Arrays.asList(LINE0);
        List recorrido1 = Arrays.asList(LINE1);
        List recorrido2 = Arrays.asList(LINE2);
        List recorrido3 = Arrays.asList(LINE3);
        List recorrido4 = Arrays.asList(LINE10,LINE11,LINE12,LINE13,LINE14,LINE15,LINE16,LINE17,LINE18,LINE19,LINE20,LINE21,LINE22);
        List recorrido5 = Arrays.asList(LINE23);

        this.recorridos = Arrays.asList(recorrido0,recorrido1,recorrido2,recorrido3,recorrido4,recorrido5);
        this.descripciones = Arrays.asList(DESCRIPCION_0,DESCRIPCION_1,DESCRIPCION_2,DESCRIPCION_3,DESCRIPCION_4,DESCRIPCION_5);
    }

    public List<List> getRecorridos() {
        return recorridos;
    }

    public List<String> getDescripciones() {
        return descripciones;
    }
}