package com.github.catvod.spider.merge.p053o0;

import com.github.catvod.spider.merge.atm;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.github.catvod.spider.merge.o0.b */
/* loaded from: classes.dex */
public final class C0640b {

    /* renamed from: d */
    static final Class f1225d;

    /* renamed from: a */
    protected Vector f1226a;

    /* renamed from: b */
    protected String f1227b;

    /* renamed from: c */
    protected Hashtable f1228c = new Hashtable();

    static {
        new C0640b();
        f1225d = C0640b.class;
    }

    protected C0640b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.github.catvod.spider.merge.p053o0.C0640b m159a() {
        /*
            java.lang.Class r0 = com.github.catvod.spider.merge.p053o0.C0640b.f1225d
            java.lang.String r1 = "45373F210D7523343C5A3F3D180C1316292B45150812622007160A002034440C4B5B1435062A0F1920080B0809103E1E0B190E1A3E21"
            java.lang.String r1 = com.github.catvod.spider.merge.atm.m897d(r1)     // Catch: java.lang.Exception -> Lc9
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch: java.lang.Exception -> Lc9
            if (r0 == 0) goto Lbd
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> Lc9
            r1.<init>()     // Catch: java.lang.Exception -> Lc9
        L13:
            int r2 = r0.read()     // Catch: java.lang.Exception -> Lc9
            if (r2 >= 0) goto Lb3
            r0.close()     // Catch: java.lang.Exception -> Lc9
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> Lc9
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "181F091A392A091F5A5A011D3E3B573C021E45091F073A31091F095A232A0D54021820281F16165B3A69442217191C2D06162A143E2B0F083C142F2C0508035538300B0E5A1623361E1B131B293C4A5D"
            java.lang.String r2 = com.github.catvod.spider.merge.atm.m897d(r2)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "4D"
            java.lang.String r2 = com.github.catvod.spider.merge.atm.m897d(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
            java.util.Vector r3 = new java.util.Vector
            r3.<init>()
            r3 = 0
            r4 = 0
            r6 = r4
            r5 = 0
        L4c:
            int r7 = r0.length()
            if (r5 < r7) goto L5e
            if (r6 != 0) goto L59
            com.github.catvod.spider.merge.o0.b r6 = new com.github.catvod.spider.merge.o0.b
            r6.<init>()
        L59:
            r6.f1226a = r2
            r6.f1227b = r1
            return r6
        L5e:
            r7 = 44
            int r7 = r0.indexOf(r7, r5)
            r8 = -1
            if (r7 != r8) goto L6b
            int r7 = r0.length()
        L6b:
            java.lang.String r5 = r0.substring(r5, r7)
            java.lang.Class r8 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L78
            java.lang.Object r9 = r8.newInstance()     // Catch: java.lang.Exception -> L79
            goto L7a
        L78:
            r8 = r4
        L79:
            r9 = r4
        L7a:
            if (r8 == 0) goto Lb0
            boolean r10 = r9 instanceof org.xmlpull.v1.XmlPullParser
            r11 = 1
            if (r10 == 0) goto L86
            r2.addElement(r8)
            r8 = 1
            goto L87
        L86:
            r8 = 0
        L87:
            boolean r10 = r9 instanceof com.github.catvod.spider.merge.p053o0.C0640b
            if (r10 == 0) goto L91
            if (r6 != 0) goto L92
            r6 = r9
            com.github.catvod.spider.merge.o0.b r6 = (com.github.catvod.spider.merge.p053o0.C0640b) r6
            goto L92
        L91:
            r11 = r8
        L92:
            if (r11 == 0) goto L95
            goto Lb0
        L95:
            com.github.catvod.spider.merge.o0.a r0 = new com.github.catvod.spider.merge.o0.a
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "0314191A21280B0E1317203D4A1916143F2B505A"
            java.lang.String r2 = com.github.catvod.spider.merge.atm.m897d(r2)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lb0:
            int r5 = r7 + 1
            goto L4c
        Lb3:
            r3 = 32
            if (r2 <= r3) goto L13
            char r2 = (char) r2
            r1.append(r2)     // Catch: java.lang.Exception -> Lc9
            goto L13
        Lbd:
            com.github.catvod.spider.merge.o0.a r0 = new com.github.catvod.spider.merge.o0.a     // Catch: java.lang.Exception -> Lc9
            java.lang.String r1 = "181F091A392A091F5A1B232C4A1C1500223C505A5538090C2B57333B0A77191F0803253B0F09551A3E3F440217193C2D061654037D76321716253934062A1B073F3D183C1B16383718035A182D330F5A09003E3D4A0E121438781A1B0806292A4A131705203D071F140125360D5A221820081F1616550D08235A13066C391C1B13192D3A061F"
            java.lang.String r1 = com.github.catvod.spider.merge.atm.m897d(r1)     // Catch: java.lang.Exception -> Lc9
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lc9
            throw r0     // Catch: java.lang.Exception -> Lc9
        Lc9:
            r0 = move-exception
            com.github.catvod.spider.merge.o0.a r1 = new com.github.catvod.spider.merge.o0.a
            r1.<init>(r0)
            goto Ld1
        Ld0:
            throw r1
        Ld1:
            goto Ld0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p053o0.C0640b.m159a():com.github.catvod.spider.merge.o0.b");
    }

    /* renamed from: b */
    public final XmlPullParser m158b() {
        Vector vector = this.f1226a;
        if (vector == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(atm.m897d("2C1B1901232A135A131B252C031B161C36391E13151B6C2F0B095A1C223B05170A19292C0F5A57552439195A141A38781E0813102878"));
            stringBuffer.append(this.f1227b);
            throw new C0639a(stringBuffer.toString());
        } else if (vector.size() == 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(atm.m897d("24155A032D34031E5A052D2A191F08552F340B0909103F780C150F1B287803145A"));
            stringBuffer2.append(this.f1227b);
            throw new C0639a(stringBuffer2.toString());
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            for (int i = 0; i < this.f1226a.size(); i++) {
                Class cls = (Class) this.f1226a.elementAt(i);
                try {
                    XmlPullParser xmlPullParser = (XmlPullParser) cls.newInstance();
                    Enumeration keys = this.f1228c.keys();
                    while (keys.hasMoreElements()) {
                        String str = (String) keys.nextElement();
                        Boolean bool = (Boolean) this.f1228c.get(str);
                        if (bool != null && bool.booleanValue()) {
                            xmlPullParser.setFeature(str, true);
                        }
                    }
                    return xmlPullParser;
                } catch (Exception e) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append(cls.getName());
                    stringBuffer4.append(atm.m897d("505A"));
                    stringBuffer4.append(e.toString());
                    stringBuffer4.append(atm.m897d("515A"));
                    stringBuffer3.append(stringBuffer4.toString());
                }
            }
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(atm.m897d("09150F19287804150E552F2A0F1B0E106C280B0809103E624A"));
            stringBuffer5.append((Object) stringBuffer3);
            throw new C0639a(stringBuffer5.toString());
        }
    }

    /* renamed from: c */
    public final void m157c() {
        this.f1228c.put(atm.m897d("020E0E057677450217193C2D0616541A3E3F450C4B5A283709551C102D2C1F081F0662301E1716563C2A05191F063F75041B17103F280B191F06"), new Boolean(true));
    }
}
