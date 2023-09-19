package com.github.catvod.spider.merge.p038h;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.atm;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.h.a */
/* loaded from: classes.dex */
public final class C0543a {

    /* renamed from: A */
    private String f961A;

    /* renamed from: B */
    private String f962B;

    /* renamed from: C */
    private String f963C;

    /* renamed from: D */
    private String f964D;

    /* renamed from: E */
    private Pattern f965E;

    /* renamed from: F */
    private String f966F;

    /* renamed from: G */
    private Pattern f967G;

    /* renamed from: H */
    private String f968H;

    /* renamed from: I */
    private Pattern f969I;

    /* renamed from: J */
    private String f970J;

    /* renamed from: K */
    private Pattern f971K;

    /* renamed from: L */
    private String f972L;

    /* renamed from: M */
    private Pattern f973M;

    /* renamed from: N */
    private String f974N;

    /* renamed from: O */
    private Pattern f975O;

    /* renamed from: P */
    private String f976P;

    /* renamed from: Q */
    private Pattern f977Q;

    /* renamed from: R */
    private String f978R;

    /* renamed from: S */
    private Pattern f979S;

    /* renamed from: T */
    private String f980T;

    /* renamed from: U */
    private Pattern f981U;

    /* renamed from: V */
    private String f982V;

    /* renamed from: W */
    private String f983W;

    /* renamed from: X */
    private Pattern f984X;

    /* renamed from: Y */
    private String f985Y;

    /* renamed from: Z */
    private String f986Z;

    /* renamed from: a */
    private String f987a;

    /* renamed from: a0 */
    private String f988a0;

    /* renamed from: b */
    private String f989b;

    /* renamed from: b0 */
    private Pattern f990b0;

    /* renamed from: c */
    private String f991c;

    /* renamed from: c0 */
    private String f992c0;

    /* renamed from: d */
    private String f993d;

    /* renamed from: d0 */
    private Pattern f994d0;

    /* renamed from: e */
    private Pattern f995e;

    /* renamed from: e0 */
    private String f996e0;

    /* renamed from: f */
    private String f997f;

    /* renamed from: f0 */
    private String f998f0;

    /* renamed from: g */
    private Pattern f999g;

    /* renamed from: g0 */
    private String f1000g0;

    /* renamed from: h */
    private final LinkedHashMap<String, String> f1001h = new LinkedHashMap<>();

    /* renamed from: h0 */
    private String f1002h0;

    /* renamed from: i */
    private JSONObject f1003i;

    /* renamed from: i0 */
    private String f1004i0;

    /* renamed from: j */
    private String f1005j;

    /* renamed from: j0 */
    private String f1006j0;

    /* renamed from: k */
    private String f1007k;

    /* renamed from: k0 */
    private Pattern f1008k0;

    /* renamed from: l */
    private Pattern f1009l;

    /* renamed from: l0 */
    private String f1010l0;

    /* renamed from: m */
    private String f1011m;

    /* renamed from: m0 */
    private Pattern f1012m0;

    /* renamed from: n */
    private Pattern f1013n;

    /* renamed from: n0 */
    private String f1014n0;

    /* renamed from: o */
    private String f1015o;

    /* renamed from: o0 */
    private Pattern f1016o0;

    /* renamed from: p */
    private Pattern f1017p;

    /* renamed from: p0 */
    private String f1018p0;

    /* renamed from: q */
    private String f1019q;

    /* renamed from: q0 */
    private Pattern f1020q0;

    /* renamed from: r */
    private Pattern f1021r;

    /* renamed from: s */
    private String f1022s;

    /* renamed from: t */
    private String f1023t;

    /* renamed from: u */
    private String f1024u;

    /* renamed from: v */
    private Pattern f1025v;

    /* renamed from: w */
    private String f1026w;

    /* renamed from: x */
    private Pattern f1027x;

    /* renamed from: y */
    private String f1028y;

    /* renamed from: z */
    private Pattern f1029z;

    /* renamed from: a */
    private static String m369a(Pattern pattern, String str) {
        if (pattern == null) {
            return str;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(1).trim();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return str;
    }

    /* renamed from: b */
    public static C0543a m367b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C0543a c0543a = new C0543a();
            c0543a.f987a = jSONObject.optString(atm.m897d("1F1B"));
            c0543a.f989b = jSONObject.optString(atm.m897d("02151710192A06")).trim();
            c0543a.f991c = jSONObject.optString(atm.m897d("091B0E1002370E1F")).trim();
            c0543a.f993d = jSONObject.optString(atm.m897d("091B0E100239071F")).trim();
            c0543a.f995e = m356g0(jSONObject, atm.m897d("091B0E100239071F28"));
            c0543a.f997f = jSONObject.optString(atm.m897d("091B0E10053C")).trim();
            c0543a.f999g = m356g0(jSONObject, atm.m897d("091B0E10053C38"));
            JSONObject optJSONObject = jSONObject.optJSONObject(atm.m897d("091B0E100139040F1B19"));
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    c0543a.f1001h.put(next.trim(), optJSONObject.getString(next).trim());
                }
            }
            c0543a.f1003i = jSONObject.optJSONObject(atm.m897d("0C131601292A"));
            c0543a.f1005j = jSONObject.optString(atm.m897d("021517101A370E34151129")).trim();
            c0543a.f1007k = jSONObject.optString(atm.m897d("021517101A370E341B1829")).trim();
            c0543a.f1009l = m356g0(jSONObject, atm.m897d("021517101A370E341B18290A"));
            c0543a.f1011m = jSONObject.optString(atm.m897d("021517101A370E331E")).trim();
            c0543a.f1013n = m356g0(jSONObject, atm.m897d("021517101A370E331E27"));
            c0543a.f1015o = jSONObject.optString(atm.m897d("021517101A370E331712")).trim();
            c0543a.f1017p = m356g0(jSONObject, atm.m897d("021517101A370E3317121E"));
            c0543a.f1019q = jSONObject.optString(atm.m897d("021517101A370E371B0727")).trim();
            c0543a.f1021r = m356g0(jSONObject, atm.m897d("021517101A370E371B07270A"));
            c0543a.f1022s = jSONObject.optString(atm.m897d("091B0E10192A06")).trim();
            c0543a.f1023t = jSONObject.optString(atm.m897d("091B0E101A370E34151129")).trim();
            c0543a.f1024u = jSONObject.optString(atm.m897d("091B0E101A370E341B1829")).trim();
            c0543a.f1025v = m356g0(jSONObject, atm.m897d("091B0E101A370E341B18290A"));
            c0543a.f1026w = jSONObject.optString(atm.m897d("091B0E101A370E331E")).trim();
            c0543a.f1027x = m356g0(jSONObject, atm.m897d("091B0E101A370E331E27"));
            c0543a.f1028y = jSONObject.optString(atm.m897d("091B0E101A370E331712")).trim();
            c0543a.f1029z = m356g0(jSONObject, atm.m897d("091B0E101A370E3317121E"));
            c0543a.f961A = jSONObject.optString(atm.m897d("091B0E101A370E371B0727")).trim();
            m356g0(jSONObject, atm.m897d("091B0E101A370E371B07270A"));
            c0543a.f962B = jSONObject.optString(atm.m897d("0E0E2F0720"));
            c0543a.f963C = jSONObject.optString(atm.m897d("0E0E341A283D"));
            c0543a.f964D = jSONObject.optString(atm.m897d("0E0E3414213D"));
            c0543a.f965E = m356g0(jSONObject, atm.m897d("0E0E3414213D38"));
            c0543a.f966F = jSONObject.optString(atm.m897d("0E0E33182B"));
            c0543a.f967G = m356g0(jSONObject, atm.m897d("0E0E33182B0A"));
            c0543a.f968H = jSONObject.optString(atm.m897d("0E0E3914383D"));
            c0543a.f969I = m356g0(jSONObject, atm.m897d("0E0E3914383D38"));
            c0543a.f970J = jSONObject.optString(atm.m897d("0E0E23102D2A"));
            c0543a.f971K = m356g0(jSONObject, atm.m897d("0E0E23102D2A38"));
            c0543a.f972L = jSONObject.optString(atm.m897d("0E0E3B072939"));
            c0543a.f973M = m356g0(jSONObject, atm.m897d("0E0E3B07293938"));
            c0543a.f974N = jSONObject.optString(atm.m897d("0E0E37143E33"));
            c0543a.f975O = m356g0(jSONObject, atm.m897d("0E0E37143E3338"));
            c0543a.f976P = jSONObject.optString(atm.m897d("0E0E3B16383718"));
            c0543a.f977Q = m356g0(jSONObject, atm.m897d("0E0E3B1638371828"));
            c0543a.f978R = jSONObject.optString(atm.m897d("0E0E3E1C3E3D090E1507"));
            c0543a.f979S = m356g0(jSONObject, atm.m897d("0E0E3E1C3E3D090E15071E"));
            c0543a.f980T = jSONObject.optString(atm.m897d("0E0E3E103F3B"));
            c0543a.f981U = m356g0(jSONObject, atm.m897d("0E0E3E103F3B38"));
            c0543a.f982V = jSONObject.optString(atm.m897d("0E0E3C07233524151E10"));
            c0543a.f983W = jSONObject.optString(atm.m897d("0E0E3C072335241B1710"));
            c0543a.f984X = m356g0(jSONObject, atm.m897d("0E0E3C072335241B17101E"));
            c0543a.f985Y = jSONObject.optString(atm.m897d("0E0E2F072016051E1F"));
            c0543a.f986Z = jSONObject.optString(atm.m897d("0E0E2F07200B1F18341A283D"));
            c0543a.f988a0 = jSONObject.optString(atm.m897d("0E0E2F0720110E"));
            c0543a.f990b0 = m356g0(jSONObject, atm.m897d("0E0E2F0720110E28"));
            c0543a.f992c0 = jSONObject.optString(atm.m897d("0E0E2F0720160B171F"));
            c0543a.f994d0 = m356g0(jSONObject, atm.m897d("0E0E2F0720160B171F27"));
            c0543a.f996e0 = jSONObject.optString(atm.m897d("1A161B0C192A06"));
            c0543a.f998f0 = jSONObject.optString(atm.m897d("1A161B0C1939"));
            c0543a.f1000g0 = jSONObject.optString(atm.m897d("1A161B0C1E3D0C1F08103E"));
            c0543a.f1002h0 = jSONObject.optString(atm.m897d("191F1B072F303F0816"));
            c0543a.f1004i0 = jSONObject.optString(atm.m897d("19192C1A2816051E1F")).trim();
            c0543a.f1006j0 = jSONObject.optString(atm.m897d("19192C1A28160B171F")).trim();
            c0543a.f1008k0 = m356g0(jSONObject, atm.m897d("19192C1A28160B171F27"));
            c0543a.f1010l0 = jSONObject.optString(atm.m897d("19192C1A28110E")).trim();
            c0543a.f1012m0 = m356g0(jSONObject, atm.m897d("19192C1A28110E28"));
            c0543a.f1014n0 = jSONObject.optString(atm.m897d("19192C1A2811071D")).trim();
            c0543a.f1016o0 = m356g0(jSONObject, atm.m897d("19192C1A2811071D28"));
            c0543a.f1018p0 = jSONObject.optString(atm.m897d("19192C1A28150B0811")).trim();
            c0543a.f1020q0 = m356g0(jSONObject, atm.m897d("19192C1A28150B081127"));
            return c0543a;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* renamed from: g0 */
    private static Pattern m356g0(JSONObject jSONObject, String str) {
        String trim = jSONObject.optString(str).trim();
        if (trim.isEmpty()) {
            return null;
        }
        try {
            return Pattern.compile(trim);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* renamed from: A */
    public final String m395A() {
        return this.f978R;
    }

    /* renamed from: B */
    public final String m394B(String str) {
        return m369a(this.f979S, str);
    }

    /* renamed from: C */
    public final String m393C() {
        return this.f983W;
    }

    /* renamed from: D */
    public final String m392D(String str) {
        return m369a(this.f984X, str);
    }

    /* renamed from: E */
    public final String m391E() {
        return this.f982V;
    }

    /* renamed from: F */
    public final String m390F() {
        return this.f966F;
    }

    /* renamed from: G */
    public final String m389G(String str) {
        return m369a(this.f967G, str);
    }

    /* renamed from: H */
    public final String m388H() {
        return this.f974N;
    }

    /* renamed from: I */
    public final String m387I(String str) {
        return m369a(this.f975O, str);
    }

    /* renamed from: J */
    public final String m386J() {
        return this.f964D;
    }

    /* renamed from: K */
    public final String m385K(String str) {
        return m369a(this.f965E, str);
    }

    /* renamed from: L */
    public final String m384L() {
        return this.f963C;
    }

    /* renamed from: M */
    public final String m383M() {
        return this.f962B;
    }

    /* renamed from: N */
    public final String m382N() {
        return this.f988a0;
    }

    /* renamed from: O */
    public final String m381O(String str) {
        return m369a(this.f990b0, str);
    }

    /* renamed from: P */
    public final String m380P() {
        return this.f992c0;
    }

    /* renamed from: Q */
    public final String m379Q(String str) {
        return m369a(this.f994d0, str);
    }

    /* renamed from: R */
    public final String m378R() {
        return this.f985Y;
    }

    /* renamed from: S */
    public final String m377S() {
        return this.f986Z;
    }

    /* renamed from: T */
    public final String m376T() {
        return this.f970J;
    }

    /* renamed from: U */
    public final String m375U(String str) {
        return m369a(this.f971K, str);
    }

    /* renamed from: V */
    public final JSONObject m374V() {
        return this.f1003i;
    }

    /* renamed from: W */
    public final String m373W() {
        return this.f989b;
    }

    /* renamed from: X */
    public final String m372X() {
        return this.f1011m;
    }

    /* renamed from: Y */
    public final String m371Y(String str) {
        return m369a(this.f1013n, str);
    }

    /* renamed from: Z */
    public final String m370Z() {
        return this.f1015o;
    }

    /* renamed from: a0 */
    public final String m368a0(String str) {
        return m369a(this.f1017p, str);
    }

    /* renamed from: b0 */
    public final String m366b0() {
        return this.f1019q;
    }

    /* renamed from: c */
    public final String m365c() {
        return this.f997f;
    }

    /* renamed from: c0 */
    public final String m364c0(String str) {
        return m369a(this.f1021r, str);
    }

    /* renamed from: d */
    public final String m363d(String str) {
        return m369a(this.f999g, str);
    }

    /* renamed from: d0 */
    public final String m362d0() {
        return this.f1007k;
    }

    /* renamed from: e */
    public final LinkedHashMap<String, String> m361e() {
        return this.f1001h;
    }

    /* renamed from: e0 */
    public final String m360e0(String str) {
        return m369a(this.f1009l, str);
    }

    /* renamed from: f */
    public final String m359f() {
        return this.f993d;
    }

    /* renamed from: f0 */
    public final String m358f0() {
        return this.f1005j;
    }

    /* renamed from: g */
    public final String m357g(String str) {
        return m369a(this.f995e, str);
    }

    /* renamed from: h */
    public final String m355h() {
        return this.f991c;
    }

    /* renamed from: h0 */
    public final String m354h0() {
        return this.f1000g0;
    }

    /* renamed from: i */
    public final String m353i() {
        return this.f1022s;
    }

    /* renamed from: i0 */
    public final String m352i0() {
        return this.f998f0;
    }

    /* renamed from: j */
    public final String m351j() {
        return this.f1026w;
    }

    /* renamed from: j0 */
    public final String m350j0() {
        return this.f996e0;
    }

    /* renamed from: k */
    public final String m349k(String str) {
        return m369a(this.f1027x, str);
    }

    /* renamed from: k0 */
    public final String m348k0() {
        return this.f1002h0;
    }

    /* renamed from: l */
    public final String m347l() {
        return this.f1028y;
    }

    /* renamed from: l0 */
    public final String m346l0() {
        return this.f1010l0;
    }

    /* renamed from: m */
    public final String m345m(String str) {
        return m369a(this.f1029z, str);
    }

    /* renamed from: m0 */
    public final String m344m0(String str) {
        return m369a(this.f1012m0, str);
    }

    /* renamed from: n */
    public final String m343n() {
        return this.f961A;
    }

    /* renamed from: n0 */
    public final String m342n0() {
        return this.f1014n0;
    }

    /* renamed from: o */
    public final String m341o(String str) {
        return m369a(this.f1025v, str);
    }

    /* renamed from: o0 */
    public final String m340o0(String str) {
        return m369a(this.f1016o0, str);
    }

    /* renamed from: p */
    public final String m339p() {
        return this.f1024u;
    }

    /* renamed from: p0 */
    public final String m338p0() {
        return this.f1018p0;
    }

    /* renamed from: q */
    public final String m337q(String str) {
        return m369a(this.f1025v, str);
    }

    /* renamed from: q0 */
    public final String m336q0(String str) {
        return m369a(this.f1020q0, str);
    }

    /* renamed from: r */
    public final String m335r() {
        return this.f1023t;
    }

    /* renamed from: r0 */
    public final String m334r0() {
        return this.f1006j0;
    }

    /* renamed from: s */
    public final String m333s() {
        return this.f976P;
    }

    /* renamed from: s0 */
    public final String m332s0(String str) {
        return m369a(this.f1008k0, str);
    }

    /* renamed from: t */
    public final String m331t(String str) {
        return m369a(this.f977Q, str);
    }

    /* renamed from: t0 */
    public final String m330t0() {
        return this.f1004i0;
    }

    /* renamed from: u */
    public final String m329u() {
        return this.f972L;
    }

    /* renamed from: u0 */
    public final String m328u0() {
        return this.f987a;
    }

    /* renamed from: v */
    public final String m327v(String str) {
        return m369a(this.f973M, str);
    }

    /* renamed from: w */
    public final String m326w() {
        return this.f968H;
    }

    /* renamed from: x */
    public final String m325x(String str) {
        return m369a(this.f969I, str);
    }

    /* renamed from: y */
    public final String m324y() {
        return this.f980T;
    }

    /* renamed from: z */
    public final String m323z(String str) {
        return m369a(this.f981U, str);
    }
}
