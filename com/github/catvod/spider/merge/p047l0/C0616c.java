package com.github.catvod.spider.merge.p047l0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p049m0.C0623c;
import com.github.catvod.spider.merge.p051n0.C0634c;
import com.github.catvod.spider.merge.p051n0.C0635d;
import com.github.catvod.spider.merge.p051n0.C0637f;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.impl.StaticLoggerBinder;

/* renamed from: com.github.catvod.spider.merge.l0.c */
/* loaded from: classes.dex */
public final class C0616c {

    /* renamed from: a */
    static volatile int f1179a;

    /* renamed from: b */
    static final C0635d f1180b = new C0635d();

    /* renamed from: c */
    static final C0277c f1181c = new C0277c();

    /* renamed from: d */
    static boolean f1182d;

    /* renamed from: e */
    private static final String[] f1183e;

    /* renamed from: f */
    private static String f1184f;

    static {
        String str = null;
        try {
            str = System.getProperty(atm.m897d("19161C4126760E1F0E102F2C26151D12292A241B1710013119171B012F30"));
        } catch (SecurityException unused) {
        }
        f1182d = str == null ? false : str.equalsIgnoreCase(atm.m897d("1E080F10"));
        f1183e = new String[]{atm.m897d("5B544C"), atm.m897d("5B544D")};
        f1184f = atm.m897d("05081D5A3F340C4E105A25351A16552638391E131939233F0D1F083725360E1F085B2F340B0909");
    }

    private C0616c() {
    }

    /* renamed from: a */
    private static final void m219a() {
        String m897d = atm.m897d("2C1B1319293C4A0E15552536190E1B1B38310B0E1F551F142C4E305500370D1D1F070A39090E150735");
        Set<URL> set = null;
        try {
            try {
                try {
                    try {
                        if (!m214f()) {
                            set = m218b();
                            m211i(set);
                        }
                        StaticLoggerBinder.getSingleton();
                        f1179a = 3;
                        m212h(set);
                    } catch (NoClassDefFoundError e) {
                        String message = e.getMessage();
                        boolean z = false;
                        if (message != null) {
                            if (!message.contains(atm.m897d("05081D5A3F340C4E105A25351A16552638391E131939233F0D1F083725360E1F08"))) {
                                if (message.contains(atm.m897d("05081D5B3F340C4E105B25351A16542638391E131939233F0D1F083725360E1F08"))) {
                                }
                            }
                            z = true;
                        }
                        if (z) {
                            f1179a = 4;
                            C0637f.m162b(atm.m897d("2C1B1319293C4A0E155520370B1E5A16203919095A57232A0D5409192A6C005413183C3444290E143831093615122B3D1838131B283D185854"));
                            C0637f.m162b(atm.m897d("2E1F1C1439341E1314126C2C055A141A61371A1F0814383105145A5D02173A535A19233F0D1F085525351A161F1829361E1B0E1C2336"));
                            C0637f.m162b(atm.m897d("391F1F55242C1E0A405A632F1D0D5406203E5E10541A3E3F45191511292B44120E18207B390E1B01253B26151D12292A28131411292A4A1C15076C3E1F080E1D292A4A1E1F012D31060954"));
                        } else {
                            f1179a = 2;
                            C0637f.m161c(m897d, e);
                            throw e;
                        }
                    }
                } catch (Exception e2) {
                    f1179a = 2;
                    C0637f.m161c(m897d, e2);
                    throw new IllegalStateException(atm.m897d("3F141F0D3C3D090E1F116C3104130E1C2D3403001B012537045A1C1425341F081F"), e2);
                }
            } catch (NoSuchMethodError e3) {
                String message2 = e3.getMessage();
                if (message2 != null && message2.contains(atm.m897d("05081D5B3F340C4E105B25351A16542638391E131939233F0D1F083725360E1F085B2B3D1E29131B2B340F0E151B6471"))) {
                    f1179a = 2;
                    C0637f.m162b(atm.m897d("19161C4126750B0A13557D765C5402556437185A1614383D18535A1C3F780314191A21280B0E1317203D4A0D130124781E1213066C3A03141E1C223F44"));
                    C0637f.m162b(atm.m897d("33150F076C3A03141E1C223F4A1309553A3D1809131A22785B544F5B797805085A102D2A06131F0762"));
                    C0637f.m162b(atm.m897d("3F0A1D072D3C0F5A031A392A4A18131B2831041D5A0123781C1F08062537045A4B5B7A761254"));
                }
                throw e3;
            }
        } finally {
            m213g();
        }
    }

    /* renamed from: b */
    static Set<URL> m218b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C0616c.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f1184f) : classLoader.getResources(f1184f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            C0637f.m161c(atm.m897d("2F08081A3E780D1F0E0125360D5A08103F371F0819103F780C0815186C280B0E12"), e);
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public static InterfaceC0614a m217c() {
        if (f1179a == 0) {
            synchronized (C0616c.class) {
                if (f1179a == 0) {
                    f1179a = 1;
                    m219a();
                    if (f1179a == 3) {
                        m210j();
                    }
                }
            }
        }
        int i = f1179a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return f1181c;
                    }
                    throw new IllegalStateException(atm.m897d("3F1408102D3B021B1819297809151E10"));
                }
                return StaticLoggerBinder.getSingleton().getLoggerFactory();
            }
            throw new IllegalStateException(atm.m897d("05081D5B3F340C4E105B00370D1D1F070A39090E1507357803145A132D31061F1E553F2C0B0E1F5B6C1718131D1C2239065A1F0D2F3D1A0E131A22781D1B0955383018150D1B6C1D2B28363C090A445A291029780B16091A6C301E0E0A4F63771D0D0D5B3F340C4E105B232A0D55191A283D195412012134490F1406393B091F09062A2D0633141C38"));
        }
        return f1180b;
    }

    /* renamed from: d */
    public static InterfaceC0615b m216d(Class<?> cls) {
        Class<?> m163a;
        InterfaceC0615b mo168a = m217c().mo168a(cls.getName());
        if (f1182d && (m163a = C0637f.m163a()) != null && (!m163a.isAssignableFrom(cls))) {
            C0637f.m162b(String.format(atm.m897d("2E1F0E102F2C0F1E5A19233F0D1F08552239071F5A18252B071B0E1624764A3D130329364A141B1829624A585F066E634A1915183C2D1E1F1E552239071F40556E7D195854"), mo168a.getName(), m163a.getName()));
            C0637f.m162b(atm.m897d("391F1F55242C1E0A405A632F1D0D5406203E5E10541A3E3F45191511292B44120E18207B06151D12292A241B1710013119171B012F304A1C15076C39045A1F0D3C340B141B01253704"));
        }
        return mo168a;
    }

    /* renamed from: e */
    public static InterfaceC0615b m215e(String str) {
        return m217c().mo168a(str);
    }

    /* renamed from: f */
    private static boolean m214f() {
        String str = null;
        try {
            str = System.getProperty(atm.m897d("001B0C14622E0F141E1A3E761F0816"));
        } catch (SecurityException unused) {
        }
        if (str == null) {
            return false;
        }
        return str.toLowerCase().contains(atm.m897d("0B141E0723310E"));
    }

    /* renamed from: g */
    private static void m213g() {
        C0635d c0635d = f1180b;
        synchronized (c0635d) {
            c0635d.m164e();
            Iterator it = ((ArrayList) c0635d.m165d()).iterator();
            while (it.hasNext()) {
                C0634c c0634c = (C0634c) it.next();
                c0634c.m169f(m215e(c0634c.getName()));
            }
        }
        LinkedBlockingQueue<C0623c> m166c = f1180b.m166c();
        int size = m166c.size();
        ArrayList arrayList = new ArrayList(128);
        int i = 0;
        while (m166c.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0623c c0623c = (C0623c) it2.next();
                if (c0623c != null) {
                    C0634c m195a = c0623c.m195a();
                    String name = m195a.getName();
                    if (m195a.m171d()) {
                        throw new IllegalStateException(atm.m897d("2E1F16102B391E1F5A19233F0D1F08552F39041415016C3A0F5A140020344A1B0E55383003095A0638391E1F54"));
                    }
                    if (!m195a.m172c()) {
                        if (m195a.m173b()) {
                            m195a.m170e(c0623c);
                        } else {
                            C0637f.m162b(name);
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c0623c.m195a().m173b()) {
                        C0637f.m162b(atm.m897d("2B5A1400213A0F085A5D") + size + atm.m897d("435A15136C34051D1D1C223F4A191B19202B4A1E0F0725360D5A0E1D297803141301253906130014383105145A052439191F5A1D2D2E0F5A181029364A131401292A091F0A01293C4A1B14116C39181F"));
                        C0637f.m162b(atm.m897d("04150D552E3D03141D553E3D1A161B0C293C445A2E1D292B0F5A1B072978190F181F293B1E5A0E1A6C2C021F5A1325341E1F081C223F4A080F19292B4A151C5538300F5A0F1B283D1816031C223F4A1615122B31041D5A06352B1E1F175B"));
                        C0637f.m162b(atm.m897d("391F1F552D3419155A1D382C1A40555A3B2F1D5409192A6C005415072B7709151E103F76020E17196F2A0F0A161435"));
                    } else if (!c0623c.m195a().m172c()) {
                        C0637f.m162b(atm.m897d("3E121F552A370616150225360D5A09103878051C5A06393A190E1301392C0F5A161A2B3F0F0809552139135A12143A3D4A181F1022780B1919103F2B0F1E"));
                        C0637f.m162b(atm.m897d("0E0F081C223F4A0E12106C3104130E1C2D3403001B012537045A0A1D2D2B0F545A39233F0D1314126C3B0B1616066C3C1F08131B2B781E121306"));
                        C0637f.m162b(atm.m897d("1A121B0629781D1F08106C36050E5A1D233605081F11627822150D103A3D18565A06393A191F0B0029361E5A161A2B3F03141D552F390616095538374A0E12103F3D"));
                        C0637f.m162b(atm.m897d("06151D12292A195A0D1C20344A0D150727780B095A1B232A071B161935780F020A102F2C0F1E54"));
                        C0637f.m162b(atm.m897d("391F1F552D3419155A1D382C1A40555A3B2F1D5409192A6C005415072B7709151E103F76020E17196F2B1F180901252C1F0E1F39233F0D1F08"));
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        f1180b.m167b();
    }

    /* renamed from: h */
    private static void m212h(Set<URL> set) {
        if (set != null) {
            if (set.size() > 1) {
                StringBuilder m635a = C0424a.m635a(atm.m897d("2B190E002D344A18131B2831041D5A1C3F78051C5A0135280F5A21"));
                m635a.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
                m635a.append(atm.m897d("37"));
                C0637f.m162b(m635a.toString());
            }
        }
    }

    /* renamed from: i */
    private static void m211i(Set<URL> set) {
        if (set.size() > 1) {
            C0637f.m162b(atm.m897d("29161B063F781A1B0E1D6C3B05140E142536195A1700202C030A16106C0B263C4E3F6C3A03141E1C223F1954"));
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                C0637f.m162b(atm.m897d("2C150F1B28780813141125360D5A131B6C03") + it.next() + atm.m897d("37"));
            }
            C0637f.m162b(atm.m897d("391F1F55242C1E0A405A632F1D0D5406203E5E10541A3E3F45191511292B44120E18207B070F16012528061F251725360E1314123F780C1508552D364A1F02052039041B0E1C233644"));
        }
    }

    /* renamed from: j */
    private static final void m210j() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f1183e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C0637f.m162b(atm.m897d("3E121F553E3D1B0F1F06383D0E5A0C103E2B03151455") + str + atm.m897d("4A18035535371F085A06203E5E105A1725360E1314126C31195A141A3878091517052D2C031816106C2F030E1255") + Arrays.asList(f1183e).toString());
            C0637f.m162b(atm.m897d("391F1F55242C1E0A405A632F1D0D5406203E5E10541A3E3F45191511292B44120E18207B1C1F080625370425171C3F350B0E191D6C3E05085A13392A1E121F076C3C0F0E1B1C202B44"));
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C0637f.m161c(atm.m897d("3F141F0D3C3D090E1F116C281815181929354A151916392A0F1E5A11392A03141D553A3D1809131A2278191B141C38214A1912102F33"), th);
        }
    }
}
