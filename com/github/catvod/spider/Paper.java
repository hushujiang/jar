package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p026b.C0304b;
import com.github.catvod.spider.merge.p026b.C0305c;
import com.github.catvod.spider.merge.p026b.C0306d;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p027b0.C0321F;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p032e.C0486b;
import com.github.catvod.spider.merge.p042j.C0574b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Paper extends Ali {

    /* renamed from: b */
    private List<String> f24b;

    /* renamed from: a */
    private HashMap<String, String> m1534a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(atm.m897d("3F091F0761190D1F1401"), atm.m897d("2715001C20340B554F5B7C78422D131B28371D095A3B18785B4A544577783D13144378634A024C4165782B0A0A19290F0F18311C38775F494D5B7F6E4A52313D181526565A1925330F5A3D102F3305535A36242A05171F5A7D6853544A5B7C765A5A29142A39181355407F6F44494C"));
        return hashMap;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String m897d = atm.m897d("1E030A10");
        if (hashMap.containsKey(m897d)) {
            str = hashMap.get(m897d);
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(atm.m897d("0B190E1C2336"), atm.m897d("1C131F022F391E"));
        hashMap2.put(atm.m897d("091B0E"), str);
        hashMap2.put(atm.m897d("040F17"), str2);
        for (C0486b c0486b : C0486b.m570a(C0574b.m310c(atm.m897d("020E0E053F6245551D1C383B0B1C1F5B223D1E550E1A2334451B161C3C391A1F085A"), hashMap2, m1534a()))) {
            arrayList.add(c0486b.m567d());
        }
        return C0308f.m887h(arrayList);
    }

    public String homeContent(boolean z) {
        C0459g m967p0 = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F6245551D1C383B0B1C1F5B223D1E551B1925280B0A1F0763"), m1534a(), null)).m967p0(atm.m897d("1E1B181929761E1B18192931101F0858383908161F5572781E1815113578545A0E07"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<C0293m> it = m967p0.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<C0293m> it2 = it.next().m967p0(atm.m897d("1E1E")).iterator();
            while (it2.hasNext()) {
                C0293m next = it2.next();
                boolean m981b0 = next.m981b0(atm.m897d("1E1B18192931101F085838311E161F"));
                String m897d = atm.m897d("0B");
                if (m981b0) {
                    String replace = next.m967p0(m897d).m606a(atm.m897d("02081F13")).replace(atm.m897d("49"), "");
                    if (this.f24b.contains(replace)) {
                        arrayList.add(new C0304b(replace, next.m960w0()));
                        linkedHashMap.put(replace, Arrays.asList(new C0306d(atm.m897d("1E030A10"), atm.m897d("83DBE490D2D3"), arrayList2)));
                    }
                } else {
                    arrayList2.add(new C0305c(next.m960w0(), next.m967p0(m897d).m606a(atm.m897d("05141919253B01")).split(atm.m897d("4D"))[1]));
                }
            }
        }
        return C0308f.m886i(arrayList, linkedHashMap);
    }

    public String homeVideoContent() {
        ArrayList arrayList = new ArrayList();
        for (C0486b c0486b : C0486b.m570a(new JSONObject(C0574b.m307f(atm.m897d("020E0E053F6245551D1C383B0B1C1F5B223D1E551B1925280B0A1F07633005171F5B262B0514"), m1534a(), null)).getJSONObject(atm.m897d("03141C1A")).getJSONArray(atm.m897d("041F0D")).toString())) {
            if (this.f24b.contains(c0486b.m569b())) {
                arrayList.add(c0486b.m567d());
            }
        }
        return C0308f.m887h(arrayList);
    }

    @Override // com.github.catvod.spider.Ali
    public void init(Context context, String str) {
        super.init(context, str);
        this.f24b = Arrays.asList(atm.m897d("02031E06"), atm.m897d("18121E06"), atm.m897d("05171E06"), atm.m897d("1B0E1E06"), atm.m897d("02031E0C"), atm.m897d("18121E0C"), atm.m897d("05171E0C"), atm.m897d("1B0E1E0C"), atm.m897d("02031E18"), atm.m897d("18121E18"), atm.m897d("05171E18"), atm.m897d("00160A"), atm.m897d("10030A"), atm.m897d("00030A0D"), atm.m897d("1B0E0905"));
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        hashMap.put(atm.m897d("0B190E1C2336"), atm.m897d("191F1B072F30"));
        hashMap.put(atm.m897d("011F0302232A0E"), str);
        for (C0486b c0486b : C0486b.m570a(C0574b.m310c(atm.m897d("020E0E053F6245551D1C383B0B1C1F5B223D1E550E1A2334451B161C3C391A1F085A"), hashMap, m1534a()))) {
            if (this.f24b.contains(c0486b.m569b()) && c0486b.m568c().contains(str)) {
                arrayList.add(c0486b.m567d());
            }
        }
        return C0308f.m887h(arrayList);
    }
}
