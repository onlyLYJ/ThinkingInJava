package Interface;

public class SwapAdaptor implements Processor {

	SwapCharactor swapCharactor;
	
	public SwapAdaptor(SwapCharactor swapCharactor) {
		this.swapCharactor = swapCharactor;
	}
	
	public String name() {
		return swapCharactor.getClass().getSimpleName();
	}

	public Object process(Object input) {
		return swapCharactor.process((String)input);
	}


	
}
