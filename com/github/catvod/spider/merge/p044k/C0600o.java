package com.github.catvod.spider.merge.p044k;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Dora;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p050n.C0629f;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.k.o */
/* loaded from: classes.dex */
public final class C0600o extends Dora {

    /* renamed from: c */
    private static String f1123c;

    /* renamed from: d */
    private static long f1124d;

    /* renamed from: e */
    private static String f1125e;

    /* renamed from: b */
    private final HashMap<String, ArrayList<String>> f1126b = new HashMap<>();

    /* renamed from: a */
    public final HashMap<String, String> m273a(long j) {
        String m897d = atm.m897d("B1D8A1EE97F4B1D6A1D197FEB1E2A1D797FFB1ECA1D597C0B1DBA1E297FCB1E3A1D197FEB1DB");
        StringBuilder sb = null;
        String str = null;
        StringBuilder sb2 = null;
        String str2 = null;
        HashMap<String, String> hashMap = null;
        while (true) {
            switch ((m897d.hashCode() ^ 90) ^ 2043498028) {
                case -1973037670:
                    sb.append(C0052e.m1418a(new byte[]{8, -29, 116, -14, -86, 85, 23, 99, 9, -30, 32, -95, -83, 86, 22, 101, 1, -30, 38, -6, -87, 83, 23, 107, 0, -73, 37, -95, -88, 84, 18, 96, 95, -79, 117, -15, -96, 83, 23, 53, 1, -28, 112}, new byte[]{57, -45, 68, -62, -103, 101, 39, 83}));
                    m897d = atm.m897d("B1DDA1D597F9B1E2A1ED97FAB1ECA1DE97C3B1DFA1ED97CFB1DEA1EF97C0B1E2A1D297FFB1E2A1ED97CEB1DEA1D397C0");
                    break;
                case -1818209330:
                    hashMap.put(C0052e.m1418a(new byte[]{-115, 81, 70, -56, -78}, new byte[]{-20, 33, 54, -127, -42, 58, 14, 6}), C0052e.m1418a(new byte[]{15, -83, -9, 87, 19, -58, -71, 18, 14, -84}, new byte[]{62, -99, -57, 103, 32, -10, -119, 34}));
                    m897d = atm.m897d("B1DDA1D197FDB1DAA1EF97FFB1E2A1D197FAB1D1A1ED97C2B1E5A1D197F9B1E2A1D497F0B1D2A1EF97CEB1E2A1D397FEB1EDA1D197C1B1DF");
                    break;
                case -1813083738:
                    StringBuilder sb3 = new StringBuilder();
                    m897d = atm.m897d("B1DDA1DE97CEB1E2A1EE97CFB1E3A1D397FDB1DDA1ED97C1B1E1A1D097C0B1D8A1E997C0");
                    sb2 = sb3;
                    break;
                case -1686142031:
                    hashMap.put(str, m267g(sb.toString()));
                    m897d = atm.m897d("B1D2A1D597C0B1E2A1D997FEB1DAA1D997C0B1DCA1EA97CFB1D6A1D797C1B1DAA1D197C1B1E2A1EA97C2B1D8A1D997F0B1E2A1E297FEB1D2");
                    break;
                case -1230533757:
                    sb.append(C0052e.m1418a(new byte[]{16, -67, -120, 57, 76, 45}, new byte[]{126, -46, -4, 80, 47, 72, 41, 81}));
                    m897d = atm.m897d("B1E2A1EA97F3B1D2A1D297C7B1D1A1D297FAB1DDA1D097CFB1E3A1D197C2B1E3A1EE97FEB1EDA1D297C4B1E6A1D097C0");
                    break;
                case -815376598:
                    sb = new StringBuilder();
                    m897d = atm.m897d("B1DEA1D997FDB1ECA1E397FEB1E2A1DD97C3B1D2A1EE97C2B1E0A1DD97F3B1ECA1D297F9B1EDA1E297C3B1DCA1EA97F4B1E6");
                    break;
                case -632042440:
                    sb.append(j);
                    m897d = atm.m897d("B1D6A1D997FDB1E6A1ED97FFB1E2A1D597C4B1DFA1D597FEB1ECA1ED97CEB1DCA1E397F0B1DFA1D297C0");
                    break;
                case -547994000:
                    sb2.append("");
                    m897d = atm.m897d("B1E1A1D597FFB1DCA1D297FDB1E0A1EC97CEB1E2A1EC97F4B1ECA1D097FCB1E3A1EF97F3B1DFA1ED");
                    break;
                case -268910988:
                    hashMap.put(C0052e.m1418a(new byte[]{-60, 24, 59, 110, 76, -9, 122, -62, -1, 31}, new byte[]{-111, 107, 94, 28, 97, -74, 29, -89}), C0052e.m1418a(new byte[]{60, 54, -15, -119, 20, 100, 63, -15, 26, 49, -106, -56, 78, 36, 68, -75, 94, 60, -43, -115, 8, 117, 68, -73}, new byte[]{115, 93, -71, -3, 96, 20, 106, -123}));
                    m897d = atm.m897d("B1DEA1DD97C0B1DFA1D197F0B1DCA1D997CEB1ECA1D297C4B1DDA1ED97CEB1E5A1E997FCB1DC");
                    break;
                case -245871070:
                    return hashMap;
                case -133791610:
                    String m1418a = C0052e.m1418a(new byte[]{-122, -11, -53, 51, 113, -78, -110, -67, -126}, new byte[]{-14, -100, -90, 86, 2, -58, -13, -48});
                    m897d = atm.m897d("B1E0A1D997CEB1DFA1EA97FFB1DBA1D597F0B1E2A1DD97C4B1DFA1D097CEB1E1A1ED97C0B1DB");
                    str2 = m1418a;
                    break;
                case -115648582:
                    hashMap.put(C0052e.m1418a(new byte[]{96, -117, -28, 105, 36, -44, 84}, new byte[]{22, -18, -106, 26, 77, -69, 58, 97}), C0052e.m1418a(new byte[]{-109}, new byte[]{-89, -125, -64, -56, -76, -65, -12, -91}));
                    m897d = atm.m897d("B1E0A1E997C3B1E1A1E997FDB1E2A1D197CEB1D2A1ED97CEB1E1A1E397C0B1DBA1EE97F8B1EDA1E2");
                    break;
                case 397605923:
                    m897d = atm.m897d("B1DCA1D497C4B1E0A1D397F4B1E3A1EF97C0B1E2A1D197C7B1E3A1D497F9B1DFA1ED");
                    break;
                case 1014306782:
                    m897d = atm.m897d("B1D2A1E997FEB1E2A1D797FFB1DFA1D497C1B1D2A1EF97CEB1D2A1E397C3B1D2A1ED97F3B1ECA1D297CFB1DDA1DE97C1B1E1A1D4");
                    break;
                case 1019642292:
                    sb2.append(j);
                    m897d = atm.m897d("B1DAA1D497C1B1E0A1E297FFB1E6A1D397CEB1D2A1DD97CFB1E6A1D297F9B1E2A1E397C2B1E3A1DD97F9B1DBA1ED");
                    break;
                case 1326084967:
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    m897d = atm.m897d("B1D8A1D297FDB1E2A1EF97F8B1D1A1D397FCB1E5A1D297C1B1D2A1EC97C2B1E1");
                    hashMap = hashMap2;
                    break;
                case 1453007021:
                    String m1418a2 = C0052e.m1418a(new byte[]{16, -76, -110, 46, 11}, new byte[]{100, -37, -7, 75, 101, -9, 112, 91});
                    m897d = atm.m897d("B1ECA1DD97FDB1EDA1DE97C1B1D8A1DD97FFB1E2A1EA97C4B1D6A1D797C7B1E5A1D997F3B1DCA1E397F9B1D2A1DE97FCB1DD");
                    str = m1418a2;
                    break;
                case 1951720392:
                    hashMap.put(str2, sb2.toString());
                    m897d = atm.m897d("B1DEA1DD97C4B1E2A1D397C0B1E5A1D997F4B1E1A1E997F0B1DDA1E297C3B1DEA1E297FDB1ECA1ED97FCB1D6A1D097C7B1DEA1DD97F3B1D2A1D4");
                    break;
            }
        }
    }

    /* renamed from: b */
    final String m272b(String str) {
        int i;
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance(C0052e.m1418a(new byte[]{-44, 19, -80}, new byte[]{-122, 64, -15, 94, -79, -78, 11, -17})).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(atm.m897d("273333303A3F23383B310D16281D11042433033D43027C1A2B2B3F330D193939383E2B2F0D1D291E0D3F2F3B3B1A051A2B2B3E1C380045082D257A0F3D19491D461C102F1913086022180D42752129384D073669523D3F1E261C0B0A1019190E231B4925741E2F2B3C1A033B020F4D3B672E0E314C3D1D16191648373D345E160C7F1B17330F00271B1608363D247B35240E37162D6A521339001C1009114A342F121035094C0A6E1B080F25006F591F23420D315D030C0F3F6A231C3F1135003900703D1C7713221D3003315F203F372A2B28203F2501121D4C0C1304123C0F1F00087706125539273720551D2D09132739375A3C3323003D050E080E482E06053F527020113A172D372A0C6715251430177D090C1F4A0C7F093B1E19401A083C1E20331B373D09374C1E190F143218096B0E4B2E3D2E731F34202F163B04374B011A6F600223120E3A23121D3D38002B201422080F2E2838387F20202A284603610E1C383D042C450E180C3E0218290D3E7D110D0D3C123D3E331755011E3A070A4E0C63525B3E123C0A6E073E3B12011A2B3B3F362B3F2F3B330F083239481D300A1603204A147A36050F2C262E690C4E4D06042952351D277D321A4C4B4C3F3D27341127466E38000941342C2534422336175B283F19786F06093B12256E2543291234342F0E031E05310D16380408163B3D3402780B24320B387A362B3F0F030A6B190C557F7E6F29231847061F2C0F2A113D733F2C3B3A04335E18434628105C0F294C79311A3B42311A615D0A09271A08592A4B303D332D103D3C1F0C001C55471F6C233D70447C095A2F12257820121328267E31290E1B3C3D680C180C1B3E1B020B232720013B230A1E270A2939325E1D6C2C343104390B190B1722351B1F4F031329092770371027730B2E433E2B2E07391245790D291F0B367D205D022A011F360F3418050628263E4F0F1B6029193D4209012C3E0E3C1C600843382508341F1E4E421610604F2341632F132B2B33041026351B1B250C202C0C3006025D19331A1421581D351D3A3F09320A3B3E213B3138121D1C123434011436291C2C3E7C123334121B19525F2D393A1461241F2D4C1D6F53321611240C274F55303D2B003B4F3D7E69004F29420D770E0F38261E3E324D131A3969020322142D6A1A5130423E202C43091F4616060D32253F13020A08062720321B323F7B293F424E121F351D35280618093B2A1701182B03003D021A2B2749494567095820283A2D0B2F1C3E1A19292243517F071A21094C3E671E25161E1618171839205E051401420D103E2F21381D24082F042B2F0707193E002821240E0E3E4C3D2F3F1E553C5A1F1903003E183A2C032E70233A0A093D111C1A6B2F0E38401E2052003C3B06612D2D08041F192B080D3C340C3D1D1C2C0F01190C0A20263A202D4A47013F5A2F1C1F7E73331210217B695970354C350E030D2F0475615C290E4C29141D3D2B3A791E2E373E4D0A01034D18270D31303F3B100D3D233F1F03291C3809343E7D6D415142231A123C154D177E34600019143C285F1149171D13281D2B311F31203432272429391F0E4367200D3333310B3730514B243A683E3C2A2D790D18200E4D032819314D333F302F35122D1D5229020E4D1B02244A493D040021431C300F6C2D100D02341A180D2337671A2510392C2515221739117F325A37493D23000D3E08121A3113233138390E1F3E114D460D2D4249077902080B2C000F2F0C35421C631008021E11393D2F0C0E0C251C583920417B022933320D0717213B1F45076C271F0247191A0B310D3E0E3F3B3E137F3E1D050F351020085331144028213C123230020932382E00751C233818440A1904354F133432272E2D0D0A395F0B123939012234181334132C484E14382B380F7037292824123007351E29112E45262E2D0C4839740A134A0D3D252F1B0D0C1D03695E15183F7F310B49133709092B2C3E193873192C43397E131C3D3505181A5E70551B2035233B4E007C6A234B333736311D4A48141B01013D15451F17272F15451609265148250921012B31372B193C4B0F042512062D0F34752D3A1E3C33060860202A397E0105350F211B3C3D1C3302053A452F1E062E0D1F2E191E0F3F1B2A330419080349321D250E390F143A2B3B254D3222076B2D3E491F74335E223F171B522D4E035E05335A1636071B2228164D47742C301F4B320916102E1C4D2D391A3F163D200D0C3C2938781706082E270E2B083735061D1A0930341D7B090803152F461A2213202F183A382F2343340D384E3E321533293511060A"), 0)));
            Cipher cipher = Cipher.getInstance(C0052e.m1418a(new byte[]{-46, 16, 36, -55, -24, 97, 60, -72, -48, 8, 38, -75, -100, 114, 31, -13, -28, 42, 11, -127}, new byte[]{Byte.MIN_VALUE, 67, 101, -26, -83, 34, 126, -105}));
            cipher.init(1, generatePrivate);
            byte[] bytes = str.getBytes();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String m897d = atm.m897d("B1DEA1DE97C4B1E2A1EC97FDB1DEA1D397C4B1ECA1DE97C4B1D6A1EA97CFB1DAA1D197FDB1ED");
            while (true) {
                switch (m897d.hashCode() ^ (-749037966)) {
                    case -1955554320:
                        byteArrayOutputStream.write(cipher.doFinal(bytes));
                        break;
                    case -703259754:
                        int length = bytes.length;
                        int i2 = 0;
                        while (true) {
                            String m897d2 = atm.m897d("B1E6A1D297F9B1EDA1D197C4B1E2A1EA97CEB1D8A1ED97F3B1E2A1ED97FDB1E1A1D797FFB1E2A1ED97CFB1E1A1EE97C4B1E2A1D297FEB1DB");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-1797438190)) {
                                    case 735674427:
                                        m897d2 = i2 < bytes.length ? atm.m897d("B1DCA1D997F9B1EDA1ED97C0B1E5A1DD97FEB1E3A1D597C3B1DAA1D097FEB1E2A1DE97FFB1DFA1ED97F0B1ECA1E397CEB1DCA1EE97F8B1DF") : atm.m897d("B1ECA1D497C4B1DAA1EC97F0B1EDA1D997FDB1E2A1D597FFB1D6A1E997CEB1D6");
                                    case 967284609:
                                        break;
                                    case 1021402169:
                                        int i3 = i2 + 256;
                                        String m897d3 = atm.m897d("B1EDA1D797F0B1E2A1D797C0B1D6A1D597F4B1DFA1ED97FAB1E5A1EE97FCB1DBA1E397C0B1E5A1D997FDB1DFA1D9");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ 461482700) {
                                                case -1507639440:
                                                    m897d3 = i3 > length ? atm.m897d("B1DEA1D997FFB1E0A1EC97F9B1EDA1D497F0B1E2A1D097F4B1DDA1DE97F9B1D2A1EC97F9B1D2A1ED97F8B1DCA1DE97CEB1DAA1D097FAB1D8A1E2") : atm.m897d("B1E0A1D197CEB1DCA1D797FEB1E2A1DE97C1B1DAA1EF97C0B1E2A1EA97F9B1EC");
                                                case -648064074:
                                                    m897d3 = atm.m897d("B1E5A1EC97F8B1D8A1E997CEB1E2A1DD97FAB1DCA1ED97C0B1D1A1ED97C0B1D8A1E297F8B1D2A1D797CE");
                                                case -575075906:
                                                    i = 256;
                                                    break;
                                                case 190459326:
                                                    i = length - i2;
                                                    break;
                                            }
                                        }
                                        byteArrayOutputStream.write(cipher.doFinal(bytes, i2, i));
                                        i2 = i3;
                                        break;
                                    case 1836598355:
                                        m897d2 = atm.m897d("B1D6A1DD97CEB1E2A1E997C2B1DFA1D997C0B1D8A1EC97F8B1EDA1E297CEB1DAA1D797C4B1E2A1ED97C7B1D6A1ED97C0B1EDA1E997C1B1DFA1D4");
                                }
                            }
                        }
                        break;
                    case 37527823:
                        m897d = atm.m897d("B1E2A1EA97FDB1E1A1D297F0B1E2A1E397FDB1E2A1D097F3B1E0A1D297F4B1E0A1EC97F8B1DFA1EA97C2B1D1");
                        break;
                    case 689585388:
                        if (bytes.length > 256) {
                            m897d = atm.m897d("B1D6A1E297FFB1E5A1EF97FAB1E5A1DE97FEB1E2A1DD97FEB1DAA1EA97C1B1DBA1E397CEB1E2A1E997CEB1D2");
                            break;
                        } else {
                            m897d = atm.m897d("B1EDA1EF97FDB1E2A1D797F3B1DEA1ED97FAB1D6A1EA97F3B1DFA1D597F8B1E0A1EA97FFB1E3A1E297FFB1E1A1D497F4B1DA");
                            break;
                        }
                }
            }
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    final String m271c(String str) {
        int i;
        int i2 = 0;
        try {
            Cipher cipher = Cipher.getInstance(C0052e.m1418a(new byte[]{-114, 23, -117, 120, -72, 97, 15, 12, -116, 15, -119, 4, -52, 114, 44, 71, -72, 45, -92, 48}, new byte[]{-36, 68, -54, 87, -3, 34, 77, 35}));
            cipher.init(2, KeyFactory.getInstance(C0052e.m1418a(new byte[]{7, 13, -47}, new byte[]{85, 94, -112, -20, -24, 123, -42, 53})).generatePublic(new X509EncodedKeySpec(Base64.decode(C0052e.m1418a(new byte[]{-36, 53, -37, -30, 69, -82, -54, -105, -46, 47, -19, -61, 91, -90, -104, -29, -43, 45, -39, -58, 73, -66, -81, -111, -48, 72, -37, -54, 73, -85, -71, -110, -8, 45, -41, -58, 111, -66, -71, -71, -56, 54, -87, -47, 78, -123, -97, -107, -10, 25, -55, -19, 61, -106, -108, -100, -38, 20, -10, -79, 77, -94, -68, -32, -101, 79, -17, -27, Byte.MAX_VALUE, -69, -125, -111, -38, 19, -52, -26, 110, -70, -71, -125, -53, 38, -51, -79, 89, -117, -120, -104, -7, 14, -43, -54, 111, -120, -120, -119, -23, 56, -24, -58, 39, -69, -83, -120, -2, 13, -49, -62, 35, -83, -80, Byte.MIN_VALUE, -87, 73, -38, -76, 126, -98, -62, -110, -89, 27, -45, -11, 78, -72, -110, -101, -66, 118, -83, -44, 65, -92, -97, -30, -26, 55, -16, -42, 90, -102, -96, -125, -34, 24, -55, -2, 67, -64, -55, -90, -21, 46, -44, -23, 90, -36, -80, -29, -38, 59, -18, -14, 70, -107, -116, -89, -48, 46, -44, -68, 111, -120, -62, -88, -53, 22, -2, -9, 105, -125, -103, -1, -10, 62, -9, -25, 94, -105, -87, -88, -42, 24, -106, -68, 98, -41, -120, -102, -91, 45, -12, -53, 91, -87, -110, -23, -41, 68, -34, -74, Byte.MAX_VALUE, -90, -66, -111, -64, 61, -34}, new byte[]{-111, 124, -100, -124, 8, -17, -6, -48}), 0))));
            byte[] decode = Base64.decode(str, 0);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String m897d = atm.m897d("B1E5A1DE97F9B1DAA1E997FCB1E5A1D597C7B1E3A1E397F4B1DBA1D397C0B1DBA1ED97FDB1E0A1EE97F9B1DBA1EA97C0");
            while (true) {
                switch (m897d.hashCode() ^ 523590276) {
                    case -2024174811:
                        int length = decode.length;
                        while (true) {
                            String m897d2 = atm.m897d("B1E5A1E297C4B1E0A1E397F0B1E2A1E297FDB1DDA1ED97C1B1EDA1D397C0B1E0A1ED97FFB1E2A1DE97C3B1DCA1ED97C0B1E5A1D597C1B1DEA1EC");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-1293936303)) {
                                    case -1691371147:
                                        int i3 = i2 + 256;
                                        String m897d3 = atm.m897d("B1DFA1D597FEB1E2A1EC97F4B1ECA1D997CFB1ECA1EC97F9B1E2A1ED97C4B1E6A1E997FEB1E2A1DD97C7B1D2A1E297FFB1E1");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ 1514059598) {
                                                case 270192458:
                                                    i = 256;
                                                    break;
                                                case 787357998:
                                                    i = length - i2;
                                                    break;
                                                case 1559989957:
                                                    m897d3 = i3 > length ? atm.m897d("B1EDA1EF97F9B1E2A1DE97F4B1D2A1D297F3B1DEA1DE97F4B1E2A1ED97FEB1DCA1E997C4B1E6A1ED97C0B1DBA1D797C3") : atm.m897d("B1DFA1EA97C1B1E2A1EA97FDB1E2A1D197C0B1E5A1ED97C4B1DCA1ED97F4B1DDA1D297C1B1DBA1E997F3B1DCA1ED97C0B1D1A1D597C0B1E2A1D197C7B1E5");
                                                case 1698581980:
                                                    m897d3 = atm.m897d("B1DDA1ED97C7B1D8A1D097FEB1D8A1ED97C3B1D1A1EC97FCB1E3A1E297FEB1E2A1D297C4B1E6A1ED97C4B1E2A1D497C0B1D8A1D297C7");
                                            }
                                        }
                                        byteArrayOutputStream.write(cipher.doFinal(decode, i2, i));
                                        i2 = i3;
                                        break;
                                    case 1197006042:
                                        m897d2 = atm.m897d("B1EDA1DE97C4B1E2A1EC97F4B1DFA1D597F8B1DAA1D097CFB1D2A1ED97F8B1D8A1D3");
                                    case 1729502251:
                                        break;
                                    case 2099459412:
                                        m897d2 = i2 < length ? atm.m897d("B1DCA1EC97CEB1D6A1E297F9B1E2A1D297C2B1D8A1DE97F8B1E6A1D197F0B1DFA1D497F0") : atm.m897d("B1DBA1D197F0B1DDA1D597C7B1E2A1D597F9B1DAA1E397FFB1E2A1DD97F9B1E2A1ED97FDB1D1A1E997C0");
                                }
                            }
                        }
                        break;
                    case -1579078755:
                        if (decode.length > 256) {
                            m897d = atm.m897d("B1D6A1D797C4B1E2A1EF97CFB1DCA1D297C7B1D8A1D997FDB1E6A1D997C7B1E1A1E397FCB1DD");
                            break;
                        } else {
                            m897d = atm.m897d("B1DFA1D097CEB1E2A1ED97C4B1ECA1D497C0B1D1A1DD97F3B1DEA1EF97CEB1D8A1D797C0B1E2A1EF97C4B1D2");
                            break;
                        }
                    case -117481978:
                        byteArrayOutputStream.write(cipher.doFinal(decode));
                        break;
                    case 2008467017:
                        m897d = atm.m897d("B1ECA1EA97FCB1DCA1D597FCB1E5A1D997FDB1EDA1E997C0B1D2A1D197C4B1E2");
                        break;
                }
            }
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString(0);
        } catch (Exception e) {
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        int parseInt;
        int parseInt2;
        int parseInt3;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        int i;
        int i2 = 0;
        try {
            m268f();
            String m897d = atm.m897d("B1DBA1D297F0B1E2A1EE97C1B1E0A1D297CFB1DDA1D097C4B1ECA1D997C4B1E2A1D197CFB1ECA1ED97FCB1E3A1D397F3B1DDA1D397C4B1D8A1D7");
            while (true) {
                switch (m897d.hashCode() ^ (-347568518)) {
                    case -2089856402:
                        parseInt = 0;
                        break;
                    case -1954064863:
                        parseInt = Integer.parseInt(hashMap.get(C0052e.m1418a(new byte[]{44, 36, -71, 43, 53, 60}, new byte[]{77, 86, -36, 74, 124, 88, -25, 72})));
                        break;
                    case 363121496:
                        m897d = atm.m897d("B1DEA1DE97CFB1DEA1D797FEB1E2A1D297FAB1ECA1ED97C7B1D2A1E997C0B1DBA1DE97FF");
                        break;
                    case 1520255118:
                        if (!hashMap.containsKey(C0052e.m1418a(new byte[]{-22, -83, 70, -51, -117, -12}, new byte[]{-117, -33, 35, -84, -62, -112, 109, -119}))) {
                            m897d = atm.m897d("B1EDA1D097C7B1E3A1D097C4B1E2A1DD97F0B1DDA1E297F3B1DBA1EC97F3B1E3A1D197FDB1DFA1ED97FDB1D8A1ED97FDB1E0");
                            break;
                        } else {
                            m897d = atm.m897d("B1DBA1DE97F4B1DAA1D397F3B1E6A1D597F9B1E2A1DE97FFB1E6A1E997F0B1D1A1E397C1B1ECA1ED");
                            break;
                        }
                }
            }
            String m897d2 = atm.m897d("B1DBA1E297CEB1D8A1EC97FDB1DFA1DE97C4B1E2A1D497F4B1E2A1D797FDB1DDA1DD97C0B1E2A1EE97FEB1D6A1EE97F8B1ECA1ED97FDB1DCA1EA");
            while (true) {
                switch (m897d2.hashCode() ^ 61543630) {
                    case -841072759:
                        parseInt2 = Integer.parseInt(hashMap.get(C0052e.m1418a(new byte[]{-77, 118, 28, 36, 119}, new byte[]{-57, 23, 123, 109, 19, 76, 47, 24})));
                        break;
                    case 6447385:
                        if (!hashMap.containsKey(C0052e.m1418a(new byte[]{107, 68, -86, 3, -88}, new byte[]{31, 37, -51, 74, -52, -50, -52, 74}))) {
                            m897d2 = atm.m897d("B1E5A1EF97C4B1E1A1ED97CEB1DAA1D497CEB1EDA1EC97C7B1DAA1DE97FE");
                            break;
                        } else {
                            m897d2 = atm.m897d("B1D1A1D097C1B1D6A1D097C0B1E2A1D597FCB1E1A1D997CEB1E0A1EE97C4B1D2");
                            break;
                        }
                    case 1129331509:
                        parseInt2 = 0;
                        break;
                    case 1953515608:
                        m897d2 = atm.m897d("B1EDA1DD97C7B1DCA1D097FEB1E1A1D397C7B1DAA1EA97C0B1D6A1D597C1");
                        break;
                }
            }
            String m897d3 = atm.m897d("B1E1A1D797C1B1D8A1D397F9B1E5A1EA97FDB1DAA1DD97FCB1ECA1D197FF");
            while (true) {
                switch (m897d3.hashCode() ^ (-76988836)) {
                    case -1655672042:
                        parseInt3 = Integer.parseInt(hashMap.get(C0052e.m1418a(new byte[]{42, 103, -3, -117, -89, -55}, new byte[]{83, 2, -100, -7, -18, -83, -109, -125})));
                        break;
                    case 270918288:
                        parseInt3 = 0;
                        break;
                    case 1028800038:
                        m897d3 = atm.m897d("B1DCA1D397CFB1E2A1D797FCB1E2A1EF97C0B1E3A1D397FFB1E2A1D297C3B1D1A1DE97C4B1DAA1D997C7B1E3A1D297FDB1DF");
                        break;
                    case 1198950603:
                        if (!hashMap.containsKey(C0052e.m1418a(new byte[]{45, -77, 86, 73, 105, 92}, new byte[]{84, -42, 55, 59, 32, 56, 88, -92}))) {
                            m897d3 = atm.m897d("B1E1A1EC97C4B1E2A1D197C2B1EDA1D797FAB1E2A1D197F8B1E0A1D997F4B1E1A1D497F3B1E2A1ED97FAB1ECA1ED");
                            break;
                        } else {
                            m897d3 = atm.m897d("B1E0A1DD97C7B1EDA1EC97F9B1E2A1D797CFB1DCA1D297FCB1E2A1ED97FDB1DEA1EC97FDB1DCA1D297FEB1E3A1ED97F3B1DFA1ED97FCB1E0A1EC");
                            break;
                        }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            String m267g = m267g(C0052e.m1418a(new byte[]{-46, -3, 119, -74, -112, -38, 76, 62, -45, -4, 35, -27, -105, -39, 77, 56, -37, -4, 37, -66, -109, -36, 76, 54, -38, -87, 38, -27, -110, -37, 73, 61, -123, -81, 118, -75, -102, -36, 76, 104, -37, -6}, new byte[]{-29, -51, 71, -122, -93, -22, 124, 14}) + str2 + 18 + str + parseInt2 + parseInt + parseInt3 + currentTimeMillis + C0052e.m1418a(new byte[]{-97, -22, 51, -45, 87, -38}, new byte[]{-15, -123, 71, -70, 52, -65, 0, -11}));
            jSONObject2.put(C0052e.m1418a(new byte[]{-85, 91, -73, 52, 39}, new byte[]{-54, 43, -57, 125, 67, -49, -4, -109}), C0052e.m1418a(new byte[]{-87, 47, 74, 95, 70, -85, -14, -12, -88, 46}, new byte[]{-104, 31, 122, 111, 117, -101, -62, -60}));
            jSONObject2.put(C0052e.m1418a(new byte[]{-122, -39, 49, 68, 105, 1}, new byte[]{-14, -96, 65, 33, 32, 101, -112, 92}), str);
            jSONObject2.put(C0052e.m1418a(new byte[]{-65, -102, -54, -7, 99, -9}, new byte[]{-34, -24, -81, -104, 42, -109, -82, 37}), parseInt);
            jSONObject2.put(C0052e.m1418a(new byte[]{-6, 104, 100, Byte.MIN_VALUE, -82}, new byte[]{-114, 9, 3, -55, -54, 71, -1, -18}), parseInt2);
            jSONObject2.put(C0052e.m1418a(new byte[]{-8, 16, Byte.MIN_VALUE, -75, 73, 55}, new byte[]{-127, 117, -31, -57, 0, 83, -74, -24}), parseInt3);
            jSONObject2.put(C0052e.m1418a(new byte[]{16, -92, 75, 0}, new byte[]{96, -59, 44, 101, -12, 124, -2, 34}), Integer.parseInt(str2));
            jSONObject2.put(C0052e.m1418a(new byte[]{-52, 33, 70, 73, 92, -56, 8, Byte.MIN_VALUE}, new byte[]{-68, 64, 33, 44, 15, -95, 114, -27}), 18);
            jSONObject2.put(C0052e.m1418a(new byte[]{-90, -120, -6, -54}, new byte[]{-43, -31, -99, -92, 73, -60, 8, 15}), m267g);
            jSONObject2.put(C0052e.m1418a(new byte[]{-92, 84, -55, 91, 111, -45, -16, -8, -96}, new byte[]{-48, 61, -92, 62, 28, -89, -111, -107}), currentTimeMillis);
            String m269e = m269e(f1123c.substring(0, 16), f1123c.substring(16, 32), jSONObject2.toString());
            String m272b = m272b(f1123c);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C0052e.m1418a(new byte[]{45, -101, -82, 61}, new byte[]{79, -12, -54, 68, -83, 9, 12, -27}), m269e);
            jSONObject3.put(C0052e.m1418a(new byte[]{-101, 3, 83, 18, -99, -29}, new byte[]{-17, 106, 48, 121, -8, -105, -3, 80}), m272b);
            JSONObject jSONObject4 = new JSONObject();
            try {
                JSONObject jSONObject5 = new JSONObject(C0629f.m180e(C0052e.m1418a(new byte[]{-64, 61, -116, 47, -106, 124, -12, 108, -36, 37, -105, 48, -57, 125, -67, 110, -53, 40, -111, 44, -60, 58, -94, 102, -122, 42, -105, 50, -125, 50, -85, 102, -121, 63, -55, 112, -33, 54, -70, 125, -53, 33, -41, 41, -59, 55, -66, 96, -122, 45, -105}, new byte[]{-88, 73, -8, 95, -84, 83, -37, 15}), jSONObject3.toString(), m273a(currentTimeMillis)));
                String m271c = m271c(jSONObject5.getString(C0052e.m1418a(new byte[]{-47, 63, 22, -62, -29, 103}, new byte[]{-91, 86, 117, -87, -122, 19, -109, -123})));
                jSONObject = new JSONObject(m270d(m271c.substring(0, 16), m271c.substring(16, 32), jSONObject5.getString(C0052e.m1418a(new byte[]{60, 43, 124, 101}, new byte[]{94, 68, 24, 28, -85, -40, 123, -94}))));
                jSONArray = new JSONArray();
                jSONArray2 = jSONObject.getJSONArray(C0052e.m1418a(new byte[]{-7, 58, 92, 2, -13, 80, 109}, new byte[]{-117, 95, 47, 119, -97, 36, 30, 56}));
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            while (true) {
                String m897d4 = atm.m897d("B1DCA1EA97C0B1DFA1D797CEB1E2A1E997FCB1E6A1E397FEB1D8A1E297C2B1ECA1ED97FAB1DEA1E2");
                while (true) {
                    switch (m897d4.hashCode() ^ 409149003) {
                        case -1608945448:
                            break;
                        case -126937894:
                            m897d4 = atm.m897d("B1D1A1D597C0B1E2A1EF97F9B1DFA1D797F8B1DFA1EF97FDB1D8A1D197FDB1ECA1D197F3B1D8A1D997C7B1ECA1EF97FFB1ECA1ED");
                        case 339168767:
                            m897d4 = i2 < jSONArray2.length() ? atm.m897d("B1E1A1EF97FDB1E5A1EF97C0B1E1A1D197FDB1DEA1D097F4B1D6A1D997C3B1DDA1D297FFB1D8A1D497FFB1E2A1D097CFB1ECA1ED97FCB1E5A1ED97C0") : atm.m897d("B1D8A1D297CEB1E1A1EA97C4B1E2A1D397C2B1DDA1D997FDB1ECA1EE97F9B1DBA1DD97C4B1E6A1D997C2B1E6");
                        case 1934020397:
                            jSONObject4.put(C0052e.m1418a(new byte[]{-63, 85, 58, -8}, new byte[]{-79, 52, 93, -99, 22, -127, 47, -86}), Integer.parseInt(str2));
                            int i3 = jSONObject.getInt(C0052e.m1418a(new byte[]{-44, 18, -47, -14, 62}, new byte[]{-73, 125, -92, -100, 74, 42, -45, -63}));
                            String m1418a = C0052e.m1418a(new byte[]{-14, -125, -61, 6, -23, -55, -56, -112, -10}, new byte[]{-126, -30, -92, 99, -118, -90, -67, -2});
                            String m897d5 = atm.m897d("B1D2A1D197FDB1E6A1D797C4B1ECA1EE97C7B1DEA1ED97F3B1EDA1ED97F4");
                            while (true) {
                                switch (m897d5.hashCode() ^ 1470265498) {
                                    case -1103544005:
                                        if (i3 % 20 != 0) {
                                            m897d5 = atm.m897d("B1D1A1D497FAB1D2A1D297CEB1E3A1EF97F9B1DFA1D097F9B1E2A1E297C4B1DEA1D797C2B1DBA1ED97F3B1D2A1DD97C0");
                                            break;
                                        } else {
                                            m897d5 = atm.m897d("B1D2A1D497F0B1E1A1E997F3B1DEA1EE97F0B1E1A1DD97C0B1D1A1E997C7B1D1A1D397F3B1D2A1D397C0B1E5A1D197F9B1E2");
                                            break;
                                        }
                                    case 1217424925:
                                        i = i3 / 20;
                                        break;
                                    case 1825203717:
                                        m897d5 = atm.m897d("B1E3A1EA97C0B1E2A1D997C0B1E2A1D997F8B1E1A1D197F0B1DFA1ED97FAB1DBA1DD97C0B1DDA1DE97C4B1E2");
                                        break;
                                    case 1961757493:
                                        i = (i3 / 20) + 1;
                                        break;
                                }
                            }
                            jSONObject4.put(m1418a, i);
                            jSONObject4.put(C0052e.m1418a(new byte[]{-69, -123, 106, -7, 42}, new byte[]{-41, -20, 7, -112, 94, 92, 49, 112}), 20);
                            jSONObject4.put(C0052e.m1418a(new byte[]{-93, -57, -17, 99, 27}, new byte[]{-41, -88, -101, 2, 119, 57, 36, 93}), i3);
                            jSONObject4.put(C0052e.m1418a(new byte[]{0, -16, -121, 91}, new byte[]{108, -103, -12, 47, Byte.MIN_VALUE, 124, 68, -120}), jSONArray);
                            break;
                    }
                }
                return jSONObject4.toString();
                JSONObject jSONObject6 = jSONArray2.getJSONObject(i2);
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put(C0052e.m1418a(new byte[]{28, -57, 45, 105, 29, 13}, new byte[]{106, -88, 73, 54, 116, 105, -120, -32}), jSONObject6.getString(C0052e.m1418a(new byte[]{-80, 112}, new byte[]{-39, 20, -45, -48, -72, 120, -93, -39})));
                jSONObject7.put(C0052e.m1418a(new byte[]{47, -13, -2, -74, 94, 72, 92, 77}, new byte[]{89, -100, -102, -23, 48, 41, 49, 40}), jSONObject6.getString(C0052e.m1418a(new byte[]{70, 100, 88, 113}, new byte[]{40, 5, 53, 20, -72, 114, -33, 102})));
                jSONObject7.put(C0052e.m1418a(new byte[]{77, -7, 101, -21, 45, 108, 43}, new byte[]{59, -106, 1, -76, 93, 5, 72, 2}), jSONObject6.getString(C0052e.m1418a(new byte[]{86, -43, 79}, new byte[]{38, -68, 44, 79, -95, -58, 99, 17})));
                jSONObject7.put(C0052e.m1418a(new byte[]{55, -3, 67, -82, -67, -75, -63, 0, 51, -7, 84}, new byte[]{65, -110, 39, -15, -49, -48, -84, 97}), jSONObject6.getString(C0052e.m1418a(new byte[]{-69, -55, -112, 112, 10, 39, 40, 10}, new byte[]{-53, -69, -1, 23, 120, 66, 91, 121})));
                jSONArray.put(jSONObject7);
                i2++;
            }
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    @TargetApi(19)
    /* renamed from: d */
    final String m270d(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), C0052e.m1418a(new byte[]{12, 103, -95}, new byte[]{77, 34, -14, -119, 7, -37, -58, 11}));
            Cipher cipher = Cipher.getInstance(C0052e.m1418a(new byte[]{25, -45, 20, 6, 78, -86, -37, -112, 8, -35, 4, 122, 56, -72, -7, -37, 60, -1, 41, 78}, new byte[]{88, -106, 71, 41, 13, -24, -104, -65}));
            cipher.init(2, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str3, 0)), C0052e.m1418a(new byte[]{19, -5, 31, -90, -123}, new byte[]{70, -81, 89, -117, -67, -104, -124, -35}));
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String detailContent(List<String> list) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        TreeMap treeMap;
        int i;
        JSONObject jSONObject2;
        try {
            m268f();
            JSONObject jSONObject3 = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            String m267g = m267g(C0052e.m1418a(new byte[]{126, -11, -9, -61, -76, 109, -91, 35, Byte.MAX_VALUE, -12, -93, -112, -77, 110, -92, 37, 119, -12, -91, -53, -73, 107, -91, 43, 118, -95, -90, -112, -74, 108, -96, 32, 41, -89, -10, -64, -66, 107, -91, 117, 119, -14}, new byte[]{79, -59, -57, -13, -121, 93, -107, 19}) + list.get(0) + currentTimeMillis + C0052e.m1418a(new byte[]{36, -60, -72, -54, -102, -75}, new byte[]{74, -85, -52, -93, -7, -48, -14, 17}));
            jSONObject3.put(C0052e.m1418a(new byte[]{4, -102, -58, 94, -46}, new byte[]{101, -22, -74, 23, -74, -29, -91, -77}), C0052e.m1418a(new byte[]{116, 21, -50, -46, 94, -125, -78, 107, 117, 20}, new byte[]{69, 37, -2, -30, 109, -77, -126, 91}));
            jSONObject3.put(C0052e.m1418a(new byte[]{51, 53}, new byte[]{90, 81, 62, -109, -52, -28, 103, 103}), list.get(0));
            jSONObject3.put(C0052e.m1418a(new byte[]{15, 45, 21, 69}, new byte[]{124, 68, 114, 43, -37, 18, -32, 84}), m267g);
            jSONObject3.put(C0052e.m1418a(new byte[]{59, -86, 86, -40, 118, 90, 41, 83, 63}, new byte[]{79, -61, 59, -67, 5, 46, 72, 62}), currentTimeMillis);
            String m269e = m269e(f1123c.substring(0, 16), f1123c.substring(16, 32), jSONObject3.toString());
            String m272b = m272b(f1123c);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(C0052e.m1418a(new byte[]{33, 78, 96, 98}, new byte[]{67, 33, 4, 27, 55, 11, 123, -17}), m269e);
            jSONObject4.put(C0052e.m1418a(new byte[]{1, 88, 115, 101, -61, -26}, new byte[]{117, 49, 16, 14, -90, -110, -7, -17}), m272b);
            JSONObject jSONObject5 = new JSONObject();
            try {
                JSONObject jSONObject6 = new JSONObject(C0629f.m180e(C0052e.m1418a(new byte[]{37, -56, -124, -108, 110, -123, -64, -26, 57, -48, -97, -117, 63, -124, -119, -28, 46, -35, -103, -105, 60, -61, -106, -20, 99, -33, -97, -119, 123, -53, -97, -20, 98, -54, -63, -53, 34, -61, -117, -32, 34, -109, Byte.MIN_VALUE, -120, 53, -45, -64}, new byte[]{77, -68, -16, -28, 84, -86, -17, -123}) + list.get(0) + C0052e.m1418a(new byte[]{58, 122, -7, -52}, new byte[]{20, 30, -106, -20, 102, 105, -90, -83}), jSONObject4.toString(), m273a(currentTimeMillis)));
                String m271c = m271c(jSONObject6.getString(C0052e.m1418a(new byte[]{-61, -10, 59, 113, 57, -58}, new byte[]{-73, -97, 88, 26, 92, -78, -66, -94})));
                JSONObject jSONObject7 = new JSONObject(m270d(m271c.substring(0, 16), m271c.substring(16, 32), jSONObject6.getString(C0052e.m1418a(new byte[]{37, 103, 14, -123}, new byte[]{71, 8, 106, -4, -41, 125, -80, -8})))).getJSONObject(C0052e.m1418a(new byte[]{73, 72, -110, -68}, new byte[]{45, 41, -26, -35, 29, 72, -45, 115}));
                jSONArray = new JSONArray();
                jSONObject = new JSONObject();
                jSONObject.put(C0052e.m1418a(new byte[]{-59, 72, -51, 73, -91, 54}, new byte[]{-77, 39, -87, 22, -52, 82, 58, 126}), jSONObject7.getString(C0052e.m1418a(new byte[]{-119, -89}, new byte[]{-32, -61, 27, -40, 8, 114, -91, -71})));
                jSONObject.put(C0052e.m1418a(new byte[]{114, 83, 70, 91, 36, 51, -7, 96}, new byte[]{4, 60, 34, 4, 74, 82, -108, 5}), jSONObject7.getString(C0052e.m1418a(new byte[]{41, 14, 85, 113}, new byte[]{71, 111, 56, 20, 20, 78, 9, 82})));
                jSONObject.put(C0052e.m1418a(new byte[]{-92, 26, -40, 72, -121, 111, 89}, new byte[]{-46, 117, -68, 23, -9, 6, 58, -62}), jSONObject7.getString(C0052e.m1418a(new byte[]{20, 111, 85}, new byte[]{100, 6, 54, 13, -6, -91, 93, 47})));
                jSONObject.put(C0052e.m1418a(new byte[]{-95, 37, 30, 111, -121, 77, 81, 22}, new byte[]{-41, 74, 122, 48, -2, 40, 48, 100}), jSONObject7.getString(C0052e.m1418a(new byte[]{66, -113, -67, 57}, new byte[]{59, -22, -36, 75, 45, 72, -122, -56})));
                jSONObject.put(C0052e.m1418a(new byte[]{69, -46, 116, 93, -113, 98, -67, 35, 65, -42, 99}, new byte[]{51, -67, 16, 2, -3, 7, -48, 66}), jSONObject7.getString(C0052e.m1418a(new byte[]{88, 102, 107, -62, -8, 57, 9, -109}, new byte[]{40, 20, 4, -91, -118, 92, 122, -32})));
                jSONObject.put(C0052e.m1418a(new byte[]{-101, -29, 43, -79, 110, -21, 13, -52, -97}, new byte[]{-19, -116, 79, -18, 15, -120, 121, -93}), jSONObject7.getString(C0052e.m1418a(new byte[]{-105, 27, -59, 43, -61}, new byte[]{-10, 120, -79, 68, -79, -106, -33, 70})));
                jSONObject.put(C0052e.m1418a(new byte[]{-8, -18, -76, -92, 86, -55, 8, 5, -19, -11, -65, -119}, new byte[]{-114, -127, -48, -5, 50, -96, 122, 96}), jSONObject7.getString(C0052e.m1418a(new byte[]{-24, -115, -85, 64, 100, 0, 43, 81}, new byte[]{-116, -28, -39, 37, 7, 116, 68, 35})));
                jSONObject.put(C0052e.m1418a(new byte[]{-100, 45, 42, -25, -22, 45, -49, 56, -113, 44, 58}, new byte[]{-22, 66, 78, -72, -119, 66, -95, 76}), jSONObject7.getString(C0052e.m1418a(new byte[]{-47, -72, 66, -112, -4, 23, 123}, new byte[]{-78, -41, 44, -28, -103, 121, 15, -44})).trim());
                jSONArray2 = new JSONArray(m270d(C0052e.m1418a(new byte[]{58, -65, -3, -46, 76, 59, 65, 79, 61, -21, -6, -46, 72, 48, 65, 70}, new byte[]{15, -118, -56, -29, 41, 9, 32, 119}), C0052e.m1418a(new byte[]{61, -3, -64, -72, 52, -35, 63, 10, 106, -6, -56, -72, 54, -38, 110, 91}, new byte[]{92, -56, -8, -114, 87, -24, 13, 57}), jSONObject7.getString(C0052e.m1418a(new byte[]{7, 71, -94, 19, -82, 17, 74, 122, 8, 65, -66}, new byte[]{105, 34, -43, 67, -62, 112, 51, 24}))));
                treeMap = new TreeMap();
                i = 0;
            } catch (Exception e) {
                e = e;
            }
            while (true) {
                int i2 = i;
                int length = jSONArray2.length();
                String m897d = atm.m897d("B1D6A1E997FDB1E2A1D097FEB1DEA1D297FAB1EDA1E297C4B1ECA1D597F8B1D8A1E297C3B1DC");
                while (true) {
                    switch (m897d.hashCode() ^ (-2140089051)) {
                        case -1411373840:
                            m897d = i2 < length ? atm.m897d("B1E0A1E997C7B1E3A1EE97C4B1E2A1EE97FEB1DDA1ED97FDB1E3A1DD97F3B1E6A1D397C0B1E6A1ED97CFB1E6A1D0") : atm.m897d("B1ECA1D297F0B1E1A1EE97C0B1E2A1EE97FCB1ECA1E297C3B1EDA1D397FAB1D8A1D397FEB1DBA1ED97C3B1DCA1D9");
                        case 670734145:
                            m897d = atm.m897d("B1E1A1D597C4B1E2A1EC97C7B1E5A1E997FFB1D2A1EF97C2B1E2A1ED97C4B1E3A1E397C0B1DEA1EE97FD");
                        case 937099567:
                            try {
                                JSONObject jSONObject8 = jSONArray2.getJSONObject(i2);
                                String string = jSONObject8.getString(C0052e.m1418a(new byte[]{64, -7, -26, 90}, new byte[]{46, -104, -117, 63, -12, -84, -106, -95}));
                                String string2 = jSONObject8.getString(C0052e.m1418a(new byte[]{90, 100}, new byte[]{51, 0, -124, -17, -61, -80, -123, -103}));
                                JSONArray jSONArray3 = jSONObject8.getJSONArray(C0052e.m1418a(new byte[]{-10, -92, -86, -70, -103, 15, 96, 80}, new byte[]{-109, -44, -61, -55, -10, 107, 5, 35}));
                                ArrayList arrayList = new ArrayList();
                                int i3 = 0;
                                while (true) {
                                    String m897d2 = atm.m897d("B1EDA1D297F0B1DAA1DE97C0B1E2A1EA97CEB1DBA1EF97C0B1E5A1D497FEB1DFA1ED97CFB1DBA1EA");
                                    while (true) {
                                        switch (m897d2.hashCode() ^ 787116014) {
                                            case -1491544018:
                                                JSONObject jSONObject9 = jSONArray3.getJSONObject(i3);
                                                String string3 = jSONObject9.getString(C0052e.m1418a(new byte[]{80, 52, -121, -101, 72}, new byte[]{36, 93, -13, -9, 45, -11, 61, 38}));
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(string3);
                                                try {
                                                    sb.append(C0052e.m1418a(new byte[]{-54}, new byte[]{-74, -20, 18, -29, 16, -87, -68, -85}));
                                                    sb.append(list.get(0));
                                                    sb.append(C0052e.m1418a(new byte[]{-93}, new byte[]{-33, 35, 59, -80, 116, 40, -107, -102}));
                                                    sb.append(string2);
                                                    sb.append(C0052e.m1418a(new byte[]{119}, new byte[]{11, -110, -53, -35, 115, 23, 67, 75}));
                                                    sb.append(jSONObject9.getString(C0052e.m1418a(new byte[]{58, -110, 35}, new byte[]{79, -32, 79, 26, 51, -112, -109, 57})));
                                                    arrayList.add(string3 + C0052e.m1418a(new byte[]{41}, new byte[]{13, -51, 21, -63, -6, -79, 103, -37}) + Base64.encodeToString(sb.toString().getBytes(), 10));
                                                    i3++;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    jSONObject2 = jSONObject5;
                                                    jSONObject5 = jSONObject2;
                                                    SpiderDebug.log(e);
                                                    return jSONObject5.toString();
                                                }
                                            case -529085355:
                                                m897d2 = atm.m897d("B1DDA1D597C4B1E2A1D497C7B1E3A1D097C2B1D6A1D497C3B1E3A1ED97FFB1DEA1D997CFB1E6A1ED97C0B1DBA1DD97F4B1E6A1D4");
                                            case 96718765:
                                                m897d2 = i3 < jSONArray3.length() ? atm.m897d("B1DEA1DD97CEB1E2A1E997F4B1ECA1ED97C7B1DCA1D397C0B1E5A1D197CEB1E2A1E397FFB1DFA1ED97C0B1DCA1DE97FDB1D1A1D7") : atm.m897d("B1E2A1D597C7B1E5A1ED97C7B1DCA1D497F9B1DEA1EF97C4B1E5A1D497F9B1E2A1D097FEB1DDA1ED97F3B1D8A1D997C4B1D8");
                                            case 1029449391:
                                                treeMap.put(string, TextUtils.join(C0052e.m1418a(new byte[]{-44}, new byte[]{-9, 108, -123, 9, -35, 4, 89, -38}), arrayList));
                                                i = i2 + 1;
                                        }
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                jSONObject2 = jSONObject5;
                            }
                            break;
                        case 1155065220:
                            try {
                                jSONObject.put(C0052e.m1418a(new byte[]{-74, 25, 14, -77, 59, 0, -16, -58, -97, 16, 24, -125, 38}, new byte[]{-64, 118, 106, -20, 75, 108, -111, -65}), TextUtils.join(C0052e.m1418a(new byte[]{-124, -28, 20}, new byte[]{-96, -64, 48, -59, 0, -109, 80, -109}), treeMap.keySet()));
                                jSONObject.put(C0052e.m1418a(new byte[]{-46, -64, 104, 26, 34, -35, 5, -62, -5, -38, 126, 41}, new byte[]{-92, -81, 12, 69, 82, -79, 100, -69}), TextUtils.join(C0052e.m1418a(new byte[]{-2, 94, 118}, new byte[]{-38, 122, 82, -102, 62, 12, -89, 57}), treeMap.values()));
                                jSONArray.put(jSONObject);
                            } catch (Exception e4) {
                                e = e4;
                            }
                            try {
                                jSONObject5.put(C0052e.m1418a(new byte[]{61, -22, 29, -88}, new byte[]{81, -125, 110, -36, -61, -26, 65, -115}), jSONArray);
                            } catch (Exception e5) {
                                e = e5;
                                SpiderDebug.log(e);
                                return jSONObject5.toString();
                            }
                    }
                }
                return jSONObject5.toString();
            }
        } catch (Exception e6) {
            SpiderDebug.log(e6);
            return "";
        }
    }

    /* renamed from: e */
    final String m269e(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), C0052e.m1418a(new byte[]{51, 49, 37}, new byte[]{114, 116, 118, -114, -76, 81, -76, -75}));
            Cipher cipher = Cipher.getInstance(C0052e.m1418a(new byte[]{66, 125, -121, -45, 14, -53, -63, -59, 83, 115, -105, -81, 120, -39, -29, -114, 103, 81, -70, -101}, new byte[]{3, 56, -44, -4, 77, -119, -126, -22}));
            cipher.init(1, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str3.getBytes()), 2);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: f */
    public final void m268f() {
        String m897d = atm.m897d("B1DCA1E297FAB1D6A1EF97F3B1E2A1D397FDB1E2A1DD97C7B1DAA1EE97F9B1E2");
        while (true) {
            switch (m897d.hashCode() ^ (-976623883)) {
                case -1969021229:
                    try {
                        JSONObject jSONObject = new JSONObject();
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        String m267g = m267g(C0052e.m1418a(new byte[]{-106, -16, -76, 100, -15, 72, 100, -76, -59, -81, -74, 53, -11, 79, 104, -74, -59, -82, -73, 54, -94, 25, 97, -32, -59, -12, -73, 99, -95, 31, 48, -25, -59, -90, -77, 100, -93, 76, 97, -78, -60, -89, -25, 55, -92, 79, 96, -76, -52, -89, -31, 108, -96, 74, 97, -70, -51, -14, -30, 55, -95, 77, 100, -79, -110, -12, -78, 103, -87, 74, 97, -28, -52, -95}, new byte[]{-12, -106, -125, 84, -112, 124, 81, -126}) + currentTimeMillis + C0052e.m1418a(new byte[]{28, -84, 51, 91, 102, -93}, new byte[]{114, -61, 71, 50, 5, -58, 121, -13}));
                        jSONObject.put(C0052e.m1418a(new byte[]{46, 87, -64, -100, -60}, new byte[]{79, 39, -80, -43, -96, 35, -76, 71}), C0052e.m1418a(new byte[]{Byte.MIN_VALUE, 107, 23, -2, 44, -64, 119, 19, -127, 106}, new byte[]{-79, 91, 39, -50, 31, -16, 71, 35}));
                        jSONObject.put(C0052e.m1418a(new byte[]{-93, 102, -123, 14}, new byte[]{-48, 15, -30, 96, 14, 125, 17, -54}), m267g);
                        jSONObject.put(C0052e.m1418a(new byte[]{-106, 66, 9, -99, 4, -80, -85, -83, -110}, new byte[]{-30, 43, 100, -8, 119, -60, -54, -64}), currentTimeMillis);
                        String m269e = m269e(C0052e.m1418a(new byte[]{-119, -83, 0, -63, -64, -73, -48, -105, -38, -14, 2, -112, -60, -80, -36, -107}, new byte[]{-21, -53, 55, -15, -95, -125, -27, -95}), C0052e.m1418a(new byte[]{-77, -104, -19, -66, 11, 122, -36, 13, -77, -62, -19, -21, 8, 124, -115, 10}, new byte[]{-126, -96, -39, -36, 57, 31, -20, 111}), jSONObject.toString());
                        String m272b = m272b(C0052e.m1418a(new byte[]{-26, 38, -116, 107, -21, 122, 79, 120, -75, 121, -114, 58, -17, 125, 67, 122, -75, 120, -113, 57, -72, 43, 74, 44, -75, 34, -113, 108, -69, 45, 27, 43}, new byte[]{-124, 64, -69, 91, -118, 78, 122, 78}));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(C0052e.m1418a(new byte[]{-67, -26, -121, 90}, new byte[]{-33, -119, -29, 35, -27, 10, 27, 72}), m269e);
                        jSONObject2.put(C0052e.m1418a(new byte[]{3, -51, 37, -52, 84, -38}, new byte[]{119, -92, 70, -89, 49, -82, 66, -124}), m272b);
                        try {
                            JSONObject jSONObject3 = new JSONObject(C0629f.m180e(C0052e.m1418a(new byte[]{-51, -119, 3, 80, -53, -84, -44, 117, -47, -111, 24, 79, -102, -83, -99, 119, -58, -100, 30, 83, -103, -22, -126, Byte.MAX_VALUE, -117, -98, 24, 77, -34, -30, -117, Byte.MAX_VALUE, -118, -117, 70, 15, -124, -16, -98, 100, -118, -111, 24, 71, -104, -19, -43, 114, -54}, new byte[]{-91, -3, 119, 32, -15, -125, -5, 22}), jSONObject2.toString(), m273a(currentTimeMillis)));
                            String m271c = m271c(jSONObject3.getString(C0052e.m1418a(new byte[]{124, 120, 40, 29, -79, 77}, new byte[]{8, 17, 75, 118, -44, 57, -68, 40})));
                            JSONObject jSONObject4 = new JSONObject(m270d(m271c.substring(0, 16), m271c.substring(16, 32), jSONObject3.getString(C0052e.m1418a(new byte[]{-58, -79, -76, -114}, new byte[]{-92, -34, -48, -9, -10, -20, 34, -80}))));
                            f1124d = System.currentTimeMillis() + (jSONObject4.getLong(C0052e.m1418a(new byte[]{49, -119, -95, -21, -36, -84, -13, -126}, new byte[]{85, -4, -45, -118, -88, -59, -100, -20})) * 1000);
                            f1123c = jSONObject4.getString(C0052e.m1418a(new byte[]{-13, 36, -102, -81}, new byte[]{-105, 69, -18, -50, -121, -77, -32, -121}));
                            m266h();
                        } catch (Exception e) {
                            SpiderDebug.log(e);
                        }
                        return;
                    } catch (Throwable th) {
                        th.printStackTrace();
                        return;
                    }
                case -833266045:
                    if (System.currentTimeMillis() <= f1124d) {
                        m897d = atm.m897d("B1D6A1DD97F8B1DBA1D797C3B1ECA1D197C3B1DDA1EC97FCB1ECA1D297FCB1E5A1D097FFB1E2A1D797C3B1E1");
                        break;
                    } else {
                        m897d = atm.m897d("B1EDA1D297CEB1E2A1E397F8B1D2A1D597F3B1DAA1E997C1B1E0A1D297FFB1D2A1ED97C7B1D8A1E397FFB1E6A1ED97C0B1D2A1D097C0");
                        break;
                    }
                case -276579326:
                    m897d = atm.m897d("B1E6A1E397FDB1E6A1D197C3B1E5A1EA97C1B1D6A1DD97F9B1D2A1D297FEB1E2A1DD97FCB1D1A1E997C4B1DCA1D097FEB1E6A1ED97F8B1DFA1D1");
                    break;
                case 1359178950:
                    return;
            }
        }
    }

    /* renamed from: g */
    final String m267g(String str) {
        int i = 0;
        try {
            byte[] digest = MessageDigest.getInstance(C0052e.m1418a(new byte[]{40, -63, 101}, new byte[]{101, -123, 80, 115, 84, 57, 47, -1})).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            int length = digest.length;
            while (true) {
                String m897d = atm.m897d("B1DEA1DE97CFB1DCA1D997F0B1DCA1E997FAB1DAA1EE97FEB1E6A1EC97F8B1D1A1EF97F0B1E2");
                while (true) {
                    switch (m897d.hashCode() ^ (-851323683)) {
                        case -708676596:
                            m897d = i < length ? atm.m897d("B1D6A1E997FFB1DEA1EC97C2B1ECA1D497FCB1D8A1EE97C1B1DDA1E997FDB1D1A1D197F8B1ECA1D597FFB1D2A1E997C0") : atm.m897d("B1D6A1EC97C4B1E2A1EC97F0B1DFA1ED97FFB1EDA1D497C4B1D2A1DD97F8B1D6A1EF97C1B1E6A1EA");
                        case -596200431:
                            String hexString = Integer.toHexString(digest[i] & 255);
                            String m897d2 = atm.m897d("B1E5A1D297C0B1E1A1D097C4B1E2A1E997C1B1D8A1D297FEB1DFA1ED97C3B1D1A1D097F4B1E0A1D5");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-891797390)) {
                                    case -1442341089:
                                        m897d2 = atm.m897d("B1D6A1EA97FDB1EDA1EE97CEB1E2A1D797FFB1ECA1ED97C4B1E5A1ED97C0B1E5A1EF97C0B1DBA1EA97C3B1DFA1EE97CFB1EDA1EC97C4B1E2A1E397C7B1DFA1ED");
                                    case -1060688437:
                                        sb.append(0);
                                        break;
                                    case 1151425932:
                                        m897d2 = hexString.length() < 2 ? atm.m897d("B1E3A1D397C0B1E2A1D397FCB1E6A1D597CFB1E3A1D197FFB1E6A1EC97F0B1DBA1E997F3B1D2A1DD97F8B1E1A1D097C7B1E1A1ED97C0") : atm.m897d("B1E1A1ED97F0B1E2A1EE97CEB1DEA1D997F9B1DFA1ED97C4B1D2A1D997CFB1EDA1D497C3B1EDA1E997C0B1D6A1D597C4B1E2A1EF97C2B1DCA1ED");
                                    case 1355976109:
                                        break;
                                }
                            }
                            sb.append(hexString);
                            i++;
                            break;
                        case 362088622:
                            m897d = atm.m897d("B1E3A1EC97FEB1E2A1E297CEB1E6A1ED97F4B1EDA1DE97F0B1D1A1D097C0B1E5A1D397C0B1D1A1EC97FA");
                        case 1764237433:
                            return sb.toString().toLowerCase();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: h */
    public final void m266h() {
        try {
            JSONObject jSONObject = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            String m267g = m267g(C0052e.m1418a(new byte[]{-48, -84, -41, 77, -120, 5, 124, 22, -47, -83, -125, 30, -113, 6, 125, 16, -39, -83, -123, 69, -117, 3, 124, 30, -40, -8, -122, 30, -118, 4, 121, 21, -121, -2, -42, 78, -126, 3, 124, 64, -39, -85, -41, 77}, new byte[]{-31, -100, -25, 125, -69, 53, 76, 38}) + f1125e + currentTimeMillis + C0052e.m1418a(new byte[]{-102, -75, -122, -51, 2, -121}, new byte[]{-12, -38, -14, -92, 97, -30, -87, -66}));
            jSONObject.put(C0052e.m1418a(new byte[]{41, -59, -78}, new byte[]{72, -95, -60, 17, 108, 48, -107, 10}), 0);
            jSONObject.put(C0052e.m1418a(new byte[]{68, 54, -114, -22, 16}, new byte[]{37, 70, -2, -93, 116, 16, -93, -5}), C0052e.m1418a(new byte[]{-126, -86, 48, 125, -106, -127, 94, 36, -125, -85}, new byte[]{-77, -102, 0, 77, -91, -79, 110, 20}));
            jSONObject.put(C0052e.m1418a(new byte[]{36, 35, 92}, new byte[]{74, 66, 42, -37, -34, -43, -60, 103}), 0);
            jSONObject.put(C0052e.m1418a(new byte[]{-71, -88, 17, -78}, new byte[]{-54, -63, 118, -36, 57, 121, 102, -73}), m267g);
            jSONObject.put(C0052e.m1418a(new byte[]{-2, -60, 116, -111, -124, 36, -73, -30, -6}, new byte[]{-118, -83, 25, -12, -9, 80, -42, -113}), currentTimeMillis);
            jSONObject.put(C0052e.m1418a(new byte[]{29, 8, 114, 117}, new byte[]{104, 101, 59, 17, 94, 51, -16, -115}), f1125e);
            String m269e = m269e(f1123c.substring(0, 16), f1123c.substring(16, 32), jSONObject.toString());
            String m272b = m272b(f1123c);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0052e.m1418a(new byte[]{69, 20, 113, 100}, new byte[]{39, 123, 21, 29, -40, 33, -73, 27}), m269e);
            jSONObject2.put(C0052e.m1418a(new byte[]{14, 63, Byte.MAX_VALUE, -20, -107, -12}, new byte[]{122, 86, 28, -121, -16, Byte.MIN_VALUE, 92, 35}), m272b);
            try {
                JSONObject jSONObject3 = new JSONObject(C0629f.m180e(C0052e.m1418a(new byte[]{29, 28, -91, -101, 28, 1, 44, 19, 1, 4, -66, -124, 77, 0, 101, 17, 22, 9, -72, -104, 78, 71, 122, 25, 91, 11, -66, -122, 9, 79, 115, 25, 90, 30, -32, -60, 83, 93, 102, 2, 90, 11, -66, -123, 64, 71, 100, 94, 17, 7}, new byte[]{117, 104, -47, -21, 38, 46, 3, 112}), jSONObject2.toString(), m273a(currentTimeMillis)));
                String m271c = m271c(jSONObject3.getString(C0052e.m1418a(new byte[]{100, 51, 23, -30, -66, 46}, new byte[]{16, 90, 116, -119, -37, 90, 98, 25})));
                JSONArray jSONArray = new JSONObject(m270d(m271c.substring(0, 16), m271c.substring(16, 32), jSONObject3.getString(C0052e.m1418a(new byte[]{66, 27, 70, 76}, new byte[]{32, 116, 34, 53, -13, -40, -36, -29})))).getJSONObject(C0052e.m1418a(new byte[]{25, -117, 7, 99}, new byte[]{125, -22, 115, 2, -30, 38, 126, 43})).getJSONArray(C0052e.m1418a(new byte[]{109, 102, -82, -122, -88, -112, -33, 94, 112, 106, -86}, new byte[]{3, 3, -39, -57, -58, -15, -77, 39}));
                this.f1126b.clear();
                int i = 0;
                while (true) {
                    String m897d = atm.m897d("B1D8A1D097FEB1E2A1E397C2B1D1A1D597CEB1DFA1EA97F4B1DBA1E397C3B1E1A1D597FEB1E3A1D997CEB1D1");
                    while (true) {
                        switch (m897d.hashCode() ^ 1426039564) {
                            case -1657415316:
                                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                                ArrayList<String> arrayList = new ArrayList<>();
                                this.f1126b.put(jSONObject4.getString(C0052e.m1418a(new byte[]{69, -28}, new byte[]{44, Byte.MIN_VALUE, 63, 31, 43, -47, 92, 88})), arrayList);
                                JSONArray jSONArray2 = jSONObject4.getJSONArray(C0052e.m1418a(new byte[]{-99, 78, 28, -78, -10, -13, 20, -33}, new byte[]{-4, 32, 125, -34, -113, Byte.MIN_VALUE, 113, -84}));
                                int i2 = 0;
                                while (true) {
                                    String m897d2 = atm.m897d("B1DFA1D097FEB1DDA1D397FDB1E0A1EF97F0B1E2A1E397CEB1E3A1D497C1B1D2A1EC97C2B1DBA1DD97F8B1D2A1ED97FAB1E5A1EF97F4B1DEA1E997C0");
                                    while (true) {
                                        switch (m897d2.hashCode() ^ (-3637114)) {
                                            case -1575493926:
                                                break;
                                            case 443560483:
                                                m897d2 = atm.m897d("B1E5A1D997C2B1D1A1E397FDB1E0A1ED97FFB1DFA1EE97C4B1E6A1D997F8B1E3A1D197F0B1E2A1ED");
                                            case 769029718:
                                                m897d2 = i2 < jSONArray2.length() ? atm.m897d("B1D8A1E297F9B1E2A1E997C4B1DFA1ED97F0B1E5A1D997CEB1DFA1E397C0B1E1A1D597FDB1DCA1D397F8B1E1A1DD97C0B1DDA1D397F0") : atm.m897d("B1EDA1D297CEB1E2A1DE97C3B1E6A1ED97CEB1DCA1EA97F3B1E2A1D597F3B1E5A1D997C0B1D6A1D997C4B1D8A1D397C7B1D6A1DD97C0B1E2A1DD97FFB1E2");
                                            case 1870986897:
                                                arrayList.add(jSONArray2.getJSONObject(i2).getString(C0052e.m1418a(new byte[]{57, -20, 104}, new byte[]{76, -98, 4, -5, -9, 92, -41, -32})));
                                                i2++;
                                        }
                                    }
                                }
                                i++;
                                break;
                            case -236231167:
                                m897d = i < jSONArray.length() ? atm.m897d("B1DDA1D797F9B1D6A1EA97F0B1E2A1DD97FCB1DBA1DD97C3B1DAA1D497F3B1ECA1EE97FA") : atm.m897d("B1E6A1E997F3B1E2A1D797CEB1EDA1D497C7B1DFA1D597FCB1E3A1D297FF");
                            case 1012624136:
                                return;
                            case 2095979502:
                                m897d = atm.m897d("B1DAA1DE97F9B1E2A1D797FEB1DEA1DD97C4B1D8A1D197C2B1ECA1ED97F9B1DCA1D097C0");
                        }
                    }
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String homeContent(boolean z) {
        JSONArray jSONArray;
        int i;
        try {
            m268f();
            JSONObject jSONObject = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            String m267g = m267g(C0052e.m1418a(new byte[]{17, 49, -54, 70, 32, 68, -33, 104, 16, 48, -98, 21, 39, 71, -34, 110, 24, 48, -104, 78, 35, 66, -33, 96, 25, 101, -101, 21, 34, 69, -38, 107, 70, 99, -53, 69, 42, 66, -33, 62, 24, 54}, new byte[]{32, 1, -6, 118, 19, 116, -17, 88}) + currentTimeMillis + C0052e.m1418a(new byte[]{-114, 121, -71, -101, 124, -89}, new byte[]{-32, 22, -51, -14, 31, -62, -24, -1}));
            jSONObject.put(C0052e.m1418a(new byte[]{-75, 34, -58, 81, 43}, new byte[]{-44, 82, -74, 24, 79, -37, -45, -13}), C0052e.m1418a(new byte[]{59, 24, -52, -74, -76, -25, -44, 69, 58, 25}, new byte[]{10, 40, -4, -122, -121, -41, -28, 117}));
            jSONObject.put(C0052e.m1418a(new byte[]{16, Byte.MIN_VALUE, 66, -124}, new byte[]{99, -23, 37, -22, -11, -3, -121, 40}), m267g);
            jSONObject.put(C0052e.m1418a(new byte[]{15, -55, -55, 92, -7, 55, 31, -21, 11}, new byte[]{123, -96, -92, 57, -118, 67, 126, -122}), currentTimeMillis);
            String m269e = m269e(f1123c.substring(0, 16), f1123c.substring(16, 32), jSONObject.toString());
            String m272b = m272b(f1123c);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0052e.m1418a(new byte[]{63, 17, -48, -88}, new byte[]{93, 126, -76, -47, -79, -75, Byte.MIN_VALUE, -41}), m269e);
            jSONObject2.put(C0052e.m1418a(new byte[]{-116, 125, -112, -82, 126, 97}, new byte[]{-8, 20, -13, -59, 27, 21, 102, -111}), m272b);
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            try {
                JSONObject jSONObject4 = new JSONObject(C0629f.m180e(C0052e.m1418a(new byte[]{24, 125, 80, 15, 10, -48, Byte.MAX_VALUE, 114, 4, 101, 75, 16, 91, -47, 54, 112, 19, 104, 77, 12, 88, -106, 41, 120, 94, 106, 75, 18, 31, -98, 32, 120, 95, Byte.MAX_VALUE, 21, 80, 69, -116, 53, 99, 95, 110, 65, 17, 66, -102, 35, 63, 20, 102}, new byte[]{112, 9, 36, Byte.MAX_VALUE, 48, -1, 80, 17}), jSONObject2.toString(), m273a(currentTimeMillis)));
                String m271c = m271c(jSONObject4.getString(C0052e.m1418a(new byte[]{61, 122, -52, 105, 118, -65}, new byte[]{73, 19, -81, 2, 19, -53, 113, 20})));
                jSONArray = new JSONObject(m270d(m271c.substring(0, 16), m271c.substring(16, 32), jSONObject4.getString(C0052e.m1418a(new byte[]{-46, -95, -47, -103}, new byte[]{-80, -50, -75, -32, 65, -68, 78, 20})))).getJSONArray(C0052e.m1418a(new byte[]{-18, -105, 32, -104, -122, -92}, new byte[]{-119, -14, 78, -22, -29, -41, 8, -2}));
                i = 0;
            } catch (JSONException e) {
            }
            while (true) {
                String m897d = atm.m897d("B1D1A1EC97F4B1E3A1DE97F0B1E6A1D097FEB1D1A1D197C4B1E2A1D197C3B1E5A1D097FFB1D2A1E397C7B1DCA1ED97FCB1DAA1ED97C0B1DDA1D597C1");
                while (true) {
                    switch (m897d.hashCode() ^ 53671396) {
                        case -2043642986:
                            JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                            String string = jSONObject5.getString(C0052e.m1418a(new byte[]{-11, -117, 2, -5}, new byte[]{-101, -22, 111, -98, -125, -40, -111, 36}));
                            int i2 = jSONObject5.getInt(C0052e.m1418a(new byte[]{30, -97, 1, -70, 16, -52}, new byte[]{106, -26, 113, -33, 89, -88, -29, -115}));
                            String m897d2 = atm.m897d("B1E3A1E297F4B1DAA1E397FCB1E0A1E397C0B1DCA1EA97FDB1D2A1E397CE");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-452613119)) {
                                    case -1568863667:
                                        m897d2 = atm.m897d("B1D6A1DD97F0B1E2A1E297C7B1DBA1ED97C2B1D2A1EA97CEB1E3A1E297C7B1DAA1DD97CFB1D8A1DD");
                                    case -1315935847:
                                        m897d2 = i2 > 0 ? atm.m897d("B1E3A1E397FEB1E2A1DD97F0B1DEA1DD97F4B1E2A1EF97C3B1DBA1ED97C7B1DCA1E397C4B1E2A1D5") : atm.m897d("B1E5A1D597FDB1E2A1D797F8B1E6A1D997CFB1E1A1EC97F8B1E3A1D597F8B1EDA1EA97FFB1DFA1E397F4B1D8A1D5");
                                    case -238938297:
                                        break;
                                    case 319936005:
                                        JSONObject jSONObject6 = new JSONObject();
                                        jSONObject6.put(C0052e.m1418a(new byte[]{79, 24, 73, 114, -9, -45, -46}, new byte[]{59, 97, 57, 23, -88, -70, -74, -50}), i2 + "");
                                        jSONObject6.put(C0052e.m1418a(new byte[]{83, 77, -107, -53, 14, 82, 85, 61, 66}, new byte[]{39, 52, -27, -82, 81, 60, 52, 80}), string);
                                        jSONArray2.put(jSONObject6);
                                        JSONObject jSONObject7 = new JSONObject();
                                        long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                                        String m267g2 = m267g(C0052e.m1418a(new byte[]{-81, -52, -79, 25, -121, 22, 108, -32, -82, -51, -27, 74, Byte.MIN_VALUE, 21, 109, -26, -90, -51, -29, 17, -124, 16, 108, -24, -89, -104, -32, 74, -123, 23, 105, -29, -8, -98, -80, 26, -115, 16, 108, -74, -90, -53}, new byte[]{-98, -4, -127, 41, -76, 38, 92, -48}) + i2 + currentTimeMillis2 + C0052e.m1418a(new byte[]{97, 81, -28, -8, 91, 21}, new byte[]{15, 62, -112, -111, 56, 112, 66, -25}));
                                        jSONObject7.put(C0052e.m1418a(new byte[]{121, 35, 9, -68, 39}, new byte[]{24, 83, 121, -11, 67, 35, 97, 112}), C0052e.m1418a(new byte[]{-107, -119, -101, 88, 56, 85, -6, -79, -108, -120}, new byte[]{-92, -71, -85, 104, 11, 101, -54, -127}));
                                        jSONObject7.put(C0052e.m1418a(new byte[]{84, 97, -38}, new byte[]{32, 8, -66, 31, 92, -12, 85, 24}), i2);
                                        jSONObject7.put(C0052e.m1418a(new byte[]{Byte.MIN_VALUE, -51, 8, 17}, new byte[]{-13, -92, 111, Byte.MAX_VALUE, 72, 104, -84, 10}), m267g2);
                                        jSONObject7.put(C0052e.m1418a(new byte[]{40, -111, -72, 22, -58, -69, 50, 79, 44}, new byte[]{92, -8, -43, 115, -75, -49, 83, 34}), currentTimeMillis2);
                                        String m269e2 = m269e(f1123c.substring(0, 16), f1123c.substring(16, 32), jSONObject7.toString());
                                        String m272b2 = m272b(f1123c);
                                        JSONObject jSONObject8 = new JSONObject();
                                        jSONObject8.put(C0052e.m1418a(new byte[]{-43, 55, -14, -73}, new byte[]{-73, 88, -106, -50, 78, 35, -75, 75}), m269e2);
                                        jSONObject8.put(C0052e.m1418a(new byte[]{-116, -48, 12, -93, -87, -113}, new byte[]{-8, -71, 111, -56, -52, -5, -94, -106}), m272b2);
                                        new JSONArray();
                                        try {
                                            JSONObject jSONObject9 = new JSONObject(C0629f.m180e(C0052e.m1418a(new byte[]{17, 92, -93, 118, -91, 126, -75, 48, 13, 68, -72, 105, -12, Byte.MAX_VALUE, -4, 50, 26, 73, -66, 117, -9, 56, -29, 58, 87, 75, -72, 107, -80, 48, -22, 58, 86, 94, -26, 41, -20, 52, -5, 33, 26, 64, -8, 101, -2, 37, -1, 52, 22, 90, -82, 40, -5, 62}, new byte[]{121, 40, -41, 6, -97, 81, -102, 83}), jSONObject8.toString(), m273a(currentTimeMillis2)));
                                            String m271c2 = m271c(jSONObject9.getString(C0052e.m1418a(new byte[]{53, -127, 50, -35, 34, -124}, new byte[]{65, -24, 81, -74, 71, -16, 42, 17})));
                                            JSONObject jSONObject10 = new JSONObject(m270d(m271c2.substring(0, 16), m271c2.substring(16, 32), jSONObject9.getString(C0052e.m1418a(new byte[]{18, -77, -3, 111}, new byte[]{112, -36, -103, 22, -99, 34, 53, -42}))));
                                            JSONArray jSONArray3 = jSONObject10.getJSONArray(C0052e.m1418a(new byte[]{33, -86, 8, -22, 101}, new byte[]{64, -40, 109, -117, 22, -76, -86, -22}));
                                            JSONArray jSONArray4 = jSONObject10.getJSONArray(C0052e.m1418a(new byte[]{-50, 121, -106, 30, 22}, new byte[]{-73, 28, -9, 108, 101, -71, 39, 101}));
                                            JSONArray jSONArray5 = jSONObject10.getJSONArray(C0052e.m1418a(new byte[]{69, -89, 21, -73}, new byte[]{49, -58, 114, -60, -49, 116, -6, -98}));
                                            JSONArray jSONArray6 = new JSONArray();
                                            JSONObject jSONObject11 = new JSONObject();
                                            jSONObject11.put(C0052e.m1418a(new byte[]{70, -25, 90}, new byte[]{45, -126, 35, -102, 13, 97, 28, -92}), C0052e.m1418a(new byte[]{26, -4, 29, -67, -5}, new byte[]{110, -99, 122, -12, -97, -6, -44, 77}));
                                            jSONObject11.put(C0052e.m1418a(new byte[]{77, -28, 87, 43}, new byte[]{35, -123, 58, 78, -84, 124, -116, 108}), C0052e.m1418a(new byte[]{-51, -68, 74, 121, 6, -81}, new byte[]{42, 13, -15, -100, -104, 36, -96, 66}));
                                            JSONArray jSONArray7 = new JSONArray();
                                            int i3 = 0;
                                            while (true) {
                                                String m897d3 = atm.m897d("B1D6A1EE97FDB1D2A1DE97C2B1DEA1E297F8B1DBA1D097C7B1D1A1E397C7");
                                                while (true) {
                                                    switch (m897d3.hashCode() ^ 1691324724) {
                                                        case -663446575:
                                                            m897d3 = i3 < jSONArray5.length() ? atm.m897d("B1EDA1EE97C4B1E6A1D797FEB1E2A1DD97F3B1D2A1D997FFB1EDA1D597F4B1E0A1EC97F9B1E2A1E997F8B1ECA1ED97F3B1DAA1D0") : atm.m897d("B1DAA1D797C4B1DDA1DE97C4B1E2A1EA97FCB1DDA1D397FFB1E3A1D497C0B1DFA1ED");
                                                        case -594168642:
                                                            JSONObject jSONObject12 = jSONArray5.getJSONObject(i3);
                                                            JSONObject jSONObject13 = new JSONObject();
                                                            try {
                                                                jSONObject13.put(C0052e.m1418a(new byte[]{123}, new byte[]{21, -87, Byte.MAX_VALUE, Byte.MIN_VALUE, 31, 46, -112, -91}), jSONObject12.getString(C0052e.m1418a(new byte[]{-54, -58, -14, -19}, new byte[]{-92, -89, -97, -120, 120, -28, -94, 17})));
                                                                jSONObject13.put(C0052e.m1418a(new byte[]{103}, new byte[]{17, -85, 8, 35, -7, -123, 126, 50}), jSONObject12.getString(C0052e.m1418a(new byte[]{79, -69}, new byte[]{38, -33, 65, -37, 81, 49, -16, 107})));
                                                                jSONArray7.put(jSONObject13);
                                                                i3++;
                                                            } catch (JSONException e2) {
                                                                continue;
                                                            }
                                                        case -273288946:
                                                            try {
                                                                jSONObject11.put(C0052e.m1418a(new byte[]{-68, 125, 103, -66, -123}, new byte[]{-54, 28, 11, -53, -32, -125, -124, 77}), jSONArray7);
                                                                jSONArray6.put(jSONObject11);
                                                                JSONObject jSONObject14 = new JSONObject();
                                                                jSONObject14.put(C0052e.m1418a(new byte[]{-115, -43, 113}, new byte[]{-26, -80, 8, 92, 50, -95, 66, -66}), C0052e.m1418a(new byte[]{-8, -101, -12, 22, 104, -103}, new byte[]{-103, -23, -111, 119, 33, -3, 17, 62}));
                                                                jSONObject14.put(C0052e.m1418a(new byte[]{-85, -19, -61, 109}, new byte[]{-59, -116, -82, 8, -43, 24, -71, 10}), C0052e.m1418a(new byte[]{98, 109, 81, 100, 112, -64}, new byte[]{-121, -15, -31, -127, -4, 122, 38, -87}));
                                                                JSONArray jSONArray8 = new JSONArray();
                                                                int i4 = 0;
                                                                while (true) {
                                                                    String m897d4 = atm.m897d("B1DCA1E997C4B1E2A1ED97C0B1DDA1ED97CEB1DEA1D097C0B1DEA1DE97F9B1E2A1ED97FF");
                                                                    while (true) {
                                                                        switch (m897d4.hashCode() ^ 1630099108) {
                                                                            case -2134859700:
                                                                                m897d4 = atm.m897d("B1D1A1ED97F0B1DAA1EA97C1B1E3A1E297F4B1E1A1DE97F9B1E5A1D197FFB1DFA1D597FCB1DFA1D997C4B1E2A1D097F4B1ECA1ED97FDB1D2A1E997C0");
                                                                            case -719646219:
                                                                                m897d4 = i4 < jSONArray3.length() ? atm.m897d("B1DFA1D997F9B1E2A1D397FEB1D2A1D197CEB1E5A1EA97FDB1E2A1E297C0B1E2") : atm.m897d("B1DFA1D497C0B1E2A1EA97CEB1E3A1D497CFB1E5A1D997F9B1DDA1ED97FDB1DAA1D997FDB1DAA1E397C0");
                                                                            case -575590271:
                                                                                jSONObject14.put(C0052e.m1418a(new byte[]{-114, -105, -72, -115, 38}, new byte[]{-8, -10, -44, -8, 67, 60, -70, 32}), jSONArray8);
                                                                                jSONArray6.put(jSONObject14);
                                                                                JSONObject jSONObject15 = new JSONObject();
                                                                                jSONObject15.put(C0052e.m1418a(new byte[]{116, 48, -48}, new byte[]{31, 85, -87, 93, -126, 18, -50, 57}), C0052e.m1418a(new byte[]{-30, -67, 99, 88, -47, 88}, new byte[]{-101, -40, 2, 42, -104, 60, -20, -16}));
                                                                                jSONObject15.put(C0052e.m1418a(new byte[]{58, 123, 15, 70}, new byte[]{84, 26, 98, 35, 10, -2, 7, -107}), C0052e.m1418a(new byte[]{111, 5, Byte.MIN_VALUE, -99, -31, -40}, new byte[]{-118, -68, 52, 121, 90, 101, 37, 97}));
                                                                                JSONArray jSONArray9 = new JSONArray();
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    int i6 = i5;
                                                                                    String m897d5 = atm.m897d("B1DEA1E997FAB1EDA1E397C0B1E2A1DE97C3B1DEA1EC97C0B1E5A1E997C1B1DBA1ED97F4B1E6A1E997C0B1EDA1D197F0B1E2A1E297C4B1DAA1DE97C2B1E6");
                                                                                    while (true) {
                                                                                        switch (m897d5.hashCode() ^ 1161953765) {
                                                                                            case -1034956095:
                                                                                                m897d5 = i6 < jSONArray4.length() ? atm.m897d("B1E3A1ED97F0B1E2A1EC97C7B1D1A1D997C3B1E2A1ED97C4B1D1A1D397C3B1D8A1D797C4") : atm.m897d("B1DBA1EA97C7B1E2A1D397C3B1DEA1D497F8B1D6A1DD97C0B1E6A1E297C2B1E1A1ED97FEB1DCA1E397F8B1E3A1E297CEB1E2");
                                                                                            case -752530204:
                                                                                                jSONObject15.put(C0052e.m1418a(new byte[]{64, -84, 86, 34, -41}, new byte[]{54, -51, 58, 87, -78, 105, -50, -101}), jSONArray9);
                                                                                                jSONArray6.put(jSONObject15);
                                                                                                jSONObject3.put(i2 + "", jSONArray6);
                                                                                                continue;
                                                                                                continue;
                                                                                            case -648099434:
                                                                                                m897d5 = atm.m897d("B1E6A1D397C4B1E2A1D097F8B1ECA1D597F0B1E3A1DD97C1B1E5A1D497FF");
                                                                                            case 307489853:
                                                                                                JSONObject jSONObject16 = jSONArray4.getJSONObject(i6);
                                                                                                JSONObject jSONObject17 = new JSONObject();
                                                                                                jSONObject17.put(C0052e.m1418a(new byte[]{21}, new byte[]{123, -81, 118, -61, -69, 107, -50, 122}), jSONObject16.getString(C0052e.m1418a(new byte[]{5, -67, 19, 2}, new byte[]{107, -36, 126, 103, -52, -71, -22, 119})));
                                                                                                try {
                                                                                                    jSONObject17.put(C0052e.m1418a(new byte[]{-65}, new byte[]{-55, Byte.MIN_VALUE, -37, 41, 46, 94, 5, -108}), jSONObject16.getString(C0052e.m1418a(new byte[]{Byte.MAX_VALUE, 37}, new byte[]{22, 65, 7, 90, -120, 9, -44, -41})));
                                                                                                    jSONArray9.put(jSONObject17);
                                                                                                    i5 = i6 + 1;
                                                                                                } catch (JSONException e3) {
                                                                                                    continue;
                                                                                                }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1648127888:
                                                                                break;
                                                                        }
                                                                    }
                                                                    JSONObject jSONObject18 = jSONArray3.getJSONObject(i4);
                                                                    JSONObject jSONObject19 = new JSONObject();
                                                                    jSONObject19.put(C0052e.m1418a(new byte[]{119}, new byte[]{25, 24, 35, -1, 21, -68, 92, -61}), jSONObject18.getString(C0052e.m1418a(new byte[]{34, -4, -46, 125}, new byte[]{76, -99, -65, 24, 21, -17, 66, 98})));
                                                                    jSONObject19.put(C0052e.m1418a(new byte[]{18}, new byte[]{100, 74, 78, -68, 68, 86, -39, -100}), jSONObject18.getString(C0052e.m1418a(new byte[]{-63, 118}, new byte[]{-88, 18, 83, -117, 27, -17, 88, 72})));
                                                                    jSONArray8.put(jSONObject19);
                                                                    i4++;
                                                                }
                                                            } catch (JSONException e4) {
                                                                continue;
                                                            }
                                                            break;
                                                        case 1742613525:
                                                            m897d3 = atm.m897d("B1E5A1D097C3B1DBA1E997FEB1E2A1DE97CEB1ECA1ED97F0B1D1A1E997C1B1D8A1D297FEB1D2A1D5");
                                                    }
                                                }
                                            }
                                        } catch (JSONException e5) {
                                            continue;
                                        }
                                        break;
                                }
                            }
                            i++;
                            break;
                        case 235288565:
                            m897d = i < jSONArray.length() ? atm.m897d("B1DAA1D197F4B1DBA1D097C0B1E2A1D997C4B1D1A1EF97C7B1E3A1EE97FEB1D8A1D497FFB1D8A1E397F8B1ECA1DE97C4B1ECA1ED") : atm.m897d("B1E5A1EF97C7B1E3A1DE97FFB1DEA1E397FCB1EDA1D197F9B1E3A1ED97FFB1E2A1EC97FAB1E0A1EE97C7B1E6A1ED");
                        case 659738570:
                            break;
                        case 1226498321:
                            m897d = atm.m897d("B1E6A1E297C4B1EDA1ED97CFB1DDA1D097FAB1ECA1D597F0B1D2A1E997F0B1DAA1EE97FEB1E2");
                    }
                }
                JSONObject jSONObject20 = new JSONObject();
                jSONObject20.put(C0052e.m1418a(new byte[]{22, 59, 42, 71, -18}, new byte[]{117, 87, 75, 52, -99, Byte.MAX_VALUE, 126, -54}), jSONArray2);
                String m897d6 = atm.m897d("B1DEA1D097C4B1E2A1D397FDB1DAA1D497F3B1E2A1ED97CFB1ECA1EA97F3B1D2A1D0");
                while (true) {
                    switch (m897d6.hashCode() ^ 1138427875) {
                        case -686759401:
                            jSONObject20.put(C0052e.m1418a(new byte[]{-63, 27, 68, 0, -77, 67, -125}, new byte[]{-89, 114, 40, 116, -42, 49, -16, 17}), jSONObject3);
                            break;
                        case 419792245:
                            if (!z) {
                                m897d6 = atm.m897d("B1DDA1D197C4B1DEA1D497F0B1DBA1E297C4B1DEA1DD97F0B1DCA1D597FEB1E2A1DD97CFB1E1A1D097FAB1E0A1EF97F9B1EDA1D997F0B1DA");
                                break;
                            } else {
                                m897d6 = atm.m897d("B1DBA1D097CFB1DAA1E297F9B1E2A1D197F4B1DAA1D997FEB1DBA1ED97C3B1ECA1D097C0B1DEA1DE97F9B1E2");
                                break;
                            }
                        case 686406583:
                            m897d6 = atm.m897d("B1DCA1E997C3B1D2A1ED97C0B1ECA1EF97FAB1E0A1D197F9B1E2A1ED97FEB1D2A1D097C3B1D8A1EE97FCB1E6A1D297F0B1DFA1ED97FDB1E2A1D5");
                            break;
                        case 1453891640:
                            break;
                    }
                }
                return jSONObject20.toString();
            }
        } catch (Exception e6) {
            SpiderDebug.log(e6);
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d1, code lost:
        continue;
     */
    @Override // com.github.catvod.spider.Dora
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String homeVideoContent() {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p044k.C0600o.homeVideoContent():java.lang.String");
    }

    @Override // com.github.catvod.spider.Dora
    public final void init(Context context, String str) {
        super.init(context, str);
        SharedPreferences sharedPreferences = context.getSharedPreferences(C0052e.m1418a(new byte[]{-11, 39, 95, 113, -12, -74, -14, -65, -13, 54, 95, 126, -16, -86}, new byte[]{-122, 87, 54, 21, -111, -60, -83, -12}), 0);
        try {
            String string = sharedPreferences.getString(C0052e.m1418a(new byte[]{-75, 43, 54, 123}, new byte[]{-64, 70, Byte.MAX_VALUE, 31, 85, 22, 70, 103}), null);
            String m897d = atm.m897d("B1D2A1D997F9B1E2A1EC97C3B1ECA1ED97C2B1E1A1E997C2B1D8A1DE97C4B1E3A1EC97F9B1ECA1DD97FDB1DEA1DD97F0B1E6A1EA97C7B1DEA1EF");
            while (true) {
                switch (m897d.hashCode() ^ (-982637734)) {
                    case -793344801:
                        break;
                    case 793255855:
                        if (string == null) {
                            m897d = atm.m897d("B1E5A1D097F9B1D6A1D397C7B1E2A1D997C7B1DFA1D297C0B1D2A1ED");
                            break;
                        } else {
                            m897d = atm.m897d("B1DCA1D997FAB1EDA1D597C2B1E1A1EE97FDB1DCA1DD97F9B1D2A1EF97C1B1E1A1D297C0B1E2A1D097FFB1E6A1ED97FCB1E1A1EF");
                            break;
                        }
                    case 1378300859:
                        m897d = atm.m897d("B1DAA1E297F8B1E0A1EC97CEB1D1A1DE97C2B1D6A1E397FFB1DDA1DD97FCB1D8A1D997C2B1ECA1E397F9B1D8A1EF97C7");
                        break;
                    case 1518813278:
                        f1125e = string;
                        break;
                }
            }
        } catch (Exception e) {
        }
        f1125e = m267g(UUID.randomUUID().toString()).toLowerCase();
        sharedPreferences.edit().putString(C0052e.m1418a(new byte[]{-62, 76, 107, -62}, new byte[]{-73, 33, 34, -90, -44, 11, -111, 97}), f1125e).commit();
        System.out.println(f1125e);
    }

    @Override // com.github.catvod.spider.Dora
    public final String playerContent(String str, String str2, List<String> list) {
        try {
            m268f();
            String[] split = new String(Base64.decode(str2, 10), 0).split(C0052e.m1418a(new byte[]{25, 108}, new byte[]{69, 16, 103, -48, -103, -19, -12, 78}));
            ArrayList<String> arrayList = this.f1126b.get(split[2]);
            JSONObject jSONObject = new JSONObject();
            String m897d = atm.m897d("B1E2A1DE97CFB1EDA1D097F0B1E6A1D097C0B1D6A1E997F4B1E5A1DE97C4B1E2A1D597FAB1D1A1DE97FDB1E6A1ED97F3B1E6A1DE97C4B1DAA1E997C0");
            while (true) {
                switch (m897d.hashCode() ^ (-1244311386)) {
                    case -887749371:
                        break;
                    case -735555688:
                        m897d = atm.m897d("B1E6A1ED97CEB1DFA1D797F4B1E1A1D797FDB1ECA1D197C7B1E3A1D397FD");
                        break;
                    case 627639136:
                        if (arrayList == null) {
                            m897d = atm.m897d("B1DCA1D797FDB1E2A1D997C4B1DCA1ED97F8B1ECA1E997C0B1DCA1DD97F0B1DDA1D497C4B1DAA1E397C0B1E2A1ED97F9B1DB");
                            break;
                        } else {
                            m897d = atm.m897d("B1E1A1DD97F0B1EDA1EA97C2B1DBA1E997C4B1ECA1D597C1B1E1A1D197C4B1E1A1EE97C0B1ECA1D397C0");
                            break;
                        }
                    case 980269622:
                        String m897d2 = atm.m897d("B1DBA1EC97FCB1DEA1E397FEB1E2A1D797F3B1DDA1EF97FFB1D8A1D297F3");
                        while (true) {
                            switch (m897d2.hashCode() ^ (-881759258)) {
                                case -712399955:
                                    if (arrayList.size() <= 0) {
                                        m897d2 = atm.m897d("B1D2A1D397FFB1E2A1D997FCB1DDA1D297F9B1ECA1ED97C7B1D2A1D497C0B1D6A1D497CFB1D6A1EC97C0B1E2A1D997FDB1DBA1ED97FEB1D8A1D497CFB1E5A1D5");
                                        break;
                                    } else {
                                        m897d2 = atm.m897d("B1E5A1EE97FDB1E2A1D797C0B1DDA1ED97F9B1E1A1ED97F9B1D6A1D597C7B1DEA1EF97C7B1D6A1D097C0B1DFA1ED97C2B1E1A1ED97FFB1D1A1D297F9");
                                        break;
                                    }
                                case 808343125:
                                    Iterator<String> it = arrayList.iterator();
                                    while (true) {
                                        String m897d3 = atm.m897d("B1D6A1EF97F9B1E2A1EF97F8B1DFA1ED97FEB1E1A1DE97FAB1E3A1D197C4B1E2A1D397C2B1D1A1E997C0B1E1A1D397F8B1DBA1D997F8B1DAA1D397F4");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ 555963478) {
                                                case -1708849489:
                                                    String next = it.next();
                                                    String m897d4 = atm.m897d("B1E6A1D497FEB1D2A1ED97F9B1E2A1EE97CFB1D8A1D197F4B1DFA1DE97C3B1D2A1ED97FAB1D6A1DD97C0");
                                                    while (true) {
                                                        switch (m897d4.hashCode() ^ 662942841) {
                                                            case -1607662884:
                                                                m897d4 = atm.m897d("B1DAA1D197C0B1ECA1EE97FDB1DCA1EA97FDB1E2A1E997F3B1DBA1ED97C7B1DEA1E2");
                                                            case -1116629061:
                                                                JSONObject jSONObject2 = new JSONObject();
                                                                long currentTimeMillis = System.currentTimeMillis() / 1000;
                                                                String m267g = m267g(C0052e.m1418a(new byte[]{-100, -111, 37, -69, -77, -72, 8, -24, -99, -112, 113, -24, -76, -69, 9, -18, -107, -112, 119, -77, -80, -66, 8, -32, -108, -59, 116, -24, -79, -71, 13, -21, -53, -61, 36, -72, -71, -66, 8, -66, -107, -106}, new byte[]{-83, -95, 21, -117, Byte.MIN_VALUE, -120, 56, -40}) + split[1] + split[0] + split[3] + currentTimeMillis + C0052e.m1418a(new byte[]{36, 109, 64, 122, -37, -59}, new byte[]{74, 2, 52, 19, -72, -96, -32, 85}));
                                                                jSONObject2.put(C0052e.m1418a(new byte[]{-110, 125, 119, 82, -64}, new byte[]{-13, 13, 7, 27, -92, -19, 9, 102}), C0052e.m1418a(new byte[]{79, 6, 125, 93, -16, 57, 89, 74, 78, 7}, new byte[]{126, 54, 77, 109, -61, 9, 105, 122}));
                                                                jSONObject2.put(C0052e.m1418a(new byte[]{-110, 114}, new byte[]{-5, 22, 87, 50, -121, -56, 62, -85}), split[1]);
                                                                jSONObject2.put(C0052e.m1418a(new byte[]{62, 45, -83, 88, -109}, new byte[]{74, 68, -39, 52, -10, -120, -108, -81}), split[0]);
                                                                jSONObject2.put(C0052e.m1418a(new byte[]{-73, -73, 86}, new byte[]{-62, -59, 58, 71, 92, -55, 112, -102}), split[3]);
                                                                jSONObject2.put(C0052e.m1418a(new byte[]{103, -48, 22, -35}, new byte[]{20, -71, 113, -77, 83, 81, 39, -2}), m267g);
                                                                jSONObject2.put(C0052e.m1418a(new byte[]{-50, 9, 24, -108, 10, -60, -57, -96, -54}, new byte[]{-70, 96, 117, -15, 121, -80, -90, -51}), currentTimeMillis);
                                                                String m269e = m269e(f1123c.substring(0, 16), f1123c.substring(16, 32), jSONObject2.toString());
                                                                String m272b = m272b(f1123c);
                                                                JSONObject jSONObject3 = new JSONObject();
                                                                jSONObject3.put(C0052e.m1418a(new byte[]{-30, 26, 77, 61}, new byte[]{Byte.MIN_VALUE, 117, 41, 68, -71, -110, 18, 57}), m269e);
                                                                jSONObject3.put(C0052e.m1418a(new byte[]{29, 9, 88, -92, 72, -102}, new byte[]{105, 96, 59, -49, 45, -18, 65, 32}), m272b);
                                                                try {
                                                                    JSONObject jSONObject4 = new JSONObject(C0629f.m180e(next, jSONObject3.toString(), m273a(currentTimeMillis)));
                                                                    String m271c = m271c(jSONObject4.getString(C0052e.m1418a(new byte[]{25, -91, 123, -60, -124, -91}, new byte[]{109, -52, 24, -81, -31, -47, 57, -109})));
                                                                    try {
                                                                        JSONObject jSONObject5 = new JSONObject(m270d(m271c.substring(0, 16), m271c.substring(16, 32), jSONObject4.getString(C0052e.m1418a(new byte[]{103, -41, 60, -49}, new byte[]{5, -72, 88, -74, 42, 49, 11, -119}))));
                                                                        String m897d5 = atm.m897d("B1E1A1EE97CEB1DCA1DE97C0B1E2A1D397C2B1DDA1D197C4B1D6A1D997FAB1D1A1D597FCB1DF");
                                                                        while (true) {
                                                                            switch (m897d5.hashCode() ^ 1146602650) {
                                                                                case -412172532:
                                                                                    m897d5 = atm.m897d("B1DDA1E397F4B1DEA1EC97C2B1ECA1D397C0B1D2A1D797FAB1DDA1ED97F9B1D1A1D297FC");
                                                                                case -278448078:
                                                                                    m897d5 = jSONObject5.optString(C0052e.m1418a(new byte[]{89, -105, -37}, new byte[]{52, -28, -68, -112, 20, -88, -7, -31}), "").equals(C0052e.m1418a(new byte[]{66, -48, 126, 56, -68, -19, 49}, new byte[]{49, -91, 29, 91, -39, -98, 66, -52})) ? atm.m897d("B1DAA1D797C0B1E2A1D297F3B1DCA1ED97C3B1E0A1D097F8B1E0A1EF97F4B1D1A1D297F3B1DCA1E397F0B1D1A1EE97CFB1D6A1E297FAB1E3A1DD97C0") : atm.m897d("B1DEA1ED97FCB1E2A1EE97FFB1E0A1D997F0B1E2A1E397C0B1E3A1D997F3B1DBA1DE97F0B1D6A1D797FAB1DCA1E397C3B1DBA1ED");
                                                                                case 115515534:
                                                                                    break;
                                                                                case 529279098:
                                                                                    String m897d6 = atm.m897d("B1E2A1D597C1B1D6A1D097FAB1DEA1D097C7B1DBA1DD97C7B1E6A1E397FCB1ECA1D097CEB1EDA1D297F0B1E2");
                                                                                    while (true) {
                                                                                        switch (m897d6.hashCode() ^ 1331842915) {
                                                                                            case -1773789774:
                                                                                                break;
                                                                                            case -1354558164:
                                                                                                m897d6 = jSONObject5.optInt(C0052e.m1418a(new byte[]{-83, -71, -91, 112}, new byte[]{-50, -42, -63, 21, -95, -33, 2, -49}), -1) == 0 ? atm.m897d("B1E0A1E997F0B1E2A1D097C3B1DFA1D797FAB1DAA1E997F9B1E2A1ED97FDB1ECA1DD97C0B1DEA1D497F9") : atm.m897d("B1E5A1D997C0B1E2A1D297C2B1ECA1ED97FEB1D2A1E397C0B1E2A1D597C4B1DFA1DD97FA");
                                                                                            case 747245313:
                                                                                                jSONObject.put(C0052e.m1418a(new byte[]{77, 1, -52, 100, -21}, new byte[]{61, 96, -66, 23, -114, -69, -27, -15}), 0);
                                                                                                try {
                                                                                                    jSONObject.put(C0052e.m1418a(new byte[]{31, -101, -14, -35, -117, 73}, new byte[]{119, -2, -109, -71, -18, 59, 14, -48}), "");
                                                                                                    jSONObject.put(C0052e.m1418a(new byte[]{-77, 121, -62, 1, -34, -11, -127}, new byte[]{-61, 21, -93, 120, -117, -121, -19, 12}), "");
                                                                                                    jSONObject.put(C0052e.m1418a(new byte[]{-20, 9, -32}, new byte[]{-103, 123, -116, -2, -116, 28, 32, -84}), jSONObject5.getString(C0052e.m1418a(new byte[]{-14, 66, 98}, new byte[]{-121, 48, 14, 126, 78, -78, 94, -78})));
                                                                                                    continue;
                                                                                                } catch (JSONException e) {
                                                                                                    break;
                                                                                                }
                                                                                            case 1834412440:
                                                                                                m897d6 = atm.m897d("B1E1A1D797F9B1E5A1D497CEB1E5A1E297FFB1EDA1D397CFB1DBA1D297C7B1E6A1D497C0B1DEA1DE97FEB1E2A1D197F9B1DCA1ED97FDB1DDA1EC");
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                    } catch (JSONException e2) {
                                                                    }
                                                                } catch (JSONException e3) {
                                                                }
                                                                break;
                                                            case -86415219:
                                                                break;
                                                            case 76094304:
                                                                m897d4 = jSONObject.has(C0052e.m1418a(new byte[]{-56, 75, -59}, new byte[]{-67, 57, -87, 34, -60, -94, 75, 107})) ? atm.m897d("B1DCA1D997F0B1E2A1D297F8B1DCA1D397C1B1DBA1EA97FFB1DEA1D297F4B1DFA1ED97F9B1E1A1D797FCB1DCA1DE97C7B1DFA1D097F9B1DF") : atm.m897d("B1D1A1EC97CEB1E3A1ED97FDB1EDA1D297F8B1DBA1D297F8B1E0A1D297CF");
                                                        }
                                                    }
                                                    break;
                                                case -1420781574:
                                                    m897d3 = atm.m897d("B1ECA1E997FDB1E0A1EA97CEB1E2A1DE97C7B1E1A1D497C2B1E3A1E997C1B1DFA1DD97C7B1DEA1ED97FAB1DD");
                                                case 362296338:
                                                    m897d3 = it.hasNext() ? atm.m897d("B1E6A1D397C7B1EDA1D197C4B1E5A1D497C0B1E0A1EC97CEB1E0A1EF97C2B1E3A1EF97F4") : atm.m897d("B1DFA1ED97C0B1E3A1E997FEB1E2A1EA97C0B1DFA1ED97FAB1D2A1D797C2B1E1A1D997C4B1EDA1D397F0B1E2A1D497C4B1E6A1ED97C1B1DBA1ED97C0");
                                                case 940801171:
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case 2085494140:
                                    m897d2 = atm.m897d("B1E5A1D497FDB1DEA1EC97C4B1DFA1D197CFB1E1A1E297FCB1DBA1D297FDB1E2A1DE97C1B1E1A1D397C4B1D1A1D297FCB1DF");
                                    break;
                                case 2114936624:
                                    break;
                            }
                        }
                        break;
                }
            }
            String m897d7 = atm.m897d("B1DCA1D397F0B1E2A1D397C0B1DEA1EE97C1B1E5A1EA97CFB1E3A1D397FDB1E1A1D197CEB1DEA1D097F9B1DFA1ED");
            while (true) {
                switch (m897d7.hashCode() ^ 1159876335) {
                    case -2093173760:
                        String m897d8 = atm.m897d("B1DEA1EC97CEB1E0A1E997C1B1E0A1E397C7B1DFA1D197FEB1E0A1EE97FDB1E2A1DD97FFB1DC");
                        while (true) {
                            switch (m897d8.hashCode() ^ (-1847138925)) {
                                case -1843069942:
                                    if (!C0652d.m143h(split[3])) {
                                        m897d8 = atm.m897d("B1DBA1EC97C4B1E2A1E297FEB1E3A1E997C7B1DFA1ED97F3B1E6A1EE97C3B1DBA1D797C1B1E1A1ED97C0B1DFA1D297FEB1E2A1ED97CFB1EDA1D297CEB1D8");
                                        break;
                                    } else {
                                        m897d8 = atm.m897d("B1DBA1EF97CEB1ECA1EC97FFB1EDA1E997FCB1D1A1DD97C0B1D8A1DD97F0B1D6A1E297C1");
                                        break;
                                    }
                                case -351234851:
                                    return "";
                                case 20586460:
                                    jSONObject.put(C0052e.m1418a(new byte[]{-14, -14, -64, -85, -27}, new byte[]{-126, -109, -78, -40, Byte.MIN_VALUE, -95, 63, 12}), 0);
                                    jSONObject.put(C0052e.m1418a(new byte[]{36, 44, -126, -37, 64, 37}, new byte[]{76, 73, -29, -65, 37, 87, -82, 28}), "");
                                    jSONObject.put(C0052e.m1418a(new byte[]{47, -28, 71, 96, 72, -8, -79}, new byte[]{95, -120, 38, 25, 29, -118, -35, -93}), "");
                                    jSONObject.put(C0052e.m1418a(new byte[]{-125, 102, -19}, new byte[]{-10, 20, -127, -27, -47, 10, 101, 18}), split[3]);
                                    return jSONObject.toString();
                                case 129404060:
                                    m897d8 = atm.m897d("B1ECA1D797C7B1ECA1E997F9B1E2A1EF97FFB1E2A1ED97F9B1E1A1E397F3B1ECA1DD97CEB1DFA1EF97F9B1D8A1E297F0B1E0A1D097C0");
                                    break;
                            }
                        }
                        break;
                    case -1583539618:
                        return jSONObject.toString();
                    case -101299544:
                        if (!jSONObject.has(C0052e.m1418a(new byte[]{112, 119, 40}, new byte[]{5, 5, 68, 51, -120, -36, 93, -17}))) {
                            m897d7 = atm.m897d("B1DFA1DE97C3B1DCA1D997FDB1D8A1D497FEB1E2A1EF97FCB1ECA1ED97C7B1D1A1E997C0");
                            break;
                        } else {
                            m897d7 = atm.m897d("B1DFA1D997FAB1EDA1D197C0B1E2A1D597C2B1E6A1ED97FDB1ECA1D797CEB1D8A1E997C0B1DFA1D497F9");
                            break;
                        }
                    case 1467869509:
                        m897d7 = atm.m897d("B1D6A1EA97C0B1E2A1EA97C3B1E3A1ED97C4B1DDA1E397C0B1E3A1D397C1");
                        break;
                }
            }
        } catch (Exception e4) {
            SpiderDebug.log(e4);
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String searchContent(String str, boolean z) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        int i;
        try {
            m268f();
            JSONObject jSONObject = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            String m267g = m267g(C0052e.m1418a(new byte[]{-122, 99, 59, 113, -1, Byte.MAX_VALUE, -102, -100, -121, 98, 111, 34, -8, 124, -101, -102, -113, 98, 105, 121, -4, 121, -102, -108, -114, 55, 106, 34, -3, 126, -97, -97, -47, 49, 58, 114, -11, 121, -102, -54, -113, 100, 58, 112, -2}, new byte[]{-73, 83, 11, 65, -52, 79, -86, -84}) + str + currentTimeMillis + C0052e.m1418a(new byte[]{71, -12, -119, 26, -23, -21}, new byte[]{41, -101, -3, 115, -118, -114, -122, 42}));
            jSONObject.put(C0052e.m1418a(new byte[]{103, -39, -109, 11, -57}, new byte[]{6, -87, -29, 66, -93, 113, 33, -15}), C0052e.m1418a(new byte[]{4, 15, -30, Byte.MAX_VALUE, -63, -72, 121, 122, 5, 14}, new byte[]{53, 63, -46, 79, -14, -120, 73, 74}));
            jSONObject.put(C0052e.m1418a(new byte[]{26, -11, 4, -23, -56, 70, 84}, new byte[]{113, -112, 125, -98, -89, 52, 48, 34}), str);
            jSONObject.put(C0052e.m1418a(new byte[]{-79, 4, 9, 79}, new byte[]{-63, 101, 110, 42, -69, 55, 7, -78}), 1);
            jSONObject.put(C0052e.m1418a(new byte[]{105, 30, 87, -36, -69, -113, 51, 85}, new byte[]{25, Byte.MAX_VALUE, 48, -71, -24, -26, 73, 48}), 12);
            jSONObject.put(C0052e.m1418a(new byte[]{-50, 111, 60, -109}, new byte[]{-67, 6, 91, -3, 24, -67, -57, -33}), m267g);
            jSONObject.put(C0052e.m1418a(new byte[]{-39, 65, -88, 124, -21, -111, 2, -44, -35}, new byte[]{-83, 40, -59, 25, -104, -27, 99, -71}), currentTimeMillis);
            String m269e = m269e(f1123c.substring(0, 16), f1123c.substring(16, 32), jSONObject.toString());
            String m272b = m272b(f1123c);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0052e.m1418a(new byte[]{-31, 47, -41, -71}, new byte[]{-125, 64, -77, -64, -3, 73, -79, -22}), m269e);
            jSONObject2.put(C0052e.m1418a(new byte[]{-21, -112, 24, -67, 24, -3}, new byte[]{-97, -7, 123, -42, 125, -119, -72, 45}), m272b);
            JSONObject jSONObject3 = new JSONObject();
            try {
                JSONObject jSONObject4 = new JSONObject(C0629f.m180e(C0052e.m1418a(new byte[]{0, 63, 74, 55, -82, 115, -81, -13, 28, 39, 81, 40, -1, 114, -26, -15, 11, 42, 87, 52, -4, 53, -7, -7, 70, 40, 81, 42, -69, 61, -16, -7, 71, 61, 15, 104, -25, 57, -31, -30, 11, 35, 17, 55, -11, 59, -27, -66, 12, 36}, new byte[]{104, 75, 62, 71, -108, 92, Byte.MIN_VALUE, -112}), jSONObject2.toString(), m273a(currentTimeMillis)));
                String m271c = m271c(jSONObject4.getString(C0052e.m1418a(new byte[]{-77, -25, 51, 126, -2, 18}, new byte[]{-57, -114, 80, 21, -101, 102, -51, -115})));
                JSONObject jSONObject5 = new JSONObject(m270d(m271c.substring(0, 16), m271c.substring(16, 32), jSONObject4.getString(C0052e.m1418a(new byte[]{79, 117, -61, -30}, new byte[]{45, 26, -89, -101, 80, -24, 113, 107}))));
                jSONArray = new JSONArray();
                jSONArray2 = jSONObject5.getJSONArray(C0052e.m1418a(new byte[]{-90, -49, 7, 53, 43, 116, 96}, new byte[]{-44, -86, 116, 64, 71, 0, 19, -125}));
                i = 0;
            } catch (JSONException e) {
            }
            while (true) {
                String m897d = atm.m897d("B1E3A1EE97C3B1ECA1D597FAB1E3A1E397C7B1E2A1D197FCB1DBA1D997F8");
                while (true) {
                    switch (m897d.hashCode() ^ (-721754501)) {
                        case -1277917253:
                            m897d = i < jSONArray2.length() ? atm.m897d("B1E3A1D297CFB1DEA1EA97C4B1D6A1DE97FFB1DEA1DD97C2B1ECA1DE97FDB1E2A1D997C4B1E6A1D797F0B1E2") : atm.m897d("B1ECA1DD97FAB1E5A1D497FCB1DCA1EC97FDB1E2A1E397F9B1D8A1D597C7B1ECA1D797FFB1E2A1ED");
                        case -1202591477:
                            break;
                        case -1097054929:
                            m897d = atm.m897d("B1D8A1E297F0B1E5A1D797CFB1E3A1ED97FEB1E2A1EF97F4B1DFA1ED97FCB1D6A1ED97FAB1DEA1DE");
                        case 900032038:
                            jSONObject3.put(C0052e.m1418a(new byte[]{-66, -51, -3, -93}, new byte[]{-46, -92, -114, -41, 8, -98, -96, -92}), jSONArray);
                            break;
                    }
                }
                return jSONObject3.toString();
                JSONObject jSONObject6 = jSONArray2.getJSONObject(i);
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put(C0052e.m1418a(new byte[]{32, -1, 104, -91, 53, 24}, new byte[]{86, -112, 12, -6, 92, 124, 1, -90}), jSONObject6.getString(C0052e.m1418a(new byte[]{-90, -78}, new byte[]{-49, -42, -23, 12, 5, 75, 59, 60})));
                jSONObject7.put(C0052e.m1418a(new byte[]{122, -78, 88, 76, -94, 83, -44, -85}, new byte[]{12, -35, 60, 19, -52, 50, -71, -50}), jSONObject6.getString(C0052e.m1418a(new byte[]{72, 15, -36, -94}, new byte[]{38, 110, -79, -57, -42, 81, 69, 95})));
                jSONObject7.put(C0052e.m1418a(new byte[]{-21, -117, -64, -116, 112, -3, 88}, new byte[]{-99, -28, -92, -45, 0, -108, 59, 105}), jSONObject6.getString(C0052e.m1418a(new byte[]{74, 89, 124}, new byte[]{58, 48, 31, 120, 68, -49, -44, 35})));
                jSONArray.put(jSONObject7);
                i++;
            }
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }
}
