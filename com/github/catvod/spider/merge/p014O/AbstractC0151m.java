package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p016Q.C0189k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.github.catvod.spider.merge.O.m */
/* loaded from: classes.dex */
public abstract class AbstractC0151m {

    /* renamed from: c */
    public int f283c;

    /* renamed from: f */
    public C0189k f286f;

    /* renamed from: a */
    public C0127a f281a = null;

    /* renamed from: b */
    public int f282b = -1;

    /* renamed from: d */
    public boolean f284d = false;

    /* renamed from: e */
    protected final List<AbstractC0166t0> f285e = new ArrayList(4);

    static {
        Collections.unmodifiableList(Arrays.asList(atm.m897d("23342C3400112E"), atm.m897d("283B293C0F"), atm.m897d("382F3630130B3E3B2821"), atm.m897d("283635360707392E3B2718"), atm.m897d("3A362F26131A2635393E130B3E3B2821"), atm.m897d("392E3B27131A2635393E130B3E3B2821"), atm.m897d("3E3531300207392E3B2718"), atm.m897d("382F3630130B3E352A"), atm.m897d("2836353607072F343E"), atm.m897d("392E3B27131425352A2A0E192931"), atm.m897d("392E3B27131425352A2A09163E2823"), atm.m897d("3A362F26131425352A2A0E192931"), atm.m897d("26353525131D243E")));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.O.t0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.O.t0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<com.github.catvod.spider.merge.O.t0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List<com.github.catvod.spider.merge.O.t0>, java.util.ArrayList] */
    /* renamed from: a */
    public final void m1245a(AbstractC0166t0 abstractC0166t0) {
        int size = this.f285e.size();
        boolean z = false;
        if (this.f285e.isEmpty()) {
            this.f284d = abstractC0166t0.mo1234b();
        } else if (this.f284d != abstractC0166t0.mo1234b()) {
            System.err.format(Locale.getDefault(), atm.m897d("2B2E34553F2C0B0E1F55693C4A121B066C3A050E125529281913161A22780B141E55223704571F053F3106151455382A0B14091C38310514095B46"), Integer.valueOf(this.f282b));
            this.f284d = false;
        }
        Iterator it = this.f285e.iterator();
        while (it.hasNext()) {
            AbstractC0166t0 abstractC0166t02 = (AbstractC0166t0) it.next();
            if (abstractC0166t02.f298a.f282b == abstractC0166t0.f298a.f282b && ((abstractC0166t02.mo1240c() != null && abstractC0166t0.mo1240c() != null && abstractC0166t02.mo1240c().equals(abstractC0166t0.mo1240c())) || (abstractC0166t02.mo1234b() && abstractC0166t0.mo1234b()))) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        this.f285e.add(size, abstractC0166t0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.O.t0>, java.util.ArrayList] */
    /* renamed from: b */
    public final int m1244b() {
        return this.f285e.size();
    }

    /* renamed from: c */
    public abstract int mo1241c();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.O.t0>, java.util.ArrayList] */
    /* renamed from: d */
    public final AbstractC0166t0 m1243d(int i) {
        return (AbstractC0166t0) this.f285e.get(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0151m) && this.f282b == ((AbstractC0151m) obj).f282b;
    }

    public final int hashCode() {
        return this.f282b;
    }

    public final String toString() {
        return String.valueOf(this.f282b);
    }
}
