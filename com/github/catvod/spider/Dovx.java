package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.google.gson.Gson;
import java.net.URLEncoder;

/* loaded from: classes.dex */
public class Dovx extends Ali {
    @Override // com.github.catvod.spider.Ali
    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String searchContent(String str, boolean z) {
        StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F6245551B0525760E150C0D622C01551B192577191F1B072F30550D1E48"));
        m635a.append(URLEncoder.encode(str));
        C0308f c0308f = (C0308f) new Gson().fromJson(C0574b.m307f(m635a.toString(), null, null), C0308f.class);
        for (C0310h c0310h : c0308f.m893b()) {
            c0310h.m868g(c0310h.m874a());
        }
        return c0308f.toString();
    }
}
