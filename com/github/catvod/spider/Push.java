package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0309g;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p054p.C0642b;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class Push extends Ali {
    @Override // com.github.catvod.spider.Ali
    public String detailContent(List<String> list) {
        String trim = list.get(0).trim();
        if (trim.contains(atm.m897d("0B16130C39360E08130329"))) {
            return super.detailContent(list);
        }
        C0310h c0310h = new C0310h();
        c0310h.m868g(trim);
        c0310h.m873b(atm.m897d("2C1514120131"));
        c0310h.m867h(trim.startsWith(atm.m897d("0C131610767745")) ? new File(trim).getName() : trim);
        c0310h.m866i(atm.m897d("020E0E053F6245550A1C2F761817185B2E3C190E1B01253B44191518633A001255442868084A48117C3E5F4D1C452D6C58484A442A6158191B172D6D5B4A4D102876000A1F12"));
        List asList = Arrays.asList(atm.m897d("8DE1CE9CCCFB"), atm.m897d("8FEDFF93C2FA"), atm.m897d("82DDD993D2C8"));
        String m897d = atm.m897d("4E5E5E");
        c0310h.m865j(TextUtils.join(m897d, asList));
        String m897d2 = atm.m897d("8CE8D793D8E64E");
        c0310h.m864k(TextUtils.join(m897d, Arrays.asList(C0642b.m156a(m897d2, trim), C0642b.m156a(m897d2, trim), C0642b.m156a(m897d2, trim))));
        return C0308f.m888g(c0310h);
    }

    @Override // com.github.catvod.spider.Ali
    public void init(Context context, String str) {
        super.init(context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    @Override // com.github.catvod.spider.Ali
    public String playerContent(String str, String str2, List<String> list) {
        C0308f c0308f;
        C0308f c0308f2;
        ?? emptyList;
        if (str.equals(atm.m897d("8DE1CE9CCCFB"))) {
            C0308f c0308f3 = new C0308f();
            c0308f3.m880o(str2);
            String m897d = atm.m897d("0C131610767745");
            if (str2.startsWith(m897d)) {
                File file = new File(str2.replace(m897d, ""));
                if (file.getParentFile() != null) {
                    emptyList = new ArrayList();
                    File[] listFiles = file.getParentFile().listFiles();
                    listFiles.getClass();
                    for (File file2 : listFiles) {
                        String m147d = C0652d.m147d(file2.getName());
                        if (C0652d.m144g(m147d)) {
                            C0309g c0309g = new C0309g();
                            c0309g.m876c(C0652d.m140k(file2.getName()));
                            C0309g m878a = c0309g.m878a(m147d);
                            StringBuilder m635a = C0424a.m635a(m897d);
                            m635a.append(file2.getAbsolutePath());
                            m878a.m875d(m635a.toString());
                            emptyList.add(m878a);
                        }
                    }
                    c0308f3.m881n(emptyList);
                    c0308f2 = c0308f3;
                }
            }
            emptyList = Collections.emptyList();
            c0308f3.m881n(emptyList);
            c0308f2 = c0308f3;
        } else {
            if (str.equals(atm.m897d("8FEDFF93C2FA"))) {
                C0308f c0308f4 = new C0308f();
                c0308f4.m889f();
                c0308f = c0308f4;
            } else if (!str.equals(atm.m897d("82DDD993D2C8"))) {
                return super.playerContent(str, str2, list);
            } else {
                C0308f c0308f5 = new C0308f();
                c0308f5.m889f();
                c0308f5.m891d();
                c0308f = c0308f5;
            }
            c0308f.m880o(str2);
            c0308f2 = c0308f;
        }
        return c0308f2.toString();
    }
}
