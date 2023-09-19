package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p034f.C0518a;
import com.github.catvod.spider.merge.p034f.C0519b;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p058t.AbstractC0693f;
import com.google.gson.Gson;
import java.net.URLEncoder;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class UpYun extends Ali {
    /* renamed from: a */
    private String m1531a(String str) {
        String m897d = atm.m897d("1B0B4B4C7E685F484A417A681B0B000F");
        SecretKeySpec secretKeySpec = new SecretKeySpec(m897d.getBytes(), atm.m897d("2B3F29"));
        IvParameterSpec ivParameterSpec = new IvParameterSpec(m897d.getBytes());
        Cipher cipher = Cipher.getInstance(atm.m897d("2B3F295A0F1A29552A3E0F0B5F2A1B112831041D"));
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(AbstractC0693f.m92a().m91b(str.toUpperCase())), atm.m897d("3F2E3C5874"));
    }

    @Override // com.github.catvod.spider.Ali
    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String searchContent(String str, boolean z) {
        StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F624555000C2E761F0A0300222B0554191A21771C4B4F5A3F3D0B08191D73330F030D1A3E3C57"));
        m635a.append(URLEncoder.encode(str));
        m635a.append(atm.m897d("4C0A1B1229655B5C092A38211A1F4747"));
        String m1531a = m1531a(C0574b.m307f(m635a.toString(), null, null));
        ArrayList arrayList = new ArrayList();
        for (C0519b c0519b : ((C0518a) new Gson().fromJson(m1531a, C0518a.class)).m467b().m468a()) {
            String m1531a2 = m1531a(c0519b.m466a());
            if (m1531a2.contains(atm.m897d("1D0D0D5B2D3403030F1B282A030C1F5B2F3707")) && c0519b.m465b().contains(str)) {
                c0519b.m463d(m1531a2);
                arrayList.add(c0519b.m464c());
            }
        }
        return C0308f.m887h(arrayList);
    }
}
