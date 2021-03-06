/**
 * 
 */
package edu.sjsu.cmpe.voting.ui.views;

import com.yammer.dropwizard.views.View;

import edu.sjsu.cmpe.voting.domain.PollDetails;


/**
 * @author parthkathuria
 *
 */
public class ViewPoll_View extends View {
	private final PollDetails poll;
    public ViewPoll_View(PollDetails poll, String template) {
              super(template);
              this.poll = poll;
    }
    public PollDetails getPoll() {
              return poll;
    }

}
