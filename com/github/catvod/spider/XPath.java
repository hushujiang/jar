package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p026b.C0304b;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p031d0.C0483a;
import com.github.catvod.spider.merge.p031d0.C0484b;
import com.github.catvod.spider.merge.p038h.C0543a;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class XPath extends Spider {

    /* renamed from: a */
    protected String f29a = null;

    /* renamed from: b */
    protected C0543a f30b = null;

    /* renamed from: a */
    protected String mo1522a(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        return this.f30b.m353i().replace(atm.m897d("11191B0129110E07"), str).replace(atm.m897d("11191B0129080D07"), str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final String m1525b(String str) {
        SpiderDebug.log(str);
        HashMap hashMap = new HashMap();
        hashMap.put(atm.m897d("3F091F0761190D1F1401"), this.f30b.m328u0().isEmpty() ? atm.m897d("2715001C20340B554F5B7C78422D131B28371D095A3B18785B4A544577783D13144378634A024C4165782B0A0A19290F0F18311C38775F494D5B7F6E4A52313D181526565A1925330F5A3D102F3305535A36242A05171F5A7D6853544A5B7C765A5A29142A39181355407F6F44494C") : this.f30b.m328u0());
        return C0574b.m307f(str, hashMap, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m1524c() {
        String str;
        String str2;
        if (this.f30b != null || (str = this.f29a) == null) {
            return;
        }
        if (str.startsWith(atm.m897d("020E0E05"))) {
            str2 = C0574b.m307f(this.f29a, null, null);
            this.f30b = C0543a.m367b(str2);
        } else {
            this.f30b = C0543a.m367b(this.f29a);
            str2 = this.f29a;
        }
        mo1523d(str2);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        m1524c();
        ArrayList arrayList = new ArrayList();
        String mo1522a = mo1522a(str, str2, z, hashMap);
        List<C0484b> m574b = C0483a.m575a(m1525b(mo1522a)).m574b(this.f30b.m335r());
        int i = 0;
        while (true) {
            LinkedList linkedList = (LinkedList) m574b;
            if (i >= linkedList.size()) {
                return C0308f.m887h(arrayList);
            }
            String m337q = this.f30b.m337q(((C0484b) linkedList.get(i)).m571c(this.f30b.m339p()).m573a().trim());
            String m349k = this.f30b.m349k(((C0484b) linkedList.get(i)).m571c(this.f30b.m351j()).m573a().trim());
            String m148c = C0652d.m148c(mo1522a, this.f30b.m345m(((C0484b) linkedList.get(i)).m571c(this.f30b.m347l()).m573a().trim()));
            String str3 = "";
            if (!this.f30b.m343n().isEmpty()) {
                try {
                    str3 = this.f30b.m341o(((C0484b) linkedList.get(i)).m571c(this.f30b.m343n()).m573a().trim());
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }
            arrayList.add(new C0310h(m349k, m337q, m148c, str3));
            i++;
        }
    }

    /* renamed from: d */
    protected void mo1523d(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021a A[EDGE_INSN: B:148:0x021a->B:87:0x021a ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02cc A[EDGE_INSN: B:149:0x02cc->B:100:0x02cc ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f6 A[LOOP:0: B:84:0x01ed->B:86:0x01f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r14) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XPath.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        m1524c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.f30b.m361e().size() > 0) {
            for (String str : this.f30b.m361e().keySet()) {
                arrayList2.add(new C0304b(this.f30b.m361e().get(str), str));
            }
        }
        String m373W = this.f30b.m373W();
        C0483a m575a = C0483a.m575a(m1525b(m373W));
        int i = 0;
        if (this.f30b.m361e().size() == 0) {
            List<C0484b> m574b = m575a.m574b(this.f30b.m355h());
            int i2 = 0;
            while (true) {
                LinkedList linkedList = (LinkedList) m574b;
                if (i2 >= linkedList.size()) {
                    break;
                }
                arrayList2.add(new C0304b(this.f30b.m363d(((C0484b) linkedList.get(i2)).m571c(this.f30b.m365c()).m573a().trim()), this.f30b.m357g(((C0484b) linkedList.get(i2)).m571c(this.f30b.m359f()).m573a().trim())));
                i2++;
            }
        }
        if (!this.f30b.m358f0().isEmpty()) {
            List<C0484b> m574b2 = m575a.m574b(this.f30b.m358f0());
            while (true) {
                LinkedList linkedList2 = (LinkedList) m574b2;
                if (i >= linkedList2.size()) {
                    break;
                }
                String m360e0 = this.f30b.m360e0(((C0484b) linkedList2.get(i)).m571c(this.f30b.m362d0()).m573a().trim());
                String m371Y = this.f30b.m371Y(((C0484b) linkedList2.get(i)).m571c(this.f30b.m372X()).m573a().trim());
                String m148c = C0652d.m148c(m373W, this.f30b.m368a0(((C0484b) linkedList2.get(i)).m571c(this.f30b.m370Z()).m573a().trim()));
                String str2 = "";
                if (!this.f30b.m366b0().isEmpty()) {
                    try {
                        str2 = this.f30b.m364c0(((C0484b) linkedList2.get(i)).m571c(this.f30b.m366b0()).m573a().trim());
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                    }
                }
                arrayList.add(new C0310h(m371Y, m360e0, m148c, str2));
                i++;
            }
        }
        return C0308f.m883l(arrayList2, arrayList, this.f30b.m374V());
    }

    public void init(Context context) {
        super.init(context);
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.f29a = str;
    }

    public boolean isVideoFormat(String str) {
        return C0652d.m143h(str);
    }

    public boolean manualVideoCheck() {
        return false;
    }

    public String playerContent(String str, String str2, List<String> list) {
        m1524c();
        if (!this.f30b.m350j0().isEmpty()) {
            str2 = this.f30b.m350j0().replace(atm.m897d("110A1614350D181607"), str2);
        }
        SpiderDebug.log(str2);
        HashMap hashMap = new HashMap();
        if (this.f30b.m352i0().length() > 0) {
            hashMap.put(atm.m897d("3F091F0761190D1F1401"), this.f30b.m352i0());
        }
        if (this.f30b.m354h0().length() > 0) {
            hashMap.put(atm.m897d("381F1C103E3D18"), this.f30b.m354h0());
        }
        C0308f c0308f = new C0308f();
        c0308f.m889f();
        c0308f.m880o(str2);
        c0308f.m892c(hashMap);
        return c0308f.toString();
    }

    public String searchContent(String str, boolean z) {
        String str2;
        m1524c();
        if (this.f30b.m348k0().isEmpty()) {
            return "";
        }
        String replace = this.f30b.m348k0().replace(atm.m897d("110D1E08"), URLEncoder.encode(str));
        String m1525b = m1525b(replace);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (!this.f30b.m330t0().startsWith(atm.m897d("0009151B76"))) {
            List<C0484b> m574b = C0483a.m575a(m1525b).m574b(this.f30b.m330t0());
            while (true) {
                LinkedList linkedList = (LinkedList) m574b;
                if (i >= linkedList.size()) {
                    break;
                }
                String m332s0 = this.f30b.m332s0(((C0484b) linkedList.get(i)).m571c(this.f30b.m334r0()).m573a().trim());
                String m344m0 = this.f30b.m344m0(((C0484b) linkedList.get(i)).m571c(this.f30b.m346l0()).m573a().trim());
                String m148c = C0652d.m148c(replace, this.f30b.m340o0(((C0484b) linkedList.get(i)).m571c(this.f30b.m342n0()).m573a().trim()));
                if (this.f30b.m343n().isEmpty()) {
                    str2 = "";
                } else {
                    try {
                    } catch (Exception e) {
                        e = e;
                        str2 = "";
                    }
                    try {
                        str2 = this.f30b.m336q0(((C0484b) linkedList.get(i)).m571c(this.f30b.m338p0()).m573a().trim());
                    } catch (Exception e2) {
                        e = e2;
                        SpiderDebug.log(e);
                        arrayList.add(new C0310h(m344m0, m332s0, m148c, str2));
                        i++;
                    }
                }
                arrayList.add(new C0310h(m344m0, m332s0, m148c, str2));
                i++;
            }
        } else {
            String[] split = this.f30b.m330t0().substring(5).split(atm.m897d("54"));
            JSONObject jSONObject = new JSONObject(m1525b);
            for (int i2 = 0; i2 < split.length; i2++) {
                if (i2 == split.length - 1) {
                    JSONArray jSONArray = jSONObject.getJSONArray(split[i2]);
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                        String m332s02 = this.f30b.m332s0(jSONObject2.optString(this.f30b.m334r0()).trim());
                        arrayList.add(new C0310h(this.f30b.m344m0(jSONObject2.optString(this.f30b.m346l0()).trim()), m332s02, C0652d.m148c(replace, this.f30b.m340o0(jSONObject2.optString(this.f30b.m342n0()).trim())), this.f30b.m336q0(jSONObject2.optString(this.f30b.m338p0()).trim())));
                    }
                } else {
                    jSONObject = jSONObject.getJSONObject(split[i2]);
                }
            }
        }
        return C0308f.m887h(arrayList);
    }
}
