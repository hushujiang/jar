package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.atm;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.W.O */
/* loaded from: classes.dex */
public final class C0245O {

    /* renamed from: a */
    private static final Pattern f439a = Pattern.compile(atm.m897d("3452454F646703533D3818715552215E61054345522928040E45534A646255522611103C5553534A68"));

    /* renamed from: b */
    private static final TimeZone f440b = new C0247Q(false, 0, 0);

    /* renamed from: c */
    public static final /* synthetic */ int f441c = 0;

    /* renamed from: a */
    public static TimeZone m1099a(String str) {
        if (atm.m897d("30").equals(str) || atm.m897d("3F2E39").equals(str)) {
            return f440b;
        }
        Matcher matcher = f439a.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(2);
            boolean z = false;
            int parseInt = group != null ? Integer.parseInt(group) : 0;
            String group2 = matcher.group(4);
            int parseInt2 = group2 != null ? Integer.parseInt(group2) : 0;
            if (parseInt == 0 && parseInt2 == 0) {
                return f440b;
            }
            String group3 = matcher.group(1);
            if (group3 != null && group3.charAt(0) == '-') {
                z = true;
            }
            return new C0247Q(z, parseInt, parseInt2);
        }
        return null;
    }
}
