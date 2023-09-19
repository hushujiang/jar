package com.github.catvod.spider.merge.p050n;

import android.os.Build;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.github.catvod.spider.merge.n.h */
/* loaded from: classes.dex */
public final class C0631h extends SSLSocketFactory {

    /* renamed from: b */
    static String[] f1206b;

    /* renamed from: c */
    static String[] f1207c;

    /* renamed from: d */
    public static final X509TrustManager f1208d;

    /* renamed from: a */
    private final SSLSocketFactory f1209a;

    static {
        int i = 0;
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            String m897d = atm.m897d("B1DCA1D797FFB1D6A1D397FDB1E2A1D797C2B1E2A1ED97C2B1D2A1ED97C3B1D8A1E397C0B1D1A1ED97FCB1D2A1E397C0B1E2A1EA97F0B1DBA1ED97CFB1E2A1EA");
            while (true) {
                switch (m897d.hashCode() ^ 1919387457) {
                    case -1376418654:
                        LinkedList linkedList = new LinkedList();
                        String[] supportedProtocols = sSLSocket.getSupportedProtocols();
                        int length = supportedProtocols.length;
                        while (true) {
                            String m897d2 = atm.m897d("B1DBA1EF97F0B1E2A1EE97F0B1E2A1ED97FEB1DEA1D497C0B1E1A1D297F8B1D6A1D597C7B1E0A1D097FDB1E6A1D597F9B1D2A1D397C0");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-178018668)) {
                                    case -1594286667:
                                        String str = supportedProtocols[i];
                                        String m897d3 = atm.m897d("B1E1A1DD97FDB1DCA1D597F9B1E2A1E297F9B1DBA1ED97C4B1DCA1D297FFB1DFA1D397C4B1DAA1D397C0B1ECA1ED97F8B1D1A1E397C2B1D1A1D597F0B1E2");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ 699582088) {
                                                case -1565304993:
                                                    m897d3 = atm.m897d("B1D6A1D397C4B1E5A1D497CEB1E1A1D097FEB1E2A1E297CEB1E2A1D497FDB1DDA1ED97F8B1E6A1D397C0B1D1A1D297CEB1E2A1D597F8B1E2A1EE97F9B1E2");
                                                case 199928377:
                                                    break;
                                                case 1315387982:
                                                    linkedList.add(str);
                                                    break;
                                                case 1947194313:
                                                    m897d3 = !str.toUpperCase().contains(C0052e.m1418a(new byte[]{48, -44, 11}, new byte[]{99, -121, 71, 50, -118, -16, 18, 9})) ? atm.m897d("B1DDA1E997C2B1DAA1D297CEB1E2A1D397FAB1D2A1DD97C3B1E3A1D197C4B1E2A1ED97FEB1DEA1D097C0B1DCA1EC97F3B1E6A1EF97C4") : atm.m897d("B1D8A1E297C0B1ECA1D397C4B1E2A1D797C1B1D2A1ED97FDB1DCA1ED97C0B1DCA1EA97CEB1E2A1EF97FEB1E3A1E297C4B1DDA1ED");
                                            }
                                        }
                                        i++;
                                        break;
                                    case 587195499:
                                        m897d2 = atm.m897d("B1DFA1ED97FCB1DBA1D797FDB1DDA1E397C7B1E1A1EA97F9B1E2A1EE97CFB1DDA1ED97F8B1DAA1E997C3B1DBA1ED97C4B1E0A1EE97F4B1E1A1DD97C0");
                                    case 889223973:
                                        f1206b = (String[]) linkedList.toArray(new String[linkedList.size()]);
                                        String m897d4 = atm.m897d("B1DEA1D997F0B1E2A1E297C2B1DFA1ED97C3B1D2A1E397C1B1E5A1D797F8B1E1A1D097C4B1D1A1D497FDB1E3A1D5");
                                        while (true) {
                                            switch (m897d4.hashCode() ^ (-660120365)) {
                                                case -1064870419:
                                                    break;
                                                case -5330343:
                                                    List asList = Arrays.asList(C0052e.m1418a(new byte[]{-32, -97, 87, 121, 75, -62, 107, -82, -29, -102, 80, 110, 70, -48, 111, -94, -21, -31, 49, 16, 70, -42, 105, -68, -21, Byte.MIN_VALUE, 76, 103, 42, -87, 30}, new byte[]{-76, -45, 4, 38, 25, -111, 42, -15}), C0052e.m1418a(new byte[]{-23, 71, 36, 10, -89, 8, 45, 105, -22, 66, 35, 29, -86, 26, 41, 101, -30, 58, 69, 109, -86, 28, 47, 123, -30, 88, 63, 20, -57, 110, 90}, new byte[]{-67, 11, 119, 85, -11, 91, 108, 54}), C0052e.m1418a(new byte[]{109, -74, 115, 80, 4, 14, -57, -90, 124, -91, 101, 76, 5, 30, -62, -79, 110, -77, 116, 71, 30, 12, -58, -67, 102, -53, 18, 55, 30, 14, -63, -83, 102, -87, 104, 78, 115, 120, -75}, new byte[]{57, -6, 32, 15, 65, 77, -125, -18}), C0052e.m1418a(new byte[]{-62, -72, 105, 51, 124, -56, -78, -91, -45, -85, Byte.MAX_VALUE, 47, 125, -40, -73, -78, -63, -67, 110, 36, 102, -54, -77, -66, -55, -59, 8, 84, 102, -52, -75, -96, -55, -89, 114, 45, 11, -66, -64}, new byte[]{-106, -12, 58, 108, 57, -117, -10, -19}), C0052e.m1418a(new byte[]{42, -32, -100, 74, -16, -61, 87, 55, 59, -13, -118, 86, -15, -45, 82, 32, 41, -27, -101, 93, -22, -63, 86, 44, 33, -98, -6, 35, -22, -57, 80, 50, 33, -1, -121, 84, -122, -72, 39}, new byte[]{126, -84, -49, 21, -75, Byte.MIN_VALUE, 19, Byte.MAX_VALUE}), C0052e.m1418a(new byte[]{-38, 87, -115, 115, -30, -58, 103, 31, -53, 68, -116, Byte.MAX_VALUE, -26, -38, 116, 30, -38, 83, -127, 109, -30, -42, 124, 102, -68, 35, -127, 111, -27, -58, 124, 4, -58, 90, -20, 25, -111}, new byte[]{-114, 27, -34, 44, -89, -123, 35, 87}), C0052e.m1418a(new byte[]{-21, -12, -38, -50, -18, -111, -31, 42, -6, -25, -37, -62, -22, -115, -2, 39, -21, -16, -42, -48, -18, -127, -10, 95, -115, Byte.MIN_VALUE, -42, -42, -24, -97, -10, 61, -9, -7, -69, -92, -99}, new byte[]{-65, -72, -119, -111, -85, -46, -87, 110}), C0052e.m1418a(new byte[]{93, -4, -80, -37, 70, 39, 52, 105, 94, -7, -73, -52, 75, 71, 49, 115, 90, -17, -90, -64, 81, 43, 54, 116, 74, -17, -80, -52, 85}, new byte[]{9, -80, -29, -124, 20, 116, 117, 54}), C0052e.m1418a(new byte[]{-91, 14, 12, -36, -76, -93, 87, 91, -90, 11, 11, -53, -71, -79, 83, 87, -82, 115, 109, -69, -71, -77, 84, 71, -82, 17, 23, -62}, new byte[]{-15, 66, 95, -125, -26, -16, 22, 4}), C0052e.m1418a(new byte[]{-25, -102, 32, -99, -99, -35, 19, 118, -28, -97, 39, -118, -112, -49, 23, 122, -20, -28, 70, -12, -112, -51, 16, 106, -20, -123, 59, -125}, new byte[]{-77, -42, 115, -62, -49, -114, 82, 41}), C0052e.m1418a(new byte[]{40, -113, -58, -32, -42, 41, 101, 83, 57, -100, -48, -4, -41, 57, 96, 68, 43, -118, -63, -9, -52, 89, 101, 94, 47, -100, -48, -5, -42, 53, 98, 89, 63, -100, -58, -9, -46}, new byte[]{124, -61, -107, -65, -109, 106, 33, 27}), C0052e.m1418a(new byte[]{18, -72, 83, 99, -3, -42, 63, -29, 3, -85, 69, Byte.MAX_VALUE, -4, -58, 58, -12, 17, -67, 84, 116, -25, -44, 62, -8, 25, -59, 50, 4, -25, -42, 57, -24, 25, -89, 72, 125}, new byte[]{70, -12, 0, 60, -72, -107, 123, -85}), C0052e.m1418a(new byte[]{49, -20, 65, -63, 116, 100, -68, -77, 32, -1, 64, -51, 112, 120, -81, -78, 49, -24, 77, -83, 117, 98, -85, -92, 32, -28, 87, -63, 114, 101, -69, -92, 54, -24, 83}, new byte[]{101, -96, 18, -98, 49, 39, -8, -5}), C0052e.m1418a(new byte[]{123, -42, 117, -66, -6, -122, -97, 13, 106, -59, 116, -78, -2, -102, -116, 12, 123, -46, 121, -96, -6, -106, -124, 116, 29, -94, 121, -94, -3, -122, -124, 22, 103, -37}, new byte[]{47, -102, 38, -31, -65, -59, -37, 69}));
                                                    List asList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
                                                    HashSet hashSet = new HashSet(asList);
                                                    hashSet.retainAll(asList2);
                                                    hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
                                                    f1207c = (String[]) hashSet.toArray(new String[hashSet.size()]);
                                                    break;
                                                case 402241296:
                                                    if (Build.VERSION.SDK_INT >= 21) {
                                                        m897d4 = atm.m897d("B1DFA1EC97C2B1D6A1E397F9B1E2A1E397C1B1DBA1ED97CFB1D2A1EC97F9B1E2A1E9");
                                                        break;
                                                    } else {
                                                        m897d4 = atm.m897d("B1DCA1D397FDB1D8A1D497FDB1DFA1EE97CEB1E2A1D997F4B1E6A1E397F0B1E0A1DD97F4B1E1A1E297F8");
                                                        break;
                                                    }
                                                case 732413576:
                                                    m897d4 = atm.m897d("B1DEA1D597F3B1D2A1D597FCB1DFA1D397F9B1E5A1D397FDB1DFA1D097CFB1DCA1D797CEB1E1A1EC97CFB1ECA1D997C3");
                                                    break;
                                            }
                                        }
                                        break;
                                    case 1788257473:
                                        m897d2 = i < length ? atm.m897d("B1DDA1EE97FAB1E0A1D597FEB1DEA1EC97C4B1DDA1EF97FAB1DCA1D997C7") : atm.m897d("B1DCA1D197CFB1D2A1EA97C7B1E1A1EC97C0B1E6A1D597C1B1E6A1D797F3B1EDA1E297F4");
                                }
                            }
                        }
                        break;
                    case -355685283:
                        if (sSLSocket == null) {
                            m897d = atm.m897d("B1EDA1E297FFB1DDA1E397C0B1D1A1EF97F3B1E3A1D497C4B1ECA1DD");
                            break;
                        } else {
                            m897d = atm.m897d("B1D1A1E297F4B1DEA1E997F0B1E2A1D997FDB1E5A1D397FCB1E6A1D097FDB1DB");
                            break;
                        }
                    case 1916229197:
                        break;
                    case 2031728992:
                        m897d = atm.m897d("B1D6A1E297FEB1E2A1E997C4B1ECA1DD97CEB1E2A1D397C0B1E3A1D297C7B1E5A1EA97FEB1E2A1D497CEB1E2");
                        break;
                }
            }
            f1208d = new C0630g();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C0631h(X509TrustManager x509TrustManager) {
        X509TrustManager[] x509TrustManagerArr = null;
        try {
            SSLContext sSLContext = SSLContext.getInstance(C0052e.m1418a(new byte[]{100, 52, -101}, new byte[]{48, 120, -56, -45, 47, -27, -38, -24}));
            String m897d = atm.m897d("B1E1A1EC97FEB1E2A1E397F8B1DFA1D497FDB1DCA1EA97F4B1DFA1ED97C1B1D2A1EA97FFB1E5A1DD97FFB1D6A1EA97FFB1DDA1DE97FAB1E1");
            while (true) {
                switch (m897d.hashCode() ^ 1803838192) {
                    case -1948680655:
                        if (x509TrustManager == null) {
                            m897d = atm.m897d("B1D2A1DD97FCB1DFA1ED97C3B1DCA1D197C0B1DEA1EE97F9B1E2A1DD97C3B1E5");
                            break;
                        } else {
                            m897d = atm.m897d("B1DBA1E997CEB1DFA1EF97F4B1E3A1E997FFB1DAA1D297C4B1D8A1D497FEB1E2A1D397C4B1D8A1D097F8B1DFA1ED");
                            break;
                        }
                    case -1827759080:
                        break;
                    case -740590292:
                        m897d = atm.m897d("B1D6A1D497C3B1E0A1E297FEB1E3A1E297C4B1E2A1EA97F9B1DCA1EC97C4B1E2");
                        break;
                    case 409086302:
                        x509TrustManagerArr = new X509TrustManager[1];
                        x509TrustManagerArr[0] = x509TrustManager;
                        break;
                }
            }
            sSLContext.init(null, x509TrustManagerArr, null);
            this.f1209a = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private void m175a(SSLSocket sSLSocket) {
        String m897d = atm.m897d("B1DBA1E297C0B1DBA1D997FCB1EDA1E297CEB1E2A1EF97F3B1E2A1ED97F9B1DFA1E397F0B1DBA1EE");
        String[] strArr = null;
        String[] strArr2 = null;
        while (true) {
            switch ((m897d.hashCode() ^ 101) ^ 955732301) {
                case -1577447676:
                    return;
                case -1513445672:
                    String m897d2 = atm.m897d("B1E2A1D297F4B1E1A1D997FDB1DDA1ED97CFB1D8A1EE97C7B1DEA1D497C0B1E2A1E397C1B1D8A1ED97FEB1E2A1D097C3B1ED");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-1129684300)) {
                            case -808993194:
                                m897d2 = Build.VERSION.SDK_INT < 21 ? atm.m897d("B1D2A1DD97C4B1E2A1D197FDB1D2A1ED97C1B1E5A1DD97C2B1E2A1D397C0B1DBA1D097C2B1E2A1D497FFB1E2") : atm.m897d("B1D1A1DE97C7B1E5A1E397C4B1DCA1EC97FDB1E2A1E297FEB1DFA1DD97F9B1EC");
                            case -54326209:
                                m897d2 = atm.m897d("B1DAA1D197C7B1ECA1DE97CEB1DEA1E297C4B1E2A1D597FAB1E2A1E997CFB1DCA1ED97F8B1D2A1D797FDB1DBA1E9");
                            case 546885056:
                                m897d = atm.m897d("B1E6A1D297FEB1E5A1E997FFB1EDA1DE97CEB1DFA1D297C3B1EDA1D997FFB1DFA1D5");
                                continue;
                            case 716422471:
                                break;
                        }
                    }
                    break;
                case -1508270984:
                    m897d = atm.m897d("B1DAA1D597C3B1DDA1D597F8B1D6A1D997C3B1DEA1EA97C7B1D6A1EA97C3B1EDA1E397F0B1D6A1D997F9B1E2A1EE97F4B1DF");
                    continue;
                case -1437512209:
                    strArr = f1207c;
                    m897d = atm.m897d("B1DAA1EF97F9B1E1A1D297F0B1E2A1E997FAB1DEA1E297CEB1ECA1ED97C2B1D2A1D3");
                    continue;
                case -990980303:
                    String m897d3 = atm.m897d("B1D1A1EF97C0B1E2A1EF97FEB1DFA1EF97C3B1D2A1E997CFB1D2A1EA97C3B1E1");
                    while (true) {
                        switch (m897d3.hashCode() ^ 547324977) {
                            case -494978018:
                                m897d3 = strArr2 != null ? atm.m897d("B1E3A1D097CFB1DBA1D297F9B1E2A1E997F0B1ECA1ED97CEB1DEA1EE97FEB1D8A1D297F0B1E5A1E997CFB1D2A1ED97F0B1ECA1D2") : atm.m897d("B1DDA1EA97C7B1E2A1EE97FAB1DAA1EE97FCB1DCA1EA97C4B1E2A1EA97FFB1DEA1EC97C3B1E0A1E297C3B1E6A1ED97FEB1E3A1D497F4B1DDA1D5");
                            case 611525245:
                                m897d = atm.m897d("B1E2A1D297F3B1DEA1D397FCB1E3A1EF97F0B1DEA1EF97CEB1DFA1D597F0B1D8A1D197F8B1DCA1D997C0B1E2A1EC97C4B1DDA1ED97F9B1DEA1EF");
                                continue;
                            case 1702099208:
                                m897d = atm.m897d("B1DCA1EA97C0B1EDA1DD97C1B1DDA1D497FDB1E2A1D397FAB1E5A1DE97FAB1E3A1D197C4B1DFA1EA97CFB1E2A1ED");
                                continue;
                                continue;
                            case 2137456082:
                                m897d3 = atm.m897d("B1DFA1DE97C1B1E0A1DD97C0B1DFA1EF97FDB1E2A1E397C4B1D2A1ED97F3B1D6A1D597F0B1DBA1E397F8B1DBA1D5");
                        }
                    }
                    break;
                case -525820140:
                    String m897d4 = atm.m897d("B1E3A1EA97CFB1E2A1EF97C4B1E5A1D197F8B1DEA1E297F3B1EDA1E397F9B1E2");
                    while (true) {
                        switch (m897d4.hashCode() ^ 1423273450) {
                            case -1833543005:
                                m897d4 = atm.m897d("B1E1A1EE97C2B1DCA1D597F0B1DAA1E297FDB1E2A1ED97FCB1E1A1E997CFB1EDA1DE97FCB1E1A1E297FAB1D8");
                            case -282988630:
                                m897d = atm.m897d("B1DFA1EE97C3B1E0A1E997C2B1D2A1D797CEB1E0A1D497FAB1E2A1D497CEB1E2");
                                continue;
                            case 1080778218:
                                break;
                            case 1722852150:
                                m897d4 = strArr != null ? atm.m897d("B1DCA1E997FCB1E2A1EF97C1B1D1A1D497F4B1ECA1EC97C4B1E0A1D197C7") : atm.m897d("B1DCA1D197C7B1D8A1EA97FFB1E0A1D597FFB1D2A1E397C1B1E1A1DD97C0B1D8A1DD97CEB1E2");
                        }
                    }
                    break;
                case -46187547:
                    sSLSocket.setEnabledProtocols(strArr2);
                    m897d = atm.m897d("B1DCA1EA97C0B1EDA1DD97C1B1DDA1D497FDB1E2A1D397FAB1E5A1DE97FAB1E3A1D197C4B1DFA1EA97CFB1E2A1ED");
                    continue;
                case 22533039:
                    String[] strArr3 = f1206b;
                    m897d = atm.m897d("B1DFA1E997CEB1DBA1E397CFB1ECA1D497C0B1E5A1D197CEB1E2A1DD97F8B1DBA1ED97F3B1ECA1E997C0B1E6A1D197C1B1E6A1D097C4B1E1A1DE");
                    strArr2 = strArr3;
                    continue;
                case 393243954:
                    m897d = atm.m897d("B1ECA1E997C1B1D2A1D197C0B1E2A1EE97C3B1ECA1ED97C0B1DFA1EF97C0B1E0A1D797C4B1DDA1DD97C0B1E2A1EF97F4B1DFA1ED97FEB1E2");
                    continue;
                case 1045348341:
                    sSLSocket.setEnabledCipherSuites(strArr);
                    m897d = atm.m897d("B1E3A1EC97C7B1D8A1E397FAB1E5A1EF97C1B1DDA1D297F8B1E1A1EF97F0B1E2A1E997C0B1D2");
                    continue;
            }
            m897d = atm.m897d("B1E3A1EC97C7B1D8A1E397FAB1E5A1EF97C1B1DDA1D297F8B1E1A1EF97F0B1E2A1E997C0B1D2");
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket socket = null;
        String m897d = atm.m897d("B1DEA1ED97F9B1EDA1EC97F9B1E2A1EA97F4B1E5A1EF97F0B1E6A1ED97F3B1DBA1E997C2B1DCA1ED97C2B1E1A1EC");
        while (true) {
            switch ((m897d.hashCode() ^ 403) ^ (-1665446829)) {
                case -981328551:
                    m175a(socket);
                    m897d = atm.m897d("B1E2A1E397F8B1E5A1D097FEB1E2A1D297F0B1E2A1D997C0B1ECA1D597F4B1DCA1ED97CFB1D1");
                    break;
                case -426831734:
                    String m897d2 = atm.m897d("B1DCA1E297CFB1EDA1EC97FEB1D1A1D797F8B1ECA1EC97F4B1E3A1DE97C7B1D8A1EE97C7");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-627441200)) {
                            case -2120114873:
                                m897d = atm.m897d("B1E2A1E397F8B1E5A1D097FEB1E2A1D297F0B1E2A1D997C0B1ECA1D597F4B1DCA1ED97CFB1D1");
                                continue;
                            case -1610042505:
                                m897d = atm.m897d("B1DDA1D197C2B1E6A1EA97C0B1E1A1EE97C1B1D2A1EF97F4B1E3A1E297F4B1E6A1DD97C0B1D6A1DD97C1B1D6A1EA");
                                continue;
                            case 19444903:
                                m897d2 = socket instanceof SSLSocket ? atm.m897d("B1E6A1ED97C4B1E2A1EC97F8B1DEA1D597C0B1D2A1EE97C3B1DEA1D097F9B1E2A1DE97FEB1E3A1D397C3B1DF") : atm.m897d("B1EDA1DE97CEB1E2A1D597C7B1EDA1D997FDB1E6A1ED97C7B1D8A1EE97C1B1DBA1E997F0B1D1A1DE97C7B1DBA1D397FCB1E0A1DD97F3B1E5");
                            case 143651653:
                                m897d2 = atm.m897d("B1DAA1EC97C1B1D8A1E397C1B1E1A1D497FFB1E5A1EF97CEB1DAA1E997F3B1E1A1D397FA");
                        }
                    }
                    break;
                case 1809717980:
                    m897d = atm.m897d("B1E1A1D297F0B1E2A1D597FEB1E6A1D297F4B1E3A1ED97C4B1DBA1D297FDB1D2A1ED97C1B1DEA1D2");
                    break;
                case 1868517820:
                    m897d = atm.m897d("B1ECA1D497F4B1D6A1D797C0B1E3A1EA97CEB1E2A1E297CEB1DCA1ED97FDB1DEA1EA97CFB1D6A1E2");
                    break;
                case 1888300970:
                    socket = this.f1209a.createSocket(str, i);
                    m897d = atm.m897d("B1E1A1D197FCB1DFA1E997CEB1DDA1D797FCB1D6A1E397C0B1DCA1D497F9B1E2A1DE97FFB1DB");
                    break;
                case 1918637547:
                    m897d = atm.m897d("B1E0A1E397FCB1D1A1E297C4B1E2A1E997FDB1ECA1D397FFB1DAA1D797CFB1DB");
                    break;
                case 2021468895:
                    return socket;
            }
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket socket = null;
        String m897d = atm.m897d("B1E5A1D597CFB1D8A1D297CFB1E0A1ED97F8B1D2A1D997C3B1D6A1DD97C1B1DCA1EF97CFB1E0A1E297CE");
        while (true) {
            switch ((m897d.hashCode() ^ 647) ^ 913855027) {
                case -1557744019:
                    m897d = atm.m897d("B1E5A1DD97CEB1E2A1D797F8B1D6A1D797FDB1D8A1EC97C1B1DEA1D497CFB1DCA1D397FAB1DCA1ED97C7B1D6A1D097FCB1D1A1E2");
                    break;
                case -291639462:
                    m897d = atm.m897d("B1E1A1E297CEB1E2A1D797F9B1E5A1D797F0B1DCA1ED97C2B1D8A1D397C4B1DAA1D097C2B1D1");
                    break;
                case -184058726:
                    m897d = atm.m897d("B1DEA1DE97C1B1DAA1D297F4B1E0A1D097C0B1E5A1DD97CFB1E3A1EF97C4B1D1A1D397F4B1E1A1D197FEB1E2A1D097C2B1DEA1E397F0B1D2");
                    break;
                case 402219386:
                    m897d = atm.m897d("B1D2A1E397F9B1DBA1D097F9B1E2A1D197FAB1EDA1E397CFB1D1A1D497C0B1DBA1E297C3B1DCA1ED97FCB1D8A1DE97F3B1DFA1ED97C0B1EDA1EA");
                    break;
                case 476540367:
                    String m897d2 = atm.m897d("B1D6A1D097F9B1E2A1ED97C3B1DBA1ED97FEB1D2A1DE97F8B1DDA1D497C0B1EDA1D597CEB1E0A1EA97C0B1E2A1D097CEB1DBA1ED97C1B1DAA1DD97CEB1DCA1D9");
                    while (true) {
                        switch (m897d2.hashCode() ^ 750812059) {
                            case -1569119122:
                                m897d = atm.m897d("B1D6A1ED97FEB1E2A1DD97F8B1E2A1D197C7B1DBA1ED97C0B1DCA1D297C0B1D2A1D797C1B1EDA1DE97FDB1E2");
                                continue;
                            case -986698804:
                                m897d2 = atm.m897d("B1E3A1E997C7B1DDA1D297FDB1E2A1EE97F4B1DBA1D597FAB1D2A1EE97CEB1E6A1ED97F0B1D2A1D3");
                            case -408333309:
                                m897d2 = socket instanceof SSLSocket ? atm.m897d("B1D2A1D097FDB1DDA1E997CEB1E2A1D997C0B1E6A1ED97CFB1DFA1ED97C0B1D8A1EF97FC") : atm.m897d("B1D1A1D997CFB1DAA1D197C0B1E2A1EE97F8B1E3A1D297C2B1DDA1D797F9B1E6A1ED");
                            case 370289009:
                                m897d = atm.m897d("B1E2A1E397F9B1E2A1EC97F3B1D8A1EA97C3B1E2A1ED97FEB1E3A1E997F9B1DFA1E397C0B1E6A1EF97C2B1DBA1EE97FDB1E2A1ED97F9B1E2A1DE97CEB1D2A1ED");
                                continue;
                        }
                    }
                    break;
                case 744052775:
                    return socket;
                case 791257686:
                    m897d = atm.m897d("B1EDA1D597FAB1D1A1D197C4B1E5A1EA97FDB1E2A1E997F3B1ECA1ED97FEB1DFA1D3");
                    break;
                case 913531352:
                    socket = this.f1209a.createSocket(str, i, inetAddress, i2);
                    m897d = atm.m897d("B1E6A1D197CFB1DAA1D097C4B1E6A1E997C7B1E3A1D597F4B1D8A1D497C1B1ECA1D497F8B1EDA1E297FC");
                    break;
                case 1386275917:
                    m175a(socket);
                    m897d = atm.m897d("B1D6A1ED97FEB1E2A1DD97F8B1E2A1D197C7B1DBA1ED97C0B1DCA1D297C0B1D2A1D797C1B1EDA1DE97FDB1E2");
                    break;
            }
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket socket = null;
        String m897d = atm.m897d("B1D1A1E397FEB1D8A1D297C3B1E2A1D797FEB1E2A1D397C3B1DCA1ED97FAB1E2A1DD97C0B1DEA1EA97FFB1DAA1D597C2B1D2A1D197CEB1E2");
        while (true) {
            switch ((m897d.hashCode() ^ 287) ^ (-443191008)) {
                case -1767135912:
                    m897d = atm.m897d("B1E1A1DE97C1B1DFA1D997C0B1E2A1E997C0B1ECA1ED97F0B1DAA1D097FAB1DDA1D497F3B1D1A1E9");
                    break;
                case -1163516512:
                    m897d = atm.m897d("B1D8A1E997CEB1D2A1ED97CEB1DEA1D397F0B1E2A1E997FAB1D8A1ED97C0B1E2A1D397C0B1DDA1ED");
                    break;
                case -1056848497:
                    m897d = atm.m897d("B1D1A1EA97CFB1DBA1D797FAB1D1A1D797FEB1DCA1E997F0B1D6A1D197C3B1ECA1D197CF");
                    break;
                case 258419332:
                    socket = this.f1209a.createSocket(inetAddress, i);
                    m897d = atm.m897d("B1E0A1DE97F0B1E2A1EF97C0B1E1A1D997FEB1DDA1D397FAB1DEA1E297F4B1E6A1ED97CEB1DBA1E2");
                    break;
                case 484737028:
                    m175a(socket);
                    m897d = atm.m897d("B1DBA1EC97C1B1D6A1D597C7B1DAA1EC97C2B1D2A1D797F9B1E2A1EF97CEB1DCA1ED97FAB1D6A1EC97C0B1DCA1D497C0B1D8A1D197F0B1E2");
                    break;
                case 700564879:
                    return socket;
                case 1948374555:
                    String m897d2 = atm.m897d("B1E0A1EA97F4B1DFA1EF97C7B1D1A1D197FFB1E0A1EF97C0B1DBA1D9");
                    while (true) {
                        switch (m897d2.hashCode() ^ 758335412) {
                            case -1765981184:
                                m897d2 = atm.m897d("B1DEA1E397CFB1E5A1D097C1B1DDA1D497FEB1E2A1EC97FEB1DBA1ED97C1B1DFA1D497F0B1DCA1E397C0B1EDA1DD97C4B1E5A1EF97C4B1E2A1D097CFB1E1");
                            case -757560916:
                                m897d2 = socket instanceof SSLSocket ? atm.m897d("B1DEA1EF97F9B1E2A1D597FFB1DCA1ED97C7B1DBA1D497FCB1DFA1ED97CEB1DDA1DD97C0B1D2A1E397F3B1E3A1D497FAB1DBA1EC97F4B1EDA1E297C4B1E2") : atm.m897d("B1E6A1EF97C2B1ECA1D497F0B1E2A1E297F8B1D6A1D597C1B1DBA1D397C1B1DCA1D797CEB1D2A1ED97F0B1DBA1DD97C0");
                            case -435802960:
                                m897d = atm.m897d("B1DBA1EC97C1B1D6A1D597C7B1DAA1EC97C2B1D2A1D797F9B1E2A1EF97CEB1DCA1ED97FAB1D6A1EC97C0B1DCA1D497C0B1D8A1D197F0B1E2");
                                continue;
                            case -57541846:
                                m897d = atm.m897d("B1E3A1D197C0B1E2A1D597C0B1D8A1DD97CFB1DBA1D097C4B1DEA1D297FFB1E2A1E997C1");
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket socket = null;
        String m897d = atm.m897d("B1DBA1D997C1B1DEA1D297C7B1DBA1DD97F3B1D2A1D597C1B1DBA1EA97CEB1E2A1EA97FFB1E2A1D797FDB1DE");
        while (true) {
            switch ((m897d.hashCode() ^ 918) ^ 1284468274) {
                case -1788585207:
                    m897d = atm.m897d("B1D6A1DE97FDB1D8A1EE97C4B1DDA1EC97FCB1D6A1D997C7B1E6A1E397FCB1D6A1E997F4B1DCA1EA97C2B1E2A1ED");
                    break;
                case -1728491715:
                    m897d = atm.m897d("B1ECA1D797FEB1E2A1D997C2B1DFA1ED97F4B1E2A1EC97FAB1EDA1E997C0B1E1A1ED97F9B1DDA1E397F4B1D1A1D497F8B1E2A1E2");
                    break;
                case -1660430290:
                    m175a(socket);
                    m897d = atm.m897d("B1D8A1EA97C1B1E2A1ED97C3B1EDA1D497C0B1E0A1D597FDB1E1A1D397C4B1D6A1D797C2");
                    break;
                case -1622670472:
                    m897d = atm.m897d("B1E3A1E397CEB1DEA1E297F3B1D8A1DE97F8B1DEA1E297C7B1E0A1E297F4B1D8A1D597C0B1E2A1DD97CEB1DFA1D397F9");
                    break;
                case -234465033:
                    socket = this.f1209a.createSocket(inetAddress, i, inetAddress2, i2);
                    m897d = atm.m897d("B1D8A1DE97C2B1DBA1EE97FAB1D8A1EF97FEB1DDA1E297F0B1E2A1EE97C2B1DCA1ED97F4B1DCA1D397FEB1DCA1EE");
                    break;
                case 356803891:
                    String m897d2 = atm.m897d("B1E6A1D997F4B1DAA1D297CFB1EDA1E397F0B1E2A1EC97FEB1E2A1ED97FCB1E6A1E297CFB1D6A1DE");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-1406292454)) {
                            case -2135409974:
                                m897d = atm.m897d("B1D8A1EA97C1B1E2A1ED97C3B1EDA1D497C0B1E0A1D597FDB1E1A1D397C4B1D6A1D797C2");
                                continue;
                            case -1282256396:
                                m897d = atm.m897d("B1DAA1D397C3B1D6A1DD97C0B1DDA1EC97F4B1E6A1EC97F0B1E3A1DE");
                                continue;
                            case -834886851:
                                m897d2 = socket instanceof SSLSocket ? atm.m897d("B1E6A1D297F9B1DCA1EE97F9B1D8A1D097F8B1E5A1DE97C0B1E2A1E397C1B1ECA1ED97F9B1E0A1D097C0B1E3A1EE") : atm.m897d("B1DCA1EF97F8B1DFA1E397C3B1E6A1DD97FFB1E3A1D397C3B1DCA1D0");
                            case -213696196:
                                m897d2 = atm.m897d("B1DEA1E997CEB1E2A1E997C7B1DDA1EC97F3B1D6A1D197C4B1DAA1EA97F8B1E2A1D797F0B1D2A1ED97F0B1D6A1D2");
                        }
                    }
                    break;
                case 451173141:
                    m897d = atm.m897d("B1E5A1D797C3B1DFA1D097F9B1DFA1D597C4B1E2A1EF97C7B1D8A1D497C1B1D2A1E397C3B1DF");
                    break;
                case 696353281:
                    m897d = atm.m897d("B1DAA1EF97CEB1E2A1D797C2B1ECA1DD97F9B1D6A1D797FDB1E2A1DD97C1B1D1A1DD97FDB1E2A1EA97F9B1EDA1EC97FAB1D6");
                    break;
                case 2125859495:
                    return socket;
            }
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket socket2 = null;
        String m897d = atm.m897d("B1E6A1D497C3B1D2A1D297C7B1D8A1EE97CEB1E2A1D997FDB1DCA1EA97C0B1E2A1D997C0B1D8");
        while (true) {
            switch ((m897d.hashCode() ^ 718) ^ 1897597999) {
                case -1784095307:
                    return socket2;
                case -1558246197:
                    m897d = atm.m897d("B1EDA1EF97C3B1D8A1E297C2B1DCA1D597CFB1E6A1D397FDB1E2A1D597C0B1DAA1EA97C0B1D1A1D497F0B1E2");
                    break;
                case 102368590:
                    socket2 = this.f1209a.createSocket(socket, str, i, z);
                    m897d = atm.m897d("B1E2A1E997C0B1E2A1E297FEB1ECA1ED97C4B1E1A1D397C2B1DFA1D497F8B1D6A1D0");
                    break;
                case 214276606:
                    m897d = atm.m897d("B1DBA1ED97F9B1DDA1D397FDB1E2A1EA97C3B1E6A1ED97C7B1EDA1DE97CEB1ECA1DE97FDB1D8A1ED97FFB1D2A1E997C0B1E2A1D197FC");
                    break;
                case 412515931:
                    m897d = atm.m897d("B1D6A1E997C7B1DFA1D297CEB1E2A1D097F3B1D2A1EE97F3B1D2A1ED97FAB1DAA1EF");
                    break;
                case 495774804:
                    m175a(socket2);
                    m897d = atm.m897d("B1D8A1E397F9B1E2A1D997CFB1DBA1EA97C0B1D2A1DE97FEB1D6A1D797FCB1E0A1EA97FFB1E6A1EE97FFB1DFA1ED97F4B1E2A1D297C0B1E3A1D997C4B1E2");
                    break;
                case 656404148:
                    String m897d2 = atm.m897d("B1E5A1D097CEB1DFA1EC97CFB1DCA1D197FEB1E2A1E997F4B1DBA1EA97C4B1E1A1D397C2B1E2A1EF97FAB1DEA1D397CFB1E1A1D797F3");
                    while (true) {
                        switch (m897d2.hashCode() ^ 2024810766) {
                            case -1892816475:
                                m897d2 = socket2 instanceof SSLSocket ? atm.m897d("B1E6A1E397F0B1E1A1D297C0B1DDA1D997C4B1E2A1D397C4B1D2A1D297CFB1DAA1E297FDB1D6A1EE97F0B1E6A1ED") : atm.m897d("B1ECA1D997C0B1D8A1D997FDB1E2A1D497CEB1D1A1EC97C0B1E1A1E297CFB1E2A1ED97F0B1D2A1EC97CFB1DBA1E297F8B1E0");
                            case -1055062477:
                                m897d = atm.m897d("B1E0A1E397C7B1D2A1DE97C7B1E1A1D097FCB1E2A1D297F8B1ECA1E997F3");
                                continue;
                            case 145769604:
                                m897d2 = atm.m897d("B1DCA1D297F0B1E2A1D197CFB1DDA1E297C2B1DCA1ED97C0B1E2A1D397C4B1E3A1ED97F0B1E5A1D4");
                            case 1928786013:
                                m897d = atm.m897d("B1D8A1E397F9B1E2A1D997CFB1DBA1EA97C0B1D2A1DE97FEB1D6A1D797FCB1E0A1EA97FFB1E6A1EE97FFB1DFA1ED97F4B1E2A1D297C0B1E3A1D997C4B1E2");
                                continue;
                        }
                    }
                    break;
                case 767977772:
                    m897d = atm.m897d("B1D8A1EC97FDB1E2A1D197C4B1DFA1ED97FFB1E3A1D797FEB1DDA1DD97C0B1D2A1E297C1B1E2A1D297C4");
                    break;
                case 1593988909:
                    m897d = atm.m897d("B1D6A1E297F0B1DAA1E397F9B1E1A1D297F9B1E1A1EE97FDB1DAA1EF97C0B1D6A1EC97F8B1E6A1D497F9B1E2A1E297CEB1D2A1ED97F0B1ECA1E3");
                    break;
            }
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        String m897d = atm.m897d("B1E5A1EC97C0B1DFA1D597CEB1DDA1DD97C4B1E2A1D497CFB1D2A1ED97F9B1D6A1EF97FEB1DCA1D2");
        while (true) {
            switch ((m897d.hashCode() ^ 58) ^ (-1738554655)) {
                case -484711261:
                    m897d = atm.m897d("B1D8A1EE97F0B1D1A1E397FCB1EDA1D097C0B1DAA1EE97FDB1DEA1D197C0B1E2");
                    break;
                case 1117295857:
                    return f1207c;
            }
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String m897d = atm.m897d("B1DAA1D197FCB1DDA1D097FFB1E2A1DE97F4B1D6A1DD97F8B1DDA1D797C1");
        while (true) {
            switch ((m897d.hashCode() ^ 809) ^ 1104083132) {
                case 1276602779:
                    return f1207c;
                case 1649140415:
                    m897d = atm.m897d("B1E3A1E997F4B1D6A1D597FDB1E2A1DD97C4B1D2A1ED97CFB1DEA1E397C0B1D1A1E397C0B1E2");
                    break;
            }
        }
    }
}
