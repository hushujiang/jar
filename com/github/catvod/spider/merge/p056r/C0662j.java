package com.github.catvod.spider.merge.p056r;

import com.github.catvod.spider.merge.atm;
import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.r.j */
/* loaded from: classes.dex */
public final class C0662j {

    /* renamed from: a */
    private final String f1256a;

    /* renamed from: b */
    private final C0661i f1257b;

    /* renamed from: c */
    private C0661i f1258c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0662j(String str) {
        C0661i c0661i = new C0661i();
        this.f1257b = c0661i;
        this.f1258c = c0661i;
        this.f1256a = str;
    }

    /* renamed from: a */
    public final C0662j m133a(Object obj) {
        C0661i c0661i = new C0661i();
        this.f1258c.f1255b = c0661i;
        this.f1258c = c0661i;
        c0661i.f1254a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f1256a);
        sb.append('{');
        C0661i c0661i = this.f1257b.f1255b;
        String str = "";
        while (c0661i != null) {
            Object obj = c0661i.f1254a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            c0661i = c0661i.f1255b;
            str = atm.m897d("465A");
        }
        sb.append('}');
        return sb.toString();
    }
}
