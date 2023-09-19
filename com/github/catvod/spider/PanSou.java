package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p042j.C0574b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class PanSou extends Ali {
    @Override // com.github.catvod.spider.Ali
    public String detailContent(List<String> list) {
        if (Ali.f3a.matcher(list.get(0)).find()) {
            return super.detailContent(list);
        }
        String m897d = atm.m897d("020E0E053F6245550D023B760B1613052D3619150F5B2F3707");
        StringBuilder m635a = C0424a.m635a(m897d);
        m635a.append(list.get(0).replace(atm.m897d("450955"), atm.m897d("45190C5A")));
        String sb = m635a.toString();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(atm.m897d("3F091F0761190D1F1401"), atm.m897d("2715001C20340B554F5B7C78422D131B28371D095A3B18785B4A544577783D13144378634A024C4165782B0A0A19290F0F18311C38775F494D5B7F6E4A52313D181526565A1925330F5A3D102F3305535A36242A05171F5A7D6853544A5B7C765A5A29142A39181355407F6F44494C"));
        hashMap2.put(atm.m897d("381F1C103E3D18"), m897d + list.get(0));
        hashMap2.put(atm.m897d("35181311"), atm.m897d("5C1E4B412D6D0E1E4C167C6F53424A11753C094A424C2D6E5349424579390E42"));
        C0574b.m305h(sb, hashMap2, hashMap);
        return super.detailContent(Arrays.asList(C0574b.m311b(hashMap)));
    }

    @Override // com.github.catvod.spider.Ali
    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String searchContent(String str, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(atm.m897d("5D"), atm.m897d("82C9FD93DAC18FDEC4"));
        hashMap.put(atm.m897d("5B"), atm.m897d("8FC7CB92C5DF"));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getValue();
            StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F6245550D023B760B1613052D3619150F5B2F37075509102D2A0912451E71"));
            m635a.append(URLEncoder.encode(str));
            m635a.append(atm.m897d("4C0E47"));
            m635a.append((String) entry.getKey());
            Iterator<C0293m> it = C0052e.m1414e(C0574b.m307f(m635a.toString(), null, null)).m967p0(atm.m897d("1C1B14583E371D5A44552D")).iterator();
            while (it.hasNext()) {
                C0293m next = it.next();
                String trim = next.m966q0(atm.m897d("1E1F170520391E1F")).m960w0().trim();
                if (trim.contains(str)) {
                    C0310h c0310h = new C0310h();
                    c0310h.m868g(next.mo925d(atm.m897d("02081F13")));
                    c0310h.m867h(atm.m897d("31") + str2 + atm.m897d("375A") + trim);
                    c0310h.m866i(atm.m897d("020E0E053F624555131B292F19541D0125350D54191A2177041F0D062D281A2518016368454B49477A6B52494D4D7961454B4A457C"));
                    arrayList.add(c0310h);
                }
            }
        }
        return C0308f.m887h(arrayList);
    }
}
